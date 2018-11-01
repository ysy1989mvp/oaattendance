package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.AttendanceDateTable;

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
public class AttendanceDateTableCriteria extends AttendanceDateTable{
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
	private AttendanceDateTable attendanceDateTable;
	private String feid123;//字段用于统计查询时设置

	public AttendanceDateTableCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public AttendanceDateTable getAttendanceDateTable() {
		return attendanceDateTable;
	}
	public void setAttendanceDateTable(AttendanceDateTable attendanceDateTable) {
		this.attendanceDateTable = attendanceDateTable;
		initAttendanceDateTable(attendanceDateTable);
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
	public AttendanceDateTableCriteria page(Page value){
		page123 = value;
		return this;
	}
	public AttendanceDateTableCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public AttendanceDateTableCriteria having(String value){
		having123 = value;
		return this;
	}
	public AttendanceDateTableCriteria orderBy(String value){
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

	public AttendanceDateTableCriteria andIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andIdNotEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`!="+id+" ";
			}else{
				condition123 += "`id`!="+id+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdNotEquals(Integer id){
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
	public AttendanceDateTableCriteria andIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `id` is null";
			}else{
				condition123 += "`id` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is null";
		}else{
			condition123 += "`id` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria andIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceDateTableCriteria andDateTableTypeEquals(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_type`='"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`='"+dateTableType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableTypeEquals(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_type`='"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`='"+dateTableType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableTypeNotEquals(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_type`!='"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`!='"+dateTableType+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableTypeNotEquals(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_type`!='"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`!='"+dateTableType+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceDateTableCriteria andDateTableTypeGreaterThan(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_type`>'"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`>'"+dateTableType+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableTypeGreaterThan(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_type`>'"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`>'"+dateTableType+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andDateTableTypeLessThan(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_type`<'"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`<'"+dateTableType+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableTypeLessThan(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_type`<'"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`<'"+dateTableType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableTypeGreadterThanAndEquals(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_type`>='"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`>='"+dateTableType+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableTypeGreadterThanAndEquals(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_type`>='"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`>='"+dateTableType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableTypeLessThanAndEquals(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_type`<='"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`<='"+dateTableType+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableTypeLessThanAndEquals(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_type`<='"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type`<='"+dateTableType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableTypeLike(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0&&!("%".equals(dateTableType.trim()))&&!("%%".equals(dateTableType.trim()))){
			if(condition123.length()>0){
				condition123 += "and `date_table_type` like '"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type` like '"+dateTableType+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableTypeLike(String dateTableType){
		if(dateTableType!=null&&dateTableType.trim().length()>0&&!("%".equals(dateTableType.trim()))&&!("%%".equals(dateTableType.trim()))){
			if(condition123.length()>0){
				condition123 += "or `date_table_type` like '"+dateTableType+"' ";
			}else{
				condition123 += "`date_table_type` like '"+dateTableType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableTypeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `date_table_type` is null";
			}else{
				condition123 += "`date_table_type` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableTypeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_type` is null";
		}else{
			condition123 += "`date_table_type` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andDateTableTypeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `date_table_type` is not null";
		}else{
			condition123 += "`date_table_type` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableTypeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_type` is not null";
		}else{
			condition123 += "`date_table_type` is not null";
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableTypeIn(String value){
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
				condition123 += "and `date_table_type` in("+value+") ";
			}else{
				condition123 += "`date_table_type` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableTypeIn(String value){
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
				condition123 += "or `date_table_type` in("+value+") ";
			}else{
				condition123 += "`date_table_type` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableTypeNotIn(String value){
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
				condition123 += "and `date_table_type` not in("+value+") ";
			}else{
				condition123 += "`date_table_type` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableTypeNotIn(String value){
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
				condition123 += "or `date_table_type` not in("+value+") ";
			}else{
				condition123 += "`date_table_type` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceDateTableCriteria andUserIdEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`="+userId+" ";
			}else{
				condition123 += "`user_id`="+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orUserIdEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`="+userId+" ";
			}else{
				condition123 += "`user_id`="+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andUserIdNotEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`!="+userId+" ";
			}else{
				condition123 += "`user_id`!="+userId+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdNotEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`!="+userId+" ";
			}else{
				condition123 += "`user_id`!="+userId+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceDateTableCriteria andUserIdGreaterThan(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`>"+userId+" ";
			}else{
				condition123 += "`user_id`>"+userId+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdGreaterThan(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`>"+userId+" ";
			}else{
				condition123 += "`user_id`>"+userId+" ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andUserIdLessThan(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`<"+userId+" ";
			}else{
				condition123 += "`user_id`<"+userId+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdLessThan(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`<"+userId+" ";
			}else{
				condition123 += "`user_id`<"+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andUserIdGreadterThanAndEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`>="+userId+" ";
			}else{
				condition123 += "`user_id`>="+userId+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdGreadterThanAndEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`>="+userId+" ";
			}else{
				condition123 += "`user_id`>="+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andUserIdLessThanAndEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`<="+userId+" ";
			}else{
				condition123 += "`user_id`<="+userId+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdLessThanAndEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`<="+userId+" ";
			}else{
				condition123 += "`user_id`<="+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andUserIdLike(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id` like "+userId+" ";
			}else{
				condition123 += "`user_id` like "+userId+" ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdLike(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id` like "+userId+" ";
			}else{
				condition123 += "`user_id` like "+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andUserIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `user_id` is null";
			}else{
				condition123 += "`user_id` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `user_id` is null";
		}else{
			condition123 += "`user_id` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andUserIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `user_id` is not null";
		}else{
			condition123 += "`user_id` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `user_id` is not null";
		}else{
			condition123 += "`user_id` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andUserIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `user_id` in("+value+") ";
			}else{
				condition123 += "`user_id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `user_id` in("+value+") ";
			}else{
				condition123 += "`user_id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria andUserIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `user_id` not in("+value+") ";
			}else{
				condition123 += "`user_id` not in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orUserIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `user_id` not in("+value+") ";
			}else{
				condition123 += "`user_id` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceDateTableCriteria andDateTableYearEquals(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_year`='"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`='"+dateTableYear+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableYearEquals(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_year`='"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`='"+dateTableYear+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableYearNotEquals(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_year`!='"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`!='"+dateTableYear+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableYearNotEquals(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_year`!='"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`!='"+dateTableYear+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceDateTableCriteria andDateTableYearGreaterThan(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_year`>'"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`>'"+dateTableYear+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableYearGreaterThan(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_year`>'"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`>'"+dateTableYear+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andDateTableYearLessThan(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_year`<'"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`<'"+dateTableYear+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableYearLessThan(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_year`<'"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`<'"+dateTableYear+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableYearGreadterThanAndEquals(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_year`>='"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`>='"+dateTableYear+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableYearGreadterThanAndEquals(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_year`>='"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`>='"+dateTableYear+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableYearLessThanAndEquals(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_year`<='"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`<='"+dateTableYear+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableYearLessThanAndEquals(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_year`<='"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year`<='"+dateTableYear+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableYearLike(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0&&!("%".equals(dateTableYear.trim()))&&!("%%".equals(dateTableYear.trim()))){
			if(condition123.length()>0){
				condition123 += "and `date_table_year` like '"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year` like '"+dateTableYear+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableYearLike(String dateTableYear){
		if(dateTableYear!=null&&dateTableYear.trim().length()>0&&!("%".equals(dateTableYear.trim()))&&!("%%".equals(dateTableYear.trim()))){
			if(condition123.length()>0){
				condition123 += "or `date_table_year` like '"+dateTableYear+"' ";
			}else{
				condition123 += "`date_table_year` like '"+dateTableYear+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableYearIsNull(){
			if(condition123.length()>0){
				condition123 += "and `date_table_year` is null";
			}else{
				condition123 += "`date_table_year` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableYearIsNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_year` is null";
		}else{
			condition123 += "`date_table_year` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andDateTableYearIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `date_table_year` is not null";
		}else{
			condition123 += "`date_table_year` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableYearIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_year` is not null";
		}else{
			condition123 += "`date_table_year` is not null";
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableYearIn(String value){
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
				condition123 += "and `date_table_year` in("+value+") ";
			}else{
				condition123 += "`date_table_year` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableYearIn(String value){
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
				condition123 += "or `date_table_year` in("+value+") ";
			}else{
				condition123 += "`date_table_year` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableYearNotIn(String value){
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
				condition123 += "and `date_table_year` not in("+value+") ";
			}else{
				condition123 += "`date_table_year` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableYearNotIn(String value){
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
				condition123 += "or `date_table_year` not in("+value+") ";
			}else{
				condition123 += "`date_table_year` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceDateTableCriteria andDateTableMonthEquals(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_month`='"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`='"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableMonthEquals(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_month`='"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`='"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableMonthNotEquals(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_month`!='"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`!='"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableMonthNotEquals(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_month`!='"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`!='"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceDateTableCriteria andDateTableMonthGreaterThan(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_month`>'"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`>'"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableMonthGreaterThan(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_month`>'"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`>'"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andDateTableMonthLessThan(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_month`<'"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`<'"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableMonthLessThan(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_month`<'"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`<'"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableMonthGreadterThanAndEquals(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_month`>='"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`>='"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableMonthGreadterThanAndEquals(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_month`>='"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`>='"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableMonthLessThanAndEquals(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_month`<='"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`<='"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableMonthLessThanAndEquals(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_month`<='"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month`<='"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableMonthLike(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0&&!("%".equals(dateTableMonth.trim()))&&!("%%".equals(dateTableMonth.trim()))){
			if(condition123.length()>0){
				condition123 += "and `date_table_month` like '"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month` like '"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableMonthLike(String dateTableMonth){
		if(dateTableMonth!=null&&dateTableMonth.trim().length()>0&&!("%".equals(dateTableMonth.trim()))&&!("%%".equals(dateTableMonth.trim()))){
			if(condition123.length()>0){
				condition123 += "or `date_table_month` like '"+dateTableMonth+"' ";
			}else{
				condition123 += "`date_table_month` like '"+dateTableMonth+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableMonthIsNull(){
			if(condition123.length()>0){
				condition123 += "and `date_table_month` is null";
			}else{
				condition123 += "`date_table_month` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableMonthIsNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_month` is null";
		}else{
			condition123 += "`date_table_month` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andDateTableMonthIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `date_table_month` is not null";
		}else{
			condition123 += "`date_table_month` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableMonthIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_month` is not null";
		}else{
			condition123 += "`date_table_month` is not null";
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableMonthIn(String value){
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
				condition123 += "and `date_table_month` in("+value+") ";
			}else{
				condition123 += "`date_table_month` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableMonthIn(String value){
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
				condition123 += "or `date_table_month` in("+value+") ";
			}else{
				condition123 += "`date_table_month` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableMonthNotIn(String value){
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
				condition123 += "and `date_table_month` not in("+value+") ";
			}else{
				condition123 += "`date_table_month` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableMonthNotIn(String value){
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
				condition123 += "or `date_table_month` not in("+value+") ";
			}else{
				condition123 += "`date_table_month` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceDateTableCriteria andDateTableDayEquals(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_day`='"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`='"+dateTableDay+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableDayEquals(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_day`='"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`='"+dateTableDay+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableDayNotEquals(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_day`!='"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`!='"+dateTableDay+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableDayNotEquals(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_day`!='"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`!='"+dateTableDay+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceDateTableCriteria andDateTableDayGreaterThan(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_day`>'"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`>'"+dateTableDay+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableDayGreaterThan(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_day`>'"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`>'"+dateTableDay+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andDateTableDayLessThan(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_day`<'"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`<'"+dateTableDay+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableDayLessThan(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_day`<'"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`<'"+dateTableDay+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableDayGreadterThanAndEquals(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_day`>='"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`>='"+dateTableDay+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableDayGreadterThanAndEquals(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_day`>='"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`>='"+dateTableDay+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableDayLessThanAndEquals(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_day`<='"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`<='"+dateTableDay+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableDayLessThanAndEquals(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_day`<='"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day`<='"+dateTableDay+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableDayLike(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0&&!("%".equals(dateTableDay.trim()))&&!("%%".equals(dateTableDay.trim()))){
			if(condition123.length()>0){
				condition123 += "and `date_table_day` like '"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day` like '"+dateTableDay+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableDayLike(String dateTableDay){
		if(dateTableDay!=null&&dateTableDay.trim().length()>0&&!("%".equals(dateTableDay.trim()))&&!("%%".equals(dateTableDay.trim()))){
			if(condition123.length()>0){
				condition123 += "or `date_table_day` like '"+dateTableDay+"' ";
			}else{
				condition123 += "`date_table_day` like '"+dateTableDay+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableDayIsNull(){
			if(condition123.length()>0){
				condition123 += "and `date_table_day` is null";
			}else{
				condition123 += "`date_table_day` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableDayIsNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_day` is null";
		}else{
			condition123 += "`date_table_day` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andDateTableDayIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `date_table_day` is not null";
		}else{
			condition123 += "`date_table_day` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableDayIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_day` is not null";
		}else{
			condition123 += "`date_table_day` is not null";
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableDayIn(String value){
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
				condition123 += "and `date_table_day` in("+value+") ";
			}else{
				condition123 += "`date_table_day` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableDayIn(String value){
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
				condition123 += "or `date_table_day` in("+value+") ";
			}else{
				condition123 += "`date_table_day` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableDayNotIn(String value){
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
				condition123 += "and `date_table_day` not in("+value+") ";
			}else{
				condition123 += "`date_table_day` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableDayNotIn(String value){
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
				condition123 += "or `date_table_day` not in("+value+") ";
			}else{
				condition123 += "`date_table_day` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceDateTableCriteria andDateTableWorkingStatusEquals(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_working_status`='"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`='"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableWorkingStatusEquals(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_working_status`='"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`='"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableWorkingStatusNotEquals(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_working_status`!='"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`!='"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableWorkingStatusNotEquals(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_working_status`!='"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`!='"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceDateTableCriteria andDateTableWorkingStatusGreaterThan(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_working_status`>'"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`>'"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableWorkingStatusGreaterThan(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_working_status`>'"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`>'"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andDateTableWorkingStatusLessThan(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_working_status`<'"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`<'"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableWorkingStatusLessThan(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_working_status`<'"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`<'"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableWorkingStatusGreadterThanAndEquals(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_working_status`>='"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`>='"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableWorkingStatusGreadterThanAndEquals(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_working_status`>='"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`>='"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableWorkingStatusLessThanAndEquals(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `date_table_working_status`<='"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`<='"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableWorkingStatusLessThanAndEquals(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `date_table_working_status`<='"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status`<='"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableWorkingStatusLike(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0&&!("%".equals(dateTableWorkingStatus.trim()))&&!("%%".equals(dateTableWorkingStatus.trim()))){
			if(condition123.length()>0){
				condition123 += "and `date_table_working_status` like '"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status` like '"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableWorkingStatusLike(String dateTableWorkingStatus){
		if(dateTableWorkingStatus!=null&&dateTableWorkingStatus.trim().length()>0&&!("%".equals(dateTableWorkingStatus.trim()))&&!("%%".equals(dateTableWorkingStatus.trim()))){
			if(condition123.length()>0){
				condition123 += "or `date_table_working_status` like '"+dateTableWorkingStatus+"' ";
			}else{
				condition123 += "`date_table_working_status` like '"+dateTableWorkingStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableWorkingStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `date_table_working_status` is null";
			}else{
				condition123 += "`date_table_working_status` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableWorkingStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_working_status` is null";
		}else{
			condition123 += "`date_table_working_status` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andDateTableWorkingStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `date_table_working_status` is not null";
		}else{
			condition123 += "`date_table_working_status` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orDateTableWorkingStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `date_table_working_status` is not null";
		}else{
			condition123 += "`date_table_working_status` is not null";
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableWorkingStatusIn(String value){
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
				condition123 += "and `date_table_working_status` in("+value+") ";
			}else{
				condition123 += "`date_table_working_status` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableWorkingStatusIn(String value){
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
				condition123 += "or `date_table_working_status` in("+value+") ";
			}else{
				condition123 += "`date_table_working_status` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andDateTableWorkingStatusNotIn(String value){
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
				condition123 += "and `date_table_working_status` not in("+value+") ";
			}else{
				condition123 += "`date_table_working_status` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orDateTableWorkingStatusNotIn(String value){
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
				condition123 += "or `date_table_working_status` not in("+value+") ";
			}else{
				condition123 += "`date_table_working_status` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceDateTableCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orStatusNotEquals(String status){
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
	public AttendanceDateTableCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andStatusIn(String value){
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
	
	public AttendanceDateTableCriteria orStatusIn(String value){
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
	
	public AttendanceDateTableCriteria andStatusNotIn(String value){
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
	
	public AttendanceDateTableCriteria orStatusNotIn(String value){
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

	public AttendanceDateTableCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orCreateTimeNotEquals(String createTime){
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
	public AttendanceDateTableCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceDateTableCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceDateTableCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public AttendanceDateTableCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public AttendanceDateTableCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public AttendanceDateTableCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public AttendanceDateTableCriteria andCreateTimeIn(String value){
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
	
	public AttendanceDateTableCriteria orCreateTimeIn(String value){
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
	
	public AttendanceDateTableCriteria andCreateTimeNotIn(String value){
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
	
	public AttendanceDateTableCriteria orCreateTimeNotIn(String value){
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

	private void initAttendanceDateTable(AttendanceDateTable attendanceDateTable) {
		super.setId(attendanceDateTable.getId());
		super.setDateTableType(attendanceDateTable.getDateTableType());
		super.setUserId(attendanceDateTable.getUserId());
		super.setDateTableYear(attendanceDateTable.getDateTableYear());
		super.setDateTableMonth(attendanceDateTable.getDateTableMonth());
		super.setDateTableDay(attendanceDateTable.getDateTableDay());
		super.setDateTableWorkingStatus(attendanceDateTable.getDateTableWorkingStatus());
		super.setStatus(attendanceDateTable.getStatus());
		super.setCreateTime(attendanceDateTable.getCreateTime());

	}

}