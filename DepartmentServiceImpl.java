package com.xor.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xor.example.model.Department;
import com.xor.example.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department addDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		return (List<Department>)
				departmentRepository.findAll();
	}

	@Override
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public boolean deleteDepartmentById(int DepartmentId) {
		departmentRepository.deleteById(DepartmentId);
		return true;
		
	}

	@Override
	public Department getDepartmentById(int departmentId) {
		 return departmentRepository.findByDepartmentId(departmentId);
	}
	
	

}
