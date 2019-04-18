package cn.jmu.dao;

import java.util.List;

import cn.jmu.po.Dormitory;
import cn.jmu.po.Fix;
import cn.jmu.po.Late;
import cn.jmu.po.Student;

public interface StudentDAO {
	//根据学号查询学生信息
	public Student stuFindById(String sno);
	
	
	
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
