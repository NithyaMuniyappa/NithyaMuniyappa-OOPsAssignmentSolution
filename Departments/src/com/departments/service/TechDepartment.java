package com.departments.service;

import com.departments.model.SuperDepartment;

public class TechDepartment extends SuperDepartment
{
	public String departmentName()
	  {
		  String deptName="Tech Department  ";
		  return deptName;
	  }
	  
	  public String getTodaysWork()
	  {
		  String todaysWork="Complete coding of module 1";
		  return todaysWork;
	  }
	  
	  public String getWorkDeadline()
	  {
		  String workDeadline="Complete by EOD ";
		  return workDeadline;
	  }
	  
	 public String getTechStackInformation()
	  {
		  String techStackInfo="core Java";
		  return techStackInfo;
	  }
}
