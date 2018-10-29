package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-10-24
 * @discribe AttendanceSet实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class AttendanceSet implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//考勤设置id
	private Integer attendanceSetId;
	//考勤类型（1.人事统一设置，2.部门，3.个人）
	private String attendanceType;
	//设置对象（all:所有，部门编号，用户id）
	private String attendanceObject;
	//上班时间
	private String attendanceBusinessHours;
	//下班时间
	private String attendanceClosingTime;
	//弹性时间
	private String attendanceFlexTime;
	//考勤位置
	private String attendanceAddress;
	//考勤范围
	private String attendanceAddressRange;
	//考勤位置
	private String attendanceDefaultTime;
	//状态
	private String status;
	//创建时间
	private String createTime;
	public AttendanceSet() {


	}
	public Integer getAttendanceSetId() {
		return attendanceSetId;
	}

	public void setAttendanceSetId(Integer attendanceSetId) {
		this.attendanceSetId = attendanceSetId;
	}

	public String getAttendanceType() {
		return attendanceType;
	}

	public void setAttendanceType(String attendanceType) {
		this.attendanceType = attendanceType;
	}

	public String getAttendanceObject() {
		return attendanceObject;
	}

	public void setAttendanceObject(String attendanceObject) {
		this.attendanceObject = attendanceObject;
	}

	public String getAttendanceBusinessHours() {
		return attendanceBusinessHours;
	}

	public void setAttendanceBusinessHours(String attendanceBusinessHours) {
		this.attendanceBusinessHours = attendanceBusinessHours;
	}

	public String getAttendanceClosingTime() {
		return attendanceClosingTime;
	}

	public void setAttendanceClosingTime(String attendanceClosingTime) {
		this.attendanceClosingTime = attendanceClosingTime;
	}

	public String getAttendanceFlexTime() {
		return attendanceFlexTime;
	}

	public void setAttendanceFlexTime(String attendanceFlexTime) {
		this.attendanceFlexTime = attendanceFlexTime;
	}

	public String getAttendanceAddress() {
		return attendanceAddress;
	}

	public void setAttendanceAddress(String attendanceAddress) {
		this.attendanceAddress = attendanceAddress;
	}

	public String getAttendanceAddressRange() {
		return attendanceAddressRange;
	}

	public void setAttendanceAddressRange(String attendanceAddressRange) {
		this.attendanceAddressRange = attendanceAddressRange;
	}

	public String getAttendanceDefaultTime() {
		return attendanceDefaultTime;
	}

	public void setAttendanceDefaultTime(String attendanceDefaultTime) {
		this.attendanceDefaultTime = attendanceDefaultTime;
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
		return "AttendanceSet [attendanceSetId=" + attendanceSetId + ", attendanceType=" + attendanceType + ", attendanceObject=" + attendanceObject + ", attendanceBusinessHours=" + attendanceBusinessHours + ", attendanceClosingTime=" + attendanceClosingTime + ", attendanceFlexTime=" + attendanceFlexTime + ", attendanceAddress=" + attendanceAddress + ", attendanceAddressRange=" + attendanceAddressRange + ", attendanceDefaultTime=" + attendanceDefaultTime + ", status=" + status + ", createTime=" + createTime+"]";
	}
}