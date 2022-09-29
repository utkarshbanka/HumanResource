package com.human.bean;

public class Employee {
	
	
	private String name;
	private String password;
	private String address;
	private String email;
	private int empid;
    private int cid;
    private String department;
    private String mobile;
	public Employee(String name, String password, String address, String email, int empid, int cid, String department,
			String mobile) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.empid = empid;
		this.cid = cid;
		this.department = department;
		this.mobile = mobile;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", address=" + address + ", email=" + email
				+ ", empid=" + empid + ", cid=" + cid + ", department=" + department + ", mobile=" + mobile + "]";
	}
    
    
    
    
}