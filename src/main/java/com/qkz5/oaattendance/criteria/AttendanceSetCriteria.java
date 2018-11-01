package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.AttendanceSet;

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
public class AttendanceSetCriteria extends AttendanceSet{
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
	private AttendanceSet attendanceSet;
	private String feid123;//字段用于统计查询时设置

	public AttendanceSetCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public AttendanceSet getAttendanceSet() {
		return attendanceSet;
	}
	public void setAttendanceSet(AttendanceSet attendanceSet) {
		this.attendanceSet = attendanceSet;
		initAttendanceSet(attendanceSet);
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
	public AttendanceSetCriteria page(Page value){
		page123 = value;
		return this;
	}
	public AttendanceSetCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public AttendanceSetCriteria having(String value){
		having123 = value;
		return this;
	}
	public AttendanceSetCriteria orderBy(String value){
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

	public AttendanceSetCriteria andIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andIdNotEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`!="+id+" ";
			}else{
				condition123 += "`id`!="+id+" ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orIdNotEquals(Integer id){
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
	public AttendanceSetCriteria andIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `id` is null";
			}else{
				condition123 += "`id` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is null";
		}else{
			condition123 += "`id` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria andIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria andIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceTypeEquals(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_type`='"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`='"+attendanceType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceTypeEquals(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_type`='"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`='"+attendanceType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceTypeNotEquals(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_type`!='"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`!='"+attendanceType+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceTypeNotEquals(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_type`!='"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`!='"+attendanceType+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceTypeGreaterThan(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_type`>'"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`>'"+attendanceType+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceTypeGreaterThan(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_type`>'"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`>'"+attendanceType+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceTypeLessThan(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_type`<'"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`<'"+attendanceType+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceTypeLessThan(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_type`<'"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`<'"+attendanceType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceTypeGreadterThanAndEquals(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_type`>='"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`>='"+attendanceType+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceTypeGreadterThanAndEquals(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_type`>='"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`>='"+attendanceType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceTypeLessThanAndEquals(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_type`<='"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`<='"+attendanceType+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceTypeLessThanAndEquals(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_type`<='"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type`<='"+attendanceType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceTypeLike(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0&&!("%".equals(attendanceType.trim()))&&!("%%".equals(attendanceType.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_type` like '"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type` like '"+attendanceType+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceTypeLike(String attendanceType){
		if(attendanceType!=null&&attendanceType.trim().length()>0&&!("%".equals(attendanceType.trim()))&&!("%%".equals(attendanceType.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_type` like '"+attendanceType+"' ";
			}else{
				condition123 += "`attendance_type` like '"+attendanceType+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceTypeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_type` is null";
			}else{
				condition123 += "`attendance_type` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceTypeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_type` is null";
		}else{
			condition123 += "`attendance_type` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceTypeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_type` is not null";
		}else{
			condition123 += "`attendance_type` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceTypeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_type` is not null";
		}else{
			condition123 += "`attendance_type` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceTypeIn(String value){
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
				condition123 += "and `attendance_type` in("+value+") ";
			}else{
				condition123 += "`attendance_type` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceTypeIn(String value){
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
				condition123 += "or `attendance_type` in("+value+") ";
			}else{
				condition123 += "`attendance_type` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceTypeNotIn(String value){
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
				condition123 += "and `attendance_type` not in("+value+") ";
			}else{
				condition123 += "`attendance_type` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceTypeNotIn(String value){
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
				condition123 += "or `attendance_type` not in("+value+") ";
			}else{
				condition123 += "`attendance_type` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceClassesEquals(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_classes`='"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`='"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceClassesEquals(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_classes`='"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`='"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClassesNotEquals(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_classes`!='"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`!='"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClassesNotEquals(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_classes`!='"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`!='"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceClassesGreaterThan(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_classes`>'"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`>'"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClassesGreaterThan(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_classes`>'"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`>'"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceClassesLessThan(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_classes`<'"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`<'"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClassesLessThan(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_classes`<'"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`<'"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClassesGreadterThanAndEquals(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_classes`>='"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`>='"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClassesGreadterThanAndEquals(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_classes`>='"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`>='"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClassesLessThanAndEquals(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_classes`<='"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`<='"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClassesLessThanAndEquals(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_classes`<='"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes`<='"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClassesLike(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0&&!("%".equals(attendanceClasses.trim()))&&!("%%".equals(attendanceClasses.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_classes` like '"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes` like '"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClassesLike(String attendanceClasses){
		if(attendanceClasses!=null&&attendanceClasses.trim().length()>0&&!("%".equals(attendanceClasses.trim()))&&!("%%".equals(attendanceClasses.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_classes` like '"+attendanceClasses+"' ";
			}else{
				condition123 += "`attendance_classes` like '"+attendanceClasses+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClassesIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_classes` is null";
			}else{
				condition123 += "`attendance_classes` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClassesIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_classes` is null";
		}else{
			condition123 += "`attendance_classes` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceClassesIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_classes` is not null";
		}else{
			condition123 += "`attendance_classes` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClassesIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_classes` is not null";
		}else{
			condition123 += "`attendance_classes` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClassesIn(String value){
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
				condition123 += "and `attendance_classes` in("+value+") ";
			}else{
				condition123 += "`attendance_classes` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceClassesIn(String value){
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
				condition123 += "or `attendance_classes` in("+value+") ";
			}else{
				condition123 += "`attendance_classes` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClassesNotIn(String value){
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
				condition123 += "and `attendance_classes` not in("+value+") ";
			}else{
				condition123 += "`attendance_classes` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceClassesNotIn(String value){
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
				condition123 += "or `attendance_classes` not in("+value+") ";
			}else{
				condition123 += "`attendance_classes` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceObjectEquals(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_object`='"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`='"+attendanceObject+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceObjectEquals(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_object`='"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`='"+attendanceObject+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceObjectNotEquals(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_object`!='"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`!='"+attendanceObject+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceObjectNotEquals(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_object`!='"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`!='"+attendanceObject+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceObjectGreaterThan(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_object`>'"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`>'"+attendanceObject+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceObjectGreaterThan(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_object`>'"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`>'"+attendanceObject+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceObjectLessThan(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_object`<'"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`<'"+attendanceObject+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceObjectLessThan(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_object`<'"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`<'"+attendanceObject+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceObjectGreadterThanAndEquals(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_object`>='"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`>='"+attendanceObject+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceObjectGreadterThanAndEquals(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_object`>='"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`>='"+attendanceObject+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceObjectLessThanAndEquals(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_object`<='"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`<='"+attendanceObject+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceObjectLessThanAndEquals(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_object`<='"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object`<='"+attendanceObject+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceObjectLike(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0&&!("%".equals(attendanceObject.trim()))&&!("%%".equals(attendanceObject.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_object` like '"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object` like '"+attendanceObject+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceObjectLike(String attendanceObject){
		if(attendanceObject!=null&&attendanceObject.trim().length()>0&&!("%".equals(attendanceObject.trim()))&&!("%%".equals(attendanceObject.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_object` like '"+attendanceObject+"' ";
			}else{
				condition123 += "`attendance_object` like '"+attendanceObject+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceObjectIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_object` is null";
			}else{
				condition123 += "`attendance_object` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceObjectIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_object` is null";
		}else{
			condition123 += "`attendance_object` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceObjectIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_object` is not null";
		}else{
			condition123 += "`attendance_object` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceObjectIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_object` is not null";
		}else{
			condition123 += "`attendance_object` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceObjectIn(String value){
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
				condition123 += "and `attendance_object` in("+value+") ";
			}else{
				condition123 += "`attendance_object` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceObjectIn(String value){
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
				condition123 += "or `attendance_object` in("+value+") ";
			}else{
				condition123 += "`attendance_object` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceObjectNotIn(String value){
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
				condition123 += "and `attendance_object` not in("+value+") ";
			}else{
				condition123 += "`attendance_object` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceObjectNotIn(String value){
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
				condition123 += "or `attendance_object` not in("+value+") ";
			}else{
				condition123 += "`attendance_object` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceBusinessHoursEquals(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_business_hours`='"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`='"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceBusinessHoursEquals(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_business_hours`='"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`='"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceBusinessHoursNotEquals(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_business_hours`!='"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`!='"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceBusinessHoursNotEquals(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_business_hours`!='"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`!='"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceBusinessHoursGreaterThan(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_business_hours`>'"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`>'"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceBusinessHoursGreaterThan(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_business_hours`>'"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`>'"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceBusinessHoursLessThan(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_business_hours`<'"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`<'"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceBusinessHoursLessThan(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_business_hours`<'"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`<'"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceBusinessHoursGreadterThanAndEquals(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_business_hours`>='"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`>='"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceBusinessHoursGreadterThanAndEquals(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_business_hours`>='"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`>='"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceBusinessHoursLessThanAndEquals(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_business_hours`<='"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`<='"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceBusinessHoursLessThanAndEquals(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_business_hours`<='"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours`<='"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceBusinessHoursLike(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0&&!("%".equals(attendanceBusinessHours.trim()))&&!("%%".equals(attendanceBusinessHours.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_business_hours` like '"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours` like '"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceBusinessHoursLike(String attendanceBusinessHours){
		if(attendanceBusinessHours!=null&&attendanceBusinessHours.trim().length()>0&&!("%".equals(attendanceBusinessHours.trim()))&&!("%%".equals(attendanceBusinessHours.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_business_hours` like '"+attendanceBusinessHours+"' ";
			}else{
				condition123 += "`attendance_business_hours` like '"+attendanceBusinessHours+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceBusinessHoursIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_business_hours` is null";
			}else{
				condition123 += "`attendance_business_hours` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceBusinessHoursIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_business_hours` is null";
		}else{
			condition123 += "`attendance_business_hours` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceBusinessHoursIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_business_hours` is not null";
		}else{
			condition123 += "`attendance_business_hours` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceBusinessHoursIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_business_hours` is not null";
		}else{
			condition123 += "`attendance_business_hours` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceBusinessHoursIn(String value){
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
				condition123 += "and `attendance_business_hours` in("+value+") ";
			}else{
				condition123 += "`attendance_business_hours` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceBusinessHoursIn(String value){
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
				condition123 += "or `attendance_business_hours` in("+value+") ";
			}else{
				condition123 += "`attendance_business_hours` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceBusinessHoursNotIn(String value){
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
				condition123 += "and `attendance_business_hours` not in("+value+") ";
			}else{
				condition123 += "`attendance_business_hours` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceBusinessHoursNotIn(String value){
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
				condition123 += "or `attendance_business_hours` not in("+value+") ";
			}else{
				condition123 += "`attendance_business_hours` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceClosingTimeEquals(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_time`='"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`='"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceClosingTimeEquals(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_time`='"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`='"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClosingTimeNotEquals(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_time`!='"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`!='"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClosingTimeNotEquals(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_time`!='"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`!='"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceClosingTimeGreaterThan(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_time`>'"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`>'"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClosingTimeGreaterThan(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_time`>'"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`>'"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceClosingTimeLessThan(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_time`<'"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`<'"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClosingTimeLessThan(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_time`<'"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`<'"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClosingTimeGreadterThanAndEquals(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_time`>='"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`>='"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClosingTimeGreadterThanAndEquals(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_time`>='"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`>='"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClosingTimeLessThanAndEquals(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_time`<='"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`<='"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClosingTimeLessThanAndEquals(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_time`<='"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time`<='"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClosingTimeLike(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0&&!("%".equals(attendanceClosingTime.trim()))&&!("%%".equals(attendanceClosingTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_time` like '"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time` like '"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClosingTimeLike(String attendanceClosingTime){
		if(attendanceClosingTime!=null&&attendanceClosingTime.trim().length()>0&&!("%".equals(attendanceClosingTime.trim()))&&!("%%".equals(attendanceClosingTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_closing_time` like '"+attendanceClosingTime+"' ";
			}else{
				condition123 += "`attendance_closing_time` like '"+attendanceClosingTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClosingTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_closing_time` is null";
			}else{
				condition123 += "`attendance_closing_time` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClosingTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_closing_time` is null";
		}else{
			condition123 += "`attendance_closing_time` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceClosingTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_closing_time` is not null";
		}else{
			condition123 += "`attendance_closing_time` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceClosingTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_closing_time` is not null";
		}else{
			condition123 += "`attendance_closing_time` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClosingTimeIn(String value){
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
				condition123 += "and `attendance_closing_time` in("+value+") ";
			}else{
				condition123 += "`attendance_closing_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceClosingTimeIn(String value){
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
				condition123 += "or `attendance_closing_time` in("+value+") ";
			}else{
				condition123 += "`attendance_closing_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceClosingTimeNotIn(String value){
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
				condition123 += "and `attendance_closing_time` not in("+value+") ";
			}else{
				condition123 += "`attendance_closing_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceClosingTimeNotIn(String value){
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
				condition123 += "or `attendance_closing_time` not in("+value+") ";
			}else{
				condition123 += "`attendance_closing_time` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceFlexTimeEquals(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_flex_time`='"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`='"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceFlexTimeEquals(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_flex_time`='"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`='"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceFlexTimeNotEquals(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_flex_time`!='"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`!='"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceFlexTimeNotEquals(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_flex_time`!='"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`!='"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceFlexTimeGreaterThan(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_flex_time`>'"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`>'"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceFlexTimeGreaterThan(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_flex_time`>'"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`>'"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceFlexTimeLessThan(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_flex_time`<'"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`<'"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceFlexTimeLessThan(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_flex_time`<'"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`<'"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceFlexTimeGreadterThanAndEquals(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_flex_time`>='"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`>='"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceFlexTimeGreadterThanAndEquals(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_flex_time`>='"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`>='"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceFlexTimeLessThanAndEquals(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_flex_time`<='"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`<='"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceFlexTimeLessThanAndEquals(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_flex_time`<='"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time`<='"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceFlexTimeLike(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0&&!("%".equals(attendanceFlexTime.trim()))&&!("%%".equals(attendanceFlexTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_flex_time` like '"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time` like '"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceFlexTimeLike(String attendanceFlexTime){
		if(attendanceFlexTime!=null&&attendanceFlexTime.trim().length()>0&&!("%".equals(attendanceFlexTime.trim()))&&!("%%".equals(attendanceFlexTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_flex_time` like '"+attendanceFlexTime+"' ";
			}else{
				condition123 += "`attendance_flex_time` like '"+attendanceFlexTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceFlexTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_flex_time` is null";
			}else{
				condition123 += "`attendance_flex_time` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceFlexTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_flex_time` is null";
		}else{
			condition123 += "`attendance_flex_time` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceFlexTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_flex_time` is not null";
		}else{
			condition123 += "`attendance_flex_time` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceFlexTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_flex_time` is not null";
		}else{
			condition123 += "`attendance_flex_time` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceFlexTimeIn(String value){
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
				condition123 += "and `attendance_flex_time` in("+value+") ";
			}else{
				condition123 += "`attendance_flex_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceFlexTimeIn(String value){
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
				condition123 += "or `attendance_flex_time` in("+value+") ";
			}else{
				condition123 += "`attendance_flex_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceFlexTimeNotIn(String value){
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
				condition123 += "and `attendance_flex_time` not in("+value+") ";
			}else{
				condition123 += "`attendance_flex_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceFlexTimeNotIn(String value){
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
				condition123 += "or `attendance_flex_time` not in("+value+") ";
			}else{
				condition123 += "`attendance_flex_time` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceLatenessAllowedEquals(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_lateness_allowed`='"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`='"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceLatenessAllowedEquals(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_lateness_allowed`='"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`='"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceLatenessAllowedNotEquals(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_lateness_allowed`!='"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`!='"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceLatenessAllowedNotEquals(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_lateness_allowed`!='"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`!='"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceLatenessAllowedGreaterThan(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_lateness_allowed`>'"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`>'"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceLatenessAllowedGreaterThan(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_lateness_allowed`>'"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`>'"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceLatenessAllowedLessThan(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_lateness_allowed`<'"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`<'"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceLatenessAllowedLessThan(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_lateness_allowed`<'"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`<'"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceLatenessAllowedGreadterThanAndEquals(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_lateness_allowed`>='"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`>='"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceLatenessAllowedGreadterThanAndEquals(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_lateness_allowed`>='"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`>='"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceLatenessAllowedLessThanAndEquals(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_lateness_allowed`<='"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`<='"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceLatenessAllowedLessThanAndEquals(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_lateness_allowed`<='"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed`<='"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceLatenessAllowedLike(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0&&!("%".equals(attendanceLatenessAllowed.trim()))&&!("%%".equals(attendanceLatenessAllowed.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_lateness_allowed` like '"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed` like '"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceLatenessAllowedLike(String attendanceLatenessAllowed){
		if(attendanceLatenessAllowed!=null&&attendanceLatenessAllowed.trim().length()>0&&!("%".equals(attendanceLatenessAllowed.trim()))&&!("%%".equals(attendanceLatenessAllowed.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_lateness_allowed` like '"+attendanceLatenessAllowed+"' ";
			}else{
				condition123 += "`attendance_lateness_allowed` like '"+attendanceLatenessAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceLatenessAllowedIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_lateness_allowed` is null";
			}else{
				condition123 += "`attendance_lateness_allowed` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceLatenessAllowedIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_lateness_allowed` is null";
		}else{
			condition123 += "`attendance_lateness_allowed` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceLatenessAllowedIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_lateness_allowed` is not null";
		}else{
			condition123 += "`attendance_lateness_allowed` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceLatenessAllowedIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_lateness_allowed` is not null";
		}else{
			condition123 += "`attendance_lateness_allowed` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceLatenessAllowedIn(String value){
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
				condition123 += "and `attendance_lateness_allowed` in("+value+") ";
			}else{
				condition123 += "`attendance_lateness_allowed` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceLatenessAllowedIn(String value){
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
				condition123 += "or `attendance_lateness_allowed` in("+value+") ";
			}else{
				condition123 += "`attendance_lateness_allowed` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceLatenessAllowedNotIn(String value){
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
				condition123 += "and `attendance_lateness_allowed` not in("+value+") ";
			}else{
				condition123 += "`attendance_lateness_allowed` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceLatenessAllowedNotIn(String value){
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
				condition123 += "or `attendance_lateness_allowed` not in("+value+") ";
			}else{
				condition123 += "`attendance_lateness_allowed` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedEquals(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_advance_time_allowed`='"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`='"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedEquals(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_advance_time_allowed`='"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`='"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedNotEquals(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_advance_time_allowed`!='"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`!='"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedNotEquals(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_advance_time_allowed`!='"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`!='"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedGreaterThan(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_advance_time_allowed`>'"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`>'"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedGreaterThan(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_advance_time_allowed`>'"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`>'"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedLessThan(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_advance_time_allowed`<'"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`<'"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedLessThan(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_advance_time_allowed`<'"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`<'"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedGreadterThanAndEquals(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_advance_time_allowed`>='"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`>='"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedGreadterThanAndEquals(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_advance_time_allowed`>='"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`>='"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedLessThanAndEquals(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_advance_time_allowed`<='"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`<='"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedLessThanAndEquals(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_advance_time_allowed`<='"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed`<='"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedLike(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0&&!("%".equals(attendanceAdvanceTimeAllowed.trim()))&&!("%%".equals(attendanceAdvanceTimeAllowed.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_advance_time_allowed` like '"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed` like '"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedLike(String attendanceAdvanceTimeAllowed){
		if(attendanceAdvanceTimeAllowed!=null&&attendanceAdvanceTimeAllowed.trim().length()>0&&!("%".equals(attendanceAdvanceTimeAllowed.trim()))&&!("%%".equals(attendanceAdvanceTimeAllowed.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_advance_time_allowed` like '"+attendanceAdvanceTimeAllowed+"' ";
			}else{
				condition123 += "`attendance_advance_time_allowed` like '"+attendanceAdvanceTimeAllowed+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_advance_time_allowed` is null";
			}else{
				condition123 += "`attendance_advance_time_allowed` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_advance_time_allowed` is null";
		}else{
			condition123 += "`attendance_advance_time_allowed` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_advance_time_allowed` is not null";
		}else{
			condition123 += "`attendance_advance_time_allowed` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_advance_time_allowed` is not null";
		}else{
			condition123 += "`attendance_advance_time_allowed` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedIn(String value){
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
				condition123 += "and `attendance_advance_time_allowed` in("+value+") ";
			}else{
				condition123 += "`attendance_advance_time_allowed` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedIn(String value){
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
				condition123 += "or `attendance_advance_time_allowed` in("+value+") ";
			}else{
				condition123 += "`attendance_advance_time_allowed` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAdvanceTimeAllowedNotIn(String value){
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
				condition123 += "and `attendance_advance_time_allowed` not in("+value+") ";
			}else{
				condition123 += "`attendance_advance_time_allowed` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAdvanceTimeAllowedNotIn(String value){
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
				condition123 += "or `attendance_advance_time_allowed` not in("+value+") ";
			}else{
				condition123 += "`attendance_advance_time_allowed` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceAddressEquals(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address`='"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`='"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAddressEquals(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address`='"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`='"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressNotEquals(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address`!='"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`!='"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressNotEquals(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address`!='"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`!='"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceAddressGreaterThan(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address`>'"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`>'"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressGreaterThan(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address`>'"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`>'"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceAddressLessThan(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address`<'"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`<'"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressLessThan(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address`<'"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`<'"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressGreadterThanAndEquals(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address`>='"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`>='"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressGreadterThanAndEquals(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address`>='"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`>='"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressLessThanAndEquals(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address`<='"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`<='"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressLessThanAndEquals(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address`<='"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address`<='"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressLike(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0&&!("%".equals(attendanceAddress.trim()))&&!("%%".equals(attendanceAddress.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_address` like '"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address` like '"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressLike(String attendanceAddress){
		if(attendanceAddress!=null&&attendanceAddress.trim().length()>0&&!("%".equals(attendanceAddress.trim()))&&!("%%".equals(attendanceAddress.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_address` like '"+attendanceAddress+"' ";
			}else{
				condition123 += "`attendance_address` like '"+attendanceAddress+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_address` is null";
			}else{
				condition123 += "`attendance_address` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_address` is null";
		}else{
			condition123 += "`attendance_address` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceAddressIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_address` is not null";
		}else{
			condition123 += "`attendance_address` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_address` is not null";
		}else{
			condition123 += "`attendance_address` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressIn(String value){
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
				condition123 += "and `attendance_address` in("+value+") ";
			}else{
				condition123 += "`attendance_address` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAddressIn(String value){
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
				condition123 += "or `attendance_address` in("+value+") ";
			}else{
				condition123 += "`attendance_address` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressNotIn(String value){
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
				condition123 += "and `attendance_address` not in("+value+") ";
			}else{
				condition123 += "`attendance_address` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAddressNotIn(String value){
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
				condition123 += "or `attendance_address` not in("+value+") ";
			}else{
				condition123 += "`attendance_address` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceAddressRangeEquals(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address_range`='"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`='"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAddressRangeEquals(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address_range`='"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`='"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressRangeNotEquals(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address_range`!='"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`!='"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressRangeNotEquals(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address_range`!='"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`!='"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceAddressRangeGreaterThan(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address_range`>'"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`>'"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressRangeGreaterThan(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address_range`>'"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`>'"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceAddressRangeLessThan(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address_range`<'"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`<'"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressRangeLessThan(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address_range`<'"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`<'"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressRangeGreadterThanAndEquals(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address_range`>='"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`>='"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressRangeGreadterThanAndEquals(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address_range`>='"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`>='"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressRangeLessThanAndEquals(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_address_range`<='"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`<='"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressRangeLessThanAndEquals(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_address_range`<='"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range`<='"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressRangeLike(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0&&!("%".equals(attendanceAddressRange.trim()))&&!("%%".equals(attendanceAddressRange.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_address_range` like '"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range` like '"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressRangeLike(String attendanceAddressRange){
		if(attendanceAddressRange!=null&&attendanceAddressRange.trim().length()>0&&!("%".equals(attendanceAddressRange.trim()))&&!("%%".equals(attendanceAddressRange.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_address_range` like '"+attendanceAddressRange+"' ";
			}else{
				condition123 += "`attendance_address_range` like '"+attendanceAddressRange+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressRangeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_address_range` is null";
			}else{
				condition123 += "`attendance_address_range` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressRangeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_address_range` is null";
		}else{
			condition123 += "`attendance_address_range` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceAddressRangeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_address_range` is not null";
		}else{
			condition123 += "`attendance_address_range` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceAddressRangeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_address_range` is not null";
		}else{
			condition123 += "`attendance_address_range` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressRangeIn(String value){
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
				condition123 += "and `attendance_address_range` in("+value+") ";
			}else{
				condition123 += "`attendance_address_range` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAddressRangeIn(String value){
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
				condition123 += "or `attendance_address_range` in("+value+") ";
			}else{
				condition123 += "`attendance_address_range` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceAddressRangeNotIn(String value){
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
				condition123 += "and `attendance_address_range` not in("+value+") ";
			}else{
				condition123 += "`attendance_address_range` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceAddressRangeNotIn(String value){
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
				condition123 += "or `attendance_address_range` not in("+value+") ";
			}else{
				condition123 += "`attendance_address_range` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andAttendanceDefaultTimeEquals(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_default_time`='"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`='"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceDefaultTimeEquals(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_default_time`='"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`='"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceDefaultTimeNotEquals(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_default_time`!='"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`!='"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceDefaultTimeNotEquals(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_default_time`!='"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`!='"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AttendanceSetCriteria andAttendanceDefaultTimeGreaterThan(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_default_time`>'"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`>'"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceDefaultTimeGreaterThan(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_default_time`>'"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`>'"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andAttendanceDefaultTimeLessThan(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_default_time`<'"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`<'"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceDefaultTimeLessThan(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_default_time`<'"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`<'"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceDefaultTimeGreadterThanAndEquals(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_default_time`>='"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`>='"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceDefaultTimeGreadterThanAndEquals(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_default_time`>='"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`>='"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceDefaultTimeLessThanAndEquals(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `attendance_default_time`<='"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`<='"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceDefaultTimeLessThanAndEquals(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `attendance_default_time`<='"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time`<='"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceDefaultTimeLike(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0&&!("%".equals(attendanceDefaultTime.trim()))&&!("%%".equals(attendanceDefaultTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `attendance_default_time` like '"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time` like '"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceDefaultTimeLike(String attendanceDefaultTime){
		if(attendanceDefaultTime!=null&&attendanceDefaultTime.trim().length()>0&&!("%".equals(attendanceDefaultTime.trim()))&&!("%%".equals(attendanceDefaultTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `attendance_default_time` like '"+attendanceDefaultTime+"' ";
			}else{
				condition123 += "`attendance_default_time` like '"+attendanceDefaultTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceDefaultTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `attendance_default_time` is null";
			}else{
				condition123 += "`attendance_default_time` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orAttendanceDefaultTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_default_time` is null";
		}else{
			condition123 += "`attendance_default_time` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andAttendanceDefaultTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `attendance_default_time` is not null";
		}else{
			condition123 += "`attendance_default_time` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orAttendanceDefaultTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `attendance_default_time` is not null";
		}else{
			condition123 += "`attendance_default_time` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceDefaultTimeIn(String value){
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
				condition123 += "and `attendance_default_time` in("+value+") ";
			}else{
				condition123 += "`attendance_default_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceDefaultTimeIn(String value){
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
				condition123 += "or `attendance_default_time` in("+value+") ";
			}else{
				condition123 += "`attendance_default_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andAttendanceDefaultTimeNotIn(String value){
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
				condition123 += "and `attendance_default_time` not in("+value+") ";
			}else{
				condition123 += "`attendance_default_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orAttendanceDefaultTimeNotIn(String value){
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
				condition123 += "or `attendance_default_time` not in("+value+") ";
			}else{
				condition123 += "`attendance_default_time` not in("+value+") ";
			}
		}
		return this;
	}

	public AttendanceSetCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orStatusNotEquals(String status){
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
	public AttendanceSetCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andStatusIn(String value){
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
	
	public AttendanceSetCriteria orStatusIn(String value){
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
	
	public AttendanceSetCriteria andStatusNotIn(String value){
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
	
	public AttendanceSetCriteria orStatusNotIn(String value){
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

	public AttendanceSetCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orCreateTimeNotEquals(String createTime){
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
	public AttendanceSetCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public AttendanceSetCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public AttendanceSetCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AttendanceSetCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public AttendanceSetCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public AttendanceSetCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public AttendanceSetCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public AttendanceSetCriteria andCreateTimeIn(String value){
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
	
	public AttendanceSetCriteria orCreateTimeIn(String value){
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
	
	public AttendanceSetCriteria andCreateTimeNotIn(String value){
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
	
	public AttendanceSetCriteria orCreateTimeNotIn(String value){
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

	private void initAttendanceSet(AttendanceSet attendanceSet) {
		super.setId(attendanceSet.getId());
		super.setAttendanceType(attendanceSet.getAttendanceType());
		super.setAttendanceClasses(attendanceSet.getAttendanceClasses());
		super.setAttendanceObject(attendanceSet.getAttendanceObject());
		super.setAttendanceBusinessHours(attendanceSet.getAttendanceBusinessHours());
		super.setAttendanceClosingTime(attendanceSet.getAttendanceClosingTime());
		super.setAttendanceFlexTime(attendanceSet.getAttendanceFlexTime());
		super.setAttendanceLatenessAllowed(attendanceSet.getAttendanceLatenessAllowed());
		super.setAttendanceAdvanceTimeAllowed(attendanceSet.getAttendanceAdvanceTimeAllowed());
		super.setAttendanceAddress(attendanceSet.getAttendanceAddress());
		super.setAttendanceAddressRange(attendanceSet.getAttendanceAddressRange());
		super.setAttendanceDefaultTime(attendanceSet.getAttendanceDefaultTime());
		super.setStatus(attendanceSet.getStatus());
		super.setCreateTime(attendanceSet.getCreateTime());

	}

}