package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String username;
private String password;
private String firstname;
private String lastname;
private String email;
private boolean enabled=true;
private String profile;


@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="user")
@JsonIgnore
private Set<UserRole> userRole=new HashSet<>();




public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}
public String getProfile() {
	return profile;
}
public void setProfile(String profile) {
	this.profile = profile;
}
public Set<UserRole> getUserRole() {
	return userRole;
}
public void setUserRole(Set<UserRole> userRole) {
	this.userRole = userRole;
}



}
