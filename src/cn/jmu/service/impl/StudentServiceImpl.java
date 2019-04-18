package cn.jmu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jmu.dao.StudentDAO;
import cn.jmu.po.Dormitory;
import cn.jmu.po.Fix;
import cn.jmu.po.Late;
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
	
	public Student findStudentBySnoS(String sno){
		return studentDAO.findStudentBySnoS(sno);
	}
	public int updateStudentS (Student student){
		return studentDAO.updateStudentS(student);
	}
	
	
	
	
	public List<Fix> findFixByDidS(String did){
		return studentDAO.findFixByDidS(did);
	}
	public Fix findFixByRidS(String rid){
		return studentDAO.findFixByRidS(rid);
	}
	public int updateFixS (Fix fix){
		return studentDAO.updateFixS(fix);
	}
	public int insertFixS (Fix fix){
		return studentDAO.insertFixS(fix);
	}
	public int deleteFixS (String rid){
		return studentDAO.deleteFixS(rid);
	}
	
	
	
	public List<Late> findLateBySnoS(String sno){
		return studentDAO.findLateBySnoS(sno);
	}
	public Late findLateByLidS(String lid){
		return studentDAO.findLateByLidS(lid);
	}

	
	

	public Dormitory findDormitoryByDidS(String did){
		return studentDAO.findDormitoryByDidS(did);
	}
	public int updateDormitoryS (Dormitory dormitory){
		return studentDAO.updateDormitoryS(dormitory);
	}
}
