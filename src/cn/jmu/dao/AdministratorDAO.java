package cn.jmu.dao;

import java.util.List;

import cn.jmu.po.Administrator;
import cn.jmu.po.Student;

public interface AdministratorDAO {
	//根据账号查询管理员信息
	public Administrator AdFindById(String mno);
	public List<Student> findStudentByDname(String dname);
}
