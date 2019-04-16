package cn.jmu.service;

import java.util.List;

import cn.jmu.po.Administrator;
import cn.jmu.po.Student;

public interface AdministratorService {
	//管理员账号验证
	public Administrator adCheck(String mno,String password);

	public List<Student> findStudentByDname(String dname);
}
