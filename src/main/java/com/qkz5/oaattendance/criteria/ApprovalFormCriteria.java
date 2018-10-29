package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.ApprovalForm;

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
public class ApprovalFormCriteria extends ApprovalForm{
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
	private ApprovalForm approvalForm;
	private String feid123;//字段用于统计查询时设置

	public ApprovalFormCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public ApprovalForm getApprovalForm() {
		return approvalForm;
	}
	public void setApprovalForm(ApprovalForm approvalForm) {
		this.approvalForm = approvalForm;
		initApprovalForm(approvalForm);
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
	public ApprovalFormCriteria page(Page value){
		page123 = value;
		return this;
	}
	public ApprovalFormCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public ApprovalFormCriteria having(String value){
		having123 = value;
		return this;
	}
	public ApprovalFormCriteria orderBy(String value){
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

	public ApprovalFormCriteria andApprovalFormIdEquals(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id`="+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`="+approvalFormId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormIdEquals(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id`="+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`="+approvalFormId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormIdNotEquals(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id`!="+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`!="+approvalFormId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdNotEquals(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id`!="+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`!="+approvalFormId+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApprovalFormCriteria andApprovalFormIdGreaterThan(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id`>"+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`>"+approvalFormId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdGreaterThan(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id`>"+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`>"+approvalFormId+" ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andApprovalFormIdLessThan(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id`<"+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`<"+approvalFormId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdLessThan(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id`<"+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`<"+approvalFormId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormIdGreadterThanAndEquals(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id`>="+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`>="+approvalFormId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdGreadterThanAndEquals(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id`>="+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`>="+approvalFormId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormIdLessThanAndEquals(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id`<="+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`<="+approvalFormId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdLessThanAndEquals(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id`<="+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id`<="+approvalFormId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormIdLike(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id` like "+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id` like "+approvalFormId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdLike(Integer approvalFormId){
		if(approvalFormId!=null){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id` like "+approvalFormId+" ";
			}else{
				condition123 += "`approval_form_id` like "+approvalFormId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id` is null";
			}else{
				condition123 += "`approval_form_id` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_id` is null";
		}else{
			condition123 += "`approval_form_id` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andApprovalFormIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `approval_form_id` is not null";
		}else{
			condition123 += "`approval_form_id` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_id` is not null";
		}else{
			condition123 += "`approval_form_id` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria andApprovalFormIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id` in("+value+") ";
			}else{
				condition123 += "`approval_form_id` in("+value+") ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id` in("+value+") ";
			}else{
				condition123 += "`approval_form_id` in("+value+") ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria andApprovalFormIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_id` not in("+value+") ";
			}else{
				condition123 += "`approval_form_id` not in("+value+") ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_id` not in("+value+") ";
			}else{
				condition123 += "`approval_form_id` not in("+value+") ";
			}
		}
		return this;
	}

	public ApprovalFormCriteria andApplicationIdEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`="+applicationId+" ";
			}else{
				condition123 += "`application_id`="+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApplicationIdEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`="+applicationId+" ";
			}else{
				condition123 += "`application_id`="+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApplicationIdNotEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`!="+applicationId+" ";
			}else{
				condition123 += "`application_id`!="+applicationId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdNotEquals(Integer applicationId){
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
	public ApprovalFormCriteria andApplicationIdGreaterThan(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`>"+applicationId+" ";
			}else{
				condition123 += "`application_id`>"+applicationId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdGreaterThan(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`>"+applicationId+" ";
			}else{
				condition123 += "`application_id`>"+applicationId+" ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andApplicationIdLessThan(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`<"+applicationId+" ";
			}else{
				condition123 += "`application_id`<"+applicationId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdLessThan(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`<"+applicationId+" ";
			}else{
				condition123 += "`application_id`<"+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApplicationIdGreadterThanAndEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`>="+applicationId+" ";
			}else{
				condition123 += "`application_id`>="+applicationId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdGreadterThanAndEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`>="+applicationId+" ";
			}else{
				condition123 += "`application_id`>="+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApplicationIdLessThanAndEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id`<="+applicationId+" ";
			}else{
				condition123 += "`application_id`<="+applicationId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdLessThanAndEquals(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id`<="+applicationId+" ";
			}else{
				condition123 += "`application_id`<="+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApplicationIdLike(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "and `application_id` like "+applicationId+" ";
			}else{
				condition123 += "`application_id` like "+applicationId+" ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdLike(Integer applicationId){
		if(applicationId!=null){
			if(condition123.length()>0){
				condition123 += "or `application_id` like "+applicationId+" ";
			}else{
				condition123 += "`application_id` like "+applicationId+" ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApplicationIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `application_id` is null";
			}else{
				condition123 += "`application_id` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `application_id` is null";
		}else{
			condition123 += "`application_id` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andApplicationIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `application_id` is not null";
		}else{
			condition123 += "`application_id` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `application_id` is not null";
		}else{
			condition123 += "`application_id` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria andApplicationIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_id` in("+value+") ";
			}else{
				condition123 += "`application_id` in("+value+") ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_id` in("+value+") ";
			}else{
				condition123 += "`application_id` in("+value+") ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria andApplicationIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `application_id` not in("+value+") ";
			}else{
				condition123 += "`application_id` not in("+value+") ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApplicationIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `application_id` not in("+value+") ";
			}else{
				condition123 += "`application_id` not in("+value+") ";
			}
		}
		return this;
	}

	public ApprovalFormCriteria andApprovalFormApproverEquals(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_approver`='"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`='"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormApproverEquals(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_approver`='"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`='"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormApproverNotEquals(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_approver`!='"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`!='"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormApproverNotEquals(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_approver`!='"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`!='"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApprovalFormCriteria andApprovalFormApproverGreaterThan(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_approver`>'"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`>'"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormApproverGreaterThan(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_approver`>'"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`>'"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andApprovalFormApproverLessThan(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_approver`<'"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`<'"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormApproverLessThan(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_approver`<'"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`<'"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormApproverGreadterThanAndEquals(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_approver`>='"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`>='"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormApproverGreadterThanAndEquals(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_approver`>='"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`>='"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormApproverLessThanAndEquals(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_approver`<='"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`<='"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormApproverLessThanAndEquals(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_approver`<='"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver`<='"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormApproverLike(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0&&!("%".equals(approvalFormApprover.trim()))&&!("%%".equals(approvalFormApprover.trim()))){
			if(condition123.length()>0){
				condition123 += "and `approval_form_approver` like '"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver` like '"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormApproverLike(String approvalFormApprover){
		if(approvalFormApprover!=null&&approvalFormApprover.trim().length()>0&&!("%".equals(approvalFormApprover.trim()))&&!("%%".equals(approvalFormApprover.trim()))){
			if(condition123.length()>0){
				condition123 += "or `approval_form_approver` like '"+approvalFormApprover+"' ";
			}else{
				condition123 += "`approval_form_approver` like '"+approvalFormApprover+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormApproverIsNull(){
			if(condition123.length()>0){
				condition123 += "and `approval_form_approver` is null";
			}else{
				condition123 += "`approval_form_approver` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormApproverIsNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_approver` is null";
		}else{
			condition123 += "`approval_form_approver` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andApprovalFormApproverIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `approval_form_approver` is not null";
		}else{
			condition123 += "`approval_form_approver` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormApproverIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_approver` is not null";
		}else{
			condition123 += "`approval_form_approver` is not null";
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormApproverIn(String value){
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
				condition123 += "and `approval_form_approver` in("+value+") ";
			}else{
				condition123 += "`approval_form_approver` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormApproverIn(String value){
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
				condition123 += "or `approval_form_approver` in("+value+") ";
			}else{
				condition123 += "`approval_form_approver` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormApproverNotIn(String value){
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
				condition123 += "and `approval_form_approver` not in("+value+") ";
			}else{
				condition123 += "`approval_form_approver` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormApproverNotIn(String value){
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
				condition123 += "or `approval_form_approver` not in("+value+") ";
			}else{
				condition123 += "`approval_form_approver` not in("+value+") ";
			}
		}
		return this;
	}

	public ApprovalFormCriteria andApprovalFormOrderEquals(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_order`='"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`='"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormOrderEquals(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_order`='"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`='"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormOrderNotEquals(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_order`!='"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`!='"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormOrderNotEquals(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_order`!='"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`!='"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApprovalFormCriteria andApprovalFormOrderGreaterThan(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_order`>'"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`>'"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormOrderGreaterThan(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_order`>'"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`>'"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andApprovalFormOrderLessThan(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_order`<'"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`<'"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormOrderLessThan(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_order`<'"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`<'"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormOrderGreadterThanAndEquals(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_order`>='"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`>='"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormOrderGreadterThanAndEquals(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_order`>='"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`>='"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormOrderLessThanAndEquals(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_order`<='"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`<='"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormOrderLessThanAndEquals(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_order`<='"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order`<='"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormOrderLike(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0&&!("%".equals(approvalFormOrder.trim()))&&!("%%".equals(approvalFormOrder.trim()))){
			if(condition123.length()>0){
				condition123 += "and `approval_form_order` like '"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order` like '"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormOrderLike(String approvalFormOrder){
		if(approvalFormOrder!=null&&approvalFormOrder.trim().length()>0&&!("%".equals(approvalFormOrder.trim()))&&!("%%".equals(approvalFormOrder.trim()))){
			if(condition123.length()>0){
				condition123 += "or `approval_form_order` like '"+approvalFormOrder+"' ";
			}else{
				condition123 += "`approval_form_order` like '"+approvalFormOrder+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormOrderIsNull(){
			if(condition123.length()>0){
				condition123 += "and `approval_form_order` is null";
			}else{
				condition123 += "`approval_form_order` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormOrderIsNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_order` is null";
		}else{
			condition123 += "`approval_form_order` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andApprovalFormOrderIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `approval_form_order` is not null";
		}else{
			condition123 += "`approval_form_order` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormOrderIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_order` is not null";
		}else{
			condition123 += "`approval_form_order` is not null";
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormOrderIn(String value){
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
				condition123 += "and `approval_form_order` in("+value+") ";
			}else{
				condition123 += "`approval_form_order` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormOrderIn(String value){
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
				condition123 += "or `approval_form_order` in("+value+") ";
			}else{
				condition123 += "`approval_form_order` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormOrderNotIn(String value){
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
				condition123 += "and `approval_form_order` not in("+value+") ";
			}else{
				condition123 += "`approval_form_order` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormOrderNotIn(String value){
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
				condition123 += "or `approval_form_order` not in("+value+") ";
			}else{
				condition123 += "`approval_form_order` not in("+value+") ";
			}
		}
		return this;
	}

	public ApprovalFormCriteria andApprovalFormThroughOrNotEquals(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_through_or_not`='"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`='"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormThroughOrNotEquals(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_through_or_not`='"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`='"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormThroughOrNotNotEquals(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_through_or_not`!='"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`!='"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormThroughOrNotNotEquals(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_through_or_not`!='"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`!='"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApprovalFormCriteria andApprovalFormThroughOrNotGreaterThan(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_through_or_not`>'"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`>'"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormThroughOrNotGreaterThan(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_through_or_not`>'"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`>'"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andApprovalFormThroughOrNotLessThan(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_through_or_not`<'"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`<'"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormThroughOrNotLessThan(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_through_or_not`<'"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`<'"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormThroughOrNotGreadterThanAndEquals(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_through_or_not`>='"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`>='"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormThroughOrNotGreadterThanAndEquals(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_through_or_not`>='"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`>='"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormThroughOrNotLessThanAndEquals(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_through_or_not`<='"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`<='"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormThroughOrNotLessThanAndEquals(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_through_or_not`<='"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not`<='"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormThroughOrNotLike(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0&&!("%".equals(approvalFormThroughOrNot.trim()))&&!("%%".equals(approvalFormThroughOrNot.trim()))){
			if(condition123.length()>0){
				condition123 += "and `approval_form_through_or_not` like '"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not` like '"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormThroughOrNotLike(String approvalFormThroughOrNot){
		if(approvalFormThroughOrNot!=null&&approvalFormThroughOrNot.trim().length()>0&&!("%".equals(approvalFormThroughOrNot.trim()))&&!("%%".equals(approvalFormThroughOrNot.trim()))){
			if(condition123.length()>0){
				condition123 += "or `approval_form_through_or_not` like '"+approvalFormThroughOrNot+"' ";
			}else{
				condition123 += "`approval_form_through_or_not` like '"+approvalFormThroughOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormThroughOrNotIsNull(){
			if(condition123.length()>0){
				condition123 += "and `approval_form_through_or_not` is null";
			}else{
				condition123 += "`approval_form_through_or_not` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormThroughOrNotIsNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_through_or_not` is null";
		}else{
			condition123 += "`approval_form_through_or_not` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andApprovalFormThroughOrNotIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `approval_form_through_or_not` is not null";
		}else{
			condition123 += "`approval_form_through_or_not` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormThroughOrNotIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_through_or_not` is not null";
		}else{
			condition123 += "`approval_form_through_or_not` is not null";
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormThroughOrNotIn(String value){
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
				condition123 += "and `approval_form_through_or_not` in("+value+") ";
			}else{
				condition123 += "`approval_form_through_or_not` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormThroughOrNotIn(String value){
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
				condition123 += "or `approval_form_through_or_not` in("+value+") ";
			}else{
				condition123 += "`approval_form_through_or_not` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormThroughOrNotNotIn(String value){
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
				condition123 += "and `approval_form_through_or_not` not in("+value+") ";
			}else{
				condition123 += "`approval_form_through_or_not` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormThroughOrNotNotIn(String value){
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
				condition123 += "or `approval_form_through_or_not` not in("+value+") ";
			}else{
				condition123 += "`approval_form_through_or_not` not in("+value+") ";
			}
		}
		return this;
	}

	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotEquals(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_lastest_approver_or_not`='"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`='"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotEquals(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_lastest_approver_or_not`='"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`='"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotNotEquals(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_lastest_approver_or_not`!='"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`!='"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotNotEquals(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_lastest_approver_or_not`!='"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`!='"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotGreaterThan(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_lastest_approver_or_not`>'"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`>'"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotGreaterThan(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_lastest_approver_or_not`>'"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`>'"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotLessThan(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_lastest_approver_or_not`<'"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`<'"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotLessThan(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_lastest_approver_or_not`<'"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`<'"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotGreadterThanAndEquals(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_lastest_approver_or_not`>='"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`>='"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotGreadterThanAndEquals(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_lastest_approver_or_not`>='"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`>='"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotLessThanAndEquals(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_form_lastest_approver_or_not`<='"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`<='"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotLessThanAndEquals(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_form_lastest_approver_or_not`<='"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not`<='"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotLike(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0&&!("%".equals(approvalFormLastestApproverOrNot.trim()))&&!("%%".equals(approvalFormLastestApproverOrNot.trim()))){
			if(condition123.length()>0){
				condition123 += "and `approval_form_lastest_approver_or_not` like '"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not` like '"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotLike(String approvalFormLastestApproverOrNot){
		if(approvalFormLastestApproverOrNot!=null&&approvalFormLastestApproverOrNot.trim().length()>0&&!("%".equals(approvalFormLastestApproverOrNot.trim()))&&!("%%".equals(approvalFormLastestApproverOrNot.trim()))){
			if(condition123.length()>0){
				condition123 += "or `approval_form_lastest_approver_or_not` like '"+approvalFormLastestApproverOrNot+"' ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not` like '"+approvalFormLastestApproverOrNot+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotIsNull(){
			if(condition123.length()>0){
				condition123 += "and `approval_form_lastest_approver_or_not` is null";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotIsNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_lastest_approver_or_not` is null";
		}else{
			condition123 += "`approval_form_lastest_approver_or_not` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `approval_form_lastest_approver_or_not` is not null";
		}else{
			condition123 += "`approval_form_lastest_approver_or_not` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_form_lastest_approver_or_not` is not null";
		}else{
			condition123 += "`approval_form_lastest_approver_or_not` is not null";
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotIn(String value){
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
				condition123 += "and `approval_form_lastest_approver_or_not` in("+value+") ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotIn(String value){
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
				condition123 += "or `approval_form_lastest_approver_or_not` in("+value+") ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalFormLastestApproverOrNotNotIn(String value){
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
				condition123 += "and `approval_form_lastest_approver_or_not` not in("+value+") ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalFormLastestApproverOrNotNotIn(String value){
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
				condition123 += "or `approval_form_lastest_approver_or_not` not in("+value+") ";
			}else{
				condition123 += "`approval_form_lastest_approver_or_not` not in("+value+") ";
			}
		}
		return this;
	}

	public ApprovalFormCriteria andApprovalTimeEquals(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_time`='"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`='"+approvalTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalTimeEquals(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_time`='"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`='"+approvalTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalTimeNotEquals(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_time`!='"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`!='"+approvalTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalTimeNotEquals(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_time`!='"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`!='"+approvalTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public ApprovalFormCriteria andApprovalTimeGreaterThan(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_time`>'"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`>'"+approvalTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalTimeGreaterThan(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_time`>'"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`>'"+approvalTime+"' ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andApprovalTimeLessThan(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_time`<'"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`<'"+approvalTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalTimeLessThan(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_time`<'"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`<'"+approvalTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalTimeGreadterThanAndEquals(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_time`>='"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`>='"+approvalTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalTimeGreadterThanAndEquals(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_time`>='"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`>='"+approvalTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalTimeLessThanAndEquals(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `approval_time`<='"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`<='"+approvalTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalTimeLessThanAndEquals(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `approval_time`<='"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time`<='"+approvalTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalTimeLike(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0&&!("%".equals(approvalTime.trim()))&&!("%%".equals(approvalTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `approval_time` like '"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time` like '"+approvalTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalTimeLike(String approvalTime){
		if(approvalTime!=null&&approvalTime.trim().length()>0&&!("%".equals(approvalTime.trim()))&&!("%%".equals(approvalTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `approval_time` like '"+approvalTime+"' ";
			}else{
				condition123 += "`approval_time` like '"+approvalTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `approval_time` is null";
			}else{
				condition123 += "`approval_time` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orApprovalTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_time` is null";
		}else{
			condition123 += "`approval_time` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andApprovalTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `approval_time` is not null";
		}else{
			condition123 += "`approval_time` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orApprovalTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `approval_time` is not null";
		}else{
			condition123 += "`approval_time` is not null";
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalTimeIn(String value){
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
				condition123 += "and `approval_time` in("+value+") ";
			}else{
				condition123 += "`approval_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalTimeIn(String value){
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
				condition123 += "or `approval_time` in("+value+") ";
			}else{
				condition123 += "`approval_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andApprovalTimeNotIn(String value){
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
				condition123 += "and `approval_time` not in("+value+") ";
			}else{
				condition123 += "`approval_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orApprovalTimeNotIn(String value){
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
				condition123 += "or `approval_time` not in("+value+") ";
			}else{
				condition123 += "`approval_time` not in("+value+") ";
			}
		}
		return this;
	}

	public ApprovalFormCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orStatusNotEquals(String status){
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
	public ApprovalFormCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public ApprovalFormCriteria andStatusIn(String value){
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
	
	public ApprovalFormCriteria orStatusIn(String value){
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
	
	public ApprovalFormCriteria andStatusNotIn(String value){
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
	
	public ApprovalFormCriteria orStatusNotIn(String value){
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

	public ApprovalFormCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orCreateTimeNotEquals(String createTime){
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
	public ApprovalFormCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public ApprovalFormCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public ApprovalFormCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public ApprovalFormCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public ApprovalFormCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public ApprovalFormCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public ApprovalFormCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public ApprovalFormCriteria andCreateTimeIn(String value){
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
	
	public ApprovalFormCriteria orCreateTimeIn(String value){
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
	
	public ApprovalFormCriteria andCreateTimeNotIn(String value){
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
	
	public ApprovalFormCriteria orCreateTimeNotIn(String value){
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

	private void initApprovalForm(ApprovalForm approvalForm) {
		super.setApprovalFormId(approvalForm.getApprovalFormId());
		super.setApplicationId(approvalForm.getApplicationId());
		super.setApprovalFormApprover(approvalForm.getApprovalFormApprover());
		super.setApprovalFormOrder(approvalForm.getApprovalFormOrder());
		super.setApprovalFormThroughOrNot(approvalForm.getApprovalFormThroughOrNot());
		super.setApprovalFormLastestApproverOrNot(approvalForm.getApprovalFormLastestApproverOrNot());
		super.setApprovalTime(approvalForm.getApprovalTime());
		super.setStatus(approvalForm.getStatus());
		super.setCreateTime(approvalForm.getCreateTime());

	}

}