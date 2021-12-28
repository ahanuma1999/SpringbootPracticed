package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
     public Alien() {
		super();
		System.out.println("object created....");
	}

	private int Aid;
     private String Aname;
     private int Aage;
     
     @Autowired //(Autowired will the dependency object)
     @Qualifier(value ="Lap")
     private Laptop laptop;
     
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public int getAage() {
		return Aage;
	}
	public void setAage(int aage) {
		Aage = aage;
	}
	
	public void post() {
		System.out.println("posted");
		laptop.Lpost();
	}
}
