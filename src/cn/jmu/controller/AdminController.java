package cn.jmu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
	//��¼������Ա����ҳ
	public String adlogin(String mno,String password,  Model model,HttpSession session){
		Administrator ad=administratorService.adCheck(mno, password);
		model.addAttribute("ad", ad);
		session.setAttribute("admin", ad.getDname());
		if(ad!=null){
			return "addashboard";
		}else{
			return "adlogin";
		}
	}
	
	@RequestMapping(value = "/findStudentByDname.do") // �ɼ���ѯ--��ʦ
	public String findStudentByDname(String dname,  Model model) {
		System.out.println(dname);
		List<Student> students = this.administratorService.findStudentByDname(dname);
		model.addAttribute("students", students);
		return "adlist";
	}
	
	@RequestMapping(value = "/findStudentBySno.do") // �ɼ���ѯ--��ʦ
	public String findStudentBySno(String sno,  Model model) {
		System.out.println(sno);
		Student student = this.administratorService.findStudentBySno(sno);
		model.addAttribute("student", student);
		return "updatestu";
	}
	
	@RequestMapping(value = "/updateStudent.do") // �ɼ���ѯ--��ʦ
	public String updateStudent(Student student) {
		System.out.println(student.getSno());
		this.administratorService.updateStudent(student);
		return "addashboard";
	}
	
	@RequestMapping(value = "/insertStudent.do") // �ɼ���ѯ--��ʦ
	public String insertStudent(Student student) {
		System.out.println(student.getSno());
		this.administratorService.insertStudent(student);
		return "addashboard";
	}
	
	@RequestMapping(value = "/deleteStudent.do") // �ɼ���ѯ--��ʦ
	public String deleteStudent(String sno,  Model model) {
		System.out.println(sno);
		this.administratorService.deleteStudent(sno);
		return "addashboard";
	}
	
}
