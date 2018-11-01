package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-11-01
 * @discribe ApprovalForm实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class ApprovalForm implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//审批表id
	private Integer id;
	//申请id
	private Integer applicationId;
	//申请表的id用于与审批表做关联查询
	private Integer applicationFormId;
	//审批人
	private String approvalFormApprover;
	//审批顺序
	private String approvalFormOrder;
	//审批通过与否
	private String approvalFormThroughOrNot;
	//是否为最高审批人
	private String approvalFormLastestApproverOrNot;
	//审批时间
	private String approvalTime;
	//状态
	private String status;
	//时间
	private String createTime;
	public ApprovalForm() {


	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Integer getApplicationFormId() {
		return applicationFormId;
	}

	public void setApplicationFormId(Integer applicationFormId) {
		this.applicationFormId = applicationFormId;
	}

	public String getApprovalFormApprover() {
		return approvalFormApprover;
	}

	public void setApprovalFormApprover(String approvalFormApprover) {
		this.approvalFormApprover = approvalFormApprover;
	}

	public String getApprovalFormOrder() {
		return approvalFormOrder;
	}

	public void setApprovalFormOrder(String approvalFormOrder) {
		this.approvalFormOrder = approvalFormOrder;
	}

	public String getApprovalFormThroughOrNot() {
		return approvalFormThroughOrNot;
	}

	public void setApprovalFormThroughOrNot(String approvalFormThroughOrNot) {
		this.approvalFormThroughOrNot = approvalFormThroughOrNot;
	}

	public String getApprovalFormLastestApproverOrNot() {
		return approvalFormLastestApproverOrNot;
	}

	public void setApprovalFormLastestApproverOrNot(String approvalFormLastestApproverOrNot) {
		this.approvalFormLastestApproverOrNot = approvalFormLastestApproverOrNot;
	}

	public String getApprovalTime() {
		return approvalTime;
	}

	public void setApprovalTime(String approvalTime) {
		this.approvalTime = approvalTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

public String toString() {
		return "ApprovalForm [id=" + id + ", applicationId=" + applicationId + ", applicationFormId=" + applicationFormId + ", approvalFormApprover=" + approvalFormApprover + ", approvalFormOrder=" + approvalFormOrder + ", approvalFormThroughOrNot=" + approvalFormThroughOrNot + ", approvalFormLastestApproverOrNot=" + approvalFormLastestApproverOrNot + ", approvalTime=" + approvalTime + ", status=" + status + ", createTime=" + createTime+"]";
	}
}