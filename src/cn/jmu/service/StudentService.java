package cn.jmu.service;

import cn.jmu.po.Student;

public interface StudentService {
	//学生登录验证
	public Student stuCheck(String sno,String password);
	
}
