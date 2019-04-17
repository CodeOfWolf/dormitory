package cn.jmu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jmu.dao.AdministratorDAO;
import cn.jmu.po.Administrator;
import cn.jmu.po.Dormitory;
import cn.jmu.po.Fix;
import cn.jmu.po.Late;
import cn.jmu.po.Student;
import cn.jmu.service.AdministratorService;

@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService{
	@Autowired
	private AdministratorDAO administratorDAO;
	public Administrator adCheck(String mno,String password){
		Administrator ad=administratorDAO.AdFindById(mno);
		if(ad!=null && password.equals(ad.getPassword())){
			return ad;
		}else{
			return null;
		}
		
	}
	
	public List<Student> findStudentByDname(String dname){
		return administratorDAO.findStudentByDname(dname);
	}
	public Student findStudentBySno(String sno){
		return administratorDAO.findStudentBySno(sno);
	}
	public int updateStudent (Student student){
		return administratorDAO.updateStudent(student);
	}
	public int insertStudent (Student student){
		return administratorDAO.insertStudent(student);
	}
	public int deleteStudent (String sno){
		return administratorDAO.deleteStudent(sno);
	}
	
	
	
	
	public List<Fix> findFixByDname(String dname){
		return administratorDAO.findFixByDname(dname);
	}
	public Fix findFixByRid(String rid){
		return administratorDAO.findFixByRid(rid);
	}
	public int updateFix (Fix fix){
		return administratorDAO.updateFix(fix);
	}
	public int insertFix (Fix fix){
		return administratorDAO.insertFix(fix);
	}
	public int deleteFix (String rid){
		return administratorDAO.deleteFix(rid);
	}
	
	
	
	public List<Late> findLateByDname(String dname){
		return administratorDAO.findLateByDname(dname);
	}
	public Late findLateByLid(String lid){
		return administratorDAO.findLateByLid(lid);
	}
	public int updateLate (Late late){
		return administratorDAO.updateLate(late);
	}
	public int insertLate (Late late){
		return administratorDAO.insertLate(late);
	}
	public int deleteLate (String lid){
		return administratorDAO.deleteLate(lid);
	}

	
	public List<Dormitory> findDormitoryByDname(String dname){
		return administratorDAO.findDormitoryByDname(dname);
	}
	public Dormitory findDormitoryByDid(String did){
		return administratorDAO.findDormitoryByDid(did);
	}
	public int updateDormitory (Dormitory dormitory){
		return administratorDAO.updateDormitory(dormitory);
	}
	public int insertDormitory (Dormitory dormitory){
		return administratorDAO.insertDormitory(dormitory);
	}
	public int deleteDormitory (String did){
		return administratorDAO.deleteDormitory(did);
	}
	
}
