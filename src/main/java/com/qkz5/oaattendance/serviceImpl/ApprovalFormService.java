package com.qkz5.oaattendance.serviceImpl;
			
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slkj.autocode.entity.ServiceResult;
import com.qkz5.oaattendance.criteria.ApprovalFormCriteria;
import com.qkz5.oaattendance.dao.IApprovalFormDAO;
import com.qkz5.oaattendance.entity.mojo.ApprovalFormAO;
import com.qkz5.oaattendance.entity.pojo.ApprovalForm;
import com.qkz5.oaattendance.service.IApprovalFormService;

@Service
public class ApprovalFormService implements IApprovalFormService{
	@Autowired
	IApprovalFormDAO approvalFormDAO;
	
	@Override
	public ServiceResult<ApprovalFormAO> selectById(Integer id) {
		ApprovalFormAO approvalFormAO = approvalFormDAO.selectById(id);
		ServiceResult<ApprovalFormAO> serviceResult = new ServiceResult<ApprovalFormAO>();
		if(approvalFormAO!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过id查询对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(approvalFormAO);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过id未能查询到对象数据");
			serviceResult.setSucceed(false);
			serviceResult.setData(approvalFormAO);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<Integer> deleteById(Integer id) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.deleteById(id);
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
	public ServiceResult<List<ApprovalFormAO>> selectByCriteria(ApprovalFormCriteria criteria) {
		ServiceResult<List<ApprovalFormAO>> serviceResult = new ServiceResult<List<ApprovalFormAO>>();
		List<ApprovalFormAO> resultList = approvalFormDAO.selectByCriteria(criteria);
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
	public ServiceResult<Integer> addApprovalForm(ApprovalForm approvalForm) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.addApprovalForm(approvalForm);
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
	public ServiceResult<Integer> updateById(ApprovalForm approvalForm) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.updateById(approvalForm);
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
	public ServiceResult<Integer> updateByCriteria(ApprovalFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		if(criteria.getApprovalForm()==null){
			serviceResult.setCode(10010);
			serviceResult.setMsg("通过标准修改对象时没有放入需要修改的数据对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(null);
			return serviceResult;
		}
		Integer result = approvalFormDAO.updateByCriteria(criteria);
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
	public ServiceResult<Integer> deleteByCriteria(ApprovalFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.deleteByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidMaxByCriteria(ApprovalFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.getFeidMaxByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidMinByCriteria(ApprovalFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.getFeidMinByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidAvgByCriteria(ApprovalFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.getFeidAvgByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidSumByCriteria(ApprovalFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.getFeidSumByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidCountByCriteria(ApprovalFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = approvalFormDAO.getFeidCountByCriteria(criteria);
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