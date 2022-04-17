package com.finzly.Assignment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
	
	public Employee(long id, String name, String native1, int noOfYearOfExp, Date joiningDate, String dOB) {
		super();
		this.id = id;
		this.name = name;
		Native = native1;
		NoOfYearOfExp = noOfYearOfExp;
		this.joiningDate = joiningDate;
		DOB = dOB;
	}
   public Employee(){  
	   
   }
	private String name;
	private String Native;
	private int NoOfYearOfExp;	
	private Date joiningDate;
	private String DOB;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNative() {
		return Native;
	}
	public void setNative(String native1) {
		Native = native1;
	}
	public int getNoOfYearOfExp() {
		return NoOfYearOfExp;
	}
	public void setNoOfYearOfExp(int noOfYearOfExp) {
		NoOfYearOfExp = noOfYearOfExp;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}

}
