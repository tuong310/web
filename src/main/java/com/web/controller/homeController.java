package com.web.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.web.dao.AbstractDao;
import com.web.dto.cbmanufacture;
import com.web.service.cbService;

@Controller
@RequestMapping("")
public class homeController extends AbstractDao {

	 
    @Autowired
     cbService cbservice;
    
    @Autowired 
	HttpServletRequest Request ;
	@RequestMapping(method = RequestMethod.GET)
	public String home(ModelMap mm) {
		cbmanufacture cb =  cbservice.getCB(1);
	//	cbmanufacture cb  = new cbmanufacture();
		mm.addAttribute("doam",cb.getDoAm());
		mm.addAttribute("nhietdo",cb.getNhietDo());
		mm.addAttribute("dieukhien",cb.getDieuKhien());
		return "home";
	}
	@RequestMapping(value="den/1", method = RequestMethod.GET)
	public String add(ModelMap mm) {
		cbmanufacture cb =  cbservice.getCB(1);
		// cb.setDoAm() = Request.getParameter("doam");
		//cbservice.updateCB(1)= Request.getParameter("doam"));
		mm.addAttribute("doam" ,Request.getParameter("doam"));
		mm.addAttribute("nhietdo",cb.getNhietDo());
		mm.addAttribute("dieukhien",cb.getDieuKhien());
		return "add";
	}
	@RequestMapping(value="den/0",method = RequestMethod.GET)
	public String web(ModelMap mm) {
		cbmanufacture cb =  cbservice.getCB(1);
	//	cbmanufacture cb  = new cbmanufacture();
		mm.addAttribute("doam",cb.getDoAm());
		mm.addAttribute("nhietdo",cb.getNhietDo());
		mm.addAttribute("dieukhien",cb.getDieuKhien());
		return "home";
	}
	@RequestMapping(value="Json",method = RequestMethod.GET)
	public String Json(ModelMap mm) {
		mm.addAttribute("doam" ,Request.getParameter("doam"));
		return "json";
	}
}
