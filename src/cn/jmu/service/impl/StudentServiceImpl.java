package cn.jmu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jmu.dao.StudentDAO;
import cn.jmu.po.Student;
import cn.jmu.service.StudentService;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO studentDAO;
	public Student stuCheck(String sno,String password){
		Student stu=studentDAO.stuFindById(sno);
		if(stu!=null && password.equals(stu.getPassword())){
			return stu;
		}else{
			return null;
		}
	}
}
