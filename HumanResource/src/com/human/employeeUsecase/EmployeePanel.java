package com.human.employeeUsecase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.human.bean.*;
import com.human.exception.*;
import com.human.dao.*;
public class EmployeePanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter Your email");
//		String email = sc.next();
//		System.out.println("Enter Your Password");
//		String pass = sc.next();
//		
//		
//		EmployeDao emp = new EmployeDaoImpl();
//		
//		try {
//			Employee ans = emp.Loginin(email, pass);
//			
//			System.out.println(ans);
//		} catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			  System.out.println(e.getMessage());
//		}
		 
//		System.out.println("Change Your passsword");
//		System.out.println("Enter your email");
//		String email = sc.next();
//		System.out.println("Enter Your password");
//		String pass = sc.next();
//		System.out.println("Enter your new password");
//		String newpas = sc.next();
//		
//		EmployeDao sa = new EmployeDaoImpl();
//		
//	   try {
//		String s = sa.changepaswword(email, pass, newpas);
//		System.out.println(s);
//	} catch (EmployeeException e) {
//		// TODO Auto-generated catch block
//	     System.out.println(e.getMessage());
//	}
	   
		
		
//		System.out.println("Change Your Address");
//		System.out.println("Enter Your Email");
//		String email = sc.next();
//		System.out.println("Enter Your password");
//		String pass = sc.next();
//		System.out.println("Enter the new Address");
//		String address = sc.next();
//		
//		
//		EmployeDao ans = new EmployeDaoImpl();
//		
//		try {
//			String adc = ans.updateaddress(email, pass, address);
//			System.out.println(adc);
//		} catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("Change Email");
//		System.out.println("Enter Your Email");
//		String email = sc.next();
//		System.out.println("Enter Your password");
//		String pass = sc.next();
//		System.out.println("Enter the new Email");
//		String newemail = sc.next();
//		
//		
//		EmployeDao ans = new EmployeDaoImpl();
//		
//		try {
//			String adc = ans.updateemail(email, pass, newemail);
//			System.out.println(adc);
//		} catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println("Change Name");
//		System.out.println("Enter Your Email");
//		String email = sc.next();
//		System.out.println("Enter Your password");
//		String pass = sc.next();
//		System.out.println("Enter the new Name");
//		String newname = sc.next();
//		
//		
//		EmployeDao ans = new EmployeDaoImpl();
//		
//		try {
//			String adc = ans.updatname(email, pass, newname);
//			System.out.println(adc);
//		} catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		
		
		
//		System.out.println("Change Mobile Number");
//		System.out.println("Enter Your Email");
//		String email = sc.next();
//		System.out.println("Enter Your password");
//		String pass = sc.next();
//		System.out.println("Enter the New Mobile Number");
//		String newname = sc.next();
//		
//		
//		EmployeDao ans = new EmployeDaoImpl();
//		
//		try {
//			String adc = ans.updatmobile(email, pass, newname);
//			System.out.println(adc);
//		} catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		
		System.out.println("Welcome To The Employee Portol");
		System.out.println("Press 1 for Check Your Deatils");
		System.out.println("Press 2 for Change Your Password");
		System.out.println("Press 3 for Update Your Details");
		System.out.println("Press 4 for Applay for leave");
		int press = sc.nextInt();
		
		if(press==1)
		{
			System.out.println("Enter Your email");
			String email = sc.next();
			System.out.println("Enter Your Password");
			String pass = sc.next();
			
			
			EmployeDao emp = new EmployeDaoImpl();
			
			try {
				Employee ans = emp.Loginin(email, pass);
				int leavere = emp.leavecheck(ans.getEmpid());
				int approve = emp.leaveap(ans.getEmpid());
				System.out.println("Number of Leave Request : " + leavere);
				System.out.println("Number of Leave Approve : "+ approve);
				
				System.out.println("Your Empid is  "+ ans.getEmpid() );
				System.out.println("Your Department Id is "+ ans.getCid());
				System.out.println("Your Name is : "+ ans.getName());
				System.out.println("Your Email is : "+ ans.getEmail());
				System.out.println("Your Mobille Number is :"+ ans.getMobile());
				System.out.println("Your Department is  "+ ans.getDepartment());
				System.out.println("Your Password is  "+ ans.getPassword());
				
				
				
				
				
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				  System.out.println(e.getMessage());
			}
		}else if(press==2)
		{
			System.out.println("Change Your passsword");
			System.out.println("Enter your email");
			String email = sc.next();
			System.out.println("Enter Your password");
			String pass = sc.next();
			System.out.println("Enter your new password");
			String newpas = sc.next();
			
			EmployeDao sa = new EmployeDaoImpl();
			
		   try {
			String s = sa.changepaswword(email, pass, newpas);
			System.out.println(s);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
		     System.out.println(e.getMessage());
		}
		}else if(press==3)
		{
			System.out.println("Press 1 for Update Your Name");
			System.out.println("Press 2 for Update Your Address");
			System.out.println("Press 3 for Update Your email");
			System.out.println("Press 4 for Update Your Mobile");
			
			
			int upd = sc.nextInt();
			if(upd==1)
			{
				System.out.println("Change Name");
				System.out.println("Enter Your Email");
				String email = sc.next();
				System.out.println("Enter Your password");
				String pass = sc.next();
				System.out.println("Enter the new Name");
				String newname = sc.next();
				
				
				EmployeDao ans = new EmployeDaoImpl();
				
				try {
					String adc = ans.updatname(email, pass, newname);
					System.out.println(adc);
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}else if(upd==2)
			{
				System.out.println("Change Your Address");
				System.out.println("Enter Your Email");
				String email = sc.next();
				System.out.println("Enter Your password");
				String pass = sc.next();
				System.out.println("Enter the new Address");
				String address = sc.next();
				
				
				EmployeDao ans = new EmployeDaoImpl();
				
				try {
					String adc = ans.updateaddress(email, pass, address);
					System.out.println(adc);
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}else if(upd==3)
			{
				System.out.println("Change Email");
				System.out.println("Enter Your Email");
				String email = sc.next();
				System.out.println("Enter Your password");
				String pass = sc.next();
				System.out.println("Enter the new Email");
				String newemail = sc.next();
				
				
				EmployeDao ans = new EmployeDaoImpl();
				
				try {
					String adc = ans.updateemail(email, pass, newemail);
					System.out.println(adc);
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}else if(upd==4)
			{
				System.out.println("Change Mobile Number");
				System.out.println("Enter Your Email");
				String email = sc.next();
				System.out.println("Enter Your password");
				String pass = sc.next();
				System.out.println("Enter the New Mobile Number");
				String newname = sc.next();
				
				
				EmployeDao ans = new EmployeDaoImpl();
				
				try {
					String adc = ans.updatmobile(email, pass, newname);
					System.out.println(adc);
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
			else
			{
				return;
			}
			
			
		}
		
		else if(press==4)
		{
			System.out.println("Applay for Leave");
			System.out.println("Enter Your Email");
			String email = sc.next();
			System.out.println("Enter Your Password");
			String password = sc.next();
			
			System.out.println("Enter Your Date Till You want Leave In The YYYY-MM-DD form");
			String till = sc.next();
			System.out.println("Enter Reason for leave");
			String reason = sc.next();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate dd = LocalDate.parse(till, dtf);
			LocalDate tt = LocalDate.now();
//			System.out.println(tt);
		      String s = dtf.format(tt);
			if(dd.isBefore(tt))
			{
				System.out.println("Date should Not in Past");
			}
			else
			{
				EmployeDao ans = new EmployeDaoImpl();
				try {
					String a =  ans.applyleave(email, password, s, till,reason);
					System.out.println(a);
				} catch (DateException e) {
					// TODO Auto-generated catch block
				      System.out.println(e.getMessage());
				}
			}
			
			
			
			
			
			
			
		}
			else
		{
			System.out.println("Oops You are Out Read the Instrucation");
		}
		
		
		
		
		
		
		
		
		

	}

}
