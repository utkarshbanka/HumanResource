package com.human.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

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

	@Override
	public List<Admin> getempl() throws EmployeeException {
		// TODO Auto-generated method stub
	
		List<Admin> admin = new ArrayList<>();
		
		try(Connection conn = Dbutil.provideconnection())
		{
			PreparedStatement cs =  conn.prepareStatement("select e.empid,e.name,e.gender,e.address,e.mobile,e.email,e.password, d.did, d.department from employee e Inner join department d inner join emplodep dp on e.empid = dp.empid and d.did = dp.did");
			
			
			ResultSet c = cs.executeQuery();
			while(c.next())
			{
				int empid = c.getInt("empid");
				 String ename = c.getString("name");
				 String address = c.getString("address");
				 String mobile = c.getString("mobile");
				 int did = c.getInt("did");
				 String gender = c.getString("gender");
				 String dep =  c.getString("department");
				 String pas = c.getString("password");
				 String email = c.getString("email");
				 
				 
				 
				 Admin adm = new Admin(empid, ename, gender, address, did, email, dep, pas, email, mobile);
				 admin.add(adm);
			}
			
			
		}catch (SQLException e) {
			// TODO: handle exception
			throw new  EmployeeException(e.getMessage());
		}
		if(admin.size()==0)
		{
			throw new EmployeeException("No Employee found");
		}
		
		return admin;
	}

	@Override
	public int totalemp() {
		// TODO Auto-generated
		
		int sum = 0;
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
		 PreparedStatement	rs = conn.prepareStatement("select count(*) from employee");
			
			
		 
		 
		 ResultSet s = rs.executeQuery();
		 while(s.next())
		 {
			 sum = s.getInt(1);
		 }
		 
		 
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return sum;
	}

	@Override
	public int depat() {
		
		int sum = 0;
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
		 PreparedStatement	rs = conn.prepareStatement("select count(*) from department");
			
			
		 
		 
		 ResultSet s = rs.executeQuery();
		 while(s.next())
		 {
			 sum = s.getInt(1);
		 }
		 
		 
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		return sum;
	}

	@Override
	public HashMap<Integer, String> showdep() throws EmployeeException {
		// TODO Auto-generated method stub
		
		
	  HashMap<Integer, String> ccc = new HashMap<>();
	  try(Connection conn = Dbutil.provideconnection())
	  
	  {
		  
		 PreparedStatement ps =  conn.prepareStatement("select * from department");
		  
		 ResultSet rs = ps.executeQuery();
		 while(rs.next())
		 {
			 int x = rs.getInt("did");
			 String dep = rs.getNString("department");
			 
			 
			 ccc.put(x, dep);
			 
		 }
		  
	  }
		catch(SQLException e) {
			  throw new EmployeeException(e.getMessage());
		}
	  
	  
	  if(ccc.size()==0)
	  {
		  throw new EmployeeException("No Department found");
	  }
	  
	  return ccc;
	}

	@Override
	public int Leaverc() {
		// TODO Auto-generated method stub
		
         int sum = 0;
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
		 PreparedStatement	rs = conn.prepareStatement("select count(*) from leavere");
			
			
		 
		 
		 ResultSet s = rs.executeQuery();
		 while(s.next())
		 {
			 sum = s.getInt(1);
		 }
		 
		 
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		return sum;
	}

	@Override
	public String approve() throws EmployeeException {
		// TODO Auto-generated method stub
		
		String messs = "NO Leave Request";
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
			
		PreparedStatement ps = 	conn.prepareStatement("select e.name, e.empid,e.address, e.email, er.current,er.till,er.reason from employee e Inner join leavere er on e.empid = er.empid");
			
			
		  ResultSet rs = ps.executeQuery();
		  while(rs.next())
		  {
			  
			  int x = rs.getInt("empid");
			  String name = rs.getString("name");
			  String address = rs.getString("address");
			  String email = rs.getString("email");
			  Date cur = rs.getDate("current");
			  Date till = rs.getDate("till");
			  String resaon = rs.getString("reason");
			  
			  System.out.println("Employee Id is  "+ x);
			  System.out.println("Employee Name is  "+ name);
			  System.out.println("Employee Addres is "+ address);
			  System.out.println("Employee Email is  "+  email);
			  System.out.println("Employee  Leave Request Date "+ cur);
			  System.out.println("Employee Leave Date "+ till);
			  System.out.println("Employee Leave Reason "+ resaon);
			  System.out.println("======================================");
			  System.out.println("Press 1 for Approve 2 For Decline The Leave");
			  Scanner sc = new Scanner(System.in);
			  int prss = sc.nextInt();
			  if(prss ==1)
			  {
				      
				    try(Connection con = Dbutil.provideconnection())
				    {
				    	
				           PreparedStatement cs = con.prepareStatement("insert into approve values(?,?,?,?)");
				    	    cs.setInt(1, x);
				    	    cs.setDate(2,cur);
				    	    cs.setDate(3, till);
				    	    cs.setString(4, resaon);
				    	    int uu = cs.executeUpdate();
				    	    if(uu>0)
				    	    {
				    	    	 PreparedStatement it=  con.prepareStatement("delete from leavere where empid = ?");
				    	    	 it.setInt(1, x);
				    	    	 int m = it.executeUpdate();
				    	    	 if(m>0)
				    	    	 {
				    	    		 messs = "Leave Approve for Employee "+ x+"";
				    	    	 }
				    	    	 else
				    	    	 {
				    	    		 
//				    	    		 PreparedStatement tt=  con.prepareStatement("delete from leavere where empid = ?");
//				    	    		 tt.setInt(1, x);
//				    	    		 int re = tt.executeUpdate();
//				    	    		 if(re>0)
//				    	    		 {
//				    	    			 messs = "Leave Decline for Employee "+x+"";
//				    	    		 }
				    	    		 
				    	    	 }
				    	    		 
				    	    }
//				    	    else
//				    	    {
//				    	    	System.out.println("Something went Wrong");
//				    	    }
//				    	
				    }catch(SQLException e)
				    {
				    	System.out.println(e.getMessage());
				    }
				  
			  }
			  
			  
			  else if(prss==2)
	    	    {
				   
	    	    
				   try(Connection co = Dbutil.provideconnection())
				   {
					   
					   
						PreparedStatement tet=  co.prepareStatement("delete from leavere where empid = ?");
		  	    		 tet.setInt(1, x);
		  	    		 int re = tet.executeUpdate();
		  	    		 if(re>0)
		  	    		 {
		  	    			 messs = "Leave Decline for Employee "+x+"";
		  	    		 }
					   
					   
					   
					   
				   }catch(SQLException e)
				   {
					   System.out.println(e.getMessage());
				   }
				  
				  
				  
				  
	    	    }
			  
			  
			  
			  
			  
			  
			  
			  
			  
		  }
			
			
			
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		return messs;
	}

}
