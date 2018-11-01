package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.AuthorityList;

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
public class AuthorityListCriteria extends AuthorityList{
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
	private AuthorityList authorityList;
	private String feid123;//字段用于统计查询时设置

	public AuthorityListCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public AuthorityList getAuthorityList() {
		return authorityList;
	}
	public void setAuthorityList(AuthorityList authorityList) {
		this.authorityList = authorityList;
		initAuthorityList(authorityList);
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
	public AuthorityListCriteria page(Page value){
		page123 = value;
		return this;
	}
	public AuthorityListCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public AuthorityListCriteria having(String value){
		having123 = value;
		return this;
	}
	public AuthorityListCriteria orderBy(String value){
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

	public AuthorityListCriteria andIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orIdEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`="+id+" ";
			}else{
				condition123 += "`id`="+id+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andIdNotEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`!="+id+" ";
			}else{
				condition123 += "`id`!="+id+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orIdNotEquals(Integer id){
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
	public AuthorityListCriteria andIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orIdGreaterThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>"+id+" ";
			}else{
				condition123 += "`id`>"+id+" ";
			}
		}
		return this;
	}
	
	
	public AuthorityListCriteria andIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orIdLessThan(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<"+id+" ";
			}else{
				condition123 += "`id`<"+id+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orIdGreadterThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`>="+id+" ";
			}else{
				condition123 += "`id`>="+id+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orIdLessThanAndEquals(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id`<="+id+" ";
			}else{
				condition123 += "`id`<="+id+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "and `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orIdLike(Integer id){
		if(id!=null){
			if(condition123.length()>0){
				condition123 += "or `id` like "+id+" ";
			}else{
				condition123 += "`id` like "+id+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `id` is null";
			}else{
				condition123 += "`id` is null";
			}
		return this;
	}
	public AuthorityListCriteria orIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is null";
		}else{
			condition123 += "`id` is null";
		}
		return this;
	}
	public AuthorityListCriteria andIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public AuthorityListCriteria orIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `id` is not null";
		}else{
			condition123 += "`id` is not null";
		}
		return this;
	}
	public AuthorityListCriteria andIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` in("+value+") ";
			}else{
				condition123 += "`id` in("+value+") ";
			}
		}
		return this;
	}
	public AuthorityListCriteria andIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `id` not in("+value+") ";
			}else{
				condition123 += "`id` not in("+value+") ";
			}
		}
		return this;
	}

	public AuthorityListCriteria andAuthorityListClassifyEquals(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_classify`='"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`='"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orAuthorityListClassifyEquals(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_classify`='"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`='"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListClassifyNotEquals(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_classify`!='"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`!='"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListClassifyNotEquals(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_classify`!='"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`!='"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AuthorityListCriteria andAuthorityListClassifyGreaterThan(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_classify`>'"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`>'"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListClassifyGreaterThan(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_classify`>'"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`>'"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	
	
	public AuthorityListCriteria andAuthorityListClassifyLessThan(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_classify`<'"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`<'"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListClassifyLessThan(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_classify`<'"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`<'"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListClassifyGreadterThanAndEquals(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_classify`>='"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`>='"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListClassifyGreadterThanAndEquals(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_classify`>='"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`>='"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListClassifyLessThanAndEquals(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_classify`<='"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`<='"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListClassifyLessThanAndEquals(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_classify`<='"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify`<='"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListClassifyLike(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0&&!("%".equals(authorityListClassify.trim()))&&!("%%".equals(authorityListClassify.trim()))){
			if(condition123.length()>0){
				condition123 += "and `authority_list_classify` like '"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify` like '"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListClassifyLike(String authorityListClassify){
		if(authorityListClassify!=null&&authorityListClassify.trim().length()>0&&!("%".equals(authorityListClassify.trim()))&&!("%%".equals(authorityListClassify.trim()))){
			if(condition123.length()>0){
				condition123 += "or `authority_list_classify` like '"+authorityListClassify+"' ";
			}else{
				condition123 += "`authority_list_classify` like '"+authorityListClassify+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListClassifyIsNull(){
			if(condition123.length()>0){
				condition123 += "and `authority_list_classify` is null";
			}else{
				condition123 += "`authority_list_classify` is null";
			}
		return this;
	}
	public AuthorityListCriteria orAuthorityListClassifyIsNull(){
		if(condition123.length()>0){
			condition123 += "or `authority_list_classify` is null";
		}else{
			condition123 += "`authority_list_classify` is null";
		}
		return this;
	}
	public AuthorityListCriteria andAuthorityListClassifyIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `authority_list_classify` is not null";
		}else{
			condition123 += "`authority_list_classify` is not null";
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListClassifyIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `authority_list_classify` is not null";
		}else{
			condition123 += "`authority_list_classify` is not null";
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListClassifyIn(String value){
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
				condition123 += "and `authority_list_classify` in("+value+") ";
			}else{
				condition123 += "`authority_list_classify` in("+value+") ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orAuthorityListClassifyIn(String value){
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
				condition123 += "or `authority_list_classify` in("+value+") ";
			}else{
				condition123 += "`authority_list_classify` in("+value+") ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListClassifyNotIn(String value){
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
				condition123 += "and `authority_list_classify` not in("+value+") ";
			}else{
				condition123 += "`authority_list_classify` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orAuthorityListClassifyNotIn(String value){
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
				condition123 += "or `authority_list_classify` not in("+value+") ";
			}else{
				condition123 += "`authority_list_classify` not in("+value+") ";
			}
		}
		return this;
	}

	public AuthorityListCriteria andAuthorityListNameEquals(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_name`='"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`='"+authorityListName+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orAuthorityListNameEquals(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_name`='"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`='"+authorityListName+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListNameNotEquals(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_name`!='"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`!='"+authorityListName+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListNameNotEquals(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_name`!='"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`!='"+authorityListName+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AuthorityListCriteria andAuthorityListNameGreaterThan(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_name`>'"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`>'"+authorityListName+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListNameGreaterThan(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_name`>'"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`>'"+authorityListName+"' ";
			}
		}
		return this;
	}
	
	
	public AuthorityListCriteria andAuthorityListNameLessThan(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_name`<'"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`<'"+authorityListName+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListNameLessThan(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_name`<'"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`<'"+authorityListName+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListNameGreadterThanAndEquals(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_name`>='"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`>='"+authorityListName+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListNameGreadterThanAndEquals(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_name`>='"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`>='"+authorityListName+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListNameLessThanAndEquals(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_list_name`<='"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`<='"+authorityListName+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListNameLessThanAndEquals(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_list_name`<='"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name`<='"+authorityListName+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListNameLike(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0&&!("%".equals(authorityListName.trim()))&&!("%%".equals(authorityListName.trim()))){
			if(condition123.length()>0){
				condition123 += "and `authority_list_name` like '"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name` like '"+authorityListName+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListNameLike(String authorityListName){
		if(authorityListName!=null&&authorityListName.trim().length()>0&&!("%".equals(authorityListName.trim()))&&!("%%".equals(authorityListName.trim()))){
			if(condition123.length()>0){
				condition123 += "or `authority_list_name` like '"+authorityListName+"' ";
			}else{
				condition123 += "`authority_list_name` like '"+authorityListName+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListNameIsNull(){
			if(condition123.length()>0){
				condition123 += "and `authority_list_name` is null";
			}else{
				condition123 += "`authority_list_name` is null";
			}
		return this;
	}
	public AuthorityListCriteria orAuthorityListNameIsNull(){
		if(condition123.length()>0){
			condition123 += "or `authority_list_name` is null";
		}else{
			condition123 += "`authority_list_name` is null";
		}
		return this;
	}
	public AuthorityListCriteria andAuthorityListNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `authority_list_name` is not null";
		}else{
			condition123 += "`authority_list_name` is not null";
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityListNameIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `authority_list_name` is not null";
		}else{
			condition123 += "`authority_list_name` is not null";
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListNameIn(String value){
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
				condition123 += "and `authority_list_name` in("+value+") ";
			}else{
				condition123 += "`authority_list_name` in("+value+") ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orAuthorityListNameIn(String value){
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
				condition123 += "or `authority_list_name` in("+value+") ";
			}else{
				condition123 += "`authority_list_name` in("+value+") ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityListNameNotIn(String value){
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
				condition123 += "and `authority_list_name` not in("+value+") ";
			}else{
				condition123 += "`authority_list_name` not in("+value+") ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orAuthorityListNameNotIn(String value){
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
				condition123 += "or `authority_list_name` not in("+value+") ";
			}else{
				condition123 += "`authority_list_name` not in("+value+") ";
			}
		}
		return this;
	}

	public AuthorityListCriteria andAuthorityIdEquals(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "and `authority_id`="+authorityId+" ";
			}else{
				condition123 += "`authority_id`="+authorityId+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orAuthorityIdEquals(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "or `authority_id`="+authorityId+" ";
			}else{
				condition123 += "`authority_id`="+authorityId+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityIdNotEquals(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "and `authority_id`!="+authorityId+" ";
			}else{
				condition123 += "`authority_id`!="+authorityId+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdNotEquals(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "or `authority_id`!="+authorityId+" ";
			}else{
				condition123 += "`authority_id`!="+authorityId+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public AuthorityListCriteria andAuthorityIdGreaterThan(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "and `authority_id`>"+authorityId+" ";
			}else{
				condition123 += "`authority_id`>"+authorityId+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdGreaterThan(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "or `authority_id`>"+authorityId+" ";
			}else{
				condition123 += "`authority_id`>"+authorityId+" ";
			}
		}
		return this;
	}
	
	
	public AuthorityListCriteria andAuthorityIdLessThan(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "and `authority_id`<"+authorityId+" ";
			}else{
				condition123 += "`authority_id`<"+authorityId+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdLessThan(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "or `authority_id`<"+authorityId+" ";
			}else{
				condition123 += "`authority_id`<"+authorityId+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityIdGreadterThanAndEquals(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "and `authority_id`>="+authorityId+" ";
			}else{
				condition123 += "`authority_id`>="+authorityId+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdGreadterThanAndEquals(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "or `authority_id`>="+authorityId+" ";
			}else{
				condition123 += "`authority_id`>="+authorityId+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityIdLessThanAndEquals(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "and `authority_id`<="+authorityId+" ";
			}else{
				condition123 += "`authority_id`<="+authorityId+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdLessThanAndEquals(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "or `authority_id`<="+authorityId+" ";
			}else{
				condition123 += "`authority_id`<="+authorityId+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityIdLike(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "and `authority_id` like "+authorityId+" ";
			}else{
				condition123 += "`authority_id` like "+authorityId+" ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdLike(Integer authorityId){
		if(authorityId!=null){
			if(condition123.length()>0){
				condition123 += "or `authority_id` like "+authorityId+" ";
			}else{
				condition123 += "`authority_id` like "+authorityId+" ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andAuthorityIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `authority_id` is null";
			}else{
				condition123 += "`authority_id` is null";
			}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `authority_id` is null";
		}else{
			condition123 += "`authority_id` is null";
		}
		return this;
	}
	public AuthorityListCriteria andAuthorityIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `authority_id` is not null";
		}else{
			condition123 += "`authority_id` is not null";
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `authority_id` is not null";
		}else{
			condition123 += "`authority_id` is not null";
		}
		return this;
	}
	public AuthorityListCriteria andAuthorityIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_id` in("+value+") ";
			}else{
				condition123 += "`authority_id` in("+value+") ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_id` in("+value+") ";
			}else{
				condition123 += "`authority_id` in("+value+") ";
			}
		}
		return this;
	}
	public AuthorityListCriteria andAuthorityIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `authority_id` not in("+value+") ";
			}else{
				condition123 += "`authority_id` not in("+value+") ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orAuthorityIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `authority_id` not in("+value+") ";
			}else{
				condition123 += "`authority_id` not in("+value+") ";
			}
		}
		return this;
	}

	public AuthorityListCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orStatusNotEquals(String status){
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
	public AuthorityListCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public AuthorityListCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public AuthorityListCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public AuthorityListCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public AuthorityListCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public AuthorityListCriteria andStatusIn(String value){
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
	
	public AuthorityListCriteria orStatusIn(String value){
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
	
	public AuthorityListCriteria andStatusNotIn(String value){
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
	
	public AuthorityListCriteria orStatusNotIn(String value){
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

	public AuthorityListCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orCreateTimeNotEquals(String createTime){
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
	public AuthorityListCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public AuthorityListCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public AuthorityListCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public AuthorityListCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public AuthorityListCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public AuthorityListCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public AuthorityListCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public AuthorityListCriteria andCreateTimeIn(String value){
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
	
	public AuthorityListCriteria orCreateTimeIn(String value){
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
	
	public AuthorityListCriteria andCreateTimeNotIn(String value){
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
	
	public AuthorityListCriteria orCreateTimeNotIn(String value){
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

	private void initAuthorityList(AuthorityList authorityList) {
		super.setId(authorityList.getId());
		super.setAuthorityListClassify(authorityList.getAuthorityListClassify());
		super.setAuthorityListName(authorityList.getAuthorityListName());
		super.setAuthorityId(authorityList.getAuthorityId());
		super.setStatus(authorityList.getStatus());
		super.setCreateTime(authorityList.getCreateTime());

	}

}