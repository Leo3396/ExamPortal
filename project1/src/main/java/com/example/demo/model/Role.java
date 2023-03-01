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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="roles")
public class Role {
	
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
private long Id;
private String roleName;


@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="role")
@JsonIgnore
private Set<UserRole> userRole=new HashSet<>();


public long getRoleId() {
	return Id;
}
public void setRoleId(long roleId) {
	this.Id = roleId;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}


}
