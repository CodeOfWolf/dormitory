package cn.jmu.service;

import cn.jmu.po.Administrator;

public interface AdministratorService {
	//管理员账号验证
	public Administrator adCheck(String mno,String password);
}
