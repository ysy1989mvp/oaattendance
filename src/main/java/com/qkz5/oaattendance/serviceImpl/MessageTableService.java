package com.qkz5.oaattendance.serviceImpl;
			
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slkj.autocode.entity.ServiceResult;
import com.qkz5.oaattendance.criteria.MessageTableCriteria;
import com.qkz5.oaattendance.dao.IMessageTableDAO;
import com.qkz5.oaattendance.entity.mojo.MessageTableAO;
import com.qkz5.oaattendance.entity.pojo.MessageTable;
import com.qkz5.oaattendance.service.IMessageTableService;

@Service
public class MessageTableService implements IMessageTableService{
	@Autowired
	IMessageTableDAO messageTableDAO;
	
	@Override
	public ServiceResult<MessageTableAO> selectById(Integer id) {
		MessageTableAO messageTableAO = messageTableDAO.selectById(id);
		ServiceResult<MessageTableAO> serviceResult = new ServiceResult<MessageTableAO>();
		if(messageTableAO!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过id查询对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(messageTableAO);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过id未能查询到对象数据");
			serviceResult.setSucceed(false);
			serviceResult.setData(messageTableAO);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<Integer> deleteById(Integer id) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.deleteById(id);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过id删除对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过id未删除对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<List<MessageTableAO>> selectByCriteria(MessageTableCriteria criteria) {
		ServiceResult<List<MessageTableAO>> serviceResult = new ServiceResult<List<MessageTableAO>>();
		List<MessageTableAO> resultList = messageTableDAO.selectByCriteria(criteria);
		if(resultList!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过标准已查询到对象");
			serviceResult.setSucceed(true);
			serviceResult.setData(resultList);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过标准未能查询到对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(resultList);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<Integer> addMessageTable(MessageTable messageTable) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.addMessageTable(messageTable);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("添加对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("未能正常添加对象对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<Integer> updateById(MessageTable messageTable) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.updateById(messageTable);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过id修改对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过id未能修改对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<Integer> updateByCriteria(MessageTableCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		if(criteria.getMessageTable()==null){
			serviceResult.setCode(10010);
			serviceResult.setMsg("通过标准修改对象时没有放入需要修改的数据对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(null);
			return serviceResult;
		}
		Integer result = messageTableDAO.updateByCriteria(criteria);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过标准修改对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过标准修改对象不成功");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}
	@Override
	public ServiceResult<Integer> deleteByCriteria(MessageTableCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.deleteByCriteria(criteria);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过条件删除数据完成");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过条件未能删除数据");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<Integer> getFeidMaxByCriteria(MessageTableCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.getFeidMaxByCriteria(criteria);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过条件查询某个字段的最大值成功");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过条件查询某个字段的最大值失败");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<Integer> getFeidMinByCriteria(MessageTableCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.getFeidMinByCriteria(criteria);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过条件查询某个字段的最小值成功");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过条件查询某个字段的最小值失败");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<Integer> getFeidAvgByCriteria(MessageTableCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.getFeidAvgByCriteria(criteria);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过条件查询某个字段的平均值成功");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过条件查询某个字段的平均值失败");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<Integer> getFeidSumByCriteria(MessageTableCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.getFeidSumByCriteria(criteria);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过条件查询某个字段的总合值成功");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过条件查询某个字段的总合值失败");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<Integer> getFeidCountByCriteria(MessageTableCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = messageTableDAO.getFeidCountByCriteria(criteria);
		if(result!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过条件查询某个字段的总条数成功");
			serviceResult.setSucceed(true);
			serviceResult.setData(result);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过条件查询某个字段的总总条数失败");
			serviceResult.setSucceed(false);
			serviceResult.setData(result);
		}
		return serviceResult;
	}
}