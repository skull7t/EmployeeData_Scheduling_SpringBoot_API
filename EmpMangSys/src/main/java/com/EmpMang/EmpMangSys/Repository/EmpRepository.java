package com.EmpMang.EmpMangSys.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmpMang.EmpMangSys.Entity.EmpData;


@Repository
public interface EmpRepository extends JpaRepository<EmpData,String> {
	
	List<EmpData>findByEmpID(String empid);

}
