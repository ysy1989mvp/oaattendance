package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-10-24
 * @discribe AttendanceForm实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class AttendanceForm implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//考勤表id
	private Integer attendanceId;
	//用户id
	private Integer userId;
	//打卡时间
	private String attendanceFormClockTime;
	//打卡状态(补卡在本月内都可以申请补卡)0.正常，1.加班，2.外勤，3.缺卡，4.调休，5.请假，6.补卡
	private String attendanceFormClockStatus;
	//上下班类型(0.上班，1.下班)
	private String attendanceClosingBusinessHoursType;
	//打卡位置
	private String attendanceFormClockAddress;
	//特殊时间统计
	private String specialTimeStatistics;
	//状态
	private String status;
	//时间
	private String createTime;
	public AttendanceForm() {


	}
	public Integer getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAttendanceFormClockTime() {
		return attendanceFormClockTime;
	}

	public void setAttendanceFormClockTime(String attendanceFormClockTime) {
		this.attendanceFormClockTime = attendanceFormClockTime;
	}

	public String getAttendanceFormClockStatus() {
		return attendanceFormClockStatus;
	}

	public void setAttendanceFormClockStatus(String attendanceFormClockStatus) {
		this.attendanceFormClockStatus = attendanceFormClockStatus;
	}

	public String getAttendanceClosingBusinessHoursType() {
		return attendanceClosingBusinessHoursType;
	}

	public void setAttendanceClosingBusinessHoursType(String attendanceClosingBusinessHoursType) {
		this.attendanceClosingBusinessHoursType = attendanceClosingBusinessHoursType;
	}

	public String getAttendanceFormClockAddress() {
		return attendanceFormClockAddress;
	}

	public void setAttendanceFormClockAddress(String attendanceFormClockAddress) {
		this.attendanceFormClockAddress = attendanceFormClockAddress;
	}

	public String getSpecialTimeStatistics() {
		return specialTimeStatistics;
	}

	public void setSpecialTimeStatistics(String specialTimeStatistics) {
		this.specialTimeStatistics = specialTimeStatistics;
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
		return "AttendanceForm [attendanceId=" + attendanceId + ", userId=" + userId + ", attendanceFormClockTime=" + attendanceFormClockTime + ", attendanceFormClockStatus=" + attendanceFormClockStatus + ", attendanceClosingBusinessHoursType=" + attendanceClosingBusinessHoursType + ", attendanceFormClockAddress=" + attendanceFormClockAddress + ", specialTimeStatistics=" + specialTimeStatistics + ", status=" + status + ", createTime=" + createTime+"]";
	}
}