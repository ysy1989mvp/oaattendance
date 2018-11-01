package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.Department;

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
public class DepartmentCriteria extends Department{
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
	private Department department;
	private String feid123;//字段用于统计查询时设置

	public DepartmentCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
		initDepartment(department);
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
	public DepartmentCriteria page(Page value){
		page123 = value;
		return this;
	}
	public DepartmentCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public DepartmentCriteria having(String value){
		having123 = value;
		return this;
	}
	public DepartmentCriteria orderBy(String value){
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

	public DepartmentCriteria andIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andIdNotEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`!="+id+" ";
			}else{
				condition123 += "`id`!="+id+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orIdNotEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`!="+id+" ";
			}else{
				condition123 += "`id`!="+id+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public DepartmentCriteria andIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	
	
	public DepartmentCriteria andIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `id` is null";
			}else{
				condition123 += "`id` is null";
			}
		return this;
	}
	public DepartmentCriteria orIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is null";
		}else{
			condition123 += "`id` is null";
		}
		return this;
	}
	public DepartmentCriteria andIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public DepartmentCriteria orIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public DepartmentCriteria andIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public DepartmentCriteria orIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public DepartmentCriteria andIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}
	public DepartmentCriteria orIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}

	public DepartmentCriteria andDepartmentNumberEquals(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "and `department_number`="+departmentNumber+" ";
			}else{
				condition123 += "`department_number`="+departmentNumber+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentNumberEquals(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "or `department_number`="+departmentNumber+" ";
			}else{
				condition123 += "`department_number`="+departmentNumber+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNumberNotEquals(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "and `department_number`!="+departmentNumber+" ";
			}else{
				condition123 += "`department_number`!="+departmentNumber+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberNotEquals(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "or `department_number`!="+departmentNumber+" ";
			}else{
				condition123 += "`department_number`!="+departmentNumber+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public DepartmentCriteria andDepartmentNumberGreaterThan(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "and `department_number`>"+departmentNumber+" ";
			}else{
				condition123 += "`department_number`>"+departmentNumber+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberGreaterThan(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "or `department_number`>"+departmentNumber+" ";
			}else{
				condition123 += "`department_number`>"+departmentNumber+" ";
			}
		}
		return this;
	}
	
	
	public DepartmentCriteria andDepartmentNumberLessThan(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "and `department_number`<"+departmentNumber+" ";
			}else{
				condition123 += "`department_number`<"+departmentNumber+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberLessThan(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "or `department_number`<"+departmentNumber+" ";
			}else{
				condition123 += "`department_number`<"+departmentNumber+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNumberGreadterThanAndEquals(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "and `department_number`>="+departmentNumber+" ";
			}else{
				condition123 += "`department_number`>="+departmentNumber+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberGreadterThanAndEquals(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "or `department_number`>="+departmentNumber+" ";
			}else{
				condition123 += "`department_number`>="+departmentNumber+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNumberLessThanAndEquals(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "and `department_number`<="+departmentNumber+" ";
			}else{
				condition123 += "`department_number`<="+departmentNumber+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberLessThanAndEquals(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "or `department_number`<="+departmentNumber+" ";
			}else{
				condition123 += "`department_number`<="+departmentNumber+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNumberLike(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "and `department_number` like "+departmentNumber+" ";
			}else{
				condition123 += "`department_number` like "+departmentNumber+" ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberLike(Integer departmentNumber){
		if(departmentNumber!=null){
			if(condition123.length()>0){
				condition123 += "or `department_number` like "+departmentNumber+" ";
			}else{
				condition123 += "`department_number` like "+departmentNumber+" ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNumberIsNull(){
			if(condition123.length()>0){
				condition123 += "and `department_number` is null";
			}else{
				condition123 += "`department_number` is null";
			}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberIsNull(){
		if(condition123.length()>0){
			condition123 += "or `department_number` is null";
		}else{
			condition123 += "`department_number` is null";
		}
		return this;
	}
	public DepartmentCriteria andDepartmentNumberIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `department_number` is not null";
		}else{
			condition123 += "`department_number` is not null";
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `department_number` is not null";
		}else{
			condition123 += "`department_number` is not null";
		}
		return this;
	}
	public DepartmentCriteria andDepartmentNumberIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_number` in("+value+") ";
			}else{
				condition123 += "`department_number` in("+value+") ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_number` in("+value+") ";
			}else{
				condition123 += "`department_number` in("+value+") ";
			}
		}
		return this;
	}
	public DepartmentCriteria andDepartmentNumberNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_number` not in("+value+") ";
			}else{
				condition123 += "`department_number` not in("+value+") ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNumberNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_number` not in("+value+") ";
			}else{
				condition123 += "`department_number` not in("+value+") ";
			}
		}
		return this;
	}

	public DepartmentCriteria andDepartmentNameEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`='"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentNameEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`='"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNameNotEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`!='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`!='"+departmentName+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNameNotEquals(String departmentName){
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
	public DepartmentCriteria andDepartmentNameGreaterThan(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`>'"+departmentName+"' ";
			}else{
				condition123 += "`department_name`>'"+departmentName+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNameGreaterThan(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`>'"+departmentName+"' ";
			}else{
				condition123 += "`department_name`>'"+departmentName+"' ";
			}
		}
		return this;
	}
	
	
	public DepartmentCriteria andDepartmentNameLessThan(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`<'"+departmentName+"' ";
			}else{
				condition123 += "`department_name`<'"+departmentName+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNameLessThan(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`<'"+departmentName+"' ";
			}else{
				condition123 += "`department_name`<'"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNameGreadterThanAndEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`>='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`>='"+departmentName+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNameGreadterThanAndEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`>='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`>='"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNameLessThanAndEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_name`<='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`<='"+departmentName+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNameLessThanAndEquals(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_name`<='"+departmentName+"' ";
			}else{
				condition123 += "`department_name`<='"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNameLike(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0&&!("%".equals(departmentName.trim()))&&!("%%".equals(departmentName.trim()))){
			if(condition123.length()>0){
				condition123 += "and `department_name` like '"+departmentName+"' ";
			}else{
				condition123 += "`department_name` like '"+departmentName+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNameLike(String departmentName){
		if(departmentName!=null&&departmentName.trim().length()>0&&!("%".equals(departmentName.trim()))&&!("%%".equals(departmentName.trim()))){
			if(condition123.length()>0){
				condition123 += "or `department_name` like '"+departmentName+"' ";
			}else{
				condition123 += "`department_name` like '"+departmentName+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNameIsNull(){
			if(condition123.length()>0){
				condition123 += "and `department_name` is null";
			}else{
				condition123 += "`department_name` is null";
			}
		return this;
	}
	public DepartmentCriteria orDepartmentNameIsNull(){
		if(condition123.length()>0){
			condition123 += "or `department_name` is null";
		}else{
			condition123 += "`department_name` is null";
		}
		return this;
	}
	public DepartmentCriteria andDepartmentNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `department_name` is not null";
		}else{
			condition123 += "`department_name` is not null";
		}
		return this;
	}
	public DepartmentCriteria orDepartmentNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `department_name` is not null";
		}else{
			condition123 += "`department_name` is not null";
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentNameIn(String value){
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
	
	public DepartmentCriteria orDepartmentNameIn(String value){
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
	
	public DepartmentCriteria andDepartmentNameNotIn(String value){
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
	
	public DepartmentCriteria orDepartmentNameNotIn(String value){
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

	public DepartmentCriteria andDepartmentAddressEquals(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_address`='"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`='"+departmentAddress+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentAddressEquals(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_address`='"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`='"+departmentAddress+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentAddressNotEquals(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_address`!='"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`!='"+departmentAddress+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentAddressNotEquals(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_address`!='"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`!='"+departmentAddress+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public DepartmentCriteria andDepartmentAddressGreaterThan(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_address`>'"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`>'"+departmentAddress+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentAddressGreaterThan(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_address`>'"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`>'"+departmentAddress+"' ";
			}
		}
		return this;
	}
	
	
	public DepartmentCriteria andDepartmentAddressLessThan(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_address`<'"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`<'"+departmentAddress+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentAddressLessThan(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_address`<'"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`<'"+departmentAddress+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentAddressGreadterThanAndEquals(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_address`>='"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`>='"+departmentAddress+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentAddressGreadterThanAndEquals(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_address`>='"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`>='"+departmentAddress+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentAddressLessThanAndEquals(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_address`<='"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`<='"+departmentAddress+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentAddressLessThanAndEquals(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_address`<='"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address`<='"+departmentAddress+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentAddressLike(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0&&!("%".equals(departmentAddress.trim()))&&!("%%".equals(departmentAddress.trim()))){
			if(condition123.length()>0){
				condition123 += "and `department_address` like '"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address` like '"+departmentAddress+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentAddressLike(String departmentAddress){
		if(departmentAddress!=null&&departmentAddress.trim().length()>0&&!("%".equals(departmentAddress.trim()))&&!("%%".equals(departmentAddress.trim()))){
			if(condition123.length()>0){
				condition123 += "or `department_address` like '"+departmentAddress+"' ";
			}else{
				condition123 += "`department_address` like '"+departmentAddress+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentAddressIsNull(){
			if(condition123.length()>0){
				condition123 += "and `department_address` is null";
			}else{
				condition123 += "`department_address` is null";
			}
		return this;
	}
	public DepartmentCriteria orDepartmentAddressIsNull(){
		if(condition123.length()>0){
			condition123 += "or `department_address` is null";
		}else{
			condition123 += "`department_address` is null";
		}
		return this;
	}
	public DepartmentCriteria andDepartmentAddressIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `department_address` is not null";
		}else{
			condition123 += "`department_address` is not null";
		}
		return this;
	}
	public DepartmentCriteria orDepartmentAddressIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `department_address` is not null";
		}else{
			condition123 += "`department_address` is not null";
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentAddressIn(String value){
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
				condition123 += "and `department_address` in("+value+") ";
			}else{
				condition123 += "`department_address` in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentAddressIn(String value){
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
				condition123 += "or `department_address` in("+value+") ";
			}else{
				condition123 += "`department_address` in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentAddressNotIn(String value){
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
				condition123 += "and `department_address` not in("+value+") ";
			}else{
				condition123 += "`department_address` not in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentAddressNotIn(String value){
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
				condition123 += "or `department_address` not in("+value+") ";
			}else{
				condition123 += "`department_address` not in("+value+") ";
			}
		}
		return this;
	}

	public DepartmentCriteria andDepartmentLeaderEquals(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_leader`='"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`='"+departmentLeader+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentLeaderEquals(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_leader`='"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`='"+departmentLeader+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentLeaderNotEquals(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_leader`!='"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`!='"+departmentLeader+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentLeaderNotEquals(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_leader`!='"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`!='"+departmentLeader+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public DepartmentCriteria andDepartmentLeaderGreaterThan(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_leader`>'"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`>'"+departmentLeader+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentLeaderGreaterThan(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_leader`>'"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`>'"+departmentLeader+"' ";
			}
		}
		return this;
	}
	
	
	public DepartmentCriteria andDepartmentLeaderLessThan(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_leader`<'"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`<'"+departmentLeader+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentLeaderLessThan(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_leader`<'"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`<'"+departmentLeader+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentLeaderGreadterThanAndEquals(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_leader`>='"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`>='"+departmentLeader+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentLeaderGreadterThanAndEquals(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_leader`>='"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`>='"+departmentLeader+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentLeaderLessThanAndEquals(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_leader`<='"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`<='"+departmentLeader+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentLeaderLessThanAndEquals(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_leader`<='"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader`<='"+departmentLeader+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentLeaderLike(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0&&!("%".equals(departmentLeader.trim()))&&!("%%".equals(departmentLeader.trim()))){
			if(condition123.length()>0){
				condition123 += "and `department_leader` like '"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader` like '"+departmentLeader+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentLeaderLike(String departmentLeader){
		if(departmentLeader!=null&&departmentLeader.trim().length()>0&&!("%".equals(departmentLeader.trim()))&&!("%%".equals(departmentLeader.trim()))){
			if(condition123.length()>0){
				condition123 += "or `department_leader` like '"+departmentLeader+"' ";
			}else{
				condition123 += "`department_leader` like '"+departmentLeader+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentLeaderIsNull(){
			if(condition123.length()>0){
				condition123 += "and `department_leader` is null";
			}else{
				condition123 += "`department_leader` is null";
			}
		return this;
	}
	public DepartmentCriteria orDepartmentLeaderIsNull(){
		if(condition123.length()>0){
			condition123 += "or `department_leader` is null";
		}else{
			condition123 += "`department_leader` is null";
		}
		return this;
	}
	public DepartmentCriteria andDepartmentLeaderIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `department_leader` is not null";
		}else{
			condition123 += "`department_leader` is not null";
		}
		return this;
	}
	public DepartmentCriteria orDepartmentLeaderIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `department_leader` is not null";
		}else{
			condition123 += "`department_leader` is not null";
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentLeaderIn(String value){
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
				condition123 += "and `department_leader` in("+value+") ";
			}else{
				condition123 += "`department_leader` in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentLeaderIn(String value){
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
				condition123 += "or `department_leader` in("+value+") ";
			}else{
				condition123 += "`department_leader` in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentLeaderNotIn(String value){
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
				condition123 += "and `department_leader` not in("+value+") ";
			}else{
				condition123 += "`department_leader` not in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentLeaderNotIn(String value){
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
				condition123 += "or `department_leader` not in("+value+") ";
			}else{
				condition123 += "`department_leader` not in("+value+") ";
			}
		}
		return this;
	}

	public DepartmentCriteria andDepartmentIntroEquals(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_intro`='"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`='"+departmentIntro+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentIntroEquals(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_intro`='"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`='"+departmentIntro+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentIntroNotEquals(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_intro`!='"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`!='"+departmentIntro+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentIntroNotEquals(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_intro`!='"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`!='"+departmentIntro+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public DepartmentCriteria andDepartmentIntroGreaterThan(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_intro`>'"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`>'"+departmentIntro+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentIntroGreaterThan(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_intro`>'"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`>'"+departmentIntro+"' ";
			}
		}
		return this;
	}
	
	
	public DepartmentCriteria andDepartmentIntroLessThan(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_intro`<'"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`<'"+departmentIntro+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentIntroLessThan(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_intro`<'"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`<'"+departmentIntro+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentIntroGreadterThanAndEquals(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_intro`>='"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`>='"+departmentIntro+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentIntroGreadterThanAndEquals(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_intro`>='"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`>='"+departmentIntro+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentIntroLessThanAndEquals(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `department_intro`<='"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`<='"+departmentIntro+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentIntroLessThanAndEquals(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `department_intro`<='"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro`<='"+departmentIntro+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentIntroLike(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0&&!("%".equals(departmentIntro.trim()))&&!("%%".equals(departmentIntro.trim()))){
			if(condition123.length()>0){
				condition123 += "and `department_intro` like '"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro` like '"+departmentIntro+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orDepartmentIntroLike(String departmentIntro){
		if(departmentIntro!=null&&departmentIntro.trim().length()>0&&!("%".equals(departmentIntro.trim()))&&!("%%".equals(departmentIntro.trim()))){
			if(condition123.length()>0){
				condition123 += "or `department_intro` like '"+departmentIntro+"' ";
			}else{
				condition123 += "`department_intro` like '"+departmentIntro+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentIntroIsNull(){
			if(condition123.length()>0){
				condition123 += "and `department_intro` is null";
			}else{
				condition123 += "`department_intro` is null";
			}
		return this;
	}
	public DepartmentCriteria orDepartmentIntroIsNull(){
		if(condition123.length()>0){
			condition123 += "or `department_intro` is null";
		}else{
			condition123 += "`department_intro` is null";
		}
		return this;
	}
	public DepartmentCriteria andDepartmentIntroIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `department_intro` is not null";
		}else{
			condition123 += "`department_intro` is not null";
		}
		return this;
	}
	public DepartmentCriteria orDepartmentIntroIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `department_intro` is not null";
		}else{
			condition123 += "`department_intro` is not null";
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentIntroIn(String value){
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
				condition123 += "and `department_intro` in("+value+") ";
			}else{
				condition123 += "`department_intro` in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentIntroIn(String value){
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
				condition123 += "or `department_intro` in("+value+") ";
			}else{
				condition123 += "`department_intro` in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andDepartmentIntroNotIn(String value){
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
				condition123 += "and `department_intro` not in("+value+") ";
			}else{
				condition123 += "`department_intro` not in("+value+") ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orDepartmentIntroNotIn(String value){
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
				condition123 += "or `department_intro` not in("+value+") ";
			}else{
				condition123 += "`department_intro` not in("+value+") ";
			}
		}
		return this;
	}

	public DepartmentCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orStatusNotEquals(String status){
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
	public DepartmentCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public DepartmentCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public DepartmentCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public DepartmentCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public DepartmentCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public DepartmentCriteria andStatusIn(String value){
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
	
	public DepartmentCriteria orStatusIn(String value){
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
	
	public DepartmentCriteria andStatusNotIn(String value){
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
	
	public DepartmentCriteria orStatusNotIn(String value){
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

	public DepartmentCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orCreateTimeNotEquals(String createTime){
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
	public DepartmentCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public DepartmentCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public DepartmentCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public DepartmentCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public DepartmentCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public DepartmentCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public DepartmentCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public DepartmentCriteria andCreateTimeIn(String value){
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
	
	public DepartmentCriteria orCreateTimeIn(String value){
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
	
	public DepartmentCriteria andCreateTimeNotIn(String value){
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
	
	public DepartmentCriteria orCreateTimeNotIn(String value){
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

	private void initDepartment(Department department) {
		super.setId(department.getId());
		super.setDepartmentNumber(department.getDepartmentNumber());
		super.setDepartmentName(department.getDepartmentName());
		super.setDepartmentAddress(department.getDepartmentAddress());
		super.setDepartmentLeader(department.getDepartmentLeader());
		super.setDepartmentIntro(department.getDepartmentIntro());
		super.setStatus(department.getStatus());
		super.setCreateTime(department.getCreateTime());

	}

}