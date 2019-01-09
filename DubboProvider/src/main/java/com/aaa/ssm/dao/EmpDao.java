package com.aaa.ssm.dao;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discriptoin:雇员持久层
 * author:毛宇
 * createTime:2018-11-07 15:01:33
 */
public interface EmpDao {

	/**
	 *雇员列表
	 * @param map
	 * @return
	 */
	List<Map> getPage(Map map);

	/**
	 * 分页总数量
	 * @param map
	 * @return
	 */
	int getPageCount(Map map);

	/**
	 * 新增员工
	 * @param map
	 * @return
	 */
	int AddEmp(Map map);

	/**
	 * 删除员工
	 * @param id
	 * @return
	 */
	int delete(Integer id);

	/**
	 * 通过ID查询员工信息
	 * @return
	 */
	List<Map> getListEmp(Integer empNo);

	/**
	 * 修改员工
	 * @param map
	 * @return
	 */
	int update(Map map);
}
