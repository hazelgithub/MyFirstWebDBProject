package com.manish.java.projects.SpringBootWebappDemo.MyFirstWebDBProject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien 
{
	@Id
	private int aid ; 
	private String aname ;
	private String aloc ; 
	
	
	
	public String getAloc() {
		return aloc;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", aloc=" + aloc + "]";
	} 
	
	
	
}
