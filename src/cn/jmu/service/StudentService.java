package cn.jmu.service;

import java.util.List;

import cn.jmu.po.Dormitory;
import cn.jmu.po.Fix;
import cn.jmu.po.Late;
import cn.jmu.po.Student;

public interface StudentService {
	//学生登录验证
	public Student stuCheck(String sno,String password);
	
	
	public Student findStudentBySnoS(String sno);
	public int updateStudentS(Student student);
	
	public List<Fix> findFixByDidS(String did);
	public Fix findFixByRidS(String rid);
	public int updateFixS (Fix fix);
	public int insertFixS (Fix fix);
	public int deleteFixS (String rid);
	
	public List<Late> findLateBySnoS(String sno);
	public Late findLateByLidS(String lid);
	
	public Dormitory findDormitoryByDidS(String did);
	public int updateDormitoryS (Dormitory dormitory);
	
}
