package com.qkz5.oaattendance.dao;
			
import java.util.List;
import org.springframework.stereotype.Repository;
import com.qkz5.oaattendance.criteria.EmployeeBasicInformationCriteria;
import com.qkz5.oaattendance.entity.mojo.EmployeeBasicInformationAO;
import com.qkz5.oaattendance.entity.pojo.EmployeeBasicInformation;

@Repository
public interface IEmployeeBasicInformationDAO {
	
	/**
	 * 
	 * @param id
	 * @return 通过id查询实体对象
	 */
	public EmployeeBasicInformationAO selectById(Integer id);
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
	public List<EmployeeBasicInformationAO> selectByCriteria(EmployeeBasicInformationCriteria criteria);
	/**
	 * 通过对象添加实体，不能对视图操作
	 * @param employeeBasicInformation
	 * @return
	 */
	public int addEmployeeBasicInformation(EmployeeBasicInformation employeeBasicInformation);
	/**
	 * 通过实体id修改实体对象
	 * @param employeeBasicInformation
	 * @return
	 */
	public int updateById(EmployeeBasicInformation employeeBasicInformation);
	
	/**
	 * 通过修改标准来修改实体对象数据,需要赋值对象
	 * @param employeeBasicInformation
	 * @return
	 */
	public int updateByCriteria(EmployeeBasicInformationCriteria criteria);
	/**
	 * 通过标准删除对象
	 * @param criteria
	 * @return
	 */
	public int deleteByCriteria(EmployeeBasicInformationCriteria criteria);
	/**
	 * 通过标准查询某个字段的最大值
	 * @param feid 需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidMaxByCriteria(EmployeeBasicInformationCriteria criteria);
	/**
	 * 通过标准查询某个字段的最小值
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidMinByCriteria(EmployeeBasicInformationCriteria criteria);
	/**
	 * 通过标准查询平均值  需要在Criteria对象中赋值feid
	 * @param feid
	 * @param criteria
	 * @return
	 */
	public int getFeidAvgByCriteria(EmployeeBasicInformationCriteria criteria);
	/**
	 * 通过标准查询出某个字段的总和
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidSumByCriteria(EmployeeBasicInformationCriteria criteria);
	/**
	 * 通过标准查询对应的数据总数
	 * @param criteria
	 * @return
	 */
	public int getFeidCountByCriteria(EmployeeBasicInformationCriteria criteria);
}