package cn.jmu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jmu.po.Administrator;
import cn.jmu.service.AdministratorService;

@Controller
public class AdminController {
	@Autowired
	private AdministratorService administratorService;
	@RequestMapping(value="/adlogin.do")
	//登录到管理员端首页
	public String adlogin(String mno,String password){
		System.out.println(mno);
		Administrator ad=administratorService.adCheck(mno, password);
		System.out.println(mno);
		if(ad!=null){
			return "addashboard";
		}else{
			return "adlogin";
		}
	}
}
