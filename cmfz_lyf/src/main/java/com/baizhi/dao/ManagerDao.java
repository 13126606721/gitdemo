package com.baizhi.dao;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.Manager;

public interface ManagerDao extends Statement<Manager>{
	public Manager selectOne(@Param("managerName") String managerName, @Param("managerPassword") String managerPassword);
	public Manager updateBySelectOne(Integer ManagerId);
}
