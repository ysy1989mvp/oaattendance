package com.slkj.autocode.service;

import java.util.List;

import com.slkj.autocode.entity.ServiceResult;

public interface IBaseAOService <T,C>{
		//添加
			public ServiceResult<Integer> save(Object t);
		//修改
			public ServiceResult<Integer> updateById(Object t);
		//删除
//			通过id删除
			public ServiceResult<Integer> deleteById(Integer id);
		//查询
//			通过id查询
			public ServiceResult<T> selectById(Integer id);
//			通过条件（标准）查询
			public ServiceResult<List<T>> selectByCriteria(Object criteria);
//			查询所有的数据
			public ServiceResult<List<T>> selectAll();
}
