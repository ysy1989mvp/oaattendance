package com.qkz5.oaattendance.dao;
			
import java.util.List;
import org.springframework.stereotype.Repository;
import com.qkz5.oaattendance.criteria.ApprovalFormCriteria;
import com.qkz5.oaattendance.entity.mojo.ApprovalFormAO;
import com.qkz5.oaattendance.entity.pojo.ApprovalForm;

@Repository
public interface IApprovalFormDAO {
	
	/**
	 * 
	 * @param id
	 * @return 通过id查询实体对象
	 */
	public ApprovalFormAO selectById(Integer id);
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
	public List<ApprovalFormAO> selectByCriteria(ApprovalFormCriteria criteria);
	/**
	 * 通过对象添加实体，不能对视图操作
	 * @param approvalForm
	 * @return
	 */
	public int addApprovalForm(ApprovalForm approvalForm);
	/**
	 * 通过实体id修改实体对象
	 * @param approvalForm
	 * @return
	 */
	public int updateById(ApprovalForm approvalForm);
	
	/**
	 * 通过修改标准来修改实体对象数据,需要赋值对象
	 * @param approvalForm
	 * @return
	 */
	public int updateByCriteria(ApprovalFormCriteria criteria);
	/**
	 * 通过标准删除对象
	 * @param criteria
	 * @return
	 */
	public int deleteByCriteria(ApprovalFormCriteria criteria);
	/**
	 * 通过标准查询某个字段的最大值
	 * @param feid 需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidMaxByCriteria(ApprovalFormCriteria criteria);
	/**
	 * 通过标准查询某个字段的最小值
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidMinByCriteria(ApprovalFormCriteria criteria);
	/**
	 * 通过标准查询平均值  需要在Criteria对象中赋值feid
	 * @param feid
	 * @param criteria
	 * @return
	 */
	public int getFeidAvgByCriteria(ApprovalFormCriteria criteria);
	/**
	 * 通过标准查询出某个字段的总和
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidSumByCriteria(ApprovalFormCriteria criteria);
	/**
	 * 通过标准查询对应的数据总数
	 * @param criteria
	 * @return
	 */
	public int getFeidCountByCriteria(ApprovalFormCriteria criteria);
}