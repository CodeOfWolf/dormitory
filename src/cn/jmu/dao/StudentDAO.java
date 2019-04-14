package cn.jmu.dao;

import cn.jmu.po.Student;

public interface StudentDAO {
	//查询学生信息
	public Student stuFindById(String sno);
}
