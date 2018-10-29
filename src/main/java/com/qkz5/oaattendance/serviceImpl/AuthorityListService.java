package com.qkz5.oaattendance.serviceImpl;
			
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slkj.autocode.entity.ServiceResult;
import com.qkz5.oaattendance.criteria.AuthorityListCriteria;
import com.qkz5.oaattendance.dao.IAuthorityListDAO;
import com.qkz5.oaattendance.entity.mojo.AuthorityListAO;
import com.qkz5.oaattendance.entity.pojo.AuthorityList;
import com.qkz5.oaattendance.service.IAuthorityListService;

@Service
public class AuthorityListService implements IAuthorityListService{
	@Autowired
	IAuthorityListDAO authorityListDAO;
	
	@Override
	public ServiceResult<AuthorityListAO> selectById(Integer id) {
		AuthorityListAO authorityListAO = authorityListDAO.selectById(id);
		ServiceResult<AuthorityListAO> serviceResult = new ServiceResult<AuthorityListAO>();
		if(authorityListAO!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过id查询对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(authorityListAO);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过id未能查询到对象数据");
			serviceResult.setSucceed(false);
			serviceResult.setData(authorityListAO);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<Integer> deleteById(Integer id) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.deleteById(id);
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
	public ServiceResult<List<AuthorityListAO>> selectByCriteria(AuthorityListCriteria criteria) {
		ServiceResult<List<AuthorityListAO>> serviceResult = new ServiceResult<List<AuthorityListAO>>();
		List<AuthorityListAO> resultList = authorityListDAO.selectByCriteria(criteria);
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
	public ServiceResult<Integer> addAuthorityList(AuthorityList authorityList) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.addAuthorityList(authorityList);
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
	public ServiceResult<Integer> updateById(AuthorityList authorityList) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.updateById(authorityList);
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
	public ServiceResult<Integer> updateByCriteria(AuthorityListCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		if(criteria.getAuthorityList()==null){
			serviceResult.setCode(10010);
			serviceResult.setMsg("通过标准修改对象时没有放入需要修改的数据对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(null);
			return serviceResult;
		}
		Integer result = authorityListDAO.updateByCriteria(criteria);
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
	public ServiceResult<Integer> deleteByCriteria(AuthorityListCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.deleteByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidMaxByCriteria(AuthorityListCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.getFeidMaxByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidMinByCriteria(AuthorityListCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.getFeidMinByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidAvgByCriteria(AuthorityListCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.getFeidAvgByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidSumByCriteria(AuthorityListCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.getFeidSumByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidCountByCriteria(AuthorityListCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = authorityListDAO.getFeidCountByCriteria(criteria);
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