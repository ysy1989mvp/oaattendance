package com.qkz5.oaattendance.criteria;
	
import com.slkj.autocode.entity.Page;
import com.qkz5.oaattendance.entity.pojo.MessageTable;

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
public class MessageTableCriteria extends MessageTable{
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
	private MessageTable messageTable;
	private String feid123;//字段用于统计查询时设置

	public MessageTableCriteria() {

	}
	public String getFeid123() {
		return feid123;
	}
	public void setFeid123(String feid) {
		this.feid123 = feid;
	}
	public MessageTable getMessageTable() {
		return messageTable;
	}
	public void setMessageTable(MessageTable messageTable) {
		this.messageTable = messageTable;
		initMessageTable(messageTable);
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
	public MessageTableCriteria page(Page value){
		page123 = value;
		return this;
	}
	public MessageTableCriteria groupBy(String value){
		groupBy123 = value;
		return this;
	}
	public MessageTableCriteria having(String value){
		having123 = value;
		return this;
	}
	public MessageTableCriteria orderBy(String value){
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

	public MessageTableCriteria andMessageIdEquals(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "and `message_id`="+messageId+" ";
			}else{
				condition123 += "`message_id`="+messageId+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageIdEquals(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "or `message_id`="+messageId+" ";
			}else{
				condition123 += "`message_id`="+messageId+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageIdNotEquals(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "and `message_id`!="+messageId+" ";
			}else{
				condition123 += "`message_id`!="+messageId+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageIdNotEquals(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "or `message_id`!="+messageId+" ";
			}else{
				condition123 += "`message_id`!="+messageId+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public MessageTableCriteria andMessageIdGreaterThan(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "and `message_id`>"+messageId+" ";
			}else{
				condition123 += "`message_id`>"+messageId+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageIdGreaterThan(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "or `message_id`>"+messageId+" ";
			}else{
				condition123 += "`message_id`>"+messageId+" ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andMessageIdLessThan(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "and `message_id`<"+messageId+" ";
			}else{
				condition123 += "`message_id`<"+messageId+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageIdLessThan(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "or `message_id`<"+messageId+" ";
			}else{
				condition123 += "`message_id`<"+messageId+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageIdGreadterThanAndEquals(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "and `message_id`>="+messageId+" ";
			}else{
				condition123 += "`message_id`>="+messageId+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageIdGreadterThanAndEquals(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "or `message_id`>="+messageId+" ";
			}else{
				condition123 += "`message_id`>="+messageId+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageIdLessThanAndEquals(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "and `message_id`<="+messageId+" ";
			}else{
				condition123 += "`message_id`<="+messageId+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageIdLessThanAndEquals(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "or `message_id`<="+messageId+" ";
			}else{
				condition123 += "`message_id`<="+messageId+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageIdLike(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "and `message_id` like "+messageId+" ";
			}else{
				condition123 += "`message_id` like "+messageId+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageIdLike(Integer messageId){
		if(messageId!=null){
			if(condition123.length()>0){
				condition123 += "or `message_id` like "+messageId+" ";
			}else{
				condition123 += "`message_id` like "+messageId+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageIdIsNull(){
			if(condition123.length()>0){
				condition123 += "and `message_id` is null";
			}else{
				condition123 += "`message_id` is null";
			}
		return this;
	}
	public MessageTableCriteria orMessageIdIsNull(){
		if(condition123.length()>0){
			condition123 += "or `message_id` is null";
		}else{
			condition123 += "`message_id` is null";
		}
		return this;
	}
	public MessageTableCriteria andMessageIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `message_id` is not null";
		}else{
			condition123 += "`message_id` is not null";
		}
		return this;
	}
	public MessageTableCriteria orMessageIdIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `message_id` is not null";
		}else{
			condition123 += "`message_id` is not null";
		}
		return this;
	}
	public MessageTableCriteria andMessageIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_id` in("+value+") ";
			}else{
				condition123 += "`message_id` in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageIdIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_id` in("+value+") ";
			}else{
				condition123 += "`message_id` in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria andMessageIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_id` not in("+value+") ";
			}else{
				condition123 += "`message_id` not in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageIdNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_id` not in("+value+") ";
			}else{
				condition123 += "`message_id` not in("+value+") ";
			}
		}
		return this;
	}

	public MessageTableCriteria andMessageTableSenderEquals(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_sender`='"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`='"+messageTableSender+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableSenderEquals(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_sender`='"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`='"+messageTableSender+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSenderNotEquals(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_sender`!='"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`!='"+messageTableSender+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSenderNotEquals(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_sender`!='"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`!='"+messageTableSender+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public MessageTableCriteria andMessageTableSenderGreaterThan(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_sender`>'"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`>'"+messageTableSender+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSenderGreaterThan(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_sender`>'"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`>'"+messageTableSender+"' ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andMessageTableSenderLessThan(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_sender`<'"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`<'"+messageTableSender+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSenderLessThan(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_sender`<'"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`<'"+messageTableSender+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSenderGreadterThanAndEquals(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_sender`>='"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`>='"+messageTableSender+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSenderGreadterThanAndEquals(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_sender`>='"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`>='"+messageTableSender+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSenderLessThanAndEquals(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_sender`<='"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`<='"+messageTableSender+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSenderLessThanAndEquals(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_sender`<='"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender`<='"+messageTableSender+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSenderLike(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0&&!("%".equals(messageTableSender.trim()))&&!("%%".equals(messageTableSender.trim()))){
			if(condition123.length()>0){
				condition123 += "and `message_table_sender` like '"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender` like '"+messageTableSender+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSenderLike(String messageTableSender){
		if(messageTableSender!=null&&messageTableSender.trim().length()>0&&!("%".equals(messageTableSender.trim()))&&!("%%".equals(messageTableSender.trim()))){
			if(condition123.length()>0){
				condition123 += "or `message_table_sender` like '"+messageTableSender+"' ";
			}else{
				condition123 += "`message_table_sender` like '"+messageTableSender+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSenderIsNull(){
			if(condition123.length()>0){
				condition123 += "and `message_table_sender` is null";
			}else{
				condition123 += "`message_table_sender` is null";
			}
		return this;
	}
	public MessageTableCriteria orMessageTableSenderIsNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_sender` is null";
		}else{
			condition123 += "`message_table_sender` is null";
		}
		return this;
	}
	public MessageTableCriteria andMessageTableSenderIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `message_table_sender` is not null";
		}else{
			condition123 += "`message_table_sender` is not null";
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSenderIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_sender` is not null";
		}else{
			condition123 += "`message_table_sender` is not null";
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSenderIn(String value){
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
				condition123 += "and `message_table_sender` in("+value+") ";
			}else{
				condition123 += "`message_table_sender` in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableSenderIn(String value){
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
				condition123 += "or `message_table_sender` in("+value+") ";
			}else{
				condition123 += "`message_table_sender` in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSenderNotIn(String value){
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
				condition123 += "and `message_table_sender` not in("+value+") ";
			}else{
				condition123 += "`message_table_sender` not in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableSenderNotIn(String value){
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
				condition123 += "or `message_table_sender` not in("+value+") ";
			}else{
				condition123 += "`message_table_sender` not in("+value+") ";
			}
		}
		return this;
	}

	public MessageTableCriteria andMessageTableRecipientEquals(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_recipient`='"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`='"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableRecipientEquals(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_recipient`='"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`='"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableRecipientNotEquals(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_recipient`!='"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`!='"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableRecipientNotEquals(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_recipient`!='"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`!='"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public MessageTableCriteria andMessageTableRecipientGreaterThan(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_recipient`>'"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`>'"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableRecipientGreaterThan(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_recipient`>'"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`>'"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andMessageTableRecipientLessThan(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_recipient`<'"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`<'"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableRecipientLessThan(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_recipient`<'"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`<'"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableRecipientGreadterThanAndEquals(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_recipient`>='"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`>='"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableRecipientGreadterThanAndEquals(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_recipient`>='"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`>='"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableRecipientLessThanAndEquals(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_recipient`<='"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`<='"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableRecipientLessThanAndEquals(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_recipient`<='"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient`<='"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableRecipientLike(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0&&!("%".equals(messageTableRecipient.trim()))&&!("%%".equals(messageTableRecipient.trim()))){
			if(condition123.length()>0){
				condition123 += "and `message_table_recipient` like '"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient` like '"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableRecipientLike(String messageTableRecipient){
		if(messageTableRecipient!=null&&messageTableRecipient.trim().length()>0&&!("%".equals(messageTableRecipient.trim()))&&!("%%".equals(messageTableRecipient.trim()))){
			if(condition123.length()>0){
				condition123 += "or `message_table_recipient` like '"+messageTableRecipient+"' ";
			}else{
				condition123 += "`message_table_recipient` like '"+messageTableRecipient+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableRecipientIsNull(){
			if(condition123.length()>0){
				condition123 += "and `message_table_recipient` is null";
			}else{
				condition123 += "`message_table_recipient` is null";
			}
		return this;
	}
	public MessageTableCriteria orMessageTableRecipientIsNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_recipient` is null";
		}else{
			condition123 += "`message_table_recipient` is null";
		}
		return this;
	}
	public MessageTableCriteria andMessageTableRecipientIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `message_table_recipient` is not null";
		}else{
			condition123 += "`message_table_recipient` is not null";
		}
		return this;
	}
	public MessageTableCriteria orMessageTableRecipientIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_recipient` is not null";
		}else{
			condition123 += "`message_table_recipient` is not null";
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableRecipientIn(String value){
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
				condition123 += "and `message_table_recipient` in("+value+") ";
			}else{
				condition123 += "`message_table_recipient` in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableRecipientIn(String value){
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
				condition123 += "or `message_table_recipient` in("+value+") ";
			}else{
				condition123 += "`message_table_recipient` in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableRecipientNotIn(String value){
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
				condition123 += "and `message_table_recipient` not in("+value+") ";
			}else{
				condition123 += "`message_table_recipient` not in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableRecipientNotIn(String value){
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
				condition123 += "or `message_table_recipient` not in("+value+") ";
			}else{
				condition123 += "`message_table_recipient` not in("+value+") ";
			}
		}
		return this;
	}

	public MessageTableCriteria andMessageTableContentEquals(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_content`='"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`='"+messageTableContent+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableContentEquals(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_content`='"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`='"+messageTableContent+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableContentNotEquals(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_content`!='"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`!='"+messageTableContent+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableContentNotEquals(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_content`!='"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`!='"+messageTableContent+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public MessageTableCriteria andMessageTableContentGreaterThan(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_content`>'"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`>'"+messageTableContent+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableContentGreaterThan(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_content`>'"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`>'"+messageTableContent+"' ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andMessageTableContentLessThan(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_content`<'"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`<'"+messageTableContent+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableContentLessThan(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_content`<'"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`<'"+messageTableContent+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableContentGreadterThanAndEquals(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_content`>='"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`>='"+messageTableContent+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableContentGreadterThanAndEquals(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_content`>='"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`>='"+messageTableContent+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableContentLessThanAndEquals(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_content`<='"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`<='"+messageTableContent+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableContentLessThanAndEquals(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_content`<='"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content`<='"+messageTableContent+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableContentLike(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0&&!("%".equals(messageTableContent.trim()))&&!("%%".equals(messageTableContent.trim()))){
			if(condition123.length()>0){
				condition123 += "and `message_table_content` like '"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content` like '"+messageTableContent+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableContentLike(String messageTableContent){
		if(messageTableContent!=null&&messageTableContent.trim().length()>0&&!("%".equals(messageTableContent.trim()))&&!("%%".equals(messageTableContent.trim()))){
			if(condition123.length()>0){
				condition123 += "or `message_table_content` like '"+messageTableContent+"' ";
			}else{
				condition123 += "`message_table_content` like '"+messageTableContent+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableContentIsNull(){
			if(condition123.length()>0){
				condition123 += "and `message_table_content` is null";
			}else{
				condition123 += "`message_table_content` is null";
			}
		return this;
	}
	public MessageTableCriteria orMessageTableContentIsNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_content` is null";
		}else{
			condition123 += "`message_table_content` is null";
		}
		return this;
	}
	public MessageTableCriteria andMessageTableContentIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `message_table_content` is not null";
		}else{
			condition123 += "`message_table_content` is not null";
		}
		return this;
	}
	public MessageTableCriteria orMessageTableContentIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_content` is not null";
		}else{
			condition123 += "`message_table_content` is not null";
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableContentIn(String value){
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
				condition123 += "and `message_table_content` in("+value+") ";
			}else{
				condition123 += "`message_table_content` in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableContentIn(String value){
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
				condition123 += "or `message_table_content` in("+value+") ";
			}else{
				condition123 += "`message_table_content` in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableContentNotIn(String value){
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
				condition123 += "and `message_table_content` not in("+value+") ";
			}else{
				condition123 += "`message_table_content` not in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableContentNotIn(String value){
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
				condition123 += "or `message_table_content` not in("+value+") ";
			}else{
				condition123 += "`message_table_content` not in("+value+") ";
			}
		}
		return this;
	}

	public MessageTableCriteria andMessageTableStatusEquals(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_status`='"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`='"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableStatusEquals(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_status`='"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`='"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableStatusNotEquals(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_status`!='"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`!='"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableStatusNotEquals(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_status`!='"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`!='"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public MessageTableCriteria andMessageTableStatusGreaterThan(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_status`>'"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`>'"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableStatusGreaterThan(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_status`>'"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`>'"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andMessageTableStatusLessThan(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_status`<'"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`<'"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableStatusLessThan(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_status`<'"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`<'"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableStatusGreadterThanAndEquals(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_status`>='"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`>='"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableStatusGreadterThanAndEquals(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_status`>='"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`>='"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableStatusLessThanAndEquals(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_status`<='"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`<='"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableStatusLessThanAndEquals(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_status`<='"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status`<='"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableStatusLike(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0&&!("%".equals(messageTableStatus.trim()))&&!("%%".equals(messageTableStatus.trim()))){
			if(condition123.length()>0){
				condition123 += "and `message_table_status` like '"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status` like '"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableStatusLike(String messageTableStatus){
		if(messageTableStatus!=null&&messageTableStatus.trim().length()>0&&!("%".equals(messageTableStatus.trim()))&&!("%%".equals(messageTableStatus.trim()))){
			if(condition123.length()>0){
				condition123 += "or `message_table_status` like '"+messageTableStatus+"' ";
			}else{
				condition123 += "`message_table_status` like '"+messageTableStatus+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `message_table_status` is null";
			}else{
				condition123 += "`message_table_status` is null";
			}
		return this;
	}
	public MessageTableCriteria orMessageTableStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_status` is null";
		}else{
			condition123 += "`message_table_status` is null";
		}
		return this;
	}
	public MessageTableCriteria andMessageTableStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `message_table_status` is not null";
		}else{
			condition123 += "`message_table_status` is not null";
		}
		return this;
	}
	public MessageTableCriteria orMessageTableStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_status` is not null";
		}else{
			condition123 += "`message_table_status` is not null";
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableStatusIn(String value){
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
				condition123 += "and `message_table_status` in("+value+") ";
			}else{
				condition123 += "`message_table_status` in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableStatusIn(String value){
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
				condition123 += "or `message_table_status` in("+value+") ";
			}else{
				condition123 += "`message_table_status` in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableStatusNotIn(String value){
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
				condition123 += "and `message_table_status` not in("+value+") ";
			}else{
				condition123 += "`message_table_status` not in("+value+") ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableStatusNotIn(String value){
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
				condition123 += "or `message_table_status` not in("+value+") ";
			}else{
				condition123 += "`message_table_status` not in("+value+") ";
			}
		}
		return this;
	}

	public MessageTableCriteria andMessageTableSendYesOrNoEquals(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no`="+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`="+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableSendYesOrNoEquals(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no`="+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`="+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSendYesOrNoNotEquals(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no`!="+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`!="+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoNotEquals(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no`!="+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`!="+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public MessageTableCriteria andMessageTableSendYesOrNoGreaterThan(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no`>"+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`>"+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoGreaterThan(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no`>"+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`>"+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andMessageTableSendYesOrNoLessThan(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no`<"+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`<"+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoLessThan(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no`<"+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`<"+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSendYesOrNoGreadterThanAndEquals(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no`>="+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`>="+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoGreadterThanAndEquals(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no`>="+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`>="+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSendYesOrNoLessThanAndEquals(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no`<="+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`<="+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoLessThanAndEquals(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no`<="+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no`<="+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSendYesOrNoLike(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no` like "+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no` like "+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoLike(Integer messageTableSendYesOrNo){
		if(messageTableSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no` like "+messageTableSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_send_yes_or_no` like "+messageTableSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableSendYesOrNoIsNull(){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no` is null";
			}else{
				condition123 += "`message_table_send_yes_or_no` is null";
			}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoIsNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_send_yes_or_no` is null";
		}else{
			condition123 += "`message_table_send_yes_or_no` is null";
		}
		return this;
	}
	public MessageTableCriteria andMessageTableSendYesOrNoIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `message_table_send_yes_or_no` is not null";
		}else{
			condition123 += "`message_table_send_yes_or_no` is not null";
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_send_yes_or_no` is not null";
		}else{
			condition123 += "`message_table_send_yes_or_no` is not null";
		}
		return this;
	}
	public MessageTableCriteria andMessageTableSendYesOrNoIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no` in("+value+") ";
			}else{
				condition123 += "`message_table_send_yes_or_no` in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no` in("+value+") ";
			}else{
				condition123 += "`message_table_send_yes_or_no` in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria andMessageTableSendYesOrNoNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_send_yes_or_no` not in("+value+") ";
			}else{
				condition123 += "`message_table_send_yes_or_no` not in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableSendYesOrNoNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_send_yes_or_no` not in("+value+") ";
			}else{
				condition123 += "`message_table_send_yes_or_no` not in("+value+") ";
			}
		}
		return this;
	}

	public MessageTableCriteria andMessageTableAppSendYesOrNoEquals(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no`="+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`="+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orMessageTableAppSendYesOrNoEquals(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no`="+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`="+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableAppSendYesOrNoNotEquals(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no`!="+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`!="+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoNotEquals(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no`!="+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`!="+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	/**
	 * 大于
	 * @param 
	 * @return
	 */
	public MessageTableCriteria andMessageTableAppSendYesOrNoGreaterThan(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no`>"+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`>"+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoGreaterThan(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no`>"+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`>"+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andMessageTableAppSendYesOrNoLessThan(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no`<"+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`<"+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoLessThan(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no`<"+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`<"+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableAppSendYesOrNoGreadterThanAndEquals(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no`>="+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`>="+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoGreadterThanAndEquals(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no`>="+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`>="+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableAppSendYesOrNoLessThanAndEquals(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no`<="+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`<="+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoLessThanAndEquals(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no`<="+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no`<="+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableAppSendYesOrNoLike(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no` like "+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no` like "+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoLike(Integer messageTableAppSendYesOrNo){
		if(messageTableAppSendYesOrNo!=null){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no` like "+messageTableAppSendYesOrNo+" ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no` like "+messageTableAppSendYesOrNo+" ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andMessageTableAppSendYesOrNoIsNull(){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no` is null";
			}else{
				condition123 += "`message_table_app_send_yes_or_no` is null";
			}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoIsNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_app_send_yes_or_no` is null";
		}else{
			condition123 += "`message_table_app_send_yes_or_no` is null";
		}
		return this;
	}
	public MessageTableCriteria andMessageTableAppSendYesOrNoIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `message_table_app_send_yes_or_no` is not null";
		}else{
			condition123 += "`message_table_app_send_yes_or_no` is not null";
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `message_table_app_send_yes_or_no` is not null";
		}else{
			condition123 += "`message_table_app_send_yes_or_no` is not null";
		}
		return this;
	}
	public MessageTableCriteria andMessageTableAppSendYesOrNoIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no` in("+value+") ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no` in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no` in("+value+") ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no` in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria andMessageTableAppSendYesOrNoNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `message_table_app_send_yes_or_no` not in("+value+") ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no` not in("+value+") ";
			}
		}
		return this;
	}
	public MessageTableCriteria orMessageTableAppSendYesOrNoNotIn(String value){
		if(value!=null && value.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `message_table_app_send_yes_or_no` not in("+value+") ";
			}else{
				condition123 += "`message_table_app_send_yes_or_no` not in("+value+") ";
			}
		}
		return this;
	}

	public MessageTableCriteria andStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orStatusEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`='"+status+"' ";
			}else{
				condition123 += "`status`='"+status+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andStatusNotEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`!='"+status+"' ";
			}else{
				condition123 += "`status`!='"+status+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orStatusNotEquals(String status){
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
	public MessageTableCriteria andStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orStatusGreaterThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>'"+status+"' ";
			}else{
				condition123 += "`status`>'"+status+"' ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orStatusLessThan(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<'"+status+"' ";
			}else{
				condition123 += "`status`<'"+status+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orStatusGreadterThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`>='"+status+"' ";
			}else{
				condition123 += "`status`>='"+status+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orStatusLessThanAndEquals(String status){
		if(status!=null&&status.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `status`<='"+status+"' ";
			}else{
				condition123 += "`status`<='"+status+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "and `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orStatusLike(String status){
		if(status!=null&&status.trim().length()>0&&!("%".equals(status.trim()))&&!("%%".equals(status.trim()))){
			if(condition123.length()>0){
				condition123 += "or `status` like '"+status+"' ";
			}else{
				condition123 += "`status` like '"+status+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andStatusIsNull(){
			if(condition123.length()>0){
				condition123 += "and `status` is null";
			}else{
				condition123 += "`status` is null";
			}
		return this;
	}
	public MessageTableCriteria orStatusIsNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is null";
		}else{
			condition123 += "`status` is null";
		}
		return this;
	}
	public MessageTableCriteria andStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	public MessageTableCriteria orStatusIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `status` is not null";
		}else{
			condition123 += "`status` is not null";
		}
		return this;
	}
	
	public MessageTableCriteria andStatusIn(String value){
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
	
	public MessageTableCriteria orStatusIn(String value){
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
	
	public MessageTableCriteria andStatusNotIn(String value){
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
	
	public MessageTableCriteria orStatusNotIn(String value){
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

	public MessageTableCriteria andCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria orCreateTimeEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`='"+createTime+"' ";
			}else{
				condition123 += "`create_time`='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andCreateTimeNotEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`!='"+createTime+"' ";
			}else{
				condition123 += "`create_time`!='"+createTime+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orCreateTimeNotEquals(String createTime){
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
	public MessageTableCriteria andCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orCreateTimeGreaterThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>'"+createTime+"' ";
			}else{
				condition123 += "`create_time`>'"+createTime+"' ";
			}
		}
		return this;
	}
	
	
	public MessageTableCriteria andCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orCreateTimeLessThan(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<'"+createTime+"' ";
			}else{
				condition123 += "`create_time`<'"+createTime+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orCreateTimeGreadterThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`>='"+createTime+"' ";
			}else{
				condition123 += "`create_time`>='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "and `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orCreateTimeLessThanAndEquals(String createTime){
		if(createTime!=null&&createTime.trim().length()>0){
			if(condition123.length()>0){
				condition123 += "or `create_time`<='"+createTime+"' ";
			}else{
				condition123 += "`create_time`<='"+createTime+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "and `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	public MessageTableCriteria orCreateTimeLike(String createTime){
		if(createTime!=null&&createTime.trim().length()>0&&!("%".equals(createTime.trim()))&&!("%%".equals(createTime.trim()))){
			if(condition123.length()>0){
				condition123 += "or `create_time` like '"+createTime+"' ";
			}else{
				condition123 += "`create_time` like '"+createTime+"' ";
			}
		}
		return this;
	}
	
	public MessageTableCriteria andCreateTimeIsNull(){
			if(condition123.length()>0){
				condition123 += "and `create_time` is null";
			}else{
				condition123 += "`create_time` is null";
			}
		return this;
	}
	public MessageTableCriteria orCreateTimeIsNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is null";
		}else{
			condition123 += "`create_time` is null";
		}
		return this;
	}
	public MessageTableCriteria andCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "and `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	public MessageTableCriteria orCreateTimeIsNotNull(){
		if(condition123.length()>0){
			condition123 += "or `create_time` is not null";
		}else{
			condition123 += "`create_time` is not null";
		}
		return this;
	}
	
	public MessageTableCriteria andCreateTimeIn(String value){
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
	
	public MessageTableCriteria orCreateTimeIn(String value){
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
	
	public MessageTableCriteria andCreateTimeNotIn(String value){
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
	
	public MessageTableCriteria orCreateTimeNotIn(String value){
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

	private void initMessageTable(MessageTable messageTable) {
		super.setMessageId(messageTable.getMessageId());
		super.setMessageTableSender(messageTable.getMessageTableSender());
		super.setMessageTableRecipient(messageTable.getMessageTableRecipient());
		super.setMessageTableContent(messageTable.getMessageTableContent());
		super.setMessageTableStatus(messageTable.getMessageTableStatus());
		super.setMessageTableSendYesOrNo(messageTable.getMessageTableSendYesOrNo());
		super.setMessageTableAppSendYesOrNo(messageTable.getMessageTableAppSendYesOrNo());
		super.setStatus(messageTable.getStatus());
		super.setCreateTime(messageTable.getCreateTime());

	}

}