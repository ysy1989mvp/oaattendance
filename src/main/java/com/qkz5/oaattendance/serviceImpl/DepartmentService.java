package com.qkz5.oaattendance.serviceImpl;
			
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slkj.autocode.entity.ServiceResult;
import com.qkz5.oaattendance.criteria.DepartmentCriteria;
import com.qkz5.oaattendance.dao.IDepartmentDAO;
import com.qkz5.oaattendance.entity.mojo.DepartmentAO;
import com.qkz5.oaattendance.entity.pojo.Department;
import com.qkz5.oaattendance.service.IDepartmentService;

@Service
public class DepartmentService implements IDepartmentService{
	@Autowired
	IDepartmentDAO departmentDAO;
	
	@Override
	public ServiceResult<DepartmentAO> selectById(Integer id) {
		DepartmentAO departmentAO = departmentDAO.selectById(id);
		ServiceResult<DepartmentAO> serviceResult = new ServiceResult<DepartmentAO>();
		if(departmentAO!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过id查询对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(departmentAO);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过id未能查询到对象数据");
			serviceResult.setSucceed(false);
			serviceResult.setData(departmentAO);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<Integer> deleteById(Integer id) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.deleteById(id);
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
	public ServiceResult<List<DepartmentAO>> selectByCriteria(DepartmentCriteria criteria) {
		ServiceResult<List<DepartmentAO>> serviceResult = new ServiceResult<List<DepartmentAO>>();
		List<DepartmentAO> resultList = departmentDAO.selectByCriteria(criteria);
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
	public ServiceResult<Integer> addDepartment(Department department) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.addDepartment(department);
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
	public ServiceResult<Integer> updateById(Department department) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.updateById(department);
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
	public ServiceResult<Integer> updateByCriteria(DepartmentCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		if(criteria.getDepartment()==null){
			serviceResult.setCode(10010);
			serviceResult.setMsg("通过标准修改对象时没有放入需要修改的数据对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(null);
			return serviceResult;
		}
		Integer result = departmentDAO.updateByCriteria(criteria);
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
	public ServiceResult<Integer> deleteByCriteria(DepartmentCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.deleteByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidMaxByCriteria(DepartmentCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.getFeidMaxByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidMinByCriteria(DepartmentCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.getFeidMinByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidAvgByCriteria(DepartmentCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.getFeidAvgByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidSumByCriteria(DepartmentCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.getFeidSumByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidCountByCriteria(DepartmentCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = departmentDAO.getFeidCountByCriteria(criteria);
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