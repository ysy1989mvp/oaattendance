package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.EmployeeBasicInformation;

/**
* 
* @author sunny Yang [杨松彦]
* @QQ 550358261
* @date 2018-04-16
* @discribe
* >、<、>=、<=、=、!=、like、
* is null、is not null、in、not in
*
*/
public class EmployeeBasicInformationCriteria extends EmployeeBasicInformation{
	/**
	* 版本号
	*/
	private static final long serialVersionUID = 1L;
	private String groupBy123;//分组
	private String having123;//分组过滤
	private String orderBy123;//排序
	private Page page123;
	private String condition123="";//纯条件
	private String selectCondition123;//查询条件
	private String sql123;
	private EmployeeBasicInformation employeeBasicInformation;
	private String feid123;//字段用于统计查询时设置

	public EmployeeBasicInformationCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public EmployeeBasicInformation getEmployeeBasicInformation() {
		return employeeBasicInformation;
	}
	public void setEmployeeBasicInformation(EmployeeBasicInformation employeeBasicInformation) {
		this.employeeBasicInformation = employeeBasicInformation;
		initEmployeeBasicInformation(employeeBasicInformation);
	}

	public String getSql123() {
		return sql123;
	}

	public void setSql123(String sql123) {
		this.sql123 = sql123;
	}

	public String getSelectCondition123() {
		if(selectCondition123==null){
			if(condition123.trim().length()>0){
				condition123 = "where "+condition123;
			}
			selectCondition123 = condition123;
			if(groupBy123!=null){
				selectCondition123 += " group by "+groupBy123+" ";
			}
			if(having123!=null){
				selectCondition123 += "having "+having123+" ";
			}
			if(orderBy123!=null){
				selectCondition123 += "order by "+orderBy123+" ";
			}
			if(page123!=null){
				selectCondition123 += "limit "+((page123.getPageNumber()-1)*page123.getPageSize())+","+page123.getPageSize();
			}
			selectCondition123 = selectCondition123.trim();
		}
		System.out.println("查询条件："+selectCondition123);
		return selectCondition123;
	}
	public void setSelectCondition123(String selectCondition) {
		this.selectCondition123 = selectCondition;
	}
	public String getCondition123() {
		System.out.println("纯条件："+condition123);
		return condition123;
	}
	public void setCondition123(String condition) {
		this.condition123 = condition;
	}
	public EmployeeBasicInformationCriteria page(Page value){
		page123 = value;
		return this;
	}
	public EmployeeBasicInformationCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public EmployeeBasicInformationCriteria having(String value){
		having123 = value;
		return this;
	}
	public EmployeeBasicInformationCriteria orderBy(String value){
		orderBy123 = value;
		return this;
	}

	/*public String getSqlAll(String tableName){
		String sql = "";
		if("where ".equals(condition123)){
			sql = "select * from `"+tableName+"` ";
		}else{
			sql = "select * from `"+tableName+"` "+condition123+" ";
		}
		if(groupBy123!=null){
			sql += sql+" group by "+groupBy123+" ";
		}
		if(having123!=null){
			sql += "having "+having123+" ";
		}
		if(orderBy123!=null){
			sql += "order by "+orderBy123+" ";
		}
		if(page123!=null){
			sql += "limit "+((page123.getPageNumber()-1)*page123.getPageSize())+","+page123.getPageSize();
		}
		sql = sql.trim();
		return sql; 
	}*/

/************以下为纯条件的拼接*******************/

	public EmployeeBasicInformationCriteria andEmployeeIdEquals(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "and `employee_id`="+employeeId+" ";
			}else{
				condition123 += "`employee_id`="+employeeId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmployeeIdEquals(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "or `employee_id`="+employeeId+" ";
			}else{
				condition123 += "`employee_id`="+employeeId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeIdNotEquals(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "and `employee_id`!="+employeeId+" ";
			}else{
				condition123 += "`employee_id`!="+employeeId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdNotEquals(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "or `employee_id`!="+employeeId+" ";
			}else{
				condition123 += "`employee_id`!="+employeeId+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andEmployeeIdGreaterThan(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "and `employee_id`>"+employeeId+" ";
			}else{
				condition123 += "`employee_id`>"+employeeId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdGreaterThan(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "or `employee_id`>"+employeeId+" ";
			}else{
				condition123 += "`employee_id`>"+employeeId+" ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andEmployeeIdLessThan(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "and `employee_id`<"+employeeId+" ";
			}else{
				condition123 += "`employee_id`<"+employeeId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdLessThan(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "or `employee_id`<"+employeeId+" ";
			}else{
				condition123 += "`employee_id`<"+employeeId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeIdGreadterThanAndEquals(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "and `employee_id`>="+employeeId+" ";
			}else{
				condition123 += "`employee_id`>="+employeeId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdGreadterThanAndEquals(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "or `employee_id`>="+employeeId+" ";
			}else{
				condition123 += "`employee_id`>="+employeeId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeIdLessThanAndEquals(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "and `employee_id`<="+employeeId+" ";
			}else{
				condition123 += "`employee_id`<="+employeeId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdLessThanAndEquals(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "or `employee_id`<="+employeeId+" ";
			}else{
				condition123 += "`employee_id`<="+employeeId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeIdLike(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "and `employee_id` like "+employeeId+" ";
			}else{
				condition123 += "`employee_id` like "+employeeId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdLike(Integer employeeId){
		if(employeeId!=null){
			if(condition123.length()>0){
				condition123 += "or `employee_id` like "+employeeId+" ";
			}else{
				condition123 += "`employee_id` like "+employeeId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `employee_id` is null";
			}else{
				condition123 += "`employee_id` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `employee_id` is null";
		}else{
			condition123 += "`employee_id` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andEmployeeIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `employee_id` is not null";
		}else{
			condition123 += "`employee_id` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `employee_id` is not null";
		}else{
			condition123 += "`employee_id` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andEmployeeIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `employee_id` in("+value+") ";
			}else{
				condition123 += "`employee_id` in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `employee_id` in("+value+") ";
			}else{
				condition123 += "`employee_id` in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andEmployeeIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `employee_id` not in("+value+") ";
			}else{
				condition123 += "`employee_id` not in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `employee_id` not in("+value+") ";
			}else{
				condition123 += "`employee_id` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andWorkIdEquals(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "and `work_id`="+workId+" ";
			}else{
				condition123 += "`work_id`="+workId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orWorkIdEquals(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "or `work_id`="+workId+" ";
			}else{
				condition123 += "`work_id`="+workId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andWorkIdNotEquals(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "and `work_id`!="+workId+" ";
			}else{
				condition123 += "`work_id`!="+workId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdNotEquals(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "or `work_id`!="+workId+" ";
			}else{
				condition123 += "`work_id`!="+workId+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andWorkIdGreaterThan(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "and `work_id`>"+workId+" ";
			}else{
				condition123 += "`work_id`>"+workId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdGreaterThan(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "or `work_id`>"+workId+" ";
			}else{
				condition123 += "`work_id`>"+workId+" ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andWorkIdLessThan(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "and `work_id`<"+workId+" ";
			}else{
				condition123 += "`work_id`<"+workId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdLessThan(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "or `work_id`<"+workId+" ";
			}else{
				condition123 += "`work_id`<"+workId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andWorkIdGreadterThanAndEquals(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "and `work_id`>="+workId+" ";
			}else{
				condition123 += "`work_id`>="+workId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdGreadterThanAndEquals(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "or `work_id`>="+workId+" ";
			}else{
				condition123 += "`work_id`>="+workId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andWorkIdLessThanAndEquals(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "and `work_id`<="+workId+" ";
			}else{
				condition123 += "`work_id`<="+workId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdLessThanAndEquals(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "or `work_id`<="+workId+" ";
			}else{
				condition123 += "`work_id`<="+workId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andWorkIdLike(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "and `work_id` like "+workId+" ";
			}else{
				condition123 += "`work_id` like "+workId+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdLike(Integer workId){
		if(workId!=null){
			if(condition123.length()>0){
				condition123 += "or `work_id` like "+workId+" ";
			}else{
				condition123 += "`work_id` like "+workId+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andWorkIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `work_id` is null";
			}else{
				condition123 += "`work_id` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `work_id` is null";
		}else{
			condition123 += "`work_id` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andWorkIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `work_id` is not null";
		}else{
			condition123 += "`work_id` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `work_id` is not null";
		}else{
			condition123 += "`work_id` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andWorkIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `work_id` in("+value+") ";
			}else{
				condition123 += "`work_id` in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `work_id` in("+value+") ";
			}else{
				condition123 += "`work_id` in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andWorkIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `work_id` not in("+value+") ";
			}else{
				condition123 += "`work_id` not in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orWorkIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `work_id` not in("+value+") ";
			}else{
				condition123 += "`work_id` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andPasswordEquals(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `password`='"+password+"' ";
			}else{
				condition123 += "`password`='"+password+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPasswordEquals(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `password`='"+password+"' ";
			}else{
				condition123 += "`password`='"+password+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPasswordNotEquals(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `password`!='"+password+"' ";
			}else{
				condition123 += "`password`!='"+password+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPasswordNotEquals(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `password`!='"+password+"' ";
			}else{
				condition123 += "`password`!='"+password+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andPasswordGreaterThan(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `password`>'"+password+"' ";
			}else{
				condition123 += "`password`>'"+password+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPasswordGreaterThan(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `password`>'"+password+"' ";
			}else{
				condition123 += "`password`>'"+password+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andPasswordLessThan(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `password`<'"+password+"' ";
			}else{
				condition123 += "`password`<'"+password+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPasswordLessThan(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `password`<'"+password+"' ";
			}else{
				condition123 += "`password`<'"+password+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPasswordGreadterThanAndEquals(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `password`>='"+password+"' ";
			}else{
				condition123 += "`password`>='"+password+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPasswordGreadterThanAndEquals(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `password`>='"+password+"' ";
			}else{
				condition123 += "`password`>='"+password+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPasswordLessThanAndEquals(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `password`<='"+password+"' ";
			}else{
				condition123 += "`password`<='"+password+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPasswordLessThanAndEquals(String password){
		if(password!=null&&password.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `password`<='"+password+"' ";
			}else{
				condition123 += "`password`<='"+password+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPasswordLike(String password){
		if(password!=null&&password.trim().length()>0&&!("%".equals(password.trim()))&&!("%%".equals(password.trim()))){
			if(condition123.length()>0){
				condition123 += "and `password` like '"+password+"' ";
			}else{
				condition123 += "`password` like '"+password+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPasswordLike(String password){
		if(password!=null&&password.trim().length()>0&&!("%".equals(password.trim()))&&!("%%".equals(password.trim()))){
			if(condition123.length()>0){
				condition123 += "or `password` like '"+password+"' ";
			}else{
				condition123 += "`password` like '"+password+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPasswordIsNull(){
			if(condition123.length()>0){
				condition123 += "and `password` is null";
			}else{
				condition123 += "`password` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orPasswordIsNull(){
		if(condition123.length()>0){
			condition123 += "or `password` is null";
		}else{
			condition123 += "`password` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andPasswordIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `password` is not null";
		}else{
			condition123 += "`password` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPasswordIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `password` is not null";
		}else{
			condition123 += "`password` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPasswordIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `password` in("+value+") ";
			}else{
				condition123 += "`password` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPasswordIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `password` in("+value+") ";
			}else{
				condition123 += "`password` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPasswordNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `password` not in("+value+") ";
			}else{
				condition123 += "`password` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPasswordNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `password` not in("+value+") ";
			}else{
				condition123 += "`password` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andNameEquals(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `name`='"+name+"' ";
			}else{
				condition123 += "`name`='"+name+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orNameEquals(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `name`='"+name+"' ";
			}else{
				condition123 += "`name`='"+name+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNameNotEquals(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `name`!='"+name+"' ";
			}else{
				condition123 += "`name`!='"+name+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNameNotEquals(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `name`!='"+name+"' ";
			}else{
				condition123 += "`name`!='"+name+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andNameGreaterThan(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `name`>'"+name+"' ";
			}else{
				condition123 += "`name`>'"+name+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNameGreaterThan(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `name`>'"+name+"' ";
			}else{
				condition123 += "`name`>'"+name+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andNameLessThan(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `name`<'"+name+"' ";
			}else{
				condition123 += "`name`<'"+name+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNameLessThan(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `name`<'"+name+"' ";
			}else{
				condition123 += "`name`<'"+name+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNameGreadterThanAndEquals(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `name`>='"+name+"' ";
			}else{
				condition123 += "`name`>='"+name+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNameGreadterThanAndEquals(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `name`>='"+name+"' ";
			}else{
				condition123 += "`name`>='"+name+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNameLessThanAndEquals(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `name`<='"+name+"' ";
			}else{
				condition123 += "`name`<='"+name+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNameLessThanAndEquals(String name){
		if(name!=null&&name.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `name`<='"+name+"' ";
			}else{
				condition123 += "`name`<='"+name+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNameLike(String name){
		if(name!=null&&name.trim().length()>0&&!("%".equals(name.trim()))&&!("%%".equals(name.trim()))){
			if(condition123.length()>0){
				condition123 += "and `name` like '"+name+"' ";
			}else{
				condition123 += "`name` like '"+name+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNameLike(String name){
		if(name!=null&&name.trim().length()>0&&!("%".equals(name.trim()))&&!("%%".equals(name.trim()))){
			if(condition123.length()>0){
				condition123 += "or `name` like '"+name+"' ";
			}else{
				condition123 += "`name` like '"+name+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNameIsNull(){
			if(condition123.length()>0){
				condition123 += "and `name` is null";
			}else{
				condition123 += "`name` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orNameIsNull(){
		if(condition123.length()>0){
			condition123 += "or `name` is null";
		}else{
			condition123 += "`name` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `name` is not null";
		}else{
			condition123 += "`name` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `name` is not null";
		}else{
			condition123 += "`name` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNameIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `name` in("+value+") ";
			}else{
				condition123 += "`name` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orNameIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `name` in("+value+") ";
			}else{
				condition123 += "`name` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNameNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `name` not in("+value+") ";
			}else{
				condition123 += "`name` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orNameNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `name` not in("+value+") ";
			}else{
				condition123 += "`name` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andGenderEquals(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `gender`='"+gender+"' ";
			}else{
				condition123 += "`gender`='"+gender+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orGenderEquals(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `gender`='"+gender+"' ";
			}else{
				condition123 += "`gender`='"+gender+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andGenderNotEquals(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `gender`!='"+gender+"' ";
			}else{
				condition123 += "`gender`!='"+gender+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orGenderNotEquals(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `gender`!='"+gender+"' ";
			}else{
				condition123 += "`gender`!='"+gender+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andGenderGreaterThan(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `gender`>'"+gender+"' ";
			}else{
				condition123 += "`gender`>'"+gender+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orGenderGreaterThan(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `gender`>'"+gender+"' ";
			}else{
				condition123 += "`gender`>'"+gender+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andGenderLessThan(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `gender`<'"+gender+"' ";
			}else{
				condition123 += "`gender`<'"+gender+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orGenderLessThan(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `gender`<'"+gender+"' ";
			}else{
				condition123 += "`gender`<'"+gender+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andGenderGreadterThanAndEquals(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `gender`>='"+gender+"' ";
			}else{
				condition123 += "`gender`>='"+gender+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orGenderGreadterThanAndEquals(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `gender`>='"+gender+"' ";
			}else{
				condition123 += "`gender`>='"+gender+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andGenderLessThanAndEquals(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `gender`<='"+gender+"' ";
			}else{
				condition123 += "`gender`<='"+gender+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orGenderLessThanAndEquals(String gender){
		if(gender!=null&&gender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `gender`<='"+gender+"' ";
			}else{
				condition123 += "`gender`<='"+gender+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andGenderLike(String gender){
		if(gender!=null&&gender.trim().length()>0&&!("%".equals(gender.trim()))&&!("%%".equals(gender.trim()))){
			if(condition123.length()>0){
				condition123 += "and `gender` like '"+gender+"' ";
			}else{
				condition123 += "`gender` like '"+gender+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orGenderLike(String gender){
		if(gender!=null&&gender.trim().length()>0&&!("%".equals(gender.trim()))&&!("%%".equals(gender.trim()))){
			if(condition123.length()>0){
				condition123 += "or `gender` like '"+gender+"' ";
			}else{
				condition123 += "`gender` like '"+gender+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andGenderIsNull(){
			if(condition123.length()>0){
				condition123 += "and `gender` is null";
			}else{
				condition123 += "`gender` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orGenderIsNull(){
		if(condition123.length()>0){
			condition123 += "or `gender` is null";
		}else{
			condition123 += "`gender` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andGenderIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `gender` is not null";
		}else{
			condition123 += "`gender` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orGenderIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `gender` is not null";
		}else{
			condition123 += "`gender` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andGenderIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `gender` in("+value+") ";
			}else{
				condition123 += "`gender` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orGenderIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `gender` in("+value+") ";
			}else{
				condition123 += "`gender` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andGenderNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `gender` not in("+value+") ";
			}else{
				condition123 += "`gender` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orGenderNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `gender` not in("+value+") ";
			}else{
				condition123 += "`gender` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andAgeEquals(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "and `age`="+age+" ";
			}else{
				condition123 += "`age`="+age+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orAgeEquals(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "or `age`="+age+" ";
			}else{
				condition123 += "`age`="+age+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andAgeNotEquals(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "and `age`!="+age+" ";
			}else{
				condition123 += "`age`!="+age+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeNotEquals(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "or `age`!="+age+" ";
			}else{
				condition123 += "`age`!="+age+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andAgeGreaterThan(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "and `age`>"+age+" ";
			}else{
				condition123 += "`age`>"+age+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeGreaterThan(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "or `age`>"+age+" ";
			}else{
				condition123 += "`age`>"+age+" ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andAgeLessThan(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "and `age`<"+age+" ";
			}else{
				condition123 += "`age`<"+age+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeLessThan(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "or `age`<"+age+" ";
			}else{
				condition123 += "`age`<"+age+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andAgeGreadterThanAndEquals(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "and `age`>="+age+" ";
			}else{
				condition123 += "`age`>="+age+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeGreadterThanAndEquals(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "or `age`>="+age+" ";
			}else{
				condition123 += "`age`>="+age+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andAgeLessThanAndEquals(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "and `age`<="+age+" ";
			}else{
				condition123 += "`age`<="+age+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeLessThanAndEquals(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "or `age`<="+age+" ";
			}else{
				condition123 += "`age`<="+age+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andAgeLike(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "and `age` like "+age+" ";
			}else{
				condition123 += "`age` like "+age+" ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeLike(Integer age){
		if(age!=null){
			if(condition123.length()>0){
				condition123 += "or `age` like "+age+" ";
			}else{
				condition123 += "`age` like "+age+" ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andAgeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `age` is null";
			}else{
				condition123 += "`age` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `age` is null";
		}else{
			condition123 += "`age` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andAgeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `age` is not null";
		}else{
			condition123 += "`age` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `age` is not null";
		}else{
			condition123 += "`age` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andAgeIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `age` in("+value+") ";
			}else{
				condition123 += "`age` in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `age` in("+value+") ";
			}else{
				condition123 += "`age` in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andAgeNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `age` not in("+value+") ";
			}else{
				condition123 += "`age` not in("+value+") ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orAgeNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `age` not in("+value+") ";
			}else{
				condition123 += "`age` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andNationalityEquals(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `nationality`='"+nationality+"' ";
			}else{
				condition123 += "`nationality`='"+nationality+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orNationalityEquals(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `nationality`='"+nationality+"' ";
			}else{
				condition123 += "`nationality`='"+nationality+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNationalityNotEquals(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `nationality`!='"+nationality+"' ";
			}else{
				condition123 += "`nationality`!='"+nationality+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNationalityNotEquals(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `nationality`!='"+nationality+"' ";
			}else{
				condition123 += "`nationality`!='"+nationality+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andNationalityGreaterThan(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `nationality`>'"+nationality+"' ";
			}else{
				condition123 += "`nationality`>'"+nationality+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNationalityGreaterThan(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `nationality`>'"+nationality+"' ";
			}else{
				condition123 += "`nationality`>'"+nationality+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andNationalityLessThan(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `nationality`<'"+nationality+"' ";
			}else{
				condition123 += "`nationality`<'"+nationality+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNationalityLessThan(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `nationality`<'"+nationality+"' ";
			}else{
				condition123 += "`nationality`<'"+nationality+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNationalityGreadterThanAndEquals(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `nationality`>='"+nationality+"' ";
			}else{
				condition123 += "`nationality`>='"+nationality+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNationalityGreadterThanAndEquals(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `nationality`>='"+nationality+"' ";
			}else{
				condition123 += "`nationality`>='"+nationality+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNationalityLessThanAndEquals(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `nationality`<='"+nationality+"' ";
			}else{
				condition123 += "`nationality`<='"+nationality+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNationalityLessThanAndEquals(String nationality){
		if(nationality!=null&&nationality.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `nationality`<='"+nationality+"' ";
			}else{
				condition123 += "`nationality`<='"+nationality+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNationalityLike(String nationality){
		if(nationality!=null&&nationality.trim().length()>0&&!("%".equals(nationality.trim()))&&!("%%".equals(nationality.trim()))){
			if(condition123.length()>0){
				condition123 += "and `nationality` like '"+nationality+"' ";
			}else{
				condition123 += "`nationality` like '"+nationality+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNationalityLike(String nationality){
		if(nationality!=null&&nationality.trim().length()>0&&!("%".equals(nationality.trim()))&&!("%%".equals(nationality.trim()))){
			if(condition123.length()>0){
				condition123 += "or `nationality` like '"+nationality+"' ";
			}else{
				condition123 += "`nationality` like '"+nationality+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNationalityIsNull(){
			if(condition123.length()>0){
				condition123 += "and `nationality` is null";
			}else{
				condition123 += "`nationality` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orNationalityIsNull(){
		if(condition123.length()>0){
			condition123 += "or `nationality` is null";
		}else{
			condition123 += "`nationality` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andNationalityIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `nationality` is not null";
		}else{
			condition123 += "`nationality` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orNationalityIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `nationality` is not null";
		}else{
			condition123 += "`nationality` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNationalityIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `nationality` in("+value+") ";
			}else{
				condition123 += "`nationality` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orNationalityIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `nationality` in("+value+") ";
			}else{
				condition123 += "`nationality` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andNationalityNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `nationality` not in("+value+") ";
			}else{
				condition123 += "`nationality` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orNationalityNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `nationality` not in("+value+") ";
			}else{
				condition123 += "`nationality` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andTelephoneEquals(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `telephone`='"+telephone+"' ";
			}else{
				condition123 += "`telephone`='"+telephone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orTelephoneEquals(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `telephone`='"+telephone+"' ";
			}else{
				condition123 += "`telephone`='"+telephone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andTelephoneNotEquals(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `telephone`!='"+telephone+"' ";
			}else{
				condition123 += "`telephone`!='"+telephone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orTelephoneNotEquals(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `telephone`!='"+telephone+"' ";
			}else{
				condition123 += "`telephone`!='"+telephone+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andTelephoneGreaterThan(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `telephone`>'"+telephone+"' ";
			}else{
				condition123 += "`telephone`>'"+telephone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orTelephoneGreaterThan(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `telephone`>'"+telephone+"' ";
			}else{
				condition123 += "`telephone`>'"+telephone+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andTelephoneLessThan(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `telephone`<'"+telephone+"' ";
			}else{
				condition123 += "`telephone`<'"+telephone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orTelephoneLessThan(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `telephone`<'"+telephone+"' ";
			}else{
				condition123 += "`telephone`<'"+telephone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andTelephoneGreadterThanAndEquals(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `telephone`>='"+telephone+"' ";
			}else{
				condition123 += "`telephone`>='"+telephone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orTelephoneGreadterThanAndEquals(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `telephone`>='"+telephone+"' ";
			}else{
				condition123 += "`telephone`>='"+telephone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andTelephoneLessThanAndEquals(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `telephone`<='"+telephone+"' ";
			}else{
				condition123 += "`telephone`<='"+telephone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orTelephoneLessThanAndEquals(String telephone){
		if(telephone!=null&&telephone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `telephone`<='"+telephone+"' ";
			}else{
				condition123 += "`telephone`<='"+telephone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andTelephoneLike(String telephone){
		if(telephone!=null&&telephone.trim().length()>0&&!("%".equals(telephone.trim()))&&!("%%".equals(telephone.trim()))){
			if(condition123.length()>0){
				condition123 += "and `telephone` like '"+telephone+"' ";
			}else{
				condition123 += "`telephone` like '"+telephone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orTelephoneLike(String telephone){
		if(telephone!=null&&telephone.trim().length()>0&&!("%".equals(telephone.trim()))&&!("%%".equals(telephone.trim()))){
			if(condition123.length()>0){
				condition123 += "or `telephone` like '"+telephone+"' ";
			}else{
				condition123 += "`telephone` like '"+telephone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andTelephoneIsNull(){
			if(condition123.length()>0){
				condition123 += "and `telephone` is null";
			}else{
				condition123 += "`telephone` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orTelephoneIsNull(){
		if(condition123.length()>0){
			condition123 += "or `telephone` is null";
		}else{
			condition123 += "`telephone` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andTelephoneIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `telephone` is not null";
		}else{
			condition123 += "`telephone` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orTelephoneIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `telephone` is not null";
		}else{
			condition123 += "`telephone` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andTelephoneIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `telephone` in("+value+") ";
			}else{
				condition123 += "`telephone` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orTelephoneIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `telephone` in("+value+") ";
			}else{
				condition123 += "`telephone` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andTelephoneNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `telephone` not in("+value+") ";
			}else{
				condition123 += "`telephone` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orTelephoneNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `telephone` not in("+value+") ";
			}else{
				condition123 += "`telephone` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andDepartmentNameEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`='"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orDepartmentNameEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`='"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDepartmentNameNotEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`!='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`!='"+departmentName+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDepartmentNameNotEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`!='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`!='"+departmentName+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andDepartmentNameGreaterThan(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`>'"+departmentName+"' ";
			}else{
				condition123 += "`department_name`>'"+departmentName+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDepartmentNameGreaterThan(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`>'"+departmentName+"' ";
			}else{
				condition123 += "`department_name`>'"+departmentName+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andDepartmentNameLessThan(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`<'"+departmentName+"' ";
			}else{
				condition123 += "`department_name`<'"+departmentName+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDepartmentNameLessThan(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`<'"+departmentName+"' ";
			}else{
				condition123 += "`department_name`<'"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDepartmentNameGreadterThanAndEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`>='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`>='"+departmentName+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDepartmentNameGreadterThanAndEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`>='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`>='"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDepartmentNameLessThanAndEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`<='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`<='"+departmentName+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDepartmentNameLessThanAndEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`<='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`<='"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDepartmentNameLike(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0&&!("%".equals(departmentName.trim()))&&!("%%".equals(departmentName.trim()))){
			if(condition123.length()>0){
				condition123 += "and `department_name` like '"+departmentName+"' ";
			}else{
				condition123 += "`department_name` like '"+departmentName+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDepartmentNameLike(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0&&!("%".equals(departmentName.trim()))&&!("%%".equals(departmentName.trim()))){
			if(condition123.length()>0){
				condition123 += "or `department_name` like '"+departmentName+"' ";
			}else{
				condition123 += "`department_name` like '"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDepartmentNameIsNull(){
			if(condition123.length()>0){
				condition123 += "and `department_name` is null";
			}else{
				condition123 += "`department_name` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orDepartmentNameIsNull(){
		if(condition123.length()>0){
			condition123 += "or `department_name` is null";
		}else{
			condition123 += "`department_name` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andDepartmentNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `department_name` is not null";
		}else{
			condition123 += "`department_name` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDepartmentNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `department_name` is not null";
		}else{
			condition123 += "`department_name` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDepartmentNameIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `department_name` in("+value+") ";
			}else{
				condition123 += "`department_name` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orDepartmentNameIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `department_name` in("+value+") ";
			}else{
				condition123 += "`department_name` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDepartmentNameNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `department_name` not in("+value+") ";
			}else{
				condition123 += "`department_name` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orDepartmentNameNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `department_name` not in("+value+") ";
			}else{
				condition123 += "`department_name` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andPositionEquals(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `position`='"+position+"' ";
			}else{
				condition123 += "`position`='"+position+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPositionEquals(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `position`='"+position+"' ";
			}else{
				condition123 += "`position`='"+position+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPositionNotEquals(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `position`!='"+position+"' ";
			}else{
				condition123 += "`position`!='"+position+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPositionNotEquals(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `position`!='"+position+"' ";
			}else{
				condition123 += "`position`!='"+position+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andPositionGreaterThan(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `position`>'"+position+"' ";
			}else{
				condition123 += "`position`>'"+position+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPositionGreaterThan(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `position`>'"+position+"' ";
			}else{
				condition123 += "`position`>'"+position+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andPositionLessThan(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `position`<'"+position+"' ";
			}else{
				condition123 += "`position`<'"+position+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPositionLessThan(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `position`<'"+position+"' ";
			}else{
				condition123 += "`position`<'"+position+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPositionGreadterThanAndEquals(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `position`>='"+position+"' ";
			}else{
				condition123 += "`position`>='"+position+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPositionGreadterThanAndEquals(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `position`>='"+position+"' ";
			}else{
				condition123 += "`position`>='"+position+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPositionLessThanAndEquals(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `position`<='"+position+"' ";
			}else{
				condition123 += "`position`<='"+position+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPositionLessThanAndEquals(String position){
		if(position!=null&&position.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `position`<='"+position+"' ";
			}else{
				condition123 += "`position`<='"+position+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPositionLike(String position){
		if(position!=null&&position.trim().length()>0&&!("%".equals(position.trim()))&&!("%%".equals(position.trim()))){
			if(condition123.length()>0){
				condition123 += "and `position` like '"+position+"' ";
			}else{
				condition123 += "`position` like '"+position+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPositionLike(String position){
		if(position!=null&&position.trim().length()>0&&!("%".equals(position.trim()))&&!("%%".equals(position.trim()))){
			if(condition123.length()>0){
				condition123 += "or `position` like '"+position+"' ";
			}else{
				condition123 += "`position` like '"+position+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPositionIsNull(){
			if(condition123.length()>0){
				condition123 += "and `position` is null";
			}else{
				condition123 += "`position` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orPositionIsNull(){
		if(condition123.length()>0){
			condition123 += "or `position` is null";
		}else{
			condition123 += "`position` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andPositionIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `position` is not null";
		}else{
			condition123 += "`position` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPositionIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `position` is not null";
		}else{
			condition123 += "`position` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPositionIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `position` in("+value+") ";
			}else{
				condition123 += "`position` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPositionIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `position` in("+value+") ";
			}else{
				condition123 += "`position` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPositionNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `position` not in("+value+") ";
			}else{
				condition123 += "`position` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPositionNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `position` not in("+value+") ";
			}else{
				condition123 += "`position` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andPoliticsStatusEquals(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `politics_status`='"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`='"+politicsStatus+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPoliticsStatusEquals(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `politics_status`='"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`='"+politicsStatus+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPoliticsStatusNotEquals(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `politics_status`!='"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`!='"+politicsStatus+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPoliticsStatusNotEquals(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `politics_status`!='"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`!='"+politicsStatus+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andPoliticsStatusGreaterThan(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `politics_status`>'"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`>'"+politicsStatus+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPoliticsStatusGreaterThan(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `politics_status`>'"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`>'"+politicsStatus+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andPoliticsStatusLessThan(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `politics_status`<'"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`<'"+politicsStatus+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPoliticsStatusLessThan(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `politics_status`<'"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`<'"+politicsStatus+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPoliticsStatusGreadterThanAndEquals(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `politics_status`>='"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`>='"+politicsStatus+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPoliticsStatusGreadterThanAndEquals(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `politics_status`>='"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`>='"+politicsStatus+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPoliticsStatusLessThanAndEquals(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `politics_status`<='"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`<='"+politicsStatus+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPoliticsStatusLessThanAndEquals(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `politics_status`<='"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status`<='"+politicsStatus+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPoliticsStatusLike(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0&&!("%".equals(politicsStatus.trim()))&&!("%%".equals(politicsStatus.trim()))){
			if(condition123.length()>0){
				condition123 += "and `politics_status` like '"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status` like '"+politicsStatus+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPoliticsStatusLike(String politicsStatus){
		if(politicsStatus!=null&&politicsStatus.trim().length()>0&&!("%".equals(politicsStatus.trim()))&&!("%%".equals(politicsStatus.trim()))){
			if(condition123.length()>0){
				condition123 += "or `politics_status` like '"+politicsStatus+"' ";
			}else{
				condition123 += "`politics_status` like '"+politicsStatus+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPoliticsStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `politics_status` is null";
			}else{
				condition123 += "`politics_status` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orPoliticsStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `politics_status` is null";
		}else{
			condition123 += "`politics_status` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andPoliticsStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `politics_status` is not null";
		}else{
			condition123 += "`politics_status` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orPoliticsStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `politics_status` is not null";
		}else{
			condition123 += "`politics_status` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPoliticsStatusIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `politics_status` in("+value+") ";
			}else{
				condition123 += "`politics_status` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPoliticsStatusIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `politics_status` in("+value+") ";
			}else{
				condition123 += "`politics_status` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andPoliticsStatusNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `politics_status` not in("+value+") ";
			}else{
				condition123 += "`politics_status` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orPoliticsStatusNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `politics_status` not in("+value+") ";
			}else{
				condition123 += "`politics_status` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andIdentityCardNumberEquals(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `identity_card_number`='"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`='"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orIdentityCardNumberEquals(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `identity_card_number`='"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`='"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andIdentityCardNumberNotEquals(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `identity_card_number`!='"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`!='"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orIdentityCardNumberNotEquals(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `identity_card_number`!='"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`!='"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andIdentityCardNumberGreaterThan(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `identity_card_number`>'"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`>'"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orIdentityCardNumberGreaterThan(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `identity_card_number`>'"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`>'"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andIdentityCardNumberLessThan(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `identity_card_number`<'"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`<'"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orIdentityCardNumberLessThan(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `identity_card_number`<'"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`<'"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andIdentityCardNumberGreadterThanAndEquals(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `identity_card_number`>='"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`>='"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orIdentityCardNumberGreadterThanAndEquals(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `identity_card_number`>='"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`>='"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andIdentityCardNumberLessThanAndEquals(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `identity_card_number`<='"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`<='"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orIdentityCardNumberLessThanAndEquals(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `identity_card_number`<='"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number`<='"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andIdentityCardNumberLike(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0&&!("%".equals(identityCardNumber.trim()))&&!("%%".equals(identityCardNumber.trim()))){
			if(condition123.length()>0){
				condition123 += "and `identity_card_number` like '"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number` like '"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orIdentityCardNumberLike(String identityCardNumber){
		if(identityCardNumber!=null&&identityCardNumber.trim().length()>0&&!("%".equals(identityCardNumber.trim()))&&!("%%".equals(identityCardNumber.trim()))){
			if(condition123.length()>0){
				condition123 += "or `identity_card_number` like '"+identityCardNumber+"' ";
			}else{
				condition123 += "`identity_card_number` like '"+identityCardNumber+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andIdentityCardNumberIsNull(){
			if(condition123.length()>0){
				condition123 += "and `identity_card_number` is null";
			}else{
				condition123 += "`identity_card_number` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orIdentityCardNumberIsNull(){
		if(condition123.length()>0){
			condition123 += "or `identity_card_number` is null";
		}else{
			condition123 += "`identity_card_number` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andIdentityCardNumberIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `identity_card_number` is not null";
		}else{
			condition123 += "`identity_card_number` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orIdentityCardNumberIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `identity_card_number` is not null";
		}else{
			condition123 += "`identity_card_number` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andIdentityCardNumberIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `identity_card_number` in("+value+") ";
			}else{
				condition123 += "`identity_card_number` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orIdentityCardNumberIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `identity_card_number` in("+value+") ";
			}else{
				condition123 += "`identity_card_number` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andIdentityCardNumberNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `identity_card_number` not in("+value+") ";
			}else{
				condition123 += "`identity_card_number` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orIdentityCardNumberNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `identity_card_number` not in("+value+") ";
			}else{
				condition123 += "`identity_card_number` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andEmergencContactEquals(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact`='"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`='"+emergencContact+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmergencContactEquals(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact`='"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`='"+emergencContact+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactNotEquals(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact`!='"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`!='"+emergencContact+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactNotEquals(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact`!='"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`!='"+emergencContact+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andEmergencContactGreaterThan(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact`>'"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`>'"+emergencContact+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactGreaterThan(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact`>'"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`>'"+emergencContact+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andEmergencContactLessThan(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact`<'"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`<'"+emergencContact+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactLessThan(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact`<'"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`<'"+emergencContact+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactGreadterThanAndEquals(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact`>='"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`>='"+emergencContact+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactGreadterThanAndEquals(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact`>='"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`>='"+emergencContact+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactLessThanAndEquals(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact`<='"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`<='"+emergencContact+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactLessThanAndEquals(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact`<='"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact`<='"+emergencContact+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactLike(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0&&!("%".equals(emergencContact.trim()))&&!("%%".equals(emergencContact.trim()))){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact` like '"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact` like '"+emergencContact+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactLike(String emergencContact){
		if(emergencContact!=null&&emergencContact.trim().length()>0&&!("%".equals(emergencContact.trim()))&&!("%%".equals(emergencContact.trim()))){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact` like '"+emergencContact+"' ";
			}else{
				condition123 += "`emergenc_contact` like '"+emergencContact+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactIsNull(){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact` is null";
			}else{
				condition123 += "`emergenc_contact` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactIsNull(){
		if(condition123.length()>0){
			condition123 += "or `emergenc_contact` is null";
		}else{
			condition123 += "`emergenc_contact` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andEmergencContactIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `emergenc_contact` is not null";
		}else{
			condition123 += "`emergenc_contact` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `emergenc_contact` is not null";
		}else{
			condition123 += "`emergenc_contact` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact` in("+value+") ";
			}else{
				condition123 += "`emergenc_contact` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmergencContactIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact` in("+value+") ";
			}else{
				condition123 += "`emergenc_contact` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact` not in("+value+") ";
			}else{
				condition123 += "`emergenc_contact` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmergencContactNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact` not in("+value+") ";
			}else{
				condition123 += "`emergenc_contact` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andEmergencContactTelphoneEquals(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone`='"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`='"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneEquals(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone`='"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`='"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneNotEquals(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone`!='"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`!='"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneNotEquals(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone`!='"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`!='"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneGreaterThan(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone`>'"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`>'"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneGreaterThan(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone`>'"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`>'"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneLessThan(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone`<'"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`<'"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneLessThan(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone`<'"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`<'"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneGreadterThanAndEquals(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone`>='"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`>='"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneGreadterThanAndEquals(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone`>='"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`>='"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneLessThanAndEquals(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone`<='"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`<='"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneLessThanAndEquals(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone`<='"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone`<='"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneLike(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0&&!("%".equals(emergencContactTelphone.trim()))&&!("%%".equals(emergencContactTelphone.trim()))){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone` like '"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone` like '"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneLike(String emergencContactTelphone){
		if(emergencContactTelphone!=null&&emergencContactTelphone.trim().length()>0&&!("%".equals(emergencContactTelphone.trim()))&&!("%%".equals(emergencContactTelphone.trim()))){
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone` like '"+emergencContactTelphone+"' ";
			}else{
				condition123 += "`emergenc_contact_telphone` like '"+emergencContactTelphone+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneIsNull(){
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone` is null";
			}else{
				condition123 += "`emergenc_contact_telphone` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneIsNull(){
		if(condition123.length()>0){
			condition123 += "or `emergenc_contact_telphone` is null";
		}else{
			condition123 += "`emergenc_contact_telphone` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `emergenc_contact_telphone` is not null";
		}else{
			condition123 += "`emergenc_contact_telphone` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `emergenc_contact_telphone` is not null";
		}else{
			condition123 += "`emergenc_contact_telphone` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone` in("+value+") ";
			}else{
				condition123 += "`emergenc_contact_telphone` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone` in("+value+") ";
			}else{
				condition123 += "`emergenc_contact_telphone` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmergencContactTelphoneNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `emergenc_contact_telphone` not in("+value+") ";
			}else{
				condition123 += "`emergenc_contact_telphone` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmergencContactTelphoneNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `emergenc_contact_telphone` not in("+value+") ";
			}else{
				condition123 += "`emergenc_contact_telphone` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andEmployeeAddressEquals(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `employee_address`='"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`='"+employeeAddress+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmployeeAddressEquals(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `employee_address`='"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`='"+employeeAddress+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeAddressNotEquals(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `employee_address`!='"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`!='"+employeeAddress+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeAddressNotEquals(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `employee_address`!='"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`!='"+employeeAddress+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andEmployeeAddressGreaterThan(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `employee_address`>'"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`>'"+employeeAddress+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeAddressGreaterThan(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `employee_address`>'"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`>'"+employeeAddress+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andEmployeeAddressLessThan(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `employee_address`<'"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`<'"+employeeAddress+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeAddressLessThan(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `employee_address`<'"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`<'"+employeeAddress+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeAddressGreadterThanAndEquals(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `employee_address`>='"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`>='"+employeeAddress+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeAddressGreadterThanAndEquals(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `employee_address`>='"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`>='"+employeeAddress+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeAddressLessThanAndEquals(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `employee_address`<='"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`<='"+employeeAddress+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeAddressLessThanAndEquals(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `employee_address`<='"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address`<='"+employeeAddress+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeAddressLike(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0&&!("%".equals(employeeAddress.trim()))&&!("%%".equals(employeeAddress.trim()))){
			if(condition123.length()>0){
				condition123 += "and `employee_address` like '"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address` like '"+employeeAddress+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeAddressLike(String employeeAddress){
		if(employeeAddress!=null&&employeeAddress.trim().length()>0&&!("%".equals(employeeAddress.trim()))&&!("%%".equals(employeeAddress.trim()))){
			if(condition123.length()>0){
				condition123 += "or `employee_address` like '"+employeeAddress+"' ";
			}else{
				condition123 += "`employee_address` like '"+employeeAddress+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeAddressIsNull(){
			if(condition123.length()>0){
				condition123 += "and `employee_address` is null";
			}else{
				condition123 += "`employee_address` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeAddressIsNull(){
		if(condition123.length()>0){
			condition123 += "or `employee_address` is null";
		}else{
			condition123 += "`employee_address` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andEmployeeAddressIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `employee_address` is not null";
		}else{
			condition123 += "`employee_address` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orEmployeeAddressIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `employee_address` is not null";
		}else{
			condition123 += "`employee_address` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeAddressIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `employee_address` in("+value+") ";
			}else{
				condition123 += "`employee_address` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmployeeAddressIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `employee_address` in("+value+") ";
			}else{
				condition123 += "`employee_address` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andEmployeeAddressNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `employee_address` not in("+value+") ";
			}else{
				condition123 += "`employee_address` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orEmployeeAddressNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `employee_address` not in("+value+") ";
			}else{
				condition123 += "`employee_address` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andDegreeOfEducationEquals(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `degree_of_education`='"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`='"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orDegreeOfEducationEquals(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `degree_of_education`='"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`='"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDegreeOfEducationNotEquals(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `degree_of_education`!='"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`!='"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDegreeOfEducationNotEquals(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `degree_of_education`!='"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`!='"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andDegreeOfEducationGreaterThan(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `degree_of_education`>'"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`>'"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDegreeOfEducationGreaterThan(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `degree_of_education`>'"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`>'"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andDegreeOfEducationLessThan(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `degree_of_education`<'"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`<'"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDegreeOfEducationLessThan(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `degree_of_education`<'"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`<'"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDegreeOfEducationGreadterThanAndEquals(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `degree_of_education`>='"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`>='"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDegreeOfEducationGreadterThanAndEquals(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `degree_of_education`>='"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`>='"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDegreeOfEducationLessThanAndEquals(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `degree_of_education`<='"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`<='"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDegreeOfEducationLessThanAndEquals(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `degree_of_education`<='"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education`<='"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDegreeOfEducationLike(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0&&!("%".equals(degreeOfEducation.trim()))&&!("%%".equals(degreeOfEducation.trim()))){
			if(condition123.length()>0){
				condition123 += "and `degree_of_education` like '"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education` like '"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDegreeOfEducationLike(String degreeOfEducation){
		if(degreeOfEducation!=null&&degreeOfEducation.trim().length()>0&&!("%".equals(degreeOfEducation.trim()))&&!("%%".equals(degreeOfEducation.trim()))){
			if(condition123.length()>0){
				condition123 += "or `degree_of_education` like '"+degreeOfEducation+"' ";
			}else{
				condition123 += "`degree_of_education` like '"+degreeOfEducation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDegreeOfEducationIsNull(){
			if(condition123.length()>0){
				condition123 += "and `degree_of_education` is null";
			}else{
				condition123 += "`degree_of_education` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orDegreeOfEducationIsNull(){
		if(condition123.length()>0){
			condition123 += "or `degree_of_education` is null";
		}else{
			condition123 += "`degree_of_education` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andDegreeOfEducationIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `degree_of_education` is not null";
		}else{
			condition123 += "`degree_of_education` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orDegreeOfEducationIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `degree_of_education` is not null";
		}else{
			condition123 += "`degree_of_education` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDegreeOfEducationIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `degree_of_education` in("+value+") ";
			}else{
				condition123 += "`degree_of_education` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orDegreeOfEducationIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `degree_of_education` in("+value+") ";
			}else{
				condition123 += "`degree_of_education` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andDegreeOfEducationNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `degree_of_education` not in("+value+") ";
			}else{
				condition123 += "`degree_of_education` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orDegreeOfEducationNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `degree_of_education` not in("+value+") ";
			}else{
				condition123 += "`degree_of_education` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andSchoolOfGraduationEquals(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation`='"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`='"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orSchoolOfGraduationEquals(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation`='"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`='"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andSchoolOfGraduationNotEquals(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation`!='"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`!='"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orSchoolOfGraduationNotEquals(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation`!='"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`!='"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andSchoolOfGraduationGreaterThan(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation`>'"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`>'"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orSchoolOfGraduationGreaterThan(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation`>'"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`>'"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andSchoolOfGraduationLessThan(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation`<'"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`<'"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orSchoolOfGraduationLessThan(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation`<'"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`<'"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andSchoolOfGraduationGreadterThanAndEquals(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation`>='"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`>='"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orSchoolOfGraduationGreadterThanAndEquals(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation`>='"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`>='"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andSchoolOfGraduationLessThanAndEquals(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation`<='"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`<='"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orSchoolOfGraduationLessThanAndEquals(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation`<='"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation`<='"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andSchoolOfGraduationLike(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0&&!("%".equals(schoolOfGraduation.trim()))&&!("%%".equals(schoolOfGraduation.trim()))){
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation` like '"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation` like '"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orSchoolOfGraduationLike(String schoolOfGraduation){
		if(schoolOfGraduation!=null&&schoolOfGraduation.trim().length()>0&&!("%".equals(schoolOfGraduation.trim()))&&!("%%".equals(schoolOfGraduation.trim()))){
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation` like '"+schoolOfGraduation+"' ";
			}else{
				condition123 += "`school_of_graduation` like '"+schoolOfGraduation+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andSchoolOfGraduationIsNull(){
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation` is null";
			}else{
				condition123 += "`school_of_graduation` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orSchoolOfGraduationIsNull(){
		if(condition123.length()>0){
			condition123 += "or `school_of_graduation` is null";
		}else{
			condition123 += "`school_of_graduation` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andSchoolOfGraduationIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `school_of_graduation` is not null";
		}else{
			condition123 += "`school_of_graduation` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orSchoolOfGraduationIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `school_of_graduation` is not null";
		}else{
			condition123 += "`school_of_graduation` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andSchoolOfGraduationIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation` in("+value+") ";
			}else{
				condition123 += "`school_of_graduation` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orSchoolOfGraduationIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation` in("+value+") ";
			}else{
				condition123 += "`school_of_graduation` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andSchoolOfGraduationNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `school_of_graduation` not in("+value+") ";
			}else{
				condition123 += "`school_of_graduation` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orSchoolOfGraduationNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `school_of_graduation` not in("+value+") ";
			}else{
				condition123 += "`school_of_graduation` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andMajorEquals(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `major`='"+major+"' ";
			}else{
				condition123 += "`major`='"+major+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orMajorEquals(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `major`='"+major+"' ";
			}else{
				condition123 += "`major`='"+major+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andMajorNotEquals(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `major`!='"+major+"' ";
			}else{
				condition123 += "`major`!='"+major+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orMajorNotEquals(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `major`!='"+major+"' ";
			}else{
				condition123 += "`major`!='"+major+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andMajorGreaterThan(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `major`>'"+major+"' ";
			}else{
				condition123 += "`major`>'"+major+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orMajorGreaterThan(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `major`>'"+major+"' ";
			}else{
				condition123 += "`major`>'"+major+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andMajorLessThan(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `major`<'"+major+"' ";
			}else{
				condition123 += "`major`<'"+major+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orMajorLessThan(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `major`<'"+major+"' ";
			}else{
				condition123 += "`major`<'"+major+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andMajorGreadterThanAndEquals(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `major`>='"+major+"' ";
			}else{
				condition123 += "`major`>='"+major+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orMajorGreadterThanAndEquals(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `major`>='"+major+"' ";
			}else{
				condition123 += "`major`>='"+major+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andMajorLessThanAndEquals(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `major`<='"+major+"' ";
			}else{
				condition123 += "`major`<='"+major+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orMajorLessThanAndEquals(String major){
		if(major!=null&&major.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `major`<='"+major+"' ";
			}else{
				condition123 += "`major`<='"+major+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andMajorLike(String major){
		if(major!=null&&major.trim().length()>0&&!("%".equals(major.trim()))&&!("%%".equals(major.trim()))){
			if(condition123.length()>0){
				condition123 += "and `major` like '"+major+"' ";
			}else{
				condition123 += "`major` like '"+major+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orMajorLike(String major){
		if(major!=null&&major.trim().length()>0&&!("%".equals(major.trim()))&&!("%%".equals(major.trim()))){
			if(condition123.length()>0){
				condition123 += "or `major` like '"+major+"' ";
			}else{
				condition123 += "`major` like '"+major+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andMajorIsNull(){
			if(condition123.length()>0){
				condition123 += "and `major` is null";
			}else{
				condition123 += "`major` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orMajorIsNull(){
		if(condition123.length()>0){
			condition123 += "or `major` is null";
		}else{
			condition123 += "`major` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andMajorIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `major` is not null";
		}else{
			condition123 += "`major` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orMajorIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `major` is not null";
		}else{
			condition123 += "`major` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andMajorIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `major` in("+value+") ";
			}else{
				condition123 += "`major` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orMajorIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `major` in("+value+") ";
			}else{
				condition123 += "`major` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andMajorNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `major` not in("+value+") ";
			}else{
				condition123 += "`major` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orMajorNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `major` not in("+value+") ";
			}else{
				condition123 += "`major` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andStatusIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `status` in("+value+") ";
			}else{
				condition123 += "`status` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orStatusIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `status` in("+value+") ";
			}else{
				condition123 += "`status` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andStatusNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `status` not in("+value+") ";
			}else{
				condition123 += "`status` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orStatusNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `status` not in("+value+") ";
			}else{
				condition123 += "`status` not in("+value+") ";
			}
		}
		return this;
	}

	public EmployeeBasicInformationCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public EmployeeBasicInformationCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public EmployeeBasicInformationCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public EmployeeBasicInformationCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public EmployeeBasicInformationCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andCreateTimeIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `create_time` in("+value+") ";
			}else{
				condition123 += "`create_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orCreateTimeIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `create_time` in("+value+") ";
			}else{
				condition123 += "`create_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria andCreateTimeNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `create_time` not in("+value+") ";
			}else{
				condition123 += "`create_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public EmployeeBasicInformationCriteria orCreateTimeNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `create_time` not in("+value+") ";
			}else{
				condition123 += "`create_time` not in("+value+") ";
			}
		}
		return this;
	}

	private void initEmployeeBasicInformation(EmployeeBasicInformation employeeBasicInformation) {
		super.setEmployeeId(employeeBasicInformation.getEmployeeId());
		super.setWorkId(employeeBasicInformation.getWorkId());
		super.setPassword(employeeBasicInformation.getPassword());
		super.setName(employeeBasicInformation.getName());
		super.setGender(employeeBasicInformation.getGender());
		super.setAge(employeeBasicInformation.getAge());
		super.setNationality(employeeBasicInformation.getNationality());
		super.setTelephone(employeeBasicInformation.getTelephone());
		super.setDepartmentName(employeeBasicInformation.getDepartmentName());
		super.setPosition(employeeBasicInformation.getPosition());
		super.setPoliticsStatus(employeeBasicInformation.getPoliticsStatus());
		super.setIdentityCardNumber(employeeBasicInformation.getIdentityCardNumber());
		super.setEmergencContact(employeeBasicInformation.getEmergencContact());
		super.setEmergencContactTelphone(employeeBasicInformation.getEmergencContactTelphone());
		super.setEmployeeAddress(employeeBasicInformation.getEmployeeAddress());
		super.setDegreeOfEducation(employeeBasicInformation.getDegreeOfEducation());
		super.setSchoolOfGraduation(employeeBasicInformation.getSchoolOfGraduation());
		super.setMajor(employeeBasicInformation.getMajor());
		super.setStatus(employeeBasicInformation.getStatus());
		super.setCreateTime(employeeBasicInformation.getCreateTime());

	}

}