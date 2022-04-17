package com.finzly.Assignment.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finzly.Assignment.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository <Employee,Long> {
	
	

	List<Employee> findByJoiningDateAfter(Date date);
}
