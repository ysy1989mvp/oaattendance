package com.slkj.autocode.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Config {
	public static HashMap<String, String> classMap;//表名是key，类名是value
	public static HashMap<String, String> tableMap;//类名是key，表名是value
	public static List<String> tableNameList;
	public static List<String> classNameList;
	static{
			classMap = new HashMap<String,String>();
			tableMap = new HashMap<String,String>();
			tableNameList = new ArrayList<String>();
			classNameList = new ArrayList<String>();
			//创建SAXReader解析类的对象
			SAXReader sr = new SAXReader();
			//对接文件，获得Document对象
			Document document;
			try {
				String url = "mysql.xml";
				document = sr.read(Config.class.getClassLoader().getResourceAsStream(url));
				
				//通过document获得根元素（根节点）
				Element element = document.getRootElement();
				List<Element> elements = element.elements();
				for(Element ele:elements){
					String tableName = ele.attribute("id").getValue();
					String className = ele.attribute("class").getValue();
					if("table_name".equals(tableName)&&"className".equals(className)){
						continue;
					}
					classMap.put(tableName, className);
					tableMap.put(className,tableName);
					tableNameList.add(tableName);
					classNameList.add(className);
				}
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
