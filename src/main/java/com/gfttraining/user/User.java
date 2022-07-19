package com.gfttraining.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id()
	@GeneratedValue
private Integer id;
private String name;
private Date birthDate;
public User(Integer id, String name, Date birthDate) {
	super();
	this.id = id;
	this.name = name;
	this.birthDate = birthDate;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public User() {
	

}


}
