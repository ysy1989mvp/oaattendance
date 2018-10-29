package com.qkz5.oaattendance.serviceImpl;
			
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slkj.autocode.entity.ServiceResult;
import com.qkz5.oaattendance.criteria.AttendanceFormCriteria;
import com.qkz5.oaattendance.dao.IAttendanceFormDAO;
import com.qkz5.oaattendance.entity.mojo.AttendanceFormAO;
import com.qkz5.oaattendance.entity.pojo.AttendanceForm;
import com.qkz5.oaattendance.service.IAttendanceFormService;

@Service
public class AttendanceFormService implements IAttendanceFormService{
	@Autowired
	IAttendanceFormDAO attendanceFormDAO;
	
	@Override
	public ServiceResult<AttendanceFormAO> selectById(Integer id) {
		AttendanceFormAO attendanceFormAO = attendanceFormDAO.selectById(id);
		ServiceResult<AttendanceFormAO> serviceResult = new ServiceResult<AttendanceFormAO>();
		if(attendanceFormAO!=null){
			serviceResult.setCode(200);
			serviceResult.setMsg("通过id查询对象正常");
			serviceResult.setSucceed(true);
			serviceResult.setData(attendanceFormAO);
		}else{
			serviceResult.setCode(500);
			serviceResult.setMsg("通过id未能查询到对象数据");
			serviceResult.setSucceed(false);
			serviceResult.setData(attendanceFormAO);
		}
		return serviceResult;
	}
	
	@Override
	public ServiceResult<Integer> deleteById(Integer id) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.deleteById(id);
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
	public ServiceResult<List<AttendanceFormAO>> selectByCriteria(AttendanceFormCriteria criteria) {
		ServiceResult<List<AttendanceFormAO>> serviceResult = new ServiceResult<List<AttendanceFormAO>>();
		List<AttendanceFormAO> resultList = attendanceFormDAO.selectByCriteria(criteria);
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
	public ServiceResult<Integer> addAttendanceForm(AttendanceForm attendanceForm) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.addAttendanceForm(attendanceForm);
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
	public ServiceResult<Integer> updateById(AttendanceForm attendanceForm) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.updateById(attendanceForm);
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
	public ServiceResult<Integer> updateByCriteria(AttendanceFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		if(criteria.getAttendanceForm()==null){
			serviceResult.setCode(10010);
			serviceResult.setMsg("通过标准修改对象时没有放入需要修改的数据对象");
			serviceResult.setSucceed(false);
			serviceResult.setData(null);
			return serviceResult;
		}
		Integer result = attendanceFormDAO.updateByCriteria(criteria);
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
	public ServiceResult<Integer> deleteByCriteria(AttendanceFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.deleteByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidMaxByCriteria(AttendanceFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.getFeidMaxByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidMinByCriteria(AttendanceFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.getFeidMinByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidAvgByCriteria(AttendanceFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.getFeidAvgByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidSumByCriteria(AttendanceFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.getFeidSumByCriteria(criteria);
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
	public ServiceResult<Integer> getFeidCountByCriteria(AttendanceFormCriteria criteria) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Integer result = attendanceFormDAO.getFeidCountByCriteria(criteria);
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