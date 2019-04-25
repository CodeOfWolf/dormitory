package cn.jmu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jmu.po.Dormitory;
import cn.jmu.po.Fix;
import cn.jmu.po.Late;
import cn.jmu.po.Student;
import cn.jmu.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping(value="/login.do")
	//登录到首页
	public String login(String sno,String password,Model model,HttpSession session){
		Student stu=studentService.stuCheck(sno, password);
		model.addAttribute("stu", stu);
		session.setAttribute("stusno", stu.getSno());
		session.setAttribute("studid", stu.getDid());
		session.setAttribute("sname", stu.getSname());
		if(stu!=null){
			return "dashboard";
		}else{
			return "login";
		}
	}
	
	
	
	
	
	@RequestMapping(value = "/findStudentBySnoS.do") // 成绩查询--教师
	public String findStudentBySnoS(String sno,  Model model) {
		System.out.println(sno);
		Student students = this.studentService.findStudentBySnoS(sno);
		model.addAttribute("students", students);
		return "stulist";
	}
	
	
	
	
	@RequestMapping(value = "/findFixByDidS.do") // 成绩查询--教师
	public String findFixByDidS(String did,  Model model) {
		System.out.println(did);
		List<Fix> fixs = this.studentService.findFixByDidS(did);
		model.addAttribute("fixs", fixs);
		return "stufixlist";
	}
	
	@RequestMapping(value = "/deleteFixS.do") // 成绩查询--教师
	public String deleteFixS(String rid,  Model model) {
		System.out.println(rid);
		this.studentService.deleteFixS(rid);
		return "addashboard";
	}
	

	@RequestMapping(value = "/insertFixS.do") // 成绩查询--教师
	public String insertFixS(Fix fix) {
		System.out.println(fix.getRid());
		this.studentService.insertFixS(fix);
		return "addashboard";
	}
	
	
	
	
	
	@RequestMapping(value = "/findLateBySnoS.do") // 成绩查询--教师
	public String findLateBySnoS(String sno,  Model model) {
		System.out.println(sno);
		List<Late> lates = this.studentService.findLateBySnoS(sno);
		model.addAttribute("lates", lates);
		return "stulatelist";
	}
	@RequestMapping(value = "/stulogout.do")
	public String stuLogOut(HttpSession session){
		session.invalidate();
		return "login";
	}
	
	
	@RequestMapping(value = "/findDormitoryByDidS.do") // 成绩查询--教师
	public String findDormitoryByDidS(String did,  Model model) {
		System.out.println(did);
		Dormitory ewp = this.studentService.findDormitoryByDidS(did);
		model.addAttribute("ewp", ewp);
		return "stuewlist";
	}

}
