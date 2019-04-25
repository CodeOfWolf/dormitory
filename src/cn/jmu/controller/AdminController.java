package cn.jmu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jmu.po.Administrator;
import cn.jmu.po.Dormitory;
import cn.jmu.po.Fix;
import cn.jmu.po.Late;
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
		session.setAttribute("adname",ad.getAdname() );
		if(ad!=null)
			return "addashboard";
		else
			return "adlogin";
		
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
	
	
	
	
	@RequestMapping(value = "/findFixByDname.do") // �ɼ���ѯ--��ʦ
	public String findFixByDname(String dname,  Model model) {
		System.out.println(dname);
		List<Fix> fixs = this.administratorService.findFixByDname(dname);
		model.addAttribute("fixs", fixs);
		return "fixlist";
	}
	
	@RequestMapping(value = "/findFixByRid.do") // �ɼ���ѯ--��ʦ
	public String findFixByRid(String rid,  Model model) {
		System.out.println(rid);
		Fix fix = this.administratorService.findFixByRid(rid);
		model.addAttribute("fix", fix);
		return "updatefix";
	}
	
	@RequestMapping(value = "/updateFix.do") // �ɼ���ѯ--��ʦ
	public String updateFix(Fix fix) {
		System.out.println(fix.getRid());
		this.administratorService.updateFix(fix);
		return "addashboard";
	}
	
	@RequestMapping(value = "/deleteFix.do") // �ɼ���ѯ--��ʦ
	public String deleteFix(String rid,  Model model) {
		System.out.println(rid);
		this.administratorService.deleteFix(rid);
		return "addashboard";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/findLateByDname.do") // �ɼ���ѯ--��ʦ
	public String findLateByDname(String dname,  Model model) {
		System.out.println(dname);
		List<Late> lates = this.administratorService.findLateByDname(dname);
		model.addAttribute("lates", lates);
		return "latelist";
	}
	
	@RequestMapping(value = "/insertLate.do") // �ɼ���ѯ--��ʦ
	public String insertLate(Late late) {
		System.out.println(late.getLid());
		this.administratorService.insertLate(late);
		return "addashboard";
	}
	
	@RequestMapping(value = "/deleteLate.do") // �ɼ���ѯ--��ʦ
	public String deleteLate(String lid,  Model model) {
		System.out.println(lid);
		this.administratorService.deleteLate(lid);
		return "addashboard";
	}
	@RequestMapping(value = "/logout.do")
	public String logout(HttpSession session){
		session.invalidate();
		return "adlogin";
	}
	@RequestMapping(value = "/findDormitoryByDname.do") // �ɼ���ѯ--��ʦ
	public String findDormitoryByDname(String dname,  Model model) {
		System.out.println(dname);
		List<Dormitory> ewlist = this.administratorService.findDormitoryByDname(dname);
		model.addAttribute("ewlist", ewlist);
		return "adewlist";
	}
	
	@RequestMapping(value = "/findDormitoryByDid.do") // �ɼ���ѯ--��ʦ
	public String findDormitoryByDid(String did,  Model model) {
		System.out.println(did);
		Dormitory ewp = this.administratorService.findDormitoryByDid(did);
		model.addAttribute("ewp", ewp);
		return "updateew";
	}
	
	@RequestMapping(value = "/updateDormitory.do") // �ɼ���ѯ--��ʦ
	public String updateDormitory(Dormitory dormitory) {
		this.administratorService.updateDormitory(dormitory);
		return "addashboard";
	}

}
