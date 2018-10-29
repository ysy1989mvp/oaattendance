package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-10-24
 * @discribe Department实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class Department implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//id
	private Integer departmentId;
	//部门编号
	private Integer departmentNumber;
	//部门名称
	private String departmentName;
	//部门位置
	private String departmentAddress;
	//部门负责人
	private String departmentLeader;
	//部门简介
	private String departmentIntro;
	//状态
	private String status;
	//创建时间
	private String createTime;
	public Department() {


	}
	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(Integer departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentLeader() {
		return departmentLeader;
	}

	public void setDepartmentLeader(String departmentLeader) {
		this.departmentLeader = departmentLeader;
	}

	public String getDepartmentIntro() {
		return departmentIntro;
	}

	public void setDepartmentIntro(String departmentIntro) {
		this.departmentIntro = departmentIntro;
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
		return "Department [departmentId=" + departmentId + ", departmentNumber=" + departmentNumber + ", departmentName=" + departmentName + ", departmentAddress=" + departmentAddress + ", departmentLeader=" + departmentLeader + ", departmentIntro=" + departmentIntro + ", status=" + status + ", createTime=" + createTime+"]";
	}
}