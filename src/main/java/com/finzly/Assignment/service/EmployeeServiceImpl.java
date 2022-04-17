package com.finzly.Assignment.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.Assignment.dao.EmployeeRepository;
import com.finzly.Assignment.dao.UserRepository;
import com.finzly.Assignment.entity.Employee;
import com.finzly.Assignment.entity.User;

@Service
public class EmployeeServiceImpl {
	
	@Autowired 
	private EmployeeRepository employeeRepository;
	
	@Autowired 
	private UserRepository userRepository;

	public User GetUserByName(String name) {
		
		return userRepository.findByUsername(name);
	}

	public List<Employee> GetAllUserByJoiningDate(Date date) {
		 List<Employee> emp=( employeeRepository).findByJoiningDateAfter(date); 
		return emp;
	}

}
