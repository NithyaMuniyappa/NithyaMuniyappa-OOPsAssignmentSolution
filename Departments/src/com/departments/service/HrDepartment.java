package com.departments.service;

import com.departments.model.SuperDepartment;

public class HrDepartment extends SuperDepartment
{
	public String departmentName()
	  {
		  String deptName="Hr Department  ";
		  return deptName;
	  }
	  
	  public String getTodaysWork()
	  {
		  String todaysWork="Fill today's worksheet and mark your attendance";
		  return todaysWork;
	  }
	  
	  public String getWorkDeadline()
	  {
		  String workDeadline="Complete by EOD ";
		  return workDeadline;
	  }
	  
	  public String doActivity()
	  {
		  String activity="team Lunch";
		  return activity;
	  }
}
