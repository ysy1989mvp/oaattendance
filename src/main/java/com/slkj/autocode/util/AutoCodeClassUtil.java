package com.slkj.autocode.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AutoCodeClassUtil {
	public static String getOjectClassName(Object obj){
		return obj.getClass().getName();
	}
	/**
	 * 把查询到的数据封装成对象
	 * @param className 类的全名
	 * @param resultSet 查询返回的结果
	 * @param feidNameList 字段列表
	 * @param typeNameList 字段类型列表
	 * @return
	 */
	public static Object initObject(String className, ResultSet resultSet,List<String> feidNameList,List<String> typeNameList) {
		Object object = null;
		try {
			feidNameList.add("id");
			typeNameList.add("INT");
			Class<?> class1 = Class.forName(className);
			Constructor constructor = class1.getConstructor(new Class[]{});
			object = constructor.newInstance(new Object[]{});
			for(int i=0;i<feidNameList.size();i++){
				String feidName = feidNameList.get(i);
				String typeName = typeNameList.get(i);
				String methodName = AutoCodeTableUtil.getSetMethodNameByFeidName(feidName);
				Method method = null;
				if("INT".equals(typeName)){
					method = object.getClass().getDeclaredMethod(methodName,new Class[]{int.class});
					method.setAccessible(true);
					method.invoke(object, new Object[]{resultSet.getInt(feidName)});
				}else if("VARCHAR".equals(typeName)||"DATETIME".equals(typeName)||"DATE".equals(typeName)){
					method = object.getClass().getDeclaredMethod(methodName,new Class[]{String.class});
					method.setAccessible(true);
					method.invoke(object, new Object[]{resultSet.getString(feidName)});
				}else if("DECIMAL".equals(typeName)){
					method = object.getClass().getDeclaredMethod(methodName,new Class[]{BigDecimal.class});
					method.setAccessible(true);
					method.invoke(object, new Object[]{resultSet.getBigDecimal(feidName)});
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		feidNameList.remove(feidNameList.size()-1);
		typeNameList.remove(typeNameList.size()-1);
		return object;
	}
	public static String getSql(Object criteria, String tableName) {
		String sql = null;
		try {
			Method method = criteria.getClass().getDeclaredMethod("getSql",new Class[]{String.class});
			sql = (String) method.invoke(criteria, new Object[]{tableName});
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sql;
	}
	//object:StudentDAOImpl 方法调用者
	//methodName:方法名称
	//value:放进去的对象
	public static Object invokeMethod(Object object,String methodName,Object value){
		Object resultObj = null;
		try {
			if("selectAll".equals(methodName)){
				Method method = object.getClass().getMethod(methodName, new Class[]{});
				resultObj = method.invoke(object, new Object[]{});
			}else{
				Method method = object.getClass().getMethod(methodName, new Class[]{Object.class});
				resultObj = method.invoke(object, new Object[]{value});
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return resultObj;
	}
}
