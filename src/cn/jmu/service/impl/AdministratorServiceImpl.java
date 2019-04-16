package cn.jmu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jmu.dao.AdministratorDAO;
import cn.jmu.po.Administrator;
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
}
