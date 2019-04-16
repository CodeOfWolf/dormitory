package cn.jmu.dao;

import java.util.List;

import cn.jmu.po.Administrator;
import cn.jmu.po.Student;

public interface AdministratorDAO {
	//�����˺Ų�ѯ����Ա��Ϣ
	public Administrator AdFindById(String mno);
	public List<Student> findStudentByDname(String dname);
	public Student findStudentBySno(String sno);
	public int updateStudent (Student student);
	public int insertStudent (Student student);
	public int deleteStudent (String sno);
}
