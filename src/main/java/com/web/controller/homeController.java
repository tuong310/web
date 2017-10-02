package com.web.controller;


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
		mm.addAttribute("doam",cb.getDoAm());
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
}
