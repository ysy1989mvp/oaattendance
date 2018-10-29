package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.ApplicationForm;

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
public class ApplicationFormCriteria extends ApplicationForm{
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
	private ApplicationForm applicationForm;
	private String feid123;//字段用于统计查询时设置

	public ApplicationFormCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public ApplicationForm getApplicationForm() {
		return applicationForm;
	}
	public void setApplicationForm(ApplicationForm applicationForm) {
		this.applicationForm = applicationForm;
		initApplicationForm(applicationForm);
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
	public ApplicationFormCriteria page(Page value){
		page123 = value;
		return this;
	}
	public ApplicationFormCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public ApplicationFormCriteria having(String value){
		having123 = value;
		return this;
	}
	public ApplicationFormCriteria orderBy(String value){
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

	public ApplicationFormCriteria andApplicationIdEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`="+applicationId+" ";
			}else{
				condition123 += "`application_id`="+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationIdEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`="+applicationId+" ";
			}else{
				condition123 += "`application_id`="+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationIdNotEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`!="+applicationId+" ";
			}else{
				condition123 += "`application_id`!="+applicationId+" ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdNotEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`!="+applicationId+" ";
			}else{
				condition123 += "`application_id`!="+applicationId+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationIdGreaterThan(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`>"+applicationId+" ";
			}else{
				condition123 += "`application_id`>"+applicationId+" ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdGreaterThan(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`>"+applicationId+" ";
			}else{
				condition123 += "`application_id`>"+applicationId+" ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationIdLessThan(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`<"+applicationId+" ";
			}else{
				condition123 += "`application_id`<"+applicationId+" ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdLessThan(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`<"+applicationId+" ";
			}else{
				condition123 += "`application_id`<"+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationIdGreadterThanAndEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`>="+applicationId+" ";
			}else{
				condition123 += "`application_id`>="+applicationId+" ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdGreadterThanAndEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`>="+applicationId+" ";
			}else{
				condition123 += "`application_id`>="+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationIdLessThanAndEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`<="+applicationId+" ";
			}else{
				condition123 += "`application_id`<="+applicationId+" ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdLessThanAndEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`<="+applicationId+" ";
			}else{
				condition123 += "`application_id`<="+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationIdLike(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id` like "+applicationId+" ";
			}else{
				condition123 += "`application_id` like "+applicationId+" ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdLike(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id` like "+applicationId+" ";
			}else{
				condition123 += "`application_id` like "+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_id` is null";
			}else{
				condition123 += "`application_id` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_id` is null";
		}else{
			condition123 += "`application_id` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_id` is not null";
		}else{
			condition123 += "`application_id` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_id` is not null";
		}else{
			condition123 += "`application_id` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_id` in("+value+") ";
			}else{
				condition123 += "`application_id` in("+value+") ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_id` in("+value+") ";
			}else{
				condition123 += "`application_id` in("+value+") ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_id` not in("+value+") ";
			}else{
				condition123 += "`application_id` not in("+value+") ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_id` not in("+value+") ";
			}else{
				condition123 += "`application_id` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andApplicationTypeEquals(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_type`='"+applicationType+"' ";
			}else{
				condition123 += "`application_type`='"+applicationType+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationTypeEquals(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_type`='"+applicationType+"' ";
			}else{
				condition123 += "`application_type`='"+applicationType+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationTypeNotEquals(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_type`!='"+applicationType+"' ";
			}else{
				condition123 += "`application_type`!='"+applicationType+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationTypeNotEquals(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_type`!='"+applicationType+"' ";
			}else{
				condition123 += "`application_type`!='"+applicationType+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationTypeGreaterThan(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_type`>'"+applicationType+"' ";
			}else{
				condition123 += "`application_type`>'"+applicationType+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationTypeGreaterThan(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_type`>'"+applicationType+"' ";
			}else{
				condition123 += "`application_type`>'"+applicationType+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationTypeLessThan(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_type`<'"+applicationType+"' ";
			}else{
				condition123 += "`application_type`<'"+applicationType+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationTypeLessThan(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_type`<'"+applicationType+"' ";
			}else{
				condition123 += "`application_type`<'"+applicationType+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationTypeGreadterThanAndEquals(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_type`>='"+applicationType+"' ";
			}else{
				condition123 += "`application_type`>='"+applicationType+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationTypeGreadterThanAndEquals(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_type`>='"+applicationType+"' ";
			}else{
				condition123 += "`application_type`>='"+applicationType+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationTypeLessThanAndEquals(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_type`<='"+applicationType+"' ";
			}else{
				condition123 += "`application_type`<='"+applicationType+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationTypeLessThanAndEquals(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_type`<='"+applicationType+"' ";
			}else{
				condition123 += "`application_type`<='"+applicationType+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationTypeLike(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0&&!("%".equals(applicationType.trim()))&&!("%%".equals(applicationType.trim()))){
			if(condition123.length()>0){
				condition123 += "and `application_type` like '"+applicationType+"' ";
			}else{
				condition123 += "`application_type` like '"+applicationType+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationTypeLike(String applicationType){
		if(applicationType!=null&&applicationType.trim().length()>0&&!("%".equals(applicationType.trim()))&&!("%%".equals(applicationType.trim()))){
			if(condition123.length()>0){
				condition123 += "or `application_type` like '"+applicationType+"' ";
			}else{
				condition123 += "`application_type` like '"+applicationType+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationTypeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_type` is null";
			}else{
				condition123 += "`application_type` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationTypeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_type` is null";
		}else{
			condition123 += "`application_type` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationTypeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_type` is not null";
		}else{
			condition123 += "`application_type` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationTypeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_type` is not null";
		}else{
			condition123 += "`application_type` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationTypeIn(String value){
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
				condition123 += "and `application_type` in("+value+") ";
			}else{
				condition123 += "`application_type` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationTypeIn(String value){
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
				condition123 += "or `application_type` in("+value+") ";
			}else{
				condition123 += "`application_type` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationTypeNotIn(String value){
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
				condition123 += "and `application_type` not in("+value+") ";
			}else{
				condition123 += "`application_type` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationTypeNotIn(String value){
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
				condition123 += "or `application_type` not in("+value+") ";
			}else{
				condition123 += "`application_type` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andApplicationClassifyEquals(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_classify`='"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`='"+applicationClassify+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationClassifyEquals(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_classify`='"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`='"+applicationClassify+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationClassifyNotEquals(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_classify`!='"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`!='"+applicationClassify+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationClassifyNotEquals(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_classify`!='"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`!='"+applicationClassify+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationClassifyGreaterThan(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_classify`>'"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`>'"+applicationClassify+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationClassifyGreaterThan(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_classify`>'"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`>'"+applicationClassify+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationClassifyLessThan(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_classify`<'"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`<'"+applicationClassify+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationClassifyLessThan(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_classify`<'"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`<'"+applicationClassify+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationClassifyGreadterThanAndEquals(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_classify`>='"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`>='"+applicationClassify+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationClassifyGreadterThanAndEquals(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_classify`>='"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`>='"+applicationClassify+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationClassifyLessThanAndEquals(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_classify`<='"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`<='"+applicationClassify+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationClassifyLessThanAndEquals(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_classify`<='"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify`<='"+applicationClassify+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationClassifyLike(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0&&!("%".equals(applicationClassify.trim()))&&!("%%".equals(applicationClassify.trim()))){
			if(condition123.length()>0){
				condition123 += "and `application_classify` like '"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify` like '"+applicationClassify+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationClassifyLike(String applicationClassify){
		if(applicationClassify!=null&&applicationClassify.trim().length()>0&&!("%".equals(applicationClassify.trim()))&&!("%%".equals(applicationClassify.trim()))){
			if(condition123.length()>0){
				condition123 += "or `application_classify` like '"+applicationClassify+"' ";
			}else{
				condition123 += "`application_classify` like '"+applicationClassify+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationClassifyIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_classify` is null";
			}else{
				condition123 += "`application_classify` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationClassifyIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_classify` is null";
		}else{
			condition123 += "`application_classify` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationClassifyIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_classify` is not null";
		}else{
			condition123 += "`application_classify` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationClassifyIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_classify` is not null";
		}else{
			condition123 += "`application_classify` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationClassifyIn(String value){
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
				condition123 += "and `application_classify` in("+value+") ";
			}else{
				condition123 += "`application_classify` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationClassifyIn(String value){
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
				condition123 += "or `application_classify` in("+value+") ";
			}else{
				condition123 += "`application_classify` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationClassifyNotIn(String value){
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
				condition123 += "and `application_classify` not in("+value+") ";
			}else{
				condition123 += "`application_classify` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationClassifyNotIn(String value){
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
				condition123 += "or `application_classify` not in("+value+") ";
			}else{
				condition123 += "`application_classify` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andApplicationStartTimeEquals(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_start_time`='"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`='"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationStartTimeEquals(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_start_time`='"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`='"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationStartTimeNotEquals(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_start_time`!='"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`!='"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationStartTimeNotEquals(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_start_time`!='"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`!='"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationStartTimeGreaterThan(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_start_time`>'"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`>'"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationStartTimeGreaterThan(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_start_time`>'"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`>'"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationStartTimeLessThan(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_start_time`<'"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`<'"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationStartTimeLessThan(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_start_time`<'"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`<'"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationStartTimeGreadterThanAndEquals(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_start_time`>='"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`>='"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationStartTimeGreadterThanAndEquals(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_start_time`>='"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`>='"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationStartTimeLessThanAndEquals(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_start_time`<='"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`<='"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationStartTimeLessThanAndEquals(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_start_time`<='"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time`<='"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationStartTimeLike(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0&&!("%".equals(applicationStartTime.trim()))&&!("%%".equals(applicationStartTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `application_start_time` like '"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time` like '"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationStartTimeLike(String applicationStartTime){
		if(applicationStartTime!=null&&applicationStartTime.trim().length()>0&&!("%".equals(applicationStartTime.trim()))&&!("%%".equals(applicationStartTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `application_start_time` like '"+applicationStartTime+"' ";
			}else{
				condition123 += "`application_start_time` like '"+applicationStartTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationStartTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_start_time` is null";
			}else{
				condition123 += "`application_start_time` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationStartTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_start_time` is null";
		}else{
			condition123 += "`application_start_time` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationStartTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_start_time` is not null";
		}else{
			condition123 += "`application_start_time` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationStartTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_start_time` is not null";
		}else{
			condition123 += "`application_start_time` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationStartTimeIn(String value){
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
				condition123 += "and `application_start_time` in("+value+") ";
			}else{
				condition123 += "`application_start_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationStartTimeIn(String value){
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
				condition123 += "or `application_start_time` in("+value+") ";
			}else{
				condition123 += "`application_start_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationStartTimeNotIn(String value){
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
				condition123 += "and `application_start_time` not in("+value+") ";
			}else{
				condition123 += "`application_start_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationStartTimeNotIn(String value){
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
				condition123 += "or `application_start_time` not in("+value+") ";
			}else{
				condition123 += "`application_start_time` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andApplicationLastTimeEquals(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_last_time`='"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`='"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationLastTimeEquals(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_last_time`='"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`='"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationLastTimeNotEquals(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_last_time`!='"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`!='"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationLastTimeNotEquals(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_last_time`!='"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`!='"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationLastTimeGreaterThan(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_last_time`>'"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`>'"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationLastTimeGreaterThan(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_last_time`>'"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`>'"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationLastTimeLessThan(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_last_time`<'"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`<'"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationLastTimeLessThan(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_last_time`<'"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`<'"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationLastTimeGreadterThanAndEquals(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_last_time`>='"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`>='"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationLastTimeGreadterThanAndEquals(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_last_time`>='"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`>='"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationLastTimeLessThanAndEquals(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_last_time`<='"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`<='"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationLastTimeLessThanAndEquals(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_last_time`<='"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time`<='"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationLastTimeLike(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0&&!("%".equals(applicationLastTime.trim()))&&!("%%".equals(applicationLastTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `application_last_time` like '"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time` like '"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationLastTimeLike(String applicationLastTime){
		if(applicationLastTime!=null&&applicationLastTime.trim().length()>0&&!("%".equals(applicationLastTime.trim()))&&!("%%".equals(applicationLastTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `application_last_time` like '"+applicationLastTime+"' ";
			}else{
				condition123 += "`application_last_time` like '"+applicationLastTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationLastTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_last_time` is null";
			}else{
				condition123 += "`application_last_time` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationLastTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_last_time` is null";
		}else{
			condition123 += "`application_last_time` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationLastTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_last_time` is not null";
		}else{
			condition123 += "`application_last_time` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationLastTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_last_time` is not null";
		}else{
			condition123 += "`application_last_time` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationLastTimeIn(String value){
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
				condition123 += "and `application_last_time` in("+value+") ";
			}else{
				condition123 += "`application_last_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationLastTimeIn(String value){
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
				condition123 += "or `application_last_time` in("+value+") ";
			}else{
				condition123 += "`application_last_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationLastTimeNotIn(String value){
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
				condition123 += "and `application_last_time` not in("+value+") ";
			}else{
				condition123 += "`application_last_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationLastTimeNotIn(String value){
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
				condition123 += "or `application_last_time` not in("+value+") ";
			}else{
				condition123 += "`application_last_time` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andApplicationDurationEquals(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_duration`='"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`='"+applicationDuration+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationDurationEquals(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_duration`='"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`='"+applicationDuration+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationDurationNotEquals(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_duration`!='"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`!='"+applicationDuration+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationDurationNotEquals(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_duration`!='"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`!='"+applicationDuration+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationDurationGreaterThan(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_duration`>'"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`>'"+applicationDuration+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationDurationGreaterThan(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_duration`>'"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`>'"+applicationDuration+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationDurationLessThan(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_duration`<'"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`<'"+applicationDuration+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationDurationLessThan(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_duration`<'"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`<'"+applicationDuration+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationDurationGreadterThanAndEquals(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_duration`>='"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`>='"+applicationDuration+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationDurationGreadterThanAndEquals(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_duration`>='"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`>='"+applicationDuration+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationDurationLessThanAndEquals(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_duration`<='"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`<='"+applicationDuration+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationDurationLessThanAndEquals(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_duration`<='"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration`<='"+applicationDuration+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationDurationLike(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0&&!("%".equals(applicationDuration.trim()))&&!("%%".equals(applicationDuration.trim()))){
			if(condition123.length()>0){
				condition123 += "and `application_duration` like '"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration` like '"+applicationDuration+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationDurationLike(String applicationDuration){
		if(applicationDuration!=null&&applicationDuration.trim().length()>0&&!("%".equals(applicationDuration.trim()))&&!("%%".equals(applicationDuration.trim()))){
			if(condition123.length()>0){
				condition123 += "or `application_duration` like '"+applicationDuration+"' ";
			}else{
				condition123 += "`application_duration` like '"+applicationDuration+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationDurationIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_duration` is null";
			}else{
				condition123 += "`application_duration` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationDurationIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_duration` is null";
		}else{
			condition123 += "`application_duration` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationDurationIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_duration` is not null";
		}else{
			condition123 += "`application_duration` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationDurationIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_duration` is not null";
		}else{
			condition123 += "`application_duration` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationDurationIn(String value){
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
				condition123 += "and `application_duration` in("+value+") ";
			}else{
				condition123 += "`application_duration` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationDurationIn(String value){
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
				condition123 += "or `application_duration` in("+value+") ";
			}else{
				condition123 += "`application_duration` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationDurationNotIn(String value){
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
				condition123 += "and `application_duration` not in("+value+") ";
			}else{
				condition123 += "`application_duration` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationDurationNotIn(String value){
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
				condition123 += "or `application_duration` not in("+value+") ";
			}else{
				condition123 += "`application_duration` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andApplicationReasonEquals(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_reason`='"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`='"+applicationReason+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationReasonEquals(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_reason`='"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`='"+applicationReason+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationReasonNotEquals(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_reason`!='"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`!='"+applicationReason+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationReasonNotEquals(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_reason`!='"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`!='"+applicationReason+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationReasonGreaterThan(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_reason`>'"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`>'"+applicationReason+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationReasonGreaterThan(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_reason`>'"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`>'"+applicationReason+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationReasonLessThan(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_reason`<'"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`<'"+applicationReason+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationReasonLessThan(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_reason`<'"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`<'"+applicationReason+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationReasonGreadterThanAndEquals(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_reason`>='"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`>='"+applicationReason+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationReasonGreadterThanAndEquals(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_reason`>='"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`>='"+applicationReason+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationReasonLessThanAndEquals(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_reason`<='"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`<='"+applicationReason+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationReasonLessThanAndEquals(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_reason`<='"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason`<='"+applicationReason+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationReasonLike(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0&&!("%".equals(applicationReason.trim()))&&!("%%".equals(applicationReason.trim()))){
			if(condition123.length()>0){
				condition123 += "and `application_reason` like '"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason` like '"+applicationReason+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationReasonLike(String applicationReason){
		if(applicationReason!=null&&applicationReason.trim().length()>0&&!("%".equals(applicationReason.trim()))&&!("%%".equals(applicationReason.trim()))){
			if(condition123.length()>0){
				condition123 += "or `application_reason` like '"+applicationReason+"' ";
			}else{
				condition123 += "`application_reason` like '"+applicationReason+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationReasonIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_reason` is null";
			}else{
				condition123 += "`application_reason` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationReasonIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_reason` is null";
		}else{
			condition123 += "`application_reason` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationReasonIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_reason` is not null";
		}else{
			condition123 += "`application_reason` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationReasonIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_reason` is not null";
		}else{
			condition123 += "`application_reason` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationReasonIn(String value){
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
				condition123 += "and `application_reason` in("+value+") ";
			}else{
				condition123 += "`application_reason` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationReasonIn(String value){
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
				condition123 += "or `application_reason` in("+value+") ";
			}else{
				condition123 += "`application_reason` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationReasonNotIn(String value){
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
				condition123 += "and `application_reason` not in("+value+") ";
			}else{
				condition123 += "`application_reason` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationReasonNotIn(String value){
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
				condition123 += "or `application_reason` not in("+value+") ";
			}else{
				condition123 += "`application_reason` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andApplicationCopyRecipientsEquals(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_copy_recipients`='"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`='"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationCopyRecipientsEquals(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_copy_recipients`='"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`='"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationCopyRecipientsNotEquals(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_copy_recipients`!='"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`!='"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationCopyRecipientsNotEquals(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_copy_recipients`!='"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`!='"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationCopyRecipientsGreaterThan(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_copy_recipients`>'"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`>'"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationCopyRecipientsGreaterThan(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_copy_recipients`>'"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`>'"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationCopyRecipientsLessThan(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_copy_recipients`<'"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`<'"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationCopyRecipientsLessThan(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_copy_recipients`<'"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`<'"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationCopyRecipientsGreadterThanAndEquals(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_copy_recipients`>='"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`>='"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationCopyRecipientsGreadterThanAndEquals(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_copy_recipients`>='"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`>='"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationCopyRecipientsLessThanAndEquals(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_copy_recipients`<='"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`<='"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationCopyRecipientsLessThanAndEquals(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_copy_recipients`<='"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients`<='"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationCopyRecipientsLike(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0&&!("%".equals(applicationCopyRecipients.trim()))&&!("%%".equals(applicationCopyRecipients.trim()))){
			if(condition123.length()>0){
				condition123 += "and `application_copy_recipients` like '"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients` like '"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationCopyRecipientsLike(String applicationCopyRecipients){
		if(applicationCopyRecipients!=null&&applicationCopyRecipients.trim().length()>0&&!("%".equals(applicationCopyRecipients.trim()))&&!("%%".equals(applicationCopyRecipients.trim()))){
			if(condition123.length()>0){
				condition123 += "or `application_copy_recipients` like '"+applicationCopyRecipients+"' ";
			}else{
				condition123 += "`application_copy_recipients` like '"+applicationCopyRecipients+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationCopyRecipientsIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_copy_recipients` is null";
			}else{
				condition123 += "`application_copy_recipients` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationCopyRecipientsIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_copy_recipients` is null";
		}else{
			condition123 += "`application_copy_recipients` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationCopyRecipientsIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_copy_recipients` is not null";
		}else{
			condition123 += "`application_copy_recipients` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationCopyRecipientsIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_copy_recipients` is not null";
		}else{
			condition123 += "`application_copy_recipients` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationCopyRecipientsIn(String value){
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
				condition123 += "and `application_copy_recipients` in("+value+") ";
			}else{
				condition123 += "`application_copy_recipients` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationCopyRecipientsIn(String value){
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
				condition123 += "or `application_copy_recipients` in("+value+") ";
			}else{
				condition123 += "`application_copy_recipients` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationCopyRecipientsNotIn(String value){
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
				condition123 += "and `application_copy_recipients` not in("+value+") ";
			}else{
				condition123 += "`application_copy_recipients` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationCopyRecipientsNotIn(String value){
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
				condition123 += "or `application_copy_recipients` not in("+value+") ";
			}else{
				condition123 += "`application_copy_recipients` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andApplicationMoneyInvolvedEquals(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_money_involved`='"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`='"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationMoneyInvolvedEquals(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_money_involved`='"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`='"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationMoneyInvolvedNotEquals(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_money_involved`!='"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`!='"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationMoneyInvolvedNotEquals(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_money_involved`!='"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`!='"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApplicationFormCriteria andApplicationMoneyInvolvedGreaterThan(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_money_involved`>'"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`>'"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationMoneyInvolvedGreaterThan(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_money_involved`>'"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`>'"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andApplicationMoneyInvolvedLessThan(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_money_involved`<'"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`<'"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationMoneyInvolvedLessThan(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_money_involved`<'"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`<'"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationMoneyInvolvedGreadterThanAndEquals(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_money_involved`>='"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`>='"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationMoneyInvolvedGreadterThanAndEquals(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_money_involved`>='"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`>='"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationMoneyInvolvedLessThanAndEquals(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_money_involved`<='"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`<='"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationMoneyInvolvedLessThanAndEquals(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_money_involved`<='"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved`<='"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationMoneyInvolvedLike(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0&&!("%".equals(applicationMoneyInvolved.trim()))&&!("%%".equals(applicationMoneyInvolved.trim()))){
			if(condition123.length()>0){
				condition123 += "and `application_money_involved` like '"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved` like '"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationMoneyInvolvedLike(String applicationMoneyInvolved){
		if(applicationMoneyInvolved!=null&&applicationMoneyInvolved.trim().length()>0&&!("%".equals(applicationMoneyInvolved.trim()))&&!("%%".equals(applicationMoneyInvolved.trim()))){
			if(condition123.length()>0){
				condition123 += "or `application_money_involved` like '"+applicationMoneyInvolved+"' ";
			}else{
				condition123 += "`application_money_involved` like '"+applicationMoneyInvolved+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationMoneyInvolvedIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_money_involved` is null";
			}else{
				condition123 += "`application_money_involved` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orApplicationMoneyInvolvedIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_money_involved` is null";
		}else{
			condition123 += "`application_money_involved` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andApplicationMoneyInvolvedIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_money_involved` is not null";
		}else{
			condition123 += "`application_money_involved` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orApplicationMoneyInvolvedIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_money_involved` is not null";
		}else{
			condition123 += "`application_money_involved` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationMoneyInvolvedIn(String value){
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
				condition123 += "and `application_money_involved` in("+value+") ";
			}else{
				condition123 += "`application_money_involved` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationMoneyInvolvedIn(String value){
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
				condition123 += "or `application_money_involved` in("+value+") ";
			}else{
				condition123 += "`application_money_involved` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andApplicationMoneyInvolvedNotIn(String value){
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
				condition123 += "and `application_money_involved` not in("+value+") ";
			}else{
				condition123 += "`application_money_involved` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orApplicationMoneyInvolvedNotIn(String value){
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
				condition123 += "or `application_money_involved` not in("+value+") ";
			}else{
				condition123 += "`application_money_involved` not in("+value+") ";
			}
		}
		return this;
	}

	public ApplicationFormCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orStatusNotEquals(String status){
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
	public ApplicationFormCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andStatusIn(String value){
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
	
	public ApplicationFormCriteria orStatusIn(String value){
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
	
	public ApplicationFormCriteria andStatusNotIn(String value){
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
	
	public ApplicationFormCriteria orStatusNotIn(String value){
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

	public ApplicationFormCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orCreateTimeNotEquals(String createTime){
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
	public ApplicationFormCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public ApplicationFormCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public ApplicationFormCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApplicationFormCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public ApplicationFormCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public ApplicationFormCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public ApplicationFormCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public ApplicationFormCriteria andCreateTimeIn(String value){
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
	
	public ApplicationFormCriteria orCreateTimeIn(String value){
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
	
	public ApplicationFormCriteria andCreateTimeNotIn(String value){
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
	
	public ApplicationFormCriteria orCreateTimeNotIn(String value){
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

	private void initApplicationForm(ApplicationForm applicationForm) {
		super.setApplicationId(applicationForm.getApplicationId());
		super.setApplicationType(applicationForm.getApplicationType());
		super.setApplicationClassify(applicationForm.getApplicationClassify());
		super.setApplicationStartTime(applicationForm.getApplicationStartTime());
		super.setApplicationLastTime(applicationForm.getApplicationLastTime());
		super.setApplicationDuration(applicationForm.getApplicationDuration());
		super.setApplicationReason(applicationForm.getApplicationReason());
		super.setApplicationCopyRecipients(applicationForm.getApplicationCopyRecipients());
		super.setApplicationMoneyInvolved(applicationForm.getApplicationMoneyInvolved());
		super.setStatus(applicationForm.getStatus());
		super.setCreateTime(applicationForm.getCreateTime());

	}

}