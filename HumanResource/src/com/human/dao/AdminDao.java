package com.human.dao;

import com.human.bean.Admin;
import com.human.exception.*;
public interface AdminDao {

	
	public String registerEmployee(Admin admin);
	
	public String adddepartment(int cid, String dep);
	public String department(int cid , int empid) throws EmployeeException;
	
	
	
}
