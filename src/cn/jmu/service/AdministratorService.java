package cn.jmu.service;

import java.util.List;

import cn.jmu.po.Administrator;
import cn.jmu.po.Dormitory;
import cn.jmu.po.Fix;
import cn.jmu.po.Late;
import cn.jmu.po.Student;

public interface AdministratorService {
	//管理员账号验证
	public Administrator adCheck(String mno,String password);

	public List<Student> findStudentByDname(String dname);
	public Student findStudentBySno(String sno);
	public int updateStudent (Student student);
	public int insertStudent (Student student);
	public int deleteStudent (String sno);
	
	
	public List<Fix> findFixByDname(String dname);
	public Fix findFixByRid(String rid);
	public int updateFix (Fix fix);
	public int insertFix (Fix fix);
	public int deleteFix (String rid);
	
	public List<Late> findLateByDname(String dname);
	public Late findLateByLid(String lid);
	public int updateLate (Late late);
	public int insertLate (Late late);
	public int deleteLate (String lid);
	
	public List<Dormitory> findDormitoryByDname(String dname);
	public Dormitory findDormitoryByDid(String did);
	public int updateDormitory (Dormitory dormitory);
	public int insertDormitory (Dormitory dormitory);
	public int deleteDormitory (String did);
}
