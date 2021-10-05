package com.sip.devops.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Devops {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id_devops;
	private String name;
	private String firstname;
	private String tel;
	private String email;
	/**
	 * 
	 */
	public Devops() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId_devops() {
		return id_devops;
	}
	public void setId_devops(long id_devops) {
		this.id_devops = id_devops;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "devops [id_devops=" + id_devops + ", name=" + name + ", firstname=" + firstname + ", tel=" + tel
				+ ", email=" + email + "]";
	}
	

}
