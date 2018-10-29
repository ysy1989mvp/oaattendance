package com.slkj.autocode.serviceImpl;

import java.util.List;

import com.slkj.autocode.entity.ServiceResult;
import com.slkj.autocode.service.IBaseAOService;
import com.slkj.autocode.util.AutoCodeClassUtil;

public abstract class BaseAOService<T,C> implements IBaseAOService<T,C>{

	@Override
	public ServiceResult<Integer> save(Object t) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Object object = getObjectDAO();
		int result = (int) AutoCodeClassUtil.invokeMethod(object, "save",t);
		if(result>0){
			serviceResult.setSucceed(true);
			serviceResult.setCode(200);
			serviceResult.setData(result);
			serviceResult.setMsg("添加"+object.getClass().getName()+"对象成功！");
		}else{
			serviceResult.setSucceed(false);
			serviceResult.setCode(500);
			serviceResult.setData(result);
			serviceResult.setMsg("添加"+object.getClass().getName()+"对象失败！");
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<Integer> updateById(Object t) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Object object = getObjectDAO();
		int result = (int) AutoCodeClassUtil.invokeMethod(object, "updateById",t);
		if(result>0){
			serviceResult.setSucceed(true);
			serviceResult.setCode(200);
			serviceResult.setData(result);
			serviceResult.setMsg("修改"+object.getClass().getName()+"对象成功！");
		}else{
			serviceResult.setSucceed(false);
			serviceResult.setCode(500);
			serviceResult.setData(result);
			serviceResult.setMsg("修改"+object.getClass().getName()+"对象失败！");
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<Integer> deleteById(Integer id) {
		ServiceResult<Integer> serviceResult = new ServiceResult<Integer>();
		Object object = getObjectDAO();
		int result = (int) AutoCodeClassUtil.invokeMethod(object, "deleteById",id);
		if(result>0){
			serviceResult.setSucceed(true);
			serviceResult.setCode(200);
			serviceResult.setData(result);
			serviceResult.setMsg("删除"+object.getClass().getName()+"对象成功！");
		}else{
			serviceResult.setSucceed(false);
			serviceResult.setCode(500);
			serviceResult.setData(result);
			serviceResult.setMsg("删除"+object.getClass().getName()+"对象失败！");
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<T> selectById(Integer id) {
		ServiceResult<T> serviceResult = new ServiceResult<T>();
		Object object = getObjectDAO();
		@SuppressWarnings("unchecked")
		T result = (T) AutoCodeClassUtil.invokeMethod(object, "selectById",id);
		if(result!=null){
			serviceResult.setSucceed(true);
			serviceResult.setCode(200);
			serviceResult.setData(result);
			serviceResult.setMsg("查询"+object.getClass().getName()+"对象成功！");
		}else{
			serviceResult.setSucceed(false);
			serviceResult.setCode(500);
			serviceResult.setData(result);
			serviceResult.setMsg("查询"+object.getClass().getName()+"对象失败！");
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<List<T>> selectByCriteria(Object criteria) {
		ServiceResult<List<T>> serviceResult = new ServiceResult<List<T>>();
		Object object = getObjectDAO();
		List<T> result = (List<T>) AutoCodeClassUtil.invokeMethod(object, "selectByCriteria",criteria);
		if(result!=null){
			serviceResult.setSucceed(true);
			serviceResult.setCode(200);
			serviceResult.setData(result);
			serviceResult.setMsg("查询"+object.getClass().getName()+"对象成功！");
		}else{
			serviceResult.setSucceed(false);
			serviceResult.setCode(500);
			serviceResult.setData(result);
			serviceResult.setMsg("查询"+object.getClass().getName()+"对象失败！");
		}
		return serviceResult;
	}

	@Override
	public ServiceResult<List<T>> selectAll() {
		ServiceResult<List<T>> serviceResult = new ServiceResult<List<T>>();
		Object object = getObjectDAO();
		List<T> result = (List<T>) AutoCodeClassUtil.invokeMethod(object, "selectAll",null);
		if(result!=null){
			serviceResult.setSucceed(true);
			serviceResult.setCode(200);
			serviceResult.setData(result);
			serviceResult.setMsg("查询"+object.getClass().getName()+"对象成功！");
		}else{
			serviceResult.setSucceed(false);
			serviceResult.setCode(500);
			serviceResult.setData(result);
			serviceResult.setMsg("查询"+object.getClass().getName()+"对象失败！");
		}
		return serviceResult;
	}
	
	public abstract Object getObjectDAO();
	
}
