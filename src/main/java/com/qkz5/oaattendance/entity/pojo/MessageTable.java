package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-10-24
 * @discribe MessageTable实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class MessageTable implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//消息表id
	private Integer messageId;
	//发送人
	private String messageTableSender;
	//接收人(多个接收人用特殊符号隔开)
	private String messageTableRecipient;
	//内容
	private String messageTableContent;
	//是否查看状态(0.未查看，1.已查看。2.未知)
	private String messageTableStatus;
	//短信是否发送成功
	private Integer messageTableSendYesOrNo;
	//app推送成功
	private Integer messageTableAppSendYesOrNo;
	//状态
	private String status;
	//时间
	private String createTime;
	public MessageTable() {


	}
	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getMessageTableSender() {
		return messageTableSender;
	}

	public void setMessageTableSender(String messageTableSender) {
		this.messageTableSender = messageTableSender;
	}

	public String getMessageTableRecipient() {
		return messageTableRecipient;
	}

	public void setMessageTableRecipient(String messageTableRecipient) {
		this.messageTableRecipient = messageTableRecipient;
	}

	public String getMessageTableContent() {
		return messageTableContent;
	}

	public void setMessageTableContent(String messageTableContent) {
		this.messageTableContent = messageTableContent;
	}

	public String getMessageTableStatus() {
		return messageTableStatus;
	}

	public void setMessageTableStatus(String messageTableStatus) {
		this.messageTableStatus = messageTableStatus;
	}

	public Integer getMessageTableSendYesOrNo() {
		return messageTableSendYesOrNo;
	}

	public void setMessageTableSendYesOrNo(Integer messageTableSendYesOrNo) {
		this.messageTableSendYesOrNo = messageTableSendYesOrNo;
	}

	public Integer getMessageTableAppSendYesOrNo() {
		return messageTableAppSendYesOrNo;
	}

	public void setMessageTableAppSendYesOrNo(Integer messageTableAppSendYesOrNo) {
		this.messageTableAppSendYesOrNo = messageTableAppSendYesOrNo;
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
		return "MessageTable [messageId=" + messageId + ", messageTableSender=" + messageTableSender + ", messageTableRecipient=" + messageTableRecipient + ", messageTableContent=" + messageTableContent + ", messageTableStatus=" + messageTableStatus + ", messageTableSendYesOrNo=" + messageTableSendYesOrNo + ", messageTableAppSendYesOrNo=" + messageTableAppSendYesOrNo + ", status=" + status + ", createTime=" + createTime+"]";
	}
}