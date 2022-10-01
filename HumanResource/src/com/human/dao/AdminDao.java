package com.human.dao;

import java.util.HashMap;
import java.util.List;

import com.human.bean.Admin;
import com.human.exception.*;
public interface AdminDao {

	
	public String registerEmployee(Admin admin);
	
	public String adddepartment(int cid, String dep);
	public String department(int cid , int empid) throws EmployeeException;
	public List<Admin> getempl() throws EmployeeException;
	public int totalemp();
	public int depat();
	public HashMap<Integer, String> showdep() throws EmployeeException;
	public int Leaverc();
	public String approve() throws EmployeeException;
	
	
}
