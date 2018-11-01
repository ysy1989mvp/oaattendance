package com.qkz5.oaattendance.entity.pojo;
			
import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author sunny Yang
 * @date 2018-11-01
 * @discribe CharacterTable实体类，数据类型与字段 和数据库一致，
 * 不允许更改，需要更改的部分在mojo对应的AO类中进行更改
 *
 *
 */
public class CharacterTable implements Serializable{
	/**
	 * 控制版本号
	 */
	private static final long serialVersionUID = 1L;
	//角色表id
	private Integer id;
	//角色名称
	private String characterName;
	//权限模块
	private String authorityModules;
	//具体权限
	private String specificAuthority;
	//状态
	private String status;
	//时间
	private String createTime;
	public CharacterTable() {


	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getAuthorityModules() {
		return authorityModules;
	}

	public void setAuthorityModules(String authorityModules) {
		this.authorityModules = authorityModules;
	}

	public String getSpecificAuthority() {
		return specificAuthority;
	}

	public void setSpecificAuthority(String specificAuthority) {
		this.specificAuthority = specificAuthority;
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
		return "CharacterTable [id=" + id + ", characterName=" + characterName + ", authorityModules=" + authorityModules + ", specificAuthority=" + specificAuthority + ", status=" + status + ", createTime=" + createTime+"]";
	}
}