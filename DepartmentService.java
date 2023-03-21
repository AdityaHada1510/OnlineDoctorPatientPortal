package com.xor.example.service;

import java.util.List;

import com.xor.example.model.Department;

public interface DepartmentService {
	
	Department addDepartment(Department department);
	List<Department> fetchDepartmentList();
	Department updateDepartment(Department department);
	boolean deleteDepartmentById(int DepartmentId);
	Department getDepartmentById(int DepartmentId);

}
