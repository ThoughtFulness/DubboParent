package com.aaa.ssm.dao;

import com.aaa.ssm.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * className:DeptDao
 * discriptoin:
 * author:毛宇
 * createTime:2019-01-02 13:32
 */
public interface DeptDao {

	/**
	 * 员工列表
	 * @return
	 */
	List<Dept> getPage(Map map);

}

