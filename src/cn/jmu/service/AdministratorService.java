package cn.jmu.service;

import java.util.List;

import cn.jmu.po.Administrator;
import cn.jmu.po.Student;

public interface AdministratorService {
	//����Ա�˺���֤
	public Administrator adCheck(String mno,String password);

	public List<Student> findStudentByDname(String dname);
}
