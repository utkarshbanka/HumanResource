package com.human.dao;

import com.human.bean.*;
import com.human.exception.*;
public interface EmployeDao {

	
	
	
	public Employee Loginin(String email, String password) throws EmployeeException;
	public String changepaswword(String email,String password , String newpass) throws EmployeeException;
	public String updateaddress(String email,String password , String address) throws EmployeeException;
	public String updateemail(String email,String password , String newemail) throws EmployeeException;
	public String updatname(String email,String password , String name) throws EmployeeException;
	public String updatmobile(String email,String password , String mobile) throws EmployeeException;
}
