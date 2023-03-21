package com.xor.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xor.example.model.Department;
import com.xor.example.service.DepartmentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping(value="/" , consumes = "application/json")
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}
	
	@PutMapping(value="/" , consumes = "application/json")
	public Department updateDepatment(@RequestBody Department department) {
		return departmentService.updateDepartment(department);
	}
	
	@GetMapping(value="/{DepartmentId}")
	public Department getDepartmentById(@PathVariable int DepartmentId) {
		return departmentService.getDepartmentById(DepartmentId);
	}
	
	@GetMapping(value="/")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartmentList();
	}
	
	@DeleteMapping(value = "/{DepartmentId}")
	public boolean deleteDepartmentById(@PathVariable int DepartmentId)
	{
		return departmentService.deleteDepartmentById(DepartmentId);
	}

}
