package com.qkz5.oaattendance.entity.pojo;
			
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-11-01
 * @discribe EmployeeBasicInformation实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
@Component
public class EmployeeBasicInformation implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//id
	private Integer id;
	//工号
	private Integer workId;
	//密码
	private String password;
	//姓名
	private String name;
	//性别
	private String gender;
	//年龄
	private Integer age;
	//民族
	private String nationality;
	//电话
	private String telephone;
	//部门名称
	private String departmentName;
	//职位
	private String position;
	//政治面貌
	private String politicsStatus;
	//身份证
	private String identityCardNumber;
	//紧急联系人
	private String emergencContact;
	// 紧急联系人联系电话
	private String emergencContactTelphone;
	//住址
	private String employeeAddress;
	//文化程度
	private String degreeOfEducation;
	//毕业院校
	private String schoolOfGraduation;
	//专业
	private String major;
	//本表信息状态
	private String status;
	//信息创建时间
	private String createTime;
	public EmployeeBasicInformation() {


	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWorkId() {
		return workId;
	}

	public void setWorkId(Integer workId) {
		this.workId = workId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPoliticsStatus() {
		return politicsStatus;
	}

	public void setPoliticsStatus(String politicsStatus) {
		this.politicsStatus = politicsStatus;
	}

	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getEmergencContact() {
		return emergencContact;
	}

	public void setEmergencContact(String emergencContact) {
		this.emergencContact = emergencContact;
	}

	public String getEmergencContactTelphone() {
		return emergencContactTelphone;
	}

	public void setEmergencContactTelphone(String emergencContactTelphone) {
		this.emergencContactTelphone = emergencContactTelphone;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getDegreeOfEducation() {
		return degreeOfEducation;
	}

	public void setDegreeOfEducation(String degreeOfEducation) {
		this.degreeOfEducation = degreeOfEducation;
	}

	public String getSchoolOfGraduation() {
		return schoolOfGraduation;
	}

	public void setSchoolOfGraduation(String schoolOfGraduation) {
		this.schoolOfGraduation = schoolOfGraduation;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
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
		return "EmployeeBasicInformation [id=" + id + ", workId=" + workId + ", password=" + password + ", name=" + name + ", gender=" + gender + ", age=" + age + ", nationality=" + nationality + ", telephone=" + telephone + ", departmentName=" + departmentName + ", position=" + position + ", politicsStatus=" + politicsStatus + ", identityCardNumber=" + identityCardNumber + ", emergencContact=" + emergencContact + ", emergencContactTelphone=" + emergencContactTelphone + ", employeeAddress=" + employeeAddress + ", degreeOfEducation=" + degreeOfEducation + ", schoolOfGraduation=" + schoolOfGraduation + ", major=" + major + ", status=" + status + ", createTime=" + createTime+"]";
	}
}