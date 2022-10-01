package com.human.adminusecase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.human.dao.*;
import com.human.exception.EmployeeException;
import com.human.bean.*;

public class Adminpanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//	System.out.println("Add the departmen");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the did");
//		int did = sc.nextInt();
//		System.out.println("Enter the Department Name");
//		String depn = sc.next();
//		
//	
//		
//		AdminDao ss =  new  AdminDaoImpl();
//				String s = ss.adddepartment(did, depn);		
//		System.out.println(s);
		
//		System.out.println("Add the Employee");
//		
//		
//		AdminDao ss =  new  AdminDaoImpl();
//		
//		
//		Admin ad = new Admin();
//		System.out.println("Enter the Employee id");
//		int empid = sc.nextInt();
//		System.out.println("Enter the Employee Name");
//		String ename = sc.next();
//		System.out.println("Choose the Gender 1 for male 2 female");
//		int egender = sc.nextInt();
//		String gen = null;
//		if(egender==1)
//		{
//			 gen = "M";
//		}
//		else if(egender == 2)
//		{
//			gen = "F";
//		}
//		else
//		{
//			System.out.println("Check the details or try again later");
//		}
//		
//		System.out.println("Enter the employee Adress");
//		String address = sc.next();
//		System.out.println("Enter the departement id");
//		int did = sc.nextInt();
//		System.out.println("Enter the email Each employee have Unique email");
//		String email = sc.next();
//		System.out.println("Enter the password");
//		String epass = sc.next();
//		System.out.println("Enter the emoloyee mobile number");
//		String emobil = sc.next();
//		
//		ad.setName(ename);
//		ad.setAddress(address);
//		ad.setDid(did);
//		ad.setEmail(email);
//		ad.setGender(gen);
//		ad.setPassword(epass);
//		ad.setMobile(emobil);
//        ad.setEmpid(empid);
//		String answer = ss.registerEmployee(ad);
//		System.out.println(answer);
		
		
//		System.out.println("Update The Department");
//		
//		System.out.println("Enter the Cid");
//		int cid = sc.nextInt();
//		System.out.println("Enter the empid");
//		int sid = sc.nextInt();
//		
//		
//	    AdminDao ss = new AdminDaoImpl();
//		
//		try {
//			String ans = ss.department(cid, sid);
//			System.out.println(ans);
//		} catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		AdminDao ss =  new  AdminDaoImpl();
		System.out.println("Note : Without Adding The Department You are Not Able to Add the Employee");
		
		System.out.println("Welcome To The Admin Panel");
		System.out.println("Press 1 for Add The New Employee");
		System.out.println("Press 2 for Add The New Department");
		System.out.println("Pres 3 for Change the Departement of the Employee");
		System.out.println("Press 4 To See all the Employee");
		System.out.println("Press  5 To See all the Department");
		System.out.println("Prss 6 to Approve or Decline Leave");
		int totalemp = ss.totalemp();
		int totaldem = ss.depat();
		int leave = ss.Leaverc();
		System.out.println("Total Number of Employee ="+  totalemp);
		System.out.println("Total Number of Department = "+ totaldem);
		System.out.println("Total Number of Leave Request = "+ leave);
		int press = sc.nextInt();
		
		if(press==1)
		{
//			AdminDao ss =  new  AdminDaoImpl();
			Admin ad = new Admin();
			System.out.println("Enter the Employee id");
			int empid = sc.nextInt();
			System.out.println("Enter the Employee Name");
			String ename = sc.next();
			System.out.println("Choose the Gender 1 for male 2 female");
			int egender = sc.nextInt();
			String gen = null;
			if(egender==1)
			{
				 gen = "M";
			}
			else if(egender == 2)
			{
				gen = "F";
			}
			else
			{
				System.out.println("Check the details or try again later");
			}
			
			System.out.println("Enter the employee Adress");
			String address = sc.next();
			System.out.println("Enter the departement id");
			int did = sc.nextInt();
			System.out.println("Enter the email Each employee have Unique email");
			String email = sc.next();
			System.out.println("Enter the password");
			String epass = sc.next();
			System.out.println("Enter the emoloyee mobile number");
			String emobil = sc.next();
			
			ad.setName(ename);
			ad.setAddress(address);
			ad.setDid(did);
			ad.setEmail(email);
			ad.setGender(gen);
			ad.setPassword(epass);
			ad.setMobile(emobil);
	        ad.setEmpid(empid);
			String answer = ss.registerEmployee(ad);
			System.out.println(answer);
		}else if(press==2)
		{
			System.out.println("Add the departmen");
			
			
			System.out.println("Enter the did");
			int did = sc.nextInt();
			System.out.println("Enter the Department Name");
			String depn = sc.next();
			
		
			
//			AdminDao ss =  new  AdminDaoImpl();
					String s = ss.adddepartment(did, depn);		
			System.out.println(s);
		}
		else if(press==3)
		{
			System.out.println("Update The Department");
			
			System.out.println("Enter the Cid");
			int cid = sc.nextInt();
			System.out.println("Enter the empid");
			int sid = sc.nextInt();
			
			
//		    AdminDao ss = new AdminDaoImpl();
			
			try {
				String ans = ss.department(cid, sid);
				System.out.println(ans);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(press==4)
		{
//			AdminDao ss =  new  AdminDaoImpl();
			try {
				List<Admin> s = ss.getempl();
				
				s.forEach(sss->System.out.println(sss));
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else if(press == 5)
			
		{
			try {
				HashMap<Integer, String> c = ss.showdep();
				
			    Set<Entry<Integer, String>> kk = c.entrySet();
			    
			   for(Map.Entry<Integer, String> h:kk)
			   {
				   System.out.println("Depid id is "+ h.getKey());
				   System.out.println("Depdartment name is "+ h.getValue());
				   System.out.println("======================================");
			   }
				
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(press==6)
		{
			
			try {
				String s = ss.approve();
				System.out.println(s);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
		{
			System.out.println("Something went Wrong");
		}
		
		
		
		
		
		
		
		
		
	}

}
