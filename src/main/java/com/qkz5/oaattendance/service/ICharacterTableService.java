package com.qkz5.oaattendance.service;
			
import java.util.List;
import com.slkj.autocode.entity.ServiceResult;
import com.qkz5.oaattendance.criteria.CharacterTableCriteria;
import com.qkz5.oaattendance.entity.pojo.CharacterTable;
import com.qkz5.oaattendance.entity.mojo.CharacterTableAO;

public interface ICharacterTableService {
	/**
	 * 
	 * @param id
	 * @return 通过id查询实体对象
	 */
	public ServiceResult<CharacterTableAO> selectById(Integer id);
	/**
	 * 
	 * @param id
	 * @return 通过id删除实体对象
	 * 如果操作对象是视图则不能直接删除
	 */
	public ServiceResult<Integer> deleteById(Integer id);
	/**
	 * 通过查询标准查询实体集合
	 * @param criteria
	 * @return 
	 */
	public ServiceResult<List<CharacterTableAO>> selectByCriteria(CharacterTableCriteria criteria);
	/**
	 * 通过对象添加实体，不能对视图操作
	 * @param merchantUser
	 * @return
	 */
	public ServiceResult<Integer> addCharacterTable(CharacterTable merchantUser);
	/**
	 * 通过实体id修改实体对象
	 * @param merchantUser
	 * @return
	 */
	public ServiceResult<Integer> updateById(CharacterTable merchantUser);
	
	/**
	 * 通过修改标准来修改实体对象数据
	 * @param merchantUser
	 * @return
	 */
	public ServiceResult<Integer> updateByCriteria(CharacterTableCriteria criteria);
	
	/**
	 * 通过标准删除对象
	 * @param criteria
	 * @return
	 */
	public ServiceResult<Integer> deleteByCriteria(CharacterTableCriteria criteria);
	/**
	 * 通过标准查询某个字段的最大值
	 * @param feid 需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public ServiceResult<Integer> getFeidMaxByCriteria(CharacterTableCriteria criteria);
	/**
	 * 通过标准查询某个字段的最小值
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public ServiceResult<Integer> getFeidMinByCriteria(CharacterTableCriteria criteria);
	/**
	 * 通过标准查询平均值  需要在Criteria对象中赋值feid
	 * @param feid
	 * @param criteria
	 * @return
	 */
	public ServiceResult<Integer> getFeidAvgByCriteria(CharacterTableCriteria criteria);
	/**
	 * 通过标准查询出某个字段的总和
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public ServiceResult<Integer> getFeidSumByCriteria(CharacterTableCriteria criteria);
	/**
	 * 通过标准查询对应的数据总数
	 * @param criteria
	 * @return
	 */
	public ServiceResult<Integer> getFeidCountByCriteria(CharacterTableCriteria criteria);
}