package com.example.demo;

import org.springframework.stereotype.Component;

@Component( value = "Lap")
public class Laptop {

	//Dependency Injection(this class is dependency class to the Alien asit is using this class) 
	
	private int Lid;
	private String Lname;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	public void Lpost() {
		System.out.println("LaptopPosted");
	}

}
