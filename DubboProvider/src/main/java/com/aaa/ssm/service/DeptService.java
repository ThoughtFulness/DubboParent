package com.aaa.ssm.service;

import com.aaa.ssm.entity.Dept;

import java.util.List;
import java.util.Map;

/**
 * className:DeptService
 * discriptoin:员工服务接口
 * author:毛宇
 * createTime:2019-01-02 13:35
 */
public interface DeptService {

	/**
	 * 员工分页数据
	 * @param map
	 * @return
	 */
	List<Dept> getPage(Map map);
}



