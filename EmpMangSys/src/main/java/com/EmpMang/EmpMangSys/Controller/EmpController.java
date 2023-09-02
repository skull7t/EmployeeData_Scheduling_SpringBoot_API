package com.EmpMang.EmpMangSys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmpMang.EmpMangSys.Entity.EmpData;
import com.EmpMang.EmpMangSys.Service.EmpService;

@RestController
@RequestMapping("Employee")
public class EmpController {

	@Autowired
	EmpService empserv;
	
	
	@GetMapping("getdata")
	public List<EmpData> getData(){
		return empserv.getData();
	}
}
