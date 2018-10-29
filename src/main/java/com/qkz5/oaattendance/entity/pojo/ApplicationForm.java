package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-10-24
 * @discribe ApplicationForm实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class ApplicationForm implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//申请id
	private Integer applicationId;
	//申请类型
	private String applicationType;
	//申请分类
	private String applicationClassify;
	//申请开始时间
	private String applicationStartTime;
	//申请结束时间
	private String applicationLastTime;
	//申请时长周期
	private String applicationDuration;
	//原由
	private String applicationReason;
	//抄送人
	private String applicationCopyRecipients;
	//涉及金额
	private String applicationMoneyInvolved;
	//状态
	private String status;
	//时间
	private String createTime;
	public ApplicationForm() {


	}
	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getApplicationClassify() {
		return applicationClassify;
	}

	public void setApplicationClassify(String applicationClassify) {
		this.applicationClassify = applicationClassify;
	}

	public String getApplicationStartTime() {
		return applicationStartTime;
	}

	public void setApplicationStartTime(String applicationStartTime) {
		this.applicationStartTime = applicationStartTime;
	}

	public String getApplicationLastTime() {
		return applicationLastTime;
	}

	public void setApplicationLastTime(String applicationLastTime) {
		this.applicationLastTime = applicationLastTime;
	}

	public String getApplicationDuration() {
		return applicationDuration;
	}

	public void setApplicationDuration(String applicationDuration) {
		this.applicationDuration = applicationDuration;
	}

	public String getApplicationReason() {
		return applicationReason;
	}

	public void setApplicationReason(String applicationReason) {
		this.applicationReason = applicationReason;
	}

	public String getApplicationCopyRecipients() {
		return applicationCopyRecipients;
	}

	public void setApplicationCopyRecipients(String applicationCopyRecipients) {
		this.applicationCopyRecipients = applicationCopyRecipients;
	}

	public String getApplicationMoneyInvolved() {
		return applicationMoneyInvolved;
	}

	public void setApplicationMoneyInvolved(String applicationMoneyInvolved) {
		this.applicationMoneyInvolved = applicationMoneyInvolved;
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
		return "ApplicationForm [applicationId=" + applicationId + ", applicationType=" + applicationType + ", applicationClassify=" + applicationClassify + ", applicationStartTime=" + applicationStartTime + ", applicationLastTime=" + applicationLastTime + ", applicationDuration=" + applicationDuration + ", applicationReason=" + applicationReason + ", applicationCopyRecipients=" + applicationCopyRecipients + ", applicationMoneyInvolved=" + applicationMoneyInvolved + ", status=" + status + ", createTime=" + createTime+"]";
	}
}