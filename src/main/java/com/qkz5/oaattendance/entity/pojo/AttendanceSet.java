package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-11-01
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
	private Integer id;
	//考勤类型（1.人事统一设置，2.部门，3.个人）
	private String attendanceType;
	//班次
	private String attendanceClasses;
	//设置对象（all:所有，部门编号，用户id）
	private String attendanceObject;
	//上班时间
	private String attendanceBusinessHours;
	//下班时间
	private String attendanceClosingTime;
	//弹性时间
	private String attendanceFlexTime;
	//允许迟到时间
	private String attendanceLatenessAllowed;
	//允许提前时间
	private String attendanceAdvanceTimeAllowed;
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
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAttendanceType() {
		return attendanceType;
	}

	public void setAttendanceType(String attendanceType) {
		this.attendanceType = attendanceType;
	}

	public String getAttendanceClasses() {
		return attendanceClasses;
	}

	public void setAttendanceClasses(String attendanceClasses) {
		this.attendanceClasses = attendanceClasses;
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

	public String getAttendanceLatenessAllowed() {
		return attendanceLatenessAllowed;
	}

	public void setAttendanceLatenessAllowed(String attendanceLatenessAllowed) {
		this.attendanceLatenessAllowed = attendanceLatenessAllowed;
	}

	public String getAttendanceAdvanceTimeAllowed() {
		return attendanceAdvanceTimeAllowed;
	}

	public void setAttendanceAdvanceTimeAllowed(String attendanceAdvanceTimeAllowed) {
		this.attendanceAdvanceTimeAllowed = attendanceAdvanceTimeAllowed;
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
		return "AttendanceSet [id=" + id + ", attendanceType=" + attendanceType + ", attendanceClasses=" + attendanceClasses + ", attendanceObject=" + attendanceObject + ", attendanceBusinessHours=" + attendanceBusinessHours + ", attendanceClosingTime=" + attendanceClosingTime + ", attendanceFlexTime=" + attendanceFlexTime + ", attendanceLatenessAllowed=" + attendanceLatenessAllowed + ", attendanceAdvanceTimeAllowed=" + attendanceAdvanceTimeAllowed + ", attendanceAddress=" + attendanceAddress + ", attendanceAddressRange=" + attendanceAddressRange + ", attendanceDefaultTime=" + attendanceDefaultTime + ", status=" + status + ", createTime=" + createTime+"]";
	}
}