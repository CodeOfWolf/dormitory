package cn.jmu.dao;

import cn.jmu.po.Student;

public interface StudentDAO {
	//根据学号查询学生信息
	public Student stuFindById(String sno);
}
