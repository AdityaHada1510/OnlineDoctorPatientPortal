package com.xor.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xor.example.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
	Department findByDepartmentId(Integer departmentId);
}
