package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-10-24
 * @discribe AuthorityList实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class AuthorityList implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//权限表id
	private Integer authorityListId;
	//权限分类
	private String authorityListClassify;
	//权限名称
	private String authorityListName;
	//权限id
	private Integer authorityId;
	//状态
	private String status;
	//时间
	private String createTime;
	public AuthorityList() {


	}
	public Integer getAuthorityListId() {
		return authorityListId;
	}

	public void setAuthorityListId(Integer authorityListId) {
		this.authorityListId = authorityListId;
	}

	public String getAuthorityListClassify() {
		return authorityListClassify;
	}

	public void setAuthorityListClassify(String authorityListClassify) {
		this.authorityListClassify = authorityListClassify;
	}

	public String getAuthorityListName() {
		return authorityListName;
	}

	public void setAuthorityListName(String authorityListName) {
		this.authorityListName = authorityListName;
	}

	public Integer getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
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
		return "AuthorityList [authorityListId=" + authorityListId + ", authorityListClassify=" + authorityListClassify + ", authorityListName=" + authorityListName + ", authorityId=" + authorityId + ", status=" + status + ", createTime=" + createTime+"]";
	}
}