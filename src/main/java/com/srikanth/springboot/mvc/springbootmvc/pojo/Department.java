package com.srikanth.springboot.mvc.springbootmvc.pojo;

public class Department {
	
	private String departmentId;
	private String departmentName;
	private String departmentHod;
	
	public Department(String departmentId, String departmentName, String departmentHod) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentHod = departmentHod;
	}
	public Department() {
		super();
		
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentHod() {
		return departmentHod;
	}
	public void setDepartmentHod(String departmentHod) {
		this.departmentHod = departmentHod;
	}
	

}
