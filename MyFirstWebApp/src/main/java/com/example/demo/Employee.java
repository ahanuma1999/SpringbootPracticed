package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int eid;
    private String ename;
    private String ecompany;
    
	public Employee() {
		super();
		
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcompany() {
		return ecompany;
	}
	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecompany=" + ecompany + "]";
	}
	
	
    
    
}
