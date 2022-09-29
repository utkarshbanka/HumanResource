package com.human.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.human.utility.*;
import com.human.bean.Admin;
import com.human.exception.EmployeeException;

public class AdminDaoImpl implements AdminDao {

	@Override
	public String registerEmployee(Admin admin) {
		// TODO Auto-generated method stub
		
		
		String message = "Employee Not Registerd";
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
	     PreparedStatement  ps = conn.prepareStatement("insert into employee(empid , name, gender, address,password,email,mobile) values(?,?,?,?,?,?,?)");
		 ps.setInt(1, admin.getEmpid());
	     ps.setString(2, admin.getName());
		 ps.setString(3, admin.getGender());
		 ps.setString(4, admin.getAddress());
		 ps.setString(5, admin.getPassword());
		 ps.setString(6, admin.getEmail());
		 ps.setString(7, admin.getMobile());
		 
		 
		  int x = ps.executeUpdate();
		  
		  if(x>0)
		  {
			  System.out.println("New Employee : "+ admin.getName()+" Going to add into the Department : " + admin.getDepartment());
			  System.out.println("Checking if : "+ admin.getDepartment()+ " Exist In the Company");
			  
				  System.out.println("Great New Employee Addeded wait for the confiramation");
				  
				 PreparedStatement ps3 = conn.prepareStatement("insert into emplodep values(?,?)");
				 
				 ps3.setInt(1, admin.getEmpid());
				 ps3.setInt(2, admin.getDid());
				 
				 int y = ps3.executeUpdate();
				 if(y>0)
				 {
					 message = "New Employee Added Succefully";
				 }
				 else
				 {
					 
				 }
				 
			  }
			  else
			  {
				 
			  }
		  
		 		
		}catch(SQLException ae)
		{
		
			try(Connection conn = Dbutil.provideconnection())
			{
				
				PreparedStatement del =  conn.prepareStatement("delete from employee where email = ?");
				  del.setString(1, admin.getEmail());
				  
				  int tt = del.executeUpdate();
				  if(tt>0)
				  {
					  System.out.println("oops Registation failed Try again");
				  }
				
				
			}catch(SQLException w)
			{
				System.out.println(w.getMessage());
			}
			
			
			
			
			System.out.println(ae.getMessage());
		}
		
		
		
		return message;
	}

	@Override
	public String adddepartment(int cid, String dep) {
		// TODO Auto-generated method stub
		
		String mess = "Department Not Added";
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
		    PreparedStatement ps =	conn.prepareStatement("insert into department values(?,?)");
		    
		    ps.setInt(1, cid);
		    ps.setString(2, dep);
		    
		    
		    
		    int x = ps.executeUpdate();
		    if(x>0)
		    {
		    	mess = "Department Inseted Succesfully";
		    }
		    else
		    {
		    	return mess;
		    }
		     
			
		}catch(SQLException ad)
		{
			System.out.println(ad.getMessage());
		}
		
		
		
		
		
		return mess;
	}

	@Override
	public String department(int cid, int empid) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String mess = "Employee Department Not Change";
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
	      PreparedStatement ps = conn.prepareStatement("update emplodep set did = ? where empid = ? ");
			
	      ps.setInt(1,cid);
	      ps.setInt(2,empid);
	      
	      int x = ps.executeUpdate();
	      if(x>0)
	      {
	    	  mess = "Update Succefully";
	      }
			
		}catch(SQLException e)
		{
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		
		return mess;
	}

}
