package com.qkz5.oaattendance.dao;
			
import java.util.List;
import org.springframework.stereotype.Repository;
import com.qkz5.oaattendance.criteria.AttendanceFormCriteria;
import com.qkz5.oaattendance.entity.mojo.AttendanceFormAO;
import com.qkz5.oaattendance.entity.pojo.AttendanceForm;

@Repository
public interface IAttendanceFormDAO {
	
	/**
	 * 
	 * @param id
	 * @return 通过id查询实体对象
	 */
	public AttendanceFormAO selectById(Integer id);
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
	public List<AttendanceFormAO> selectByCriteria(AttendanceFormCriteria criteria);
	/**
	 * 通过对象添加实体，不能对视图操作
	 * @param attendanceForm
	 * @return
	 */
	public int addAttendanceForm(AttendanceForm attendanceForm);
	/**
	 * 通过实体id修改实体对象
	 * @param attendanceForm
	 * @return
	 */
	public int updateById(AttendanceForm attendanceForm);
	
	/**
	 * 通过修改标准来修改实体对象数据,需要赋值对象
	 * @param attendanceForm
	 * @return
	 */
	public int updateByCriteria(AttendanceFormCriteria criteria);
	/**
	 * 通过标准删除对象
	 * @param criteria
	 * @return
	 */
	public int deleteByCriteria(AttendanceFormCriteria criteria);
	/**
	 * 通过标准查询某个字段的最大值
	 * @param feid 需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidMaxByCriteria(AttendanceFormCriteria criteria);
	/**
	 * 通过标准查询某个字段的最小值
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidMinByCriteria(AttendanceFormCriteria criteria);
	/**
	 * 通过标准查询平均值  需要在Criteria对象中赋值feid
	 * @param feid
	 * @param criteria
	 * @return
	 */
	public int getFeidAvgByCriteria(AttendanceFormCriteria criteria);
	/**
	 * 通过标准查询出某个字段的总和
	 * @param feid  需要在Criteria对象中赋值feid
	 * @param criteria
	 * @return
	 */
	public int getFeidSumByCriteria(AttendanceFormCriteria criteria);
	/**
	 * 通过标准查询对应的数据总数
	 * @param criteria
	 * @return
	 */
	public int getFeidCountByCriteria(AttendanceFormCriteria criteria);
}