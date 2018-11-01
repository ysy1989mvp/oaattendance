package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-11-01
 * @discribe AttendanceDateTable实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class AttendanceDateTable implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//考勤日期表id
	private Integer id;
	//考勤日期类型 （0.所有人员，1.部门，2.员工）
	private String dateTableType;
	//部门编号、员工编号
	private Integer userId;
	//年
	private String dateTableYear;
	//月
	private String dateTableMonth;
	//日
	private String dateTableDay;
	//工作状态
	private String dateTableWorkingStatus;
	//状态
	private String status;
	//创建时间
	private String createTime;
	public AttendanceDateTable() {


	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDateTableType() {
		return dateTableType;
	}

	public void setDateTableType(String dateTableType) {
		this.dateTableType = dateTableType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getDateTableYear() {
		return dateTableYear;
	}

	public void setDateTableYear(String dateTableYear) {
		this.dateTableYear = dateTableYear;
	}

	public String getDateTableMonth() {
		return dateTableMonth;
	}

	public void setDateTableMonth(String dateTableMonth) {
		this.dateTableMonth = dateTableMonth;
	}

	public String getDateTableDay() {
		return dateTableDay;
	}

	public void setDateTableDay(String dateTableDay) {
		this.dateTableDay = dateTableDay;
	}

	public String getDateTableWorkingStatus() {
		return dateTableWorkingStatus;
	}

	public void setDateTableWorkingStatus(String dateTableWorkingStatus) {
		this.dateTableWorkingStatus = dateTableWorkingStatus;
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
		return "AttendanceDateTable [id=" + id + ", dateTableType=" + dateTableType + ", userId=" + userId + ", dateTableYear=" + dateTableYear + ", dateTableMonth=" + dateTableMonth + ", dateTableDay=" + dateTableDay + ", dateTableWorkingStatus=" + dateTableWorkingStatus + ", status=" + status + ", createTime=" + createTime+"]";
	}
}