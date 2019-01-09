package com.aaa.ssm.service;

import com.aaa.ssm.dao.DeptDao;
import com.aaa.ssm.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * className:DeptServiceImpl
 * discriptoin:
 * author:毛宇
 * createTime:2019-01-02 13:36
 */
@Service
public class DeptServiceImpl implements DeptService{


	@Autowired//依赖注入
	private DeptDao deptDao;

	/*@Autowired
	private JedisDao jedisDao;*/
	/*@Autowired
	private JedisClusterInterF jedisClusterInterF;*/

	@Override
	public List<Dept> getPage(Map map) {
		/*Object depts = jedisClusterInterF.getObject("deptList");
		if(depts!=null){
			System.out.println("缓存中存在，从缓存中取。。。。。");
			return ((List<Dept>) depts);
		}else{
			System.out.println("缓存中不存在，从数据库取，放入缓存。。。。。。。");
			List<Dept> page = deptDao.getPage(map);
			jedisClusterInterF.putObject("deptList",page);
			return page;
		}*/
		List<Dept> page = deptDao.getPage(map);
		return page;
	}




}
