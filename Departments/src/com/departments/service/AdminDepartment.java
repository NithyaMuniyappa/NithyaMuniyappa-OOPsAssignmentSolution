package com.departments.service;

import com.departments.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment
{ 
	
	public String departmentName()
	  {
		  String deptName="Admin Department ";
		  return deptName;
	  }
		  
	 public  String getTodaysWork()
	  {
		  String todaysWork="Complete your documents Submission";
		  return todaysWork;
	  }
	  
	 public String getWorkDeadline()
	  {
		  String workDeadline="Complete by EOD ";
		  return workDeadline;
	  }
}
