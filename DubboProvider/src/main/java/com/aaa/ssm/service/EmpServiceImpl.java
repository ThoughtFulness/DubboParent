package com.aaa.ssm.service;

import com.aaa.ssm.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discriptoin:雇员服务实现类
 * author:毛宇
 * createTime:2018-11-07 15:16:46
 */
@Service//交给spring管理
@Transactional//加上事务后，如果有异常 整个事务都会回滚
public class EmpServiceImpl implements EmpService {

	//依赖注入
	@Autowired
	private EmpDao empDao;


	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	@Override
	public List<Map> getPage(Map map) {
		//如果pageNo为空默认1 pageSize 为空 默认10
		int pageNo = map.get("pageNo") == null?1:Integer.valueOf(map.get("pageNo") + "");
		int pageSize = map.get("pageSize") == null?10:Integer.valueOf(map.get("pageSize") + "");
		map.put("start",(pageNo-1)*pageSize);
		map.put("end",pageNo*pageSize+1);
		return empDao.getPage(map);
	}

	/**
	 * 获取分页数量
	 * @param map
	 * @return
	 */
	@Override
	public int getPageCount(Map map) {

		return empDao.getPageCount(map);
	}

	//@Transactional(propagation = Propagation.NOT_SUPPORTED)也可以加载到方法头上 加类上面就不用加载到方法头上
	/**
	 * 新增
	 * @param map
	 * @return
	 */
	@Override
	public int AddEmp(Map map) {
	int add = empDao.AddEmp(map);
		//System.out.println(1/0);
		System.out.println("返回的主键"+map.get("empNo"));
		return empDao.AddEmp(map);
	}

	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@Override
	public int delete(Integer id) {
		return empDao.delete(id);
	}

	/**
	 * 通过ID查询员工信息
	 * @param empNo
	 * @return
	 */
	@Override
	public List<Map> getListEmp(Integer empNo) {
		return empDao.getListEmp(empNo);
	}

	/**
	 * 修改
	 * @param map
	 * @return
	 */
	@Override
	public int update(Map map) {
		return empDao.update(map);
	}
}
