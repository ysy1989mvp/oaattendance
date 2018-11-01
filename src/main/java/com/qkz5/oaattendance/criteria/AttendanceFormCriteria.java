package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.AttendanceForm;

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
public class AttendanceFormCriteria extends AttendanceForm{
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
	private AttendanceForm attendanceForm;
	private String feid123;//字段用于统计查询时设置

	public AttendanceFormCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public AttendanceForm getAttendanceForm() {
		return attendanceForm;
	}
	public void setAttendanceForm(AttendanceForm attendanceForm) {
		this.attendanceForm = attendanceForm;
		initAttendanceForm(attendanceForm);
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
	public AttendanceFormCriteria page(Page value){
		page123 = value;
		return this;
	}
	public AttendanceFormCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public AttendanceFormCriteria having(String value){
		having123 = value;
		return this;
	}
	public AttendanceFormCriteria orderBy(String value){
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

	public AttendanceFormCriteria andIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andIdNotEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`!="+id+" ";
			}else{
				condition123 += "`id`!="+id+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orIdNotEquals(Integer id){
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
	public AttendanceFormCriteria andIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `id` is null";
			}else{
				condition123 += "`id` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is null";
		}else{
			condition123 += "`id` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria andIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria andIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceFormCriteria andUserIdEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`="+userId+" ";
			}else{
				condition123 += "`user_id`="+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orUserIdEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`="+userId+" ";
			}else{
				condition123 += "`user_id`="+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andUserIdNotEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`!="+userId+" ";
			}else{
				condition123 += "`user_id`!="+userId+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdNotEquals(Integer userId){
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
	public AttendanceFormCriteria andUserIdGreaterThan(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`>"+userId+" ";
			}else{
				condition123 += "`user_id`>"+userId+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdGreaterThan(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`>"+userId+" ";
			}else{
				condition123 += "`user_id`>"+userId+" ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andUserIdLessThan(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`<"+userId+" ";
			}else{
				condition123 += "`user_id`<"+userId+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdLessThan(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`<"+userId+" ";
			}else{
				condition123 += "`user_id`<"+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andUserIdGreadterThanAndEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`>="+userId+" ";
			}else{
				condition123 += "`user_id`>="+userId+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdGreadterThanAndEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`>="+userId+" ";
			}else{
				condition123 += "`user_id`>="+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andUserIdLessThanAndEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id`<="+userId+" ";
			}else{
				condition123 += "`user_id`<="+userId+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdLessThanAndEquals(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id`<="+userId+" ";
			}else{
				condition123 += "`user_id`<="+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andUserIdLike(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "and `user_id` like "+userId+" ";
			}else{
				condition123 += "`user_id` like "+userId+" ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdLike(Integer userId){
		if(userId!=null){
			if(condition123.length()>0){
				condition123 += "or `user_id` like "+userId+" ";
			}else{
				condition123 += "`user_id` like "+userId+" ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andUserIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `user_id` is null";
			}else{
				condition123 += "`user_id` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orUserIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `user_id` is null";
		}else{
			condition123 += "`user_id` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andUserIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `user_id` is not null";
		}else{
			condition123 += "`user_id` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `user_id` is not null";
		}else{
			condition123 += "`user_id` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria andUserIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `user_id` in("+value+") ";
			}else{
				condition123 += "`user_id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `user_id` in("+value+") ";
			}else{
				condition123 += "`user_id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria andUserIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `user_id` not in("+value+") ";
			}else{
				condition123 += "`user_id` not in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orUserIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `user_id` not in("+value+") ";
			}else{
				condition123 += "`user_id` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceFormCriteria andAttendanceFormClockTimeEquals(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_time`='"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`='"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockTimeEquals(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_time`='"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`='"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockTimeNotEquals(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_time`!='"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`!='"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockTimeNotEquals(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_time`!='"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`!='"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceFormCriteria andAttendanceFormClockTimeGreaterThan(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_time`>'"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`>'"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockTimeGreaterThan(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_time`>'"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`>'"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andAttendanceFormClockTimeLessThan(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_time`<'"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`<'"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockTimeLessThan(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_time`<'"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`<'"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockTimeGreadterThanAndEquals(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_time`>='"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`>='"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockTimeGreadterThanAndEquals(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_time`>='"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`>='"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockTimeLessThanAndEquals(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_time`<='"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`<='"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockTimeLessThanAndEquals(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_time`<='"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time`<='"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockTimeLike(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0&&!("%".equals(attendanceFormClockTime.trim()))&&!("%%".equals(attendanceFormClockTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_time` like '"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time` like '"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockTimeLike(String attendanceFormClockTime){
		if(attendanceFormClockTime!=null&&attendanceFormClockTime.trim().length()>0&&!("%".equals(attendanceFormClockTime.trim()))&&!("%%".equals(attendanceFormClockTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_time` like '"+attendanceFormClockTime+"' ";
			}else{
				condition123 += "`attendance_form_clock_time` like '"+attendanceFormClockTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_time` is null";
			}else{
				condition123 += "`attendance_form_clock_time` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_form_clock_time` is null";
		}else{
			condition123 += "`attendance_form_clock_time` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andAttendanceFormClockTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_form_clock_time` is not null";
		}else{
			condition123 += "`attendance_form_clock_time` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_form_clock_time` is not null";
		}else{
			condition123 += "`attendance_form_clock_time` is not null";
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockTimeIn(String value){
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
				condition123 += "and `attendance_form_clock_time` in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockTimeIn(String value){
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
				condition123 += "or `attendance_form_clock_time` in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockTimeNotIn(String value){
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
				condition123 += "and `attendance_form_clock_time` not in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockTimeNotIn(String value){
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
				condition123 += "or `attendance_form_clock_time` not in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_time` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceFormCriteria andAttendanceFormClockStatusEquals(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_status`='"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`='"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockStatusEquals(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_status`='"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`='"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockStatusNotEquals(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_status`!='"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`!='"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockStatusNotEquals(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_status`!='"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`!='"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceFormCriteria andAttendanceFormClockStatusGreaterThan(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_status`>'"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`>'"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockStatusGreaterThan(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_status`>'"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`>'"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andAttendanceFormClockStatusLessThan(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_status`<'"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`<'"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockStatusLessThan(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_status`<'"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`<'"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockStatusGreadterThanAndEquals(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_status`>='"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`>='"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockStatusGreadterThanAndEquals(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_status`>='"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`>='"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockStatusLessThanAndEquals(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_status`<='"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`<='"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockStatusLessThanAndEquals(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_status`<='"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status`<='"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockStatusLike(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0&&!("%".equals(attendanceFormClockStatus.trim()))&&!("%%".equals(attendanceFormClockStatus.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_status` like '"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status` like '"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockStatusLike(String attendanceFormClockStatus){
		if(attendanceFormClockStatus!=null&&attendanceFormClockStatus.trim().length()>0&&!("%".equals(attendanceFormClockStatus.trim()))&&!("%%".equals(attendanceFormClockStatus.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_status` like '"+attendanceFormClockStatus+"' ";
			}else{
				condition123 += "`attendance_form_clock_status` like '"+attendanceFormClockStatus+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_status` is null";
			}else{
				condition123 += "`attendance_form_clock_status` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_form_clock_status` is null";
		}else{
			condition123 += "`attendance_form_clock_status` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andAttendanceFormClockStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_form_clock_status` is not null";
		}else{
			condition123 += "`attendance_form_clock_status` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_form_clock_status` is not null";
		}else{
			condition123 += "`attendance_form_clock_status` is not null";
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockStatusIn(String value){
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
				condition123 += "and `attendance_form_clock_status` in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_status` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockStatusIn(String value){
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
				condition123 += "or `attendance_form_clock_status` in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_status` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockStatusNotIn(String value){
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
				condition123 += "and `attendance_form_clock_status` not in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_status` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockStatusNotIn(String value){
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
				condition123 += "or `attendance_form_clock_status` not in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_status` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeEquals(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_business_hours_type`='"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`='"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeEquals(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_business_hours_type`='"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`='"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeNotEquals(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_business_hours_type`!='"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`!='"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeNotEquals(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_business_hours_type`!='"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`!='"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeGreaterThan(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_business_hours_type`>'"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`>'"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeGreaterThan(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_business_hours_type`>'"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`>'"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeLessThan(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_business_hours_type`<'"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`<'"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeLessThan(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_business_hours_type`<'"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`<'"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeGreadterThanAndEquals(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_business_hours_type`>='"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`>='"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeGreadterThanAndEquals(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_business_hours_type`>='"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`>='"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeLessThanAndEquals(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_business_hours_type`<='"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`<='"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeLessThanAndEquals(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_business_hours_type`<='"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type`<='"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeLike(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0&&!("%".equals(attendanceClosingBusinessHoursType.trim()))&&!("%%".equals(attendanceClosingBusinessHoursType.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_business_hours_type` like '"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type` like '"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeLike(String attendanceClosingBusinessHoursType){
		if(attendanceClosingBusinessHoursType!=null&&attendanceClosingBusinessHoursType.trim().length()>0&&!("%".equals(attendanceClosingBusinessHoursType.trim()))&&!("%%".equals(attendanceClosingBusinessHoursType.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_business_hours_type` like '"+attendanceClosingBusinessHoursType+"' ";
			}else{
				condition123 += "`attendance_closing_business_hours_type` like '"+attendanceClosingBusinessHoursType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_business_hours_type` is null";
			}else{
				condition123 += "`attendance_closing_business_hours_type` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_closing_business_hours_type` is null";
		}else{
			condition123 += "`attendance_closing_business_hours_type` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_closing_business_hours_type` is not null";
		}else{
			condition123 += "`attendance_closing_business_hours_type` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_closing_business_hours_type` is not null";
		}else{
			condition123 += "`attendance_closing_business_hours_type` is not null";
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeIn(String value){
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
				condition123 += "and `attendance_closing_business_hours_type` in("+value+") ";
			}else{
				condition123 += "`attendance_closing_business_hours_type` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeIn(String value){
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
				condition123 += "or `attendance_closing_business_hours_type` in("+value+") ";
			}else{
				condition123 += "`attendance_closing_business_hours_type` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceClosingBusinessHoursTypeNotIn(String value){
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
				condition123 += "and `attendance_closing_business_hours_type` not in("+value+") ";
			}else{
				condition123 += "`attendance_closing_business_hours_type` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceClosingBusinessHoursTypeNotIn(String value){
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
				condition123 += "or `attendance_closing_business_hours_type` not in("+value+") ";
			}else{
				condition123 += "`attendance_closing_business_hours_type` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceFormCriteria andAttendanceFormClockAddressEquals(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_address`='"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`='"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockAddressEquals(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_address`='"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`='"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockAddressNotEquals(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_address`!='"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`!='"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockAddressNotEquals(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_address`!='"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`!='"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceFormCriteria andAttendanceFormClockAddressGreaterThan(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_address`>'"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`>'"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockAddressGreaterThan(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_address`>'"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`>'"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andAttendanceFormClockAddressLessThan(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_address`<'"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`<'"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockAddressLessThan(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_address`<'"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`<'"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockAddressGreadterThanAndEquals(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_address`>='"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`>='"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockAddressGreadterThanAndEquals(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_address`>='"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`>='"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockAddressLessThanAndEquals(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_address`<='"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`<='"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockAddressLessThanAndEquals(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_address`<='"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address`<='"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockAddressLike(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0&&!("%".equals(attendanceFormClockAddress.trim()))&&!("%%".equals(attendanceFormClockAddress.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_address` like '"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address` like '"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockAddressLike(String attendanceFormClockAddress){
		if(attendanceFormClockAddress!=null&&attendanceFormClockAddress.trim().length()>0&&!("%".equals(attendanceFormClockAddress.trim()))&&!("%%".equals(attendanceFormClockAddress.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_form_clock_address` like '"+attendanceFormClockAddress+"' ";
			}else{
				condition123 += "`attendance_form_clock_address` like '"+attendanceFormClockAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockAddressIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_form_clock_address` is null";
			}else{
				condition123 += "`attendance_form_clock_address` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockAddressIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_form_clock_address` is null";
		}else{
			condition123 += "`attendance_form_clock_address` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andAttendanceFormClockAddressIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_form_clock_address` is not null";
		}else{
			condition123 += "`attendance_form_clock_address` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orAttendanceFormClockAddressIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_form_clock_address` is not null";
		}else{
			condition123 += "`attendance_form_clock_address` is not null";
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockAddressIn(String value){
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
				condition123 += "and `attendance_form_clock_address` in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_address` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockAddressIn(String value){
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
				condition123 += "or `attendance_form_clock_address` in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_address` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andAttendanceFormClockAddressNotIn(String value){
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
				condition123 += "and `attendance_form_clock_address` not in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_address` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orAttendanceFormClockAddressNotIn(String value){
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
				condition123 += "or `attendance_form_clock_address` not in("+value+") ";
			}else{
				condition123 += "`attendance_form_clock_address` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceFormCriteria andSpecialTimeStatisticsEquals(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `special_time_statistics`='"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`='"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orSpecialTimeStatisticsEquals(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `special_time_statistics`='"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`='"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andSpecialTimeStatisticsNotEquals(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `special_time_statistics`!='"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`!='"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orSpecialTimeStatisticsNotEquals(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `special_time_statistics`!='"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`!='"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceFormCriteria andSpecialTimeStatisticsGreaterThan(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `special_time_statistics`>'"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`>'"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orSpecialTimeStatisticsGreaterThan(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `special_time_statistics`>'"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`>'"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andSpecialTimeStatisticsLessThan(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `special_time_statistics`<'"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`<'"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orSpecialTimeStatisticsLessThan(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `special_time_statistics`<'"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`<'"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andSpecialTimeStatisticsGreadterThanAndEquals(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `special_time_statistics`>='"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`>='"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orSpecialTimeStatisticsGreadterThanAndEquals(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `special_time_statistics`>='"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`>='"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andSpecialTimeStatisticsLessThanAndEquals(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `special_time_statistics`<='"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`<='"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orSpecialTimeStatisticsLessThanAndEquals(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `special_time_statistics`<='"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics`<='"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andSpecialTimeStatisticsLike(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0&&!("%".equals(specialTimeStatistics.trim()))&&!("%%".equals(specialTimeStatistics.trim()))){
			if(condition123.length()>0){
				condition123 += "and `special_time_statistics` like '"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics` like '"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orSpecialTimeStatisticsLike(String specialTimeStatistics){
		if(specialTimeStatistics!=null&&specialTimeStatistics.trim().length()>0&&!("%".equals(specialTimeStatistics.trim()))&&!("%%".equals(specialTimeStatistics.trim()))){
			if(condition123.length()>0){
				condition123 += "or `special_time_statistics` like '"+specialTimeStatistics+"' ";
			}else{
				condition123 += "`special_time_statistics` like '"+specialTimeStatistics+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andSpecialTimeStatisticsIsNull(){
			if(condition123.length()>0){
				condition123 += "and `special_time_statistics` is null";
			}else{
				condition123 += "`special_time_statistics` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orSpecialTimeStatisticsIsNull(){
		if(condition123.length()>0){
			condition123 += "or `special_time_statistics` is null";
		}else{
			condition123 += "`special_time_statistics` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andSpecialTimeStatisticsIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `special_time_statistics` is not null";
		}else{
			condition123 += "`special_time_statistics` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orSpecialTimeStatisticsIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `special_time_statistics` is not null";
		}else{
			condition123 += "`special_time_statistics` is not null";
		}
		return this;
	}
	
	public AttendanceFormCriteria andSpecialTimeStatisticsIn(String value){
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
				condition123 += "and `special_time_statistics` in("+value+") ";
			}else{
				condition123 += "`special_time_statistics` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orSpecialTimeStatisticsIn(String value){
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
				condition123 += "or `special_time_statistics` in("+value+") ";
			}else{
				condition123 += "`special_time_statistics` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andSpecialTimeStatisticsNotIn(String value){
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
				condition123 += "and `special_time_statistics` not in("+value+") ";
			}else{
				condition123 += "`special_time_statistics` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orSpecialTimeStatisticsNotIn(String value){
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
				condition123 += "or `special_time_statistics` not in("+value+") ";
			}else{
				condition123 += "`special_time_statistics` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceFormCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orStatusNotEquals(String status){
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
	public AttendanceFormCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public AttendanceFormCriteria andStatusIn(String value){
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
	
	public AttendanceFormCriteria orStatusIn(String value){
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
	
	public AttendanceFormCriteria andStatusNotIn(String value){
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
	
	public AttendanceFormCriteria orStatusNotIn(String value){
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

	public AttendanceFormCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orCreateTimeNotEquals(String createTime){
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
	public AttendanceFormCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceFormCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceFormCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceFormCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public AttendanceFormCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public AttendanceFormCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public AttendanceFormCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public AttendanceFormCriteria andCreateTimeIn(String value){
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
	
	public AttendanceFormCriteria orCreateTimeIn(String value){
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
	
	public AttendanceFormCriteria andCreateTimeNotIn(String value){
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
	
	public AttendanceFormCriteria orCreateTimeNotIn(String value){
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

	private void initAttendanceForm(AttendanceForm attendanceForm) {
		super.setId(attendanceForm.getId());
		super.setUserId(attendanceForm.getUserId());
		super.setAttendanceFormClockTime(attendanceForm.getAttendanceFormClockTime());
		super.setAttendanceFormClockStatus(attendanceForm.getAttendanceFormClockStatus());
		super.setAttendanceClosingBusinessHoursType(attendanceForm.getAttendanceClosingBusinessHoursType());
		super.setAttendanceFormClockAddress(attendanceForm.getAttendanceFormClockAddress());
		super.setSpecialTimeStatistics(attendanceForm.getSpecialTimeStatistics());
		super.setStatus(attendanceForm.getStatus());
		super.setCreateTime(attendanceForm.getCreateTime());

	}

}