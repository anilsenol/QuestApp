package com.project.questionapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {

	@Id
	Long id;
	
	String userName;
	String password;
	
	public Object getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserName(Object userName2) {
		// TODO Auto-generated method stub
		
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}

}

