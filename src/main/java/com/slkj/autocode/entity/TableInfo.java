package com.slkj.autocode.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author sunny Yang
 * @date 2017年11月10日
 * @discribe 表的信息
 *
 *
 */
public class TableInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tableName;//表名
	private String className;//类名
	private String packageName;//包名
	private List<String> remakesList;
	private List<String> classTypeNameList;//类中的字段类型
	private List<String> classFeidNameList;//类中的属性名称
	private String path;//文件路径
	//表的字段，map中的key是字段名，value是字段的类型
	private List<String> feidNameList;
	private List<String> typeNameList;
	private int numbers;//字段的个数
//	private String fiedStr;//所有字段的名称中间加‘,’拼接而成的字符串
//	private String str;//问号拼接，用于sql问号字符串
	public TableInfo() {
		
	}
	
	public TableInfo(String tableName, List<String> feidNameList, List<String> typeNameList, int numbers,
			String fiedStr, String str) {
		super();
		this.tableName = tableName;
		this.feidNameList = feidNameList;
		this.typeNameList = typeNameList;
		this.numbers = numbers;
	}

	public List<String> getRemakesList() {
		return remakesList;
	}

	public void setRemakesList(List<String> remakesList) {
		this.remakesList = remakesList;
	}

	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<String> getFeidNameList() {
		return feidNameList;
	}
	public void setFeidNameList(List<String> feidNameList) {
		this.feidNameList = feidNameList;
	}
	public List<String> getTypeNameList() {
		return typeNameList;
	}
	public void setTypeNameList(List<String> typeNameList) {
		this.typeNameList = typeNameList;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<String> getClassTypeNameList() {
		return classTypeNameList;
	}

	public void setClassTypeNameList(List<String> classTypeNameList) {
		this.classTypeNameList = classTypeNameList;
	}

	public List<String> getClassFeidNameList() {
		return classFeidNameList;
	}

	public void setClassFeidNameList(List<String> classFeidNameList) {
		this.classFeidNameList = classFeidNameList;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "TableInfo [tableName=" + tableName + ", className=" + className + ", packageName=" + packageName
				+ ", classTypeNameList=" + classTypeNameList + ", classFeidNameList=" + classFeidNameList + ", path="
				+ path + ", feidNameList=" + feidNameList + ", typeNameList=" + typeNameList + ", numbers=" + numbers
				+ "]";
	}

	

	
	
	
	
	

}
