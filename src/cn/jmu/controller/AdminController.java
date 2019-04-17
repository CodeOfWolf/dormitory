package cn.jmu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jmu.po.Administrator;
import cn.jmu.po.Student;
import cn.jmu.service.AdministratorService;

@Controller
public class AdminController {
	@Autowired
	private AdministratorService administratorService;
	@RequestMapping(value="/adlogin.do")
	//登录到管理员端首页
	public String adlogin(String mno,String password,  Model model){
		Administrator ad=administratorService.adCheck(mno, password);
		model.addAttribute("ad", ad);
		if(ad!=null){
			return "addashboard";
		}else{
			return "adlogin";
		}
	}
	
	@RequestMapping(value = "/findStudentByDname.do") // 成绩查询--教师
	public String findStudentByDname(String dname,  Model model) {
		System.out.println(dname);
		List<Student> students = this.administratorService.findStudentByDname(dname);
		model.addAttribute("students", students);
		return "adlist";
	}                    
}
