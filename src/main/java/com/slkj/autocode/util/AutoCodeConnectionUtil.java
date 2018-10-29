package com.slkj.autocode.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

import com.slkj.autocode.configuration.Config;

import net.sf.json.JSONObject;

import java.util.Map;
import java.util.Properties;

import javax.naming.InitialContext;
/**
 * 
 * @author sunny Yang
 * @date 2017年11月9日
 * @discribe 获取数据库的连接对象和关闭连接
 *	连接池：从技术的角度来说，是线程池+JDBC的数据库连接的结合
 *	作用：能够优化数据库连接，减少服务器压力进行合理分配
 *	
 */

public class AutoCodeConnectionUtil {
	private static String driverClassName;//加载驱动
	private static String url;//连接数据库的路径
	private static String username;//数据库连接的用户
	private static String password;//密码
	private static Connection connection;//连接对象
	private static BasicDataSource dataSource;//连接池
	private static int initialSize;//初始化连接数
	private static int minIdle;//最小连接数
	private static void init(){
		dataSource = new BasicDataSource();
		JSONObject jsonObject = AutoYamlUtil.getYaml();
		JSONObject datasourceJsonObject = jsonObject.getJSONObject("spring").getJSONObject("datasource");
		initialSize = Integer.parseInt(datasourceJsonObject.get("initialSize").toString());
		minIdle = Integer.parseInt(datasourceJsonObject.get("minIdle").toString());
		driverClassName = datasourceJsonObject.get("driverClassName").toString();
		url = datasourceJsonObject.get("url").toString();
		username = datasourceJsonObject.get("username").toString();
		password = datasourceJsonObject.get("password").toString();
//		System.out.println(initialSize);
//		System.out.println(minIdle);
//		System.out.println(driverClassName);
//		System.out.println(url);
//		System.out.println(username);
//		System.out.println(password);
		//设置初始化连接
		dataSource.setInitialSize(initialSize);
		//设置最小空闲连接
		dataSource.setMinIdle(minIdle);
		//设置最大连接数
		//超时设置
		//加载驱动设置
		dataSource.setDriverClassName(driverClassName);
		//数据库连接路径设置
		dataSource.setUrl(url);
		//数据库用户名设置
		dataSource.setUsername(username);
		//数据库的密码设置
		dataSource.setPassword(password);
	}
	/**
	 * 用于获取数据库连接
	 * @return Connection
	 */
	public static synchronized Connection getConnection(){
		try {
			if(connection==null || connection.isClosed()){
				init();
//				connection = DriverManager.getConnection(url,user,password);
				connection = dataSource.getConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	/**
	 * 用于关闭数据库连接
	 * @param connection
	 */
	public static void close(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
