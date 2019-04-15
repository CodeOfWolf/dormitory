package cn.jmu.dao;

import cn.jmu.po.Administrator;

public interface AdministratorDAO {
	//根据账号查询管理员信息
	public Administrator AdFindById(String mno);
}
