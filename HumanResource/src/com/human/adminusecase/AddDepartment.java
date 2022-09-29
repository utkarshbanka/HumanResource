package com.human.adminusecase;

import java.util.Scanner;
import com.human.dao.*;
import com.human.exception.EmployeeException;
import com.human.bean.*;

public class AddDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		
//		System.out.println("Add the departmen");
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the did");
//		int did = sc.nextInt();
//		System.out.println("Enter the Department Name");
//		String depn = sc.next();
//		
//		
//		
//		AdminDao ss =  new  AdminDaoImpl();
//		
//		String s = ss.adddepartment(did, depn);
//		
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
		
		
		System.out.println("Update The Department");
		
		System.out.println("Enter the Cid");
		int cid = sc.nextInt();
		System.out.println("Enter the empid");
		int sid = sc.nextInt();
		
		
	    AdminDao ss = new AdminDaoImpl();
		
		try {
			String ans = ss.department(cid, sid);
			System.out.println(ans);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
