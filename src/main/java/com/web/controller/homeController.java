package com.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.dao.AbstractDao;
import com.web.dto.cbmanufacture;
import com.web.service.cbService;

@Controller
@RequestMapping("")
public class homeController extends AbstractDao {

	 
    @Autowired
     cbService cbservice;
    
	@RequestMapping()
	public String home(ModelMap mm) {
		cbmanufacture cb =  cbservice.getCB(1);
		//cbmanufacture cb  = new cbmanufacture();
		mm.addAttribute("doam",cb.getDoAm());
		mm.addAttribute("nhietdo",cb.getNhietDo());
		mm.addAttribute("dieukhien",cb.getDieuKhien());
		return "home";
	}
}
