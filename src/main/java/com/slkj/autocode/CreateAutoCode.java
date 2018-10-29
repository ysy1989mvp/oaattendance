package com.slkj.autocode;


//import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.junit.Test;
import com.slkj.autocode.configuration.Config;
import com.slkj.autocode.configuration.StringContent;
import com.slkj.autocode.entity.TableInfo;
import com.slkj.autocode.util.AutoCodeFileUtil;
import com.slkj.autocode.util.AutoCodeStringUtil;
import com.slkj.autocode.util.AutoCodeTableUtil;

public class CreateAutoCode {

////	@Test
//	public void test(){
//		//配置文件的放置位置
//		String configUrl = "."+File.separator+"src"+File.separator+"main"+File.separator+"resources";
////		代码包
//		String packageName = "com.ysy.autocodetext";
////		代码放置路径
//		String codeUrl = "."+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+(packageName.replace(".",File.separator));
//		start("collective", "root", "123456", packageName);
//	}
	/**
	 * 
	 * @param packageName com.slkj.autocode
	 * service就在该包下面
	 */
	public void start(String dataBaseName,String user,String password,String packageName){
		String configPath = "."+File.separator+"src"+File.separator+"main"+File.separator+"resources";
//		代码放置路径
		String codePath = "."+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+(packageName.replace(".",File.separator));
		//生成build.gradle文件
//		createBuildGradle();
		//		生成application.yml文件
		createApplicationYMLFile(dataBaseName,user,password,configPath,packageName);
//		//创建mysql.xml配置文件
		createMysqlXMLFile(configPath);
		//创建mybatis_config.xml文件
		createMybatis_configXML(configPath);
		//创建mysql.xml中的配置表对应的entity对象文件
		createJavaByMysqlXML(packageName,codePath,configPath);
	}
	private void createMybatis_configXML(String configPath){
		String content = StringContent.MYBATISCONFIG_XML;
		String fileName = "mybatis_config.xml";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
	}
	private void createBuildGradle(){
		//gradle配置文件build.gradle内容
		String content = StringContent.BUID_GRADLE;
		String fileName = "build.gradle";
		String configPath = ".";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
	}
	private void createApplicationYMLFile(String dataBaseName,String user,String password, String configPath,String packageName){
		String content = StringContent.APPLICATION_YML;
		content = content.replace("collective", dataBaseName);
		content = content.replace("root", user);
		content = content.replace("123456", password);
		content = content.replace("com.slkj.gradletest", packageName);
		String fileName = "application.yml";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
	}
	private void createMysqlXMLFile(String configPath){
		String content = StringContent.MYSQL_XML;
		String fileName = "mysql.xml";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
	}
	
	private void createJavaByMysqlXML(String packageName, String codePath,String configPath){
		//创建controller包
		AutoCodeFileUtil.createDir(codePath+File.separator+"config");
		//创建controller包
		AutoCodeFileUtil.createDir(codePath+File.separator+"controller"+File.separator+"request");
//		创建controller包
		AutoCodeFileUtil.createDir(codePath+File.separator+"controller"+File.separator+"rest");
		//创建criteria包
		AutoCodeFileUtil.createDir(codePath+File.separator+"criteria");
		//创建dao包
		AutoCodeFileUtil.createDir(codePath+File.separator+"dao");
		//创建entity包
		AutoCodeFileUtil.createDir(codePath+File.separator+"entity"+File.separator+"mojo");
		AutoCodeFileUtil.createDir(codePath+File.separator+"entity"+File.separator+"pojo");
		//创建service包
		AutoCodeFileUtil.createDir(codePath+File.separator+"service");
		//创建serviceImpl包
		AutoCodeFileUtil.createDir(codePath+File.separator+"serviceImpl");
		//创建util包
		AutoCodeFileUtil.createDir(codePath+File.separator+"util");
		//创建mapper包
		AutoCodeFileUtil.createDir(configPath+File.separator+"mapper");
		//1.创建7个配置文件
		createMybatisConfiguration(packageName,codePath);
		createMyBatisMapperScannerConfig(packageName,codePath);
		createRedisConfig(packageName,codePath);
		createSessionConfig(packageName,codePath);
		createShiroConfiguration(packageName,codePath);
		createShiroRealm(packageName,codePath);
		createSwagger2Config(packageName,codePath);
		//2.创建两个模板类controller 一个负责ajax请求，一个负责页面跳转和数据传输
		createRestController(packageName,codePath);
		createRequestController(packageName,codePath);
		//3.创建util工具类
		createMD5Util(packageName,codePath);
		//4.创建application类用于springboot的启动
		createApplication(packageName,codePath);
		//5.创建main下面的webapp下的文件和目录
		createDirWebapp();
		//获取配置表、
		for(int i=0;i<Config.tableNameList.size();i++){//遍历表
			String tableName = Config.tableNameList.get(i);
			TableInfo tableInfo = AutoCodeTableUtil.getTableInfoList(tableName);
			System.out.println(tableInfo);
			//基本包名，即传入的参数
			tableInfo.setPackageName(packageName);
			//基本路径
			tableInfo.setPath(codePath);
//			System.out.println(tableInfo);
				//1.创建entity的pojo
				createEntity(tableInfo);
				//2.创建EntityCriteria
				createCriteria(tableInfo);
				//3.创建IDAO接口
				createIDAO(tableInfo);
				//4.创建mapper.xml文件
				createMapperXML(tableInfo);
				//5.创建Service接口
				createService(tableInfo);
				//6.创建ServiceImpl实现类
 				createServiceImpl(tableInfo);
				//7.创建mojo实体类AO
				createEntityAO(tableInfo);
				
		}
	}
	
	private void createRequestController(String packageName, String codePath) {
		String content=StringContent.REQUESTCONTROLLER;
		String nowDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		content = content.replace("2017年12月12日",nowDate);
		
		content = content.replace("com.slkj.collective_merchant", packageName);
		content = content.replace("MerchantUser", "User");
		content = content.replace("merchantUser", "user");
		content = content.replace("rest", "request");
		content = content.replace("Rest", "Request");
		content = content.replace("RequestController", "RestController");
		String fileName = codePath+"/controller/request/UserRequestController.java";
		AutoCodeFileUtil.createFile(fileName, content);
		
	}
	private void createRestController(String packageName, String codePath) {
		String content=StringContent.RESTCONTROLLER;
		
		
		String nowDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		content = content.replace("2017年12月12日",nowDate);
		
		content = content.replace("com.slkj.collective_merchant", packageName);
		content = content.replace("MerchantUser", "User");
		String fileName = codePath+"/controller/rest/UserRestController.java";
		AutoCodeFileUtil.createFile(fileName, content);
		
	}
	private void createMapperXML(TableInfo tableInfo) {
		String content = "";
		String content1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+
						"<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n"+
						"<!--  指定工作空间，要与接口名相同，源代码没有去看，猜测应该是通过\"这里的namespace.下边方法的id\"来定位方法的 -->\n"+
						"<mapper namespace=\"com.slkj.gradletest.dao.IMerchantUserDAO\">\n"+
						"	<resultMap id=\"BaseResultMap\" type=\"com.slkj.gradletest.entity.mojo.MerchantUserAO\" >\n";
		content += content1;
		String content2 = "";
		for(int i=0;i<tableInfo.getFeidNameList().size();i++){
			if("INT".equals(tableInfo.getTypeNameList().get(i))){
				content2 += "		<result column=\""+tableInfo.getFeidNameList().get(i)+"\" property=\""+tableInfo.getClassFeidNameList().get(i)+"\" jdbcType=\"BIGINT\" />\n";
			}else{
				content2 += "		<result column=\""+tableInfo.getFeidNameList().get(i)+"\" property=\""+tableInfo.getClassFeidNameList().get(i)+"\" jdbcType=\""+tableInfo.getTypeNameList().get(i)+"\" />\n";
			}
		}
		
		content += content2;
		content += "	</resultMap>\n"+
					"	<sql id=\"Base_Column_List\" >\n";
		String content3 = "		";
		for(int i=0;i<tableInfo.getFeidNameList().size();i++){
			if(i==tableInfo.getFeidNameList().size()-1){
				content3 += "`"+tableInfo.getFeidNameList().get(i)+"`"+"\n";
			}else{
				content3 += "`"+tableInfo.getFeidNameList().get(i)+"`"+",";
			}
		}
		content += content3;
		String content4 = "	</sql>\n"+
				"	<!-- 通过id查询实体对象 -->\n"+
				"	<select id=\"selectById\" resultMap=\"BaseResultMap\" parameterType=\"java.lang.Integer\" >\n"+
				"		select \n"+
				"		<include refid=\"Base_Column_List\" />\n"+
				"		from table_nameXX\n"+
				"		where id = #{id,jdbcType=BIGINT}\n"+
				"	</select>\n"+
				"	<!-- 通过查询标准查询实体对象集合 -->\n"+
				"	<select id=\"selectByCriteria\" resultMap=\"BaseResultMap\" parameterType=\"com.slkj.gradletest.criteria.MerchantUserCriteria\" >\n"+
				"		select \n"+
				"		<include refid=\"Base_Column_List\" />\n"+
				"		from table_nameXX\n"+
				"		 ${selectCondition123}\n"+
				"	</select>\n"+
				"	<!-- 通过id删除实体对象一般不直接删除 -->\n"+
				"	<delete id=\"deleteById\" parameterType=\"java.lang.Integer\" >\n"+
				"		<!--\n"+
				"		WARNING - @mbggenerated\n"+
				"		This element is automatically generated by MyBatis Generator, do not modify.\n"+
				"		-->\n"+
				"  		delete from table_nameXX\n"+
				"  		where id = #{id,jdbcType=BIGINT}\n"+
				"	</delete>\n"+
				"	<!-- 通过对象添加入数据库，因为封装的版本只针对mysql，所以id自增 -->\n"+
				"	<insert id=\"addMerchantUser\" parameterType=\"com.slkj.gradletest.entity.pojo.MerchantUser\"  keyProperty=\"id\" useGeneratedKeys=\"true\">\n"+
				"		insert into table_nameXX \n"+
				"		<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" >\n";
		content += content4;
		String content5 = "";
		for(int i=0;i<tableInfo.getFeidNameList().size();i++){
			if(i==tableInfo.getFeidNameList().size()-1){
				content5 += "			<if test=\""+tableInfo.getClassFeidNameList().get(i)+" != null\" >\n"+
				    	"				`"+tableInfo.getFeidNameList().get(i)+"`\n"+
				    	"			</if>\n";
			}else{
				content5 += "			<if test=\""+tableInfo.getClassFeidNameList().get(i)+" != null\" >\n"+
						"				`"+tableInfo.getFeidNameList().get(i)+"`, \n"+
						"			</if>\n";
			}
		}
		content += content5;
		String content6 = "		</trim>\n"+
							"		<trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >\n";
		content += content6;
		
		String content7 = "";
		for(int i=0;i<tableInfo.getFeidNameList().size();i++){
			if(i==tableInfo.getFeidNameList().size()-1){
				content7 += "			<if test=\""+tableInfo.getClassFeidNameList().get(i)+" != null\" >\n"+
						"				#{"+tableInfo.getClassFeidNameList().get(i)+",jdbcType="+tableInfo.getTypeNameList().get(i)+"}\n"+
						"			</if>\n";
			}else{
				content7 += "			<if test=\""+tableInfo.getClassFeidNameList().get(i)+" != null\" >\n"+
							"				#{"+tableInfo.getClassFeidNameList().get(i)+",jdbcType="+tableInfo.getTypeNameList().get(i)+"},\n"+
							"			</if>\n";
			}
		}
		content += content7;
		String content8 = 	"		</trim>\n"+
							"	</insert>\n"+
							"	<!-- 通过对象id修改对象修改数据 -->\n"+
							"	<update id=\"updateById\" parameterType=\"com.slkj.gradletest.entity.pojo.MerchantUser\" >\n"+
							"		update table_nameXX\n"+
							"		<set >\n";
		content += content8;
		String content9 = "";
		for(int i=0;i<tableInfo.getFeidNameList().size();i++){
			content9 += "			<if test=\""+tableInfo.getClassFeidNameList().get(i)+" != null\" >\n"+
						"				`"+tableInfo.getFeidNameList().get(i)+"` = #{"+tableInfo.getClassFeidNameList().get(i)+",jdbcType="+tableInfo.getTypeNameList().get(i)+"},\n"+
						"			</if>\n";
		}
		content += content9;
		String content10 = "		</set>\n"+
							"		where id = #{id,jdbcType=BIGINT}\n"+
							"	</update>\n"+
							"	<!-- 通过标准修改对象修改数据 -->\n"+
							"	<update id=\"updateByCriteria\" parameterType=\"com.slkj.gradletest.criteria.MerchantUserCriteria\" >\n"+
							"		update table_nameXX\n"+
							"		<set >\n";
		content += content10;
		content += content9;
		String content11 = "		</set>\n"+
							"		<where> \n"+
							"			<if test=\"condition123!=''\">\n"+
							"				${condition123}\n"+
							"			</if>\n"+
							"		</where>\n"+		
							"	</update>\n"+
							"	<delete id=\"deleteByCriteria\" parameterType=\"com.slkj.gradletest.criteria.MerchantUserCriteria\">\n"+
							"		delete from table_nameXX\n"+
							"		<where>\n"+
							"			<if test=\"condition123!=''\">\n"+
							"				${condition123}\n"+
							"			</if>\n"+
						  	"		</where>\n"+
					  		"	</delete>\n"+
					  		"	<select id=\"getFeidMaxByCriteria\" resultType=\"java.lang.Integer\" statementType=\"STATEMENT\">\n"+
					  		"		select IFNULL(max(`${feid123}`),0) from table_nameXX\n"+
							"		<where>\n"+
							"			<if test=\"condition123!=''\">\n"+
							"				${condition123}\n"+
							"			</if>\n"+
							"		</where>\n"+
							"	</select>\n"+
							"	<select id=\"getFeidMinByCriteria\" resultType=\"java.lang.Integer\" statementType=\"STATEMENT\">\n"+
							"		select IFNULL(min(`${feid123}`),0) from table_nameXX\n"+
							"		<where>\n"+
							"			<if test=\"condition123!=''\">\n"+
							"				${condition123}\n"+
							"			</if>\n"+
							"		</where>\n"+
							"	</select>\n"+
							"	<select id=\"getFeidAvgByCriteria\" resultType=\"java.lang.Integer\" statementType=\"STATEMENT\">\n"+
							"		select IFNULL(avg(`${feid123}`),0) from table_nameXX\n"+
							"		<where>\n"+
							"			<if test=\"condition123!=''\">\n"+
							"				${condition123}\n"+
							"			</if>\n"+
							"		</where>\n"+
							"	</select>\n"+
							"	<select id=\"getFeidSumByCriteria\" resultType=\"java.lang.Integer\"  statementType=\"STATEMENT\">\n"+
							"		select IFNULL(sum(`${feid123}`),0) from table_nameXX\n"+
							"		<where>\n"+
							"			<if test=\"condition123!=''\">\n"+
							"				${condition123}\n"+
							"			</if>\n"+
							"		</where>\n"+
							"	</select>\n"+
							"	<select id=\"getFeidCountByCriteria\" resultType=\"java.lang.Integer\" parameterType=\"com.slkj.gradletest.criteria.MerchantUserCriteria\">\n"+
							"		select IFNULL(count(*),0) from table_nameXX\n"+
							"		<where>\n"+
							"			<if test=\"condition123!=''\">\n"+
							"				${condition123}\n"+
							"			</if>\n"+
							"		</where>\n"+
							"	</select>\n"+
							"</mapper>";
		content += content11;
		content = content.replace("com.slkj.gradletest", tableInfo.getPackageName());
		content = content.replace("MerchantUser", tableInfo.getClassName());
		content = content.replace("table_nameXX", "`"+tableInfo.getTableName()+"`");
		content = content.replace("DATETIME", "TIMESTAMP");
		String fileName = tableInfo.getClassName()+".xml";
		String configPath = "./src/main/resources/mapper";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
	}
	
	private void createDirWebapp() {
//		String configPath = "./src/main/webapp/META-INF";
//		//创建webapp目录
//		AutoCodeFileUtil.createDir(configPath);
		
		String configPath = "./src/main/resources/static/css";
		//创建static目录
		AutoCodeFileUtil.createDir(configPath);
		
		configPath = "./src/main/resources/static/imgs";
		//创建static目录
		AutoCodeFileUtil.createDir(configPath);
		
		configPath = "./src/main/resources/static/javascript";
		//创建static目录
		AutoCodeFileUtil.createDir(configPath);
		
		configPath = "./src/main/resources/static/jsrequest";
		//创建static目录
		AutoCodeFileUtil.createDir(configPath);
		
		configPath = "./src/main/resources/swagger";
		//创建static目录
		AutoCodeFileUtil.createDir(configPath);
		
//		configPath = "./src/main/webapp/WEB-INF/lib";
//		//创建static目录
//		AutoCodeFileUtil.createDir(configPath);
		
		configPath = "./src/main/resources/templates";
		//创建static目录
		AutoCodeFileUtil.createDir(configPath);
		
//		String content = "Manifest-Version: 1.0\n"+"Class-Path: ";
//		String configPath1 = "./src/main/webapp/META-INF";
//		String fileName = "MANIFEST.MF";
//		AutoCodeFileUtil.createFile(configPath1+File.separator+fileName, content);
	}

	private void createApplication(String packageName, String codePath) {
		String content = StringContent.APPLICATION_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath;
		String fileName = "Application.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
	}
	
	private void createMD5Util(String packageName, String codePath) {
		String content = StringContent.MD5Util_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath+"/util";
		String fileName = "MD5Util.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
		
	}
	
	private void createSwagger2Config(String packageName, String codePath) {
		String content = StringContent.SWAGGER2CONFIG_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath+"/config";
		String fileName = "Swagger2Config.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
		
	}
	
	private void createShiroRealm(String packageName, String codePath) {
		String content = StringContent.SHIROREALM_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath+"/config";
		String fileName = "ShiroRealm.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
		
	}
	
	private void createShiroConfiguration(String packageName, String codePath) {
		String content = StringContent.SHIROCONFIGURATION_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath+"/config";
		String fileName = "ShiroConfiguration.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
		
	}
	
	private void createSessionConfig(String packageName, String codePath) {
		String content = StringContent.SESSIONCONFIG_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath+"/config";
		String fileName = "SessionConfig.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
		
	}
	
	private void createRedisConfig(String packageName, String codePath) {
		String content = StringContent.REDISCONFIG_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath+"/config";
		String fileName = "RedisConfig.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
		
	}
	
	private void createMyBatisMapperScannerConfig(String packageName, String codePath) {
		String content = StringContent.MYBATISMAPPERSCANNERCONFIG_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath+"/config";
		String fileName = "MyBatisMapperScannerConfig.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
		
	}
	
	private void createMybatisConfiguration(String packageName, String codePath) {
		String content = StringContent.MYBATISCONFIGURATION_JAVA;
		content = content.replace("com.slkj.gradletest", packageName);
		String configPath = codePath+"/config";
		String fileName = "MybatisConfiguration.java";
		AutoCodeFileUtil.createFile(configPath+File.separator+fileName, content);
		
	}
	
	private void createEntityAO(TableInfo tableInfo) {
		String content = StringContent.ENTITYAO_JAVA;
		content = content.replace("MerchantUser", tableInfo.getClassName());
		content = content.replace("com.slkj.gradletest", tableInfo.getPackageName());
		String nowDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		content = content.replace("2017年12月12日",nowDate);
		String fileName = tableInfo.getPath()+"/entity/mojo/"+tableInfo.getClassName()+"AO.java";
		AutoCodeFileUtil.createFile(fileName, content);
	}
	
	private void createServiceImpl(TableInfo tableInfo) {
		String content=StringContent.SERVICEIMPL;
		content = content.replace("com.slkj.gradletest", tableInfo.getPackageName());
		content = content.replace("MerchantUser", tableInfo.getClassName());
		content = content.replace("merchantUser", AutoCodeStringUtil.strDown(tableInfo.getClassName()));
		String fileName = tableInfo.getPath()+"/serviceImpl/"+tableInfo.getClassName()+"Service.java";
		AutoCodeFileUtil.createFile(fileName, content);
		
	}
	
	//
	private void createService(TableInfo tableInfo) {
		String content = StringContent.SERVICE_JAVA;
		content = content.replace("MerchantUser", tableInfo.getClassName());
		content = content.replace("com.slkj.gradletest", tableInfo.getPackageName());
		String fileName = tableInfo.getPath()+"/service/I"+tableInfo.getClassName()+"Service.java";
		AutoCodeFileUtil.createFile(fileName, content);
	}
	
/*//	private void createDAOImpl(TableInfo tableInfo) {
//		String content="package "+tableInfo.getPackageName()+".daoImpl;\n"+
//						"\n"+
//						"import "+tableInfo.getPackageName()+".criteria.StudentCriteria;\n"+
//						"import com.slkj.autocode.daoImpl.BaseDao;\n"+
//						"import "+tableInfo.getPackageName()+".dao.IStudentDAO;\n"+
//						"import "+tableInfo.getPackageName()+".entity.gen.Student;\n"+
//						"\n"+
//						"public class StudentDAOImpl extends BaseDao<Student,StudentCriteria> implements IStudentDAO{\n"+
//						"	public String getThisObjectClassName(){\n"+
//						"		return Student.class.getName();\n"+
//						"	}\n"+
//						"}";
//		content = content.replace("Student", tableInfo.getClassName());
//		
//		
//		String fileName = tableInfo.getPath()+"/daoImpl/"+tableInfo.getClassName()+"DAOImpl.java";
//		AutoCodeFileUtil.createFile(fileName, content);
//		
//	}
*/	
	
	//
	private void createIDAO(TableInfo tableInfo) {
		String content = StringContent.DAO_JAVA;
		content = content.replace("com.slkj.gradletest", tableInfo.getPackageName());
		content = content.replace("MerchantUser", tableInfo.getClassName());
		content = content.replace("merchantUser", AutoCodeStringUtil.strDown(tableInfo.getClassName()));
		String fileName = tableInfo.getPath()+"/dao/I"+tableInfo.getClassName()+"DAO.java";
		AutoCodeFileUtil.createFile(fileName, content);
		
	}
	
	//
	private void createCriteria(TableInfo tableInfo) {
		String content="";
		String content1 = StringContent.CRITERIA_JAVA;
		content1 = content1.replace("com.xjj.loanplatform1", tableInfo.getPackageName());
		
		content += content1;
		//----------------------------------
		String content2 = "";
		String spp = "";
		for(int i=0;i<tableInfo.getClassFeidNameList().size();i++){
			String string0 = StringContent.CRITERIA0_JAVA;
			
			String string1 = StringContent.CRITERIA1_JAVA;
			String string = "";
			if(tableInfo.getClassTypeNameList().get(i).equals("Integer")||tableInfo.getClassTypeNameList().get(i).equals("int")||tableInfo.getClassTypeNameList().get(i).equals("BigDecimal")){
				string = string0;
			}else{
				
				string = string1;
			}
			String str = AutoCodeStringUtil.strUpp(tableInfo.getClassFeidNameList().get(i));
			spp += "\t\tsuper.set"+str+"(withdrawInfo.get"+str+"());\n";
			string = string.replace("idXXX", tableInfo.getClassFeidNameList().get(i));
			string = string.replace("IdXXX", str);
			string = string.replace("id_XXX", tableInfo.getFeidNameList().get(i));
			content2 += string;
		}
		content += content2;
		String sp = "\tprivate void initWithdrawInfo(WithdrawInfo withdrawInfo) {\n";
		content += sp;
		content += spp;
		content += "\n\t}\n\n}";
		content = content.replace("WithdrawInfo", tableInfo.getClassName());
		content = content.replace("WithdrawInfo", tableInfo.getClassName());
		content = content.replace("withdrawInfo", AutoCodeStringUtil.strDown(tableInfo.getClassName()));
		String nowDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		content = content.replace("2017年11月11日",nowDate);
		
		//------------------------------------------
		String fileName = tableInfo.getPath()+"/criteria/"+tableInfo.getClassName()+"Criteria.java";
		AutoCodeFileUtil.createFile(fileName, content);
		
	}
	//
	
	private void createEntity(TableInfo tableInfo) {
		String content = "";
		String content1 = StringContent.ENTITYPOJO_JAVA1;
		content1 = content1.replace("com.slkj.gradletest", tableInfo.getPackageName());
		content1 = content1.replace("MerchantUser", tableInfo.getClassName());
		content += content1;
		//属性设置
		String content2 = "";
		for(int i=0;i<tableInfo.getClassFeidNameList().size();i++){
			content2 +="\t//"+tableInfo.getRemakesList().get(i)+"\n\t"+"private "+tableInfo.getClassTypeNameList().get(i)+" "+tableInfo.getClassFeidNameList().get(i)+";\n";
		}
		content += content2;
		//构造方法
		String content3 = "\t"+"public leimingXX() {\n"+
		"\n"+
		"\n\t}\n";
		content3 = content3.replace("leimingXX", tableInfo.getClassName());
		content += content3;
		//geters and setters
		String content4 = "";
		for(int i=0;i<tableInfo.getClassFeidNameList().size();i++){
			String content5 = "\t"+"public "+tableInfo.getClassTypeNameList().get(i)+" getfangfamingXX() {\n"+
					"\t\t"+"return shuxingmingXX;\n"+
					"\t"+"}\n"+
						"\n"+
					"\t"+"public void setfangfamingXX("+tableInfo.getClassTypeNameList().get(i)+" shuxingmingXX) {\n"+
					"\t\t"+"this.shuxingmingXX = shuxingmingXX;\n"+
					"\t"+"}\n\n";
			content5 = content5.replace("fangfamingXX", AutoCodeStringUtil.strUpp(tableInfo.getClassFeidNameList().get(i)));
			content5 = content5.replace("shuxingmingXX", tableInfo.getClassFeidNameList().get(i));
			content4 += content5;
		}
		content += content4;
		//toString 方法
		String content6 = "public String toString() {\n\t\treturn \""+tableInfo.getClassName()+" [";
		for(int i=0;i<tableInfo.getClassFeidNameList().size();i++){
			String string = "";
			if(i!=tableInfo.getClassFeidNameList().size()-1){
				string = "shuxingmingXX=\" + shuxingmingXX + \", ";
			}else{
				string = "shuxingmingXX=\" + shuxingmingXX+\"]\";";
			}
			string = string.replace("shuxingmingXX", tableInfo.getClassFeidNameList().get(i));
			content6 += string;
		}
		content6 += "\n\t}";
		content += content6;
		content += "\n}";
		String nowDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		content = content.replace("2017年12月20日",nowDate);
		String fileName = tableInfo.getPath()+"/entity/pojo/"+tableInfo.getClassName()+".java";
		AutoCodeFileUtil.createFile(fileName, content);
		System.out.println(fileName+"创建完成");
	}
	
}
