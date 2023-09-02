package com.EmpMang.EmpMangSys.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmpMang.EmpMangSys.Entity.EmpData;
import com.EmpMang.EmpMangSys.Repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	EmpRepository erepo;
	
	
	public List<EmpData> getData() {
		 return erepo.findAll();
	}


	public List<EmpData> getDataByEmpid(String empid) {
		// TODO Auto-generated method stub
		return erepo.findByEmpID(empid);
	}


	public String addEmployee(EmpData emd) {
		// TODO Auto-generated method stub
		erepo.save(emd);
		return "Data Saved";
	}
}
