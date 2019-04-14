package cn.jmu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jmu.po.Student;
import cn.jmu.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping(value="/login.do")
	//µÇÂ¼µ½Ê×Ò³
	public String login(String sno,String password){
		Student stu=studentService.stuCheck(sno, password);
		if(stu!=null){
			return "dashboard";
		}else{
			return "login";
		}
	}
}
