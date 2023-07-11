package com.example.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity(name="User")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
@NamedQuery(name = "findUserByUsername", query = "SELECT u FROM User u WHERE u.username = :username")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int iduser;

	private String password;

	private String username;

	public User() {
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getIduser() {
		return this.iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}