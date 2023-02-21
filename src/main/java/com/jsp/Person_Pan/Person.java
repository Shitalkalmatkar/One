package com.jsp.Person_Pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String email;

@OneToOne
private Pan pan;
@OneToOne
private Adhar adhar;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Pan getPan() {
	return pan;
}
public void setPan(Pan pan) {
	this.pan = pan;
}
public Adhar getAdhar() {
	return adhar;
}
public void setAdhar(Adhar adhar) {
	this.adhar = adhar;
}
}


