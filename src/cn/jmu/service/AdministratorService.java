package cn.jmu.service;

import java.util.List;

import cn.jmu.po.Administrator;
import cn.jmu.po.Student;

public interface AdministratorService {
	//����Ա�˺���֤
	public Administrator adCheck(String mno,String password);

	public List<Student> findStudentByDname(String dname);
	public Student findStudentBySno(String sno);
	public int updateStudent (Student student);
	public int insertStudent (Student student);
	public int deleteStudent (String sno);
}
