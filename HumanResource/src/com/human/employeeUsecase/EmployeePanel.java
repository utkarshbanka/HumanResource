package com.human.employeeUsecase;


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
				
				System.out.println(ans);
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
			
			
		}else
		{
			System.out.println("Oops You are Out Read the Instrucation");
		}
		
		
		
		
		
		
		
		
		

	}

}
