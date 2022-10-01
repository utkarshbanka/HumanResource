package com.human.dao;

import com.human.bean.Employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.human.bean.*;
import com.human.exception.*;
import com.human.utility.*;
public class EmployeDaoImpl  implements EmployeDao{

	@Override
	public Employee Loginin(String email, String password) throws EmployeeException {
		// TODO Auto-generated method stub
		
		
		Employee ss = null;
		
		
		 try(Connection conn = Dbutil.provideconnection())
		 {
			 
			  PreparedStatement cs =  conn.prepareStatement("select e.empid,e.name,e.gender,e.address,e.mobile, d.did, d.department from employee e Inner join department d inner join emplodep dp on e.empid = dp.empid and d.did = dp.did and e.email = ? and e.password = ?");
			 
			  cs.setString(1, email);
			  cs.setString(2, password);
			  
			  ResultSet c = cs.executeQuery();
			 if(c.next())
			 {
				 
				 int empid = c.getInt("empid");
				 String ename = c.getString("name");
				 String address = c.getString("address");
				 String mobile = c.getString("mobile");
				 int did = c.getInt("did");
				 String gender = c.getString("gender");
				 String dep =  c.getString("department");
//				 String pas = c.getString("password");
				 
				 ss = new Employee(ename, password, address, email, empid, did, dep, mobile);
				 
				 
				 
				 
			 }
			 else
			 {
				 throw new EmployeeException("Invalid Email or Password");
			 }
			  
			  
			  
		 }catch (SQLException e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		
		
		return ss;
	}

	@Override
	public String changepaswword(String email, String password, String newpass) throws EmployeeException {
		// TODO Auto-generated method stub
		
		String mess = "Email or password Did not match";
		
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
	    PreparedStatement  ps = conn.prepareStatement("select * from employee where email = ? and password = ?");
			
	    ps.setString(1, email);
	    ps.setString(2, password);
	    
	    ResultSet rs = ps.executeQuery();
	    if(rs.next())
	    {
	    	System.out.println("Record found try to change the password");
	    PreparedStatement done = conn.prepareStatement("update employee set password = ? where email = ?");
	    done.setString(1, newpass);
	    done.setString(2, email);
	    
	    int x = done.executeUpdate();
	    if(x>0)
	    {
	    	mess = "password Change Successfully";
	    }
	    else
	    {
	    	throw new EmployeeException("Invalid Email or password");
	    }
	    }
	    
	    
		}catch (Exception e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		
		
		return mess;
	}

	@Override
	public String updateaddress(String email, String password, String address) throws EmployeeException {
		// TODO Auto-generated method stub
        String mess = "Email or password Did not match";
		
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
	    PreparedStatement  ps = conn.prepareStatement("select * from employee where email = ? and password = ?");
			
	    ps.setString(1, email);
	    ps.setString(2, password);
	    
	    ResultSet rs = ps.executeQuery();
	    if(rs.next())
	    {
	    	System.out.println("Record found try to change the Adresss");
	    PreparedStatement done = conn.prepareStatement("update employee set address = ? where email = ?");
	    done.setString(1, address);
	    done.setString(2, email);
	    
	    int x = done.executeUpdate();
	    if(x>0)
	    {
	    	mess = "Address Change Successfully";
	    }
	    else
	    {
	    	throw new EmployeeException("Invalid Email or password");
	    }
	    }
	    
	    
		}catch (Exception e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		
		
		
		
		
		return mess;
	}

	@Override
	public String updateemail(String email, String password, String newemail) throws EmployeeException {
		// TODO Auto-generated method stub
       String mess = "Email or password Did not match";
		
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
	    PreparedStatement  ps = conn.prepareStatement("select * from employee where email = ? and password = ?");
			
	    ps.setString(1, email);
	    ps.setString(2, password);
	    
	    ResultSet rs = ps.executeQuery();
	    if(rs.next())
	    {
	    	System.out.println("Record found try to change the Adresss");
	    PreparedStatement done = conn.prepareStatement("update employee set email = ? where email = ?");
	    done.setString(1, newemail);
	    done.setString(2, email);
	    
	    int x = done.executeUpdate();
	    if(x>0)
	    {
	    	mess = "Email Change Successfully";
	    }
	    else
	    {
	    	throw new EmployeeException("Invalid Email or password");
	    }
	    }
	    
	    
		}catch (Exception e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		
		return mess;
	}

	@Override
	public String updatname(String email, String password, String name) throws EmployeeException {
		// TODO Auto-generated method stub
		
		
       String mess = "Email or password Did not match";
		
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
	    PreparedStatement  ps = conn.prepareStatement("select * from employee where email = ? and password = ?");
			
	    ps.setString(1, email);
	    ps.setString(2, password);
	    
	    ResultSet rs = ps.executeQuery();
	    if(rs.next())
	    {
	    	System.out.println("Record found try to change the Adresss");
	    PreparedStatement done = conn.prepareStatement("update employee set name = ? where email = ?");
	    done.setString(1,name);
	    done.setString(2, email);
	    
	    int x = done.executeUpdate();
	    if(x>0)
	    {
	    	mess = "Name Change Successfully";
	    }
	    else
	    {
	    	throw new EmployeeException("Invalid Email or password");
	    }
	    }
	    
	    
		}catch (Exception e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		
		return mess;
	}

	@Override
	public String updatmobile(String email, String password, String mobile) throws EmployeeException {
		// TODO Auto-generated method stub
		
String mess = "Email or password Did not match";
		
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
	    PreparedStatement  ps = conn.prepareStatement("select * from employee where email = ? and password = ?");
			
	    ps.setString(1, email);
	    ps.setString(2, password);
	    
	    ResultSet rs = ps.executeQuery();
	    if(rs.next())
	    {
	    	System.out.println("Record found try to change the Adresss");
	    PreparedStatement done = conn.prepareStatement("update employee set mobile = ? where email = ?");
	    done.setString(1,mobile);
	    done.setString(2, email);
	    
	    int x = done.executeUpdate();
	    if(x>0)
	    {
	    	mess = "Mobile Number Change Successfully";
	    }
	    else
	    {
	    	throw new EmployeeException("Invalid Email or password");
	    }
	    }
	    
	    
		}catch (Exception e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		
		return mess;
	}

	@Override
	public String applyleave(String email, String password, String cur, String till,String reason) throws DateException {
		// TODO Auto-generated method stub
		
		
		String message = "Leave Not Granted To You";
		
		
		try(Connection conn = Dbutil.provideconnection())
		{
			
	    PreparedStatement ps =conn.prepareStatement("select empid from employee where email = ? and password = ?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				int empid = rs.getInt("empid");
		     PreparedStatement  ps2 =conn.prepareStatement("insert into leavere values(?,?,?,?)");
		     ps2.setInt(1, empid);
		     ps2.setString(2, cur);
		     ps2.setString(3, till);
		     ps2.setString(4, reason);
		     int x = ps2.executeUpdate();
		     if(x>0)
		     {
		        message = "Leave Requested";
		     }
		     else
		     {
		    	 System.out.println("Something went wrong");
		     }
		     
			}
			
		}
		catch(SQLException e)
		{
			System.out.println("No User Found for this email or password check the details and try agian");
		}
		
		
		
		return message;
	}

	@Override
	public int leavecheck(int empid) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		try(Connection conn = Dbutil.provideconnection())
		{
		     
			PreparedStatement ps = conn.prepareStatement("select count(*) from leavere where empid = ?");
			
			ps.setInt(1, empid);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				
				sum  = rs.getInt(1);
				
			}
			
			
			
			
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		return sum;
	}

	@Override
	public int leaveap(int empid) {
		// TODO Auto-generated method stub
		
		
		int sum = 0;
		try(Connection conn = Dbutil.provideconnection())
		{
		     
			PreparedStatement ps = conn.prepareStatement("select count(*) from approve where empid = ?");
			
			ps.setInt(1, empid);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				
				sum  = rs.getInt(1);
				
			}
			
			
			
			
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		return sum;
	  
	}

}
