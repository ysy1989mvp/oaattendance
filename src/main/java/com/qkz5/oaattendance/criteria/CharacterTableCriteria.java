package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.CharacterTable;

/**
* 
* @author sunny Yang [杨松彦]
* @QQ 550358261
* @date 2018-04-16
* @discribe
* >、<、>=、<=、=、!=、like、
* is null、is not null、in、not in
*
*/
public class CharacterTableCriteria extends CharacterTable{
	/**
	* 版本号
	*/
	private static final long serialVersionUID = 1L;
	private String groupBy123;//分组
	private String having123;//分组过滤
	private String orderBy123;//排序
	private Page page123;
	private String condition123="";//纯条件
	private String selectCondition123;//查询条件
	private String sql123;
	private CharacterTable characterTable;
	private String feid123;//字段用于统计查询时设置

	public CharacterTableCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public CharacterTable getCharacterTable() {
		return characterTable;
	}
	public void setCharacterTable(CharacterTable characterTable) {
		this.characterTable = characterTable;
		initCharacterTable(characterTable);
	}

	public String getSql123() {
		return sql123;
	}

	public void setSql123(String sql123) {
		this.sql123 = sql123;
	}

	public String getSelectCondition123() {
		if(selectCondition123==null){
			if(condition123.trim().length()>0){
				condition123 = "where "+condition123;
			}
			selectCondition123 = condition123;
			if(groupBy123!=null){
				selectCondition123 += " group by "+groupBy123+" ";
			}
			if(having123!=null){
				selectCondition123 += "having "+having123+" ";
			}
			if(orderBy123!=null){
				selectCondition123 += "order by "+orderBy123+" ";
			}
			if(page123!=null){
				selectCondition123 += "limit "+((page123.getPageNumber()-1)*page123.getPageSize())+","+page123.getPageSize();
			}
			selectCondition123 = selectCondition123.trim();
		}
		System.out.println("查询条件："+selectCondition123);
		return selectCondition123;
	}
	public void setSelectCondition123(String selectCondition) {
		this.selectCondition123 = selectCondition;
	}
	public String getCondition123() {
		System.out.println("纯条件："+condition123);
		return condition123;
	}
	public void setCondition123(String condition) {
		this.condition123 = condition;
	}
	public CharacterTableCriteria page(Page value){
		page123 = value;
		return this;
	}
	public CharacterTableCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public CharacterTableCriteria having(String value){
		having123 = value;
		return this;
	}
	public CharacterTableCriteria orderBy(String value){
		orderBy123 = value;
		return this;
	}

	/*public String getSqlAll(String tableName){
		String sql = "";
		if("where ".equals(condition123)){
			sql = "select * from `"+tableName+"` ";
		}else{
			sql = "select * from `"+tableName+"` "+condition123+" ";
		}
		if(groupBy123!=null){
			sql += sql+" group by "+groupBy123+" ";
		}
		if(having123!=null){
			sql += "having "+having123+" ";
		}
		if(orderBy123!=null){
			sql += "order by "+orderBy123+" ";
		}
		if(page123!=null){
			sql += "limit "+((page123.getPageNumber()-1)*page123.getPageSize())+","+page123.getPageSize();
		}
		sql = sql.trim();
		return sql; 
	}*/

/************以下为纯条件的拼接*******************/

	public CharacterTableCriteria andIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andIdNotEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`!="+id+" ";
			}else{
				condition123 += "`id`!="+id+" ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orIdNotEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`!="+id+" ";
			}else{
				condition123 += "`id`!="+id+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public CharacterTableCriteria andIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	
	
	public CharacterTableCriteria andIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `id` is null";
			}else{
				condition123 += "`id` is null";
			}
		return this;
	}
	public CharacterTableCriteria orIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is null";
		}else{
			condition123 += "`id` is null";
		}
		return this;
	}
	public CharacterTableCriteria andIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public CharacterTableCriteria orIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public CharacterTableCriteria andIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public CharacterTableCriteria andIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}

	public CharacterTableCriteria andCharacterNameEquals(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `character_name`='"+characterName+"' ";
			}else{
				condition123 += "`character_name`='"+characterName+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orCharacterNameEquals(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `character_name`='"+characterName+"' ";
			}else{
				condition123 += "`character_name`='"+characterName+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCharacterNameNotEquals(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `character_name`!='"+characterName+"' ";
			}else{
				condition123 += "`character_name`!='"+characterName+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCharacterNameNotEquals(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `character_name`!='"+characterName+"' ";
			}else{
				condition123 += "`character_name`!='"+characterName+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public CharacterTableCriteria andCharacterNameGreaterThan(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `character_name`>'"+characterName+"' ";
			}else{
				condition123 += "`character_name`>'"+characterName+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCharacterNameGreaterThan(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `character_name`>'"+characterName+"' ";
			}else{
				condition123 += "`character_name`>'"+characterName+"' ";
			}
		}
		return this;
	}
	
	
	public CharacterTableCriteria andCharacterNameLessThan(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `character_name`<'"+characterName+"' ";
			}else{
				condition123 += "`character_name`<'"+characterName+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCharacterNameLessThan(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `character_name`<'"+characterName+"' ";
			}else{
				condition123 += "`character_name`<'"+characterName+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCharacterNameGreadterThanAndEquals(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `character_name`>='"+characterName+"' ";
			}else{
				condition123 += "`character_name`>='"+characterName+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCharacterNameGreadterThanAndEquals(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `character_name`>='"+characterName+"' ";
			}else{
				condition123 += "`character_name`>='"+characterName+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCharacterNameLessThanAndEquals(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `character_name`<='"+characterName+"' ";
			}else{
				condition123 += "`character_name`<='"+characterName+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCharacterNameLessThanAndEquals(String characterName){
		if(characterName!=null&&characterName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `character_name`<='"+characterName+"' ";
			}else{
				condition123 += "`character_name`<='"+characterName+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCharacterNameLike(String characterName){
		if(characterName!=null&&characterName.trim().length()>0&&!("%".equals(characterName.trim()))&&!("%%".equals(characterName.trim()))){
			if(condition123.length()>0){
				condition123 += "and `character_name` like '"+characterName+"' ";
			}else{
				condition123 += "`character_name` like '"+characterName+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCharacterNameLike(String characterName){
		if(characterName!=null&&characterName.trim().length()>0&&!("%".equals(characterName.trim()))&&!("%%".equals(characterName.trim()))){
			if(condition123.length()>0){
				condition123 += "or `character_name` like '"+characterName+"' ";
			}else{
				condition123 += "`character_name` like '"+characterName+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCharacterNameIsNull(){
			if(condition123.length()>0){
				condition123 += "and `character_name` is null";
			}else{
				condition123 += "`character_name` is null";
			}
		return this;
	}
	public CharacterTableCriteria orCharacterNameIsNull(){
		if(condition123.length()>0){
			condition123 += "or `character_name` is null";
		}else{
			condition123 += "`character_name` is null";
		}
		return this;
	}
	public CharacterTableCriteria andCharacterNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `character_name` is not null";
		}else{
			condition123 += "`character_name` is not null";
		}
		return this;
	}
	public CharacterTableCriteria orCharacterNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `character_name` is not null";
		}else{
			condition123 += "`character_name` is not null";
		}
		return this;
	}
	
	public CharacterTableCriteria andCharacterNameIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `character_name` in("+value+") ";
			}else{
				condition123 += "`character_name` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orCharacterNameIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `character_name` in("+value+") ";
			}else{
				condition123 += "`character_name` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCharacterNameNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `character_name` not in("+value+") ";
			}else{
				condition123 += "`character_name` not in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orCharacterNameNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `character_name` not in("+value+") ";
			}else{
				condition123 += "`character_name` not in("+value+") ";
			}
		}
		return this;
	}

	public CharacterTableCriteria andAuthorityModulesEquals(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_modules`='"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`='"+authorityModules+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orAuthorityModulesEquals(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_modules`='"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`='"+authorityModules+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andAuthorityModulesNotEquals(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_modules`!='"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`!='"+authorityModules+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orAuthorityModulesNotEquals(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_modules`!='"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`!='"+authorityModules+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public CharacterTableCriteria andAuthorityModulesGreaterThan(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_modules`>'"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`>'"+authorityModules+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orAuthorityModulesGreaterThan(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_modules`>'"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`>'"+authorityModules+"' ";
			}
		}
		return this;
	}
	
	
	public CharacterTableCriteria andAuthorityModulesLessThan(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_modules`<'"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`<'"+authorityModules+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orAuthorityModulesLessThan(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_modules`<'"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`<'"+authorityModules+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andAuthorityModulesGreadterThanAndEquals(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_modules`>='"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`>='"+authorityModules+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orAuthorityModulesGreadterThanAndEquals(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_modules`>='"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`>='"+authorityModules+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andAuthorityModulesLessThanAndEquals(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_modules`<='"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`<='"+authorityModules+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orAuthorityModulesLessThanAndEquals(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_modules`<='"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules`<='"+authorityModules+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andAuthorityModulesLike(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0&&!("%".equals(authorityModules.trim()))&&!("%%".equals(authorityModules.trim()))){
			if(condition123.length()>0){
				condition123 += "and `authority_modules` like '"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules` like '"+authorityModules+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orAuthorityModulesLike(String authorityModules){
		if(authorityModules!=null&&authorityModules.trim().length()>0&&!("%".equals(authorityModules.trim()))&&!("%%".equals(authorityModules.trim()))){
			if(condition123.length()>0){
				condition123 += "or `authority_modules` like '"+authorityModules+"' ";
			}else{
				condition123 += "`authority_modules` like '"+authorityModules+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andAuthorityModulesIsNull(){
			if(condition123.length()>0){
				condition123 += "and `authority_modules` is null";
			}else{
				condition123 += "`authority_modules` is null";
			}
		return this;
	}
	public CharacterTableCriteria orAuthorityModulesIsNull(){
		if(condition123.length()>0){
			condition123 += "or `authority_modules` is null";
		}else{
			condition123 += "`authority_modules` is null";
		}
		return this;
	}
	public CharacterTableCriteria andAuthorityModulesIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `authority_modules` is not null";
		}else{
			condition123 += "`authority_modules` is not null";
		}
		return this;
	}
	public CharacterTableCriteria orAuthorityModulesIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `authority_modules` is not null";
		}else{
			condition123 += "`authority_modules` is not null";
		}
		return this;
	}
	
	public CharacterTableCriteria andAuthorityModulesIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `authority_modules` in("+value+") ";
			}else{
				condition123 += "`authority_modules` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orAuthorityModulesIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `authority_modules` in("+value+") ";
			}else{
				condition123 += "`authority_modules` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andAuthorityModulesNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `authority_modules` not in("+value+") ";
			}else{
				condition123 += "`authority_modules` not in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orAuthorityModulesNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `authority_modules` not in("+value+") ";
			}else{
				condition123 += "`authority_modules` not in("+value+") ";
			}
		}
		return this;
	}

	public CharacterTableCriteria andSpecificAuthorityEquals(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `specific_authority`='"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`='"+specificAuthority+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orSpecificAuthorityEquals(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `specific_authority`='"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`='"+specificAuthority+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andSpecificAuthorityNotEquals(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `specific_authority`!='"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`!='"+specificAuthority+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orSpecificAuthorityNotEquals(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `specific_authority`!='"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`!='"+specificAuthority+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public CharacterTableCriteria andSpecificAuthorityGreaterThan(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `specific_authority`>'"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`>'"+specificAuthority+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orSpecificAuthorityGreaterThan(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `specific_authority`>'"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`>'"+specificAuthority+"' ";
			}
		}
		return this;
	}
	
	
	public CharacterTableCriteria andSpecificAuthorityLessThan(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `specific_authority`<'"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`<'"+specificAuthority+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orSpecificAuthorityLessThan(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `specific_authority`<'"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`<'"+specificAuthority+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andSpecificAuthorityGreadterThanAndEquals(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `specific_authority`>='"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`>='"+specificAuthority+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orSpecificAuthorityGreadterThanAndEquals(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `specific_authority`>='"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`>='"+specificAuthority+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andSpecificAuthorityLessThanAndEquals(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `specific_authority`<='"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`<='"+specificAuthority+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orSpecificAuthorityLessThanAndEquals(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `specific_authority`<='"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority`<='"+specificAuthority+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andSpecificAuthorityLike(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0&&!("%".equals(specificAuthority.trim()))&&!("%%".equals(specificAuthority.trim()))){
			if(condition123.length()>0){
				condition123 += "and `specific_authority` like '"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority` like '"+specificAuthority+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orSpecificAuthorityLike(String specificAuthority){
		if(specificAuthority!=null&&specificAuthority.trim().length()>0&&!("%".equals(specificAuthority.trim()))&&!("%%".equals(specificAuthority.trim()))){
			if(condition123.length()>0){
				condition123 += "or `specific_authority` like '"+specificAuthority+"' ";
			}else{
				condition123 += "`specific_authority` like '"+specificAuthority+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andSpecificAuthorityIsNull(){
			if(condition123.length()>0){
				condition123 += "and `specific_authority` is null";
			}else{
				condition123 += "`specific_authority` is null";
			}
		return this;
	}
	public CharacterTableCriteria orSpecificAuthorityIsNull(){
		if(condition123.length()>0){
			condition123 += "or `specific_authority` is null";
		}else{
			condition123 += "`specific_authority` is null";
		}
		return this;
	}
	public CharacterTableCriteria andSpecificAuthorityIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `specific_authority` is not null";
		}else{
			condition123 += "`specific_authority` is not null";
		}
		return this;
	}
	public CharacterTableCriteria orSpecificAuthorityIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `specific_authority` is not null";
		}else{
			condition123 += "`specific_authority` is not null";
		}
		return this;
	}
	
	public CharacterTableCriteria andSpecificAuthorityIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `specific_authority` in("+value+") ";
			}else{
				condition123 += "`specific_authority` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orSpecificAuthorityIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `specific_authority` in("+value+") ";
			}else{
				condition123 += "`specific_authority` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andSpecificAuthorityNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `specific_authority` not in("+value+") ";
			}else{
				condition123 += "`specific_authority` not in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orSpecificAuthorityNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `specific_authority` not in("+value+") ";
			}else{
				condition123 += "`specific_authority` not in("+value+") ";
			}
		}
		return this;
	}

	public CharacterTableCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public CharacterTableCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public CharacterTableCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public CharacterTableCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public CharacterTableCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public CharacterTableCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public CharacterTableCriteria andStatusIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `status` in("+value+") ";
			}else{
				condition123 += "`status` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orStatusIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `status` in("+value+") ";
			}else{
				condition123 += "`status` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andStatusNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `status` not in("+value+") ";
			}else{
				condition123 += "`status` not in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orStatusNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `status` not in("+value+") ";
			}else{
				condition123 += "`status` not in("+value+") ";
			}
		}
		return this;
	}

	public CharacterTableCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public CharacterTableCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public CharacterTableCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public CharacterTableCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public CharacterTableCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public CharacterTableCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public CharacterTableCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public CharacterTableCriteria andCreateTimeIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `create_time` in("+value+") ";
			}else{
				condition123 += "`create_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orCreateTimeIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `create_time` in("+value+") ";
			}else{
				condition123 += "`create_time` in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria andCreateTimeNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "and `create_time` not in("+value+") ";
			}else{
				condition123 += "`create_time` not in("+value+") ";
			}
		}
		return this;
	}
	
	public CharacterTableCriteria orCreateTimeNotIn(String value){
		if(value!=null&&value.trim().length()>0){
			if(value.contains(",")){
				String []values = value.split(",");
				String newValue = "";
				for(String s:values){
					newValue += "'"+s+"',";
				}
				newValue = newValue.substring(0, newValue.length()-1);
				value = newValue;
			}else{
				value = "'"+value+"'";
			}
			if(condition123.length()>0){
				condition123 += "or `create_time` not in("+value+") ";
			}else{
				condition123 += "`create_time` not in("+value+") ";
			}
		}
		return this;
	}

	private void initCharacterTable(CharacterTable characterTable) {
		super.setId(characterTable.getId());
		super.setCharacterName(characterTable.getCharacterName());
		super.setAuthorityModules(characterTable.getAuthorityModules());
		super.setSpecificAuthority(characterTable.getSpecificAuthority());
		super.setStatus(characterTable.getStatus());
		super.setCreateTime(characterTable.getCreateTime());

	}

}