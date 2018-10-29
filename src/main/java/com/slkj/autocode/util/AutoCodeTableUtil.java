package com.slkj.autocode.util;


import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.junit.Test;

import com.slkj.autocode.configuration.Config;
import com.slkj.autocode.entity.TableInfo;

public class AutoCodeTableUtil {
	
	/**
	 * 通过表名获取表中的所有字段
	 * @param tableName
	 * @return
	 *  id:INT
		student_no:VARCHAR
		name:VARCHAR
		gender:VARCHAR 
		age:INT	
	 */
	public static TableInfo getTableInfoList(String tableName){
		TableInfo tableInfo = new TableInfo();
		String className = Config.classMap.get(tableName);
		List<String> feidNameList = new ArrayList<String>();
		List<String> typeNameList = new ArrayList<String>();
		List<String> classFeidNameList = new ArrayList<String>();
		List<String> classTypeNameList = new ArrayList<String>();
		List<String> remakesList = new ArrayList<String>();
		Connection connection = AutoCodeConnectionUtil.getConnection();
		try {
			DatabaseMetaData dbmd=connection.getMetaData();
			ResultSet rs = dbmd.getColumns(null, "%", tableName, "%");
			while(rs.next()){

				//获取字段名
				String feid = rs.getString("COLUMN_NAME");
				String typeName = rs.getString("TYPE_NAME");
				String remakes = rs.getString("REMARKS");
				feidNameList.add(feid);
				remakesList.add(remakes);
				classFeidNameList.add(getNameByFeidName(feid));
				typeNameList.add(typeName);
				String string = getTypeNameByFeidName(typeName);
				classTypeNameList.add(string);

            }
			tableInfo.setFeidNameList(feidNameList);
			tableInfo.setTypeNameList(typeNameList);
			tableInfo.setNumbers(feidNameList.size());
			tableInfo.setTableName(tableName);
			tableInfo.setClassName(className);
			tableInfo.setClassFeidNameList(classFeidNameList);
			tableInfo.setClassTypeNameList(classTypeNameList);
			tableInfo.setRemakesList(remakesList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tableInfo;
	}
	/**
	 * 通过字段类型获取类中的属性类型
	 * @param typeName
	 * @return
	 */
	private static String getTypeNameByFeidName(String feidTypeName) {
		String typeName = feidTypeName;
		if("INT".equals(typeName)){
			return "Integer";
		}else if("VARCHAR".equals(typeName)||"LONGTEXT".equals(typeName)||"TEXT".equals(typeName)||"DATETIME".equals(typeName)||"DATE".equals(typeName)){
			return "String";
		}else if("BIGINT".equals(typeName)){
			return "Integer";
		}else if("DECIMAL".equals(typeName)){
			return "BigDecimal";
		}else{
			return null;
		}
	}

	public static PreparedStatement preparedStatementInit(
			PreparedStatement prepareStatement,TableInfo tableInfo,Object obj,String source){
			int parameterIndex = 0;
			for(int i=0;i<tableInfo.getNumbers();i++){
				try {
					String feidName = tableInfo.getFeidNameList().get(i);
					String typeName = tableInfo.getTypeNameList().get(i);
					//通过字段名称--》得到字段对应的属性名称---》得到对应的get方法名称
					String methodName = getGetMethodNameByFeidName(feidName);
					Method method = obj.getClass().getDeclaredMethod(methodName);
					method.setAccessible(true);
					if("INT".equals(typeName)){
						prepareStatement.setInt(i+1, (int) method.invoke(obj, new Object[]{}));
					}else if("VARCHAR".equals(typeName)||"DATETIME".equals(typeName)||"DATE".equals(typeName)){
						prepareStatement.setString(i+1, (String) method.invoke(obj, new Object[]{}));
					}else if("DECIMAL".equals(typeName)){
						prepareStatement.setBigDecimal(i+1,(BigDecimal) method.invoke(obj, new Object[]{}));
					}
					parameterIndex = i;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if("updateById".equals(source)){
				try {
					Method method = obj.getClass().getMethod("getId");
					prepareStatement.setInt(parameterIndex+2,(int) method.invoke(obj, new Object[]{}) );
				}catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return prepareStatement;
	}
	/**
	 * 通过字段名获取对应的get方法名
	 * @param feidName 字段名称
	 * @return get方法名称
	 */
	public static String getGetMethodNameByFeidName(String feidName){
		String methodName = "";
		if(feidName.contains("_")){
			String[] feids = feidName.split("_");
			for(String str:feids){
				methodName += AutoCodeStringUtil.strUpp(str);
			}
			methodName = "get"+methodName;
		}else{
			feidName = AutoCodeStringUtil.strUpp(feidName);
			methodName = "get"+feidName;
		}
		return methodName;
	}
	/**
	 * 获取字段对应的set方法名称
	 * @param feidName
	 * @return
	 */
	public static String getSetMethodNameByFeidName(String feidName){
		String methodName = "";
		if(feidName.contains("_")){
			String[] feids = feidName.split("_");
			for(String str:feids){
				methodName += AutoCodeStringUtil.strUpp(str);
			}
			methodName = "set"+methodName;
		}else{
			feidName = AutoCodeStringUtil.strUpp(feidName);
			methodName = "set"+feidName;
		}
		return methodName;
	}
	/**
	 * 通过字段名获取属性名称
	 * @param feidName
	 * @return
	 */
	public static String getNameByFeidName(String feidName){
		String methodName = "";
		if(feidName.contains("_")){
			String[] feids = feidName.split("_");
			for(int i=0;i<feids.length;i++){
				String str = feids[i];
				if(i==0){
					methodName += str;
				}else{
					methodName += AutoCodeStringUtil.strUpp(str);
				}
			}
		}else{
			methodName = feidName;
		}
		return methodName;
	}
	
	/**
	 * 通过字段名获取属性名称
	 * @param feidName
	 * @return
	 */
	public static String getClassNameByTableName(String tableName){
		String methodName = "";
		if(tableName.contains("_")){
			String[] feids = tableName.split("_");
			for(int i=0;i<feids.length;i++){
				String str = feids[i];
				methodName += AutoCodeStringUtil.strUpp(str);
			}
		}else{
			methodName = AutoCodeStringUtil.strUpp(tableName);
		}
		return methodName;
	}
	
	/**
	 * 获取update语句中使用的字符串
	 * @param feidList
	 * @return
	 */
	public static String getUpdateStr(List<String> feidList){
		String str = "";
		for(int i=0;i<feidList.size();i++){
			String feid = feidList.get(i);
			if(i!=feidList.size()-1){
				str += feid+"=?,";
			}else{
				str += feid+"=?";
			}
		}
		return str;
	}
	
}
