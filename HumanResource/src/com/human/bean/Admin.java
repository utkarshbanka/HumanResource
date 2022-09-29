package com.human.bean;

public class Admin {

	
	private int empid;
	private String name;
	private String gender;
    private String address;
    private int did;
    private String email;
    private String department;
    private String password;
    private String leave;
	private String mobile;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int empid, String name, String gender, String address, int did, String email, String department,
			String password, String leave, String mobile) {
		super();
		this.empid = empid;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.did = did;
		this.email = email;
		this.department = department;
		this.password = password;
		this.leave = leave;
		this.mobile = mobile;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLeave() {
		return leave;
	}
	public void setLeave(String leave) {
		this.leave = leave;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Admin [empid=" + empid + ", name=" + name + ", gender=" + gender + ", address=" + address + ", did="
				+ did + ", email=" + email + ", department=" + department + ", password=" + password + ", leave="
				+ leave + ", mobile=" + mobile + "]";
	}
	
	
	
    
    
    
    
	
}
