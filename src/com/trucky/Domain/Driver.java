package com.trucky.Domain;
// Generated 12 janv. 2017 09:28:27 by Hibernate Tools 5.2.0.CR1

/**
 * Driver generated by hbm2java
 */
public class Driver implements java.io.Serializable {

	private int idUser;
	private User user;

	public Driver() {
	}

	public Driver(User user) {
		this.user = user;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
