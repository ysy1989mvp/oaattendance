package com.qkz5.oaattendance.dao;
			
import java.util.List;
import org.springframework.stereotype.Repository;
import com.qkz5.oaattendance.criteria.AuthorityListCriteria;
import com.qkz5.oaattendance.entity.mojo.AuthorityListAO;
import com.qkz5.oaattendance.entity.pojo.AuthorityList;

@Repository
public interface IAuthorityListDAO {
	
	/**
	 * 
	 * @param id
	 * @return 通过id查询实体对象
	 */
	public AuthorityListAO selectById(Integer id);
	/**
	 * 
	 * @param id
	 * @return 通过id删除实体对象
	 * 如果操作对象是视图则不能直接删除
	 */
	public int deleteById(Integer id);
	/**
	 * 通过查询标准查询实体集合
	 * @param criteria
	 * @return 
	 */
	public List<AuthorityListAO> selectByCriteria(AuthorityListCriteria criteria);
	/**
	 * 通过对象添加实体，不能对视图操作
	 * @param authorityList
	 * @return
	 */
	public int addAuthorityList(AuthorityList authorityList);
	/**
	 * 通过实体id修改实体对象
	 * @param authorityList
	 * @return
	 */
	public int updateById(AuthorityList authorityList);
	
	/**
	 * 通过修改标准来修改实体对象数据,需要赋值对象
	 * @param authorityList
	 * @return
	 */
	public int updateByCriteria(AuthorityListCriteria criteria);
	/**
	 * 通过标准删除对象
	 * @param criteria
	 * @return
	 */
	public int deleteByCriteria(AuthorityListCriteria criteria);
	/**
	 * 通过标准查询某个字段的最大值
	 * @param feid 需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidMaxByCriteria(AuthorityListCriteria criteria);
	/**
	 * 通过标准查询某个字段的最小值
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidMinByCriteria(AuthorityListCriteria criteria);
	/**
	 * 通过标准查询平均值  需要在Criteria对象中赋值feid
	 * @param feid
	 * @param criteria
	 * @return
	 */
	public int getFeidAvgByCriteria(AuthorityListCriteria criteria);
	/**
	 * 通过标准查询出某个字段的总和
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidSumByCriteria(AuthorityListCriteria criteria);
	/**
	 * 通过标准查询对应的数据总数
	 * @param criteria
	 * @return
	 */
	public int getFeidCountByCriteria(AuthorityListCriteria criteria);
}