package com.finzly.Assignment.Controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.finzly.Assignment.entity.Employee;
import com.finzly.Assignment.entity.Login;
import com.finzly.Assignment.entity.User;
import com.finzly.Assignment.exception.ResourceNotFoundException;
import com.finzly.Assignment.service.EmployeeServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class HomeController {
	
	@Autowired
	private EmployeeServiceImpl employeeservice;
	
	@GetMapping("/")
	public void Home(){
	  System.out.print("Hii");
	}

	 @PostMapping("/users")
	    public ResponseEntity<User> getUserById(@RequestBody Login login) {
	    	 User user = employeeservice.GetUserByName(login.getUsername());
	       if(user==null){
	    	   throw new ResourceNotFoundException("user doesn't exist");
	       }
	       else {
	    	   return ResponseEntity.ok(user);
	       }      
	    }
	 @GetMapping("/employees")
	    public ResponseEntity<List<Employee>> getAllUserByJoiningDate(@RequestParam(defaultValue = "10") int days) {
		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DATE, -days);
		 System.out.println("Date = "+ cal.getTime());
		 Date date1=cal.getTime();
	    	  List<Employee> employee = employeeservice.GetAllUserByJoiningDate(date1);
	    	  if(employee==null)
	    	  {
	    		  throw new ResourceNotFoundException("Not found any employee in this days = " + days);
	    	  }
	           return ResponseEntity.ok(employee);
	    }
}
