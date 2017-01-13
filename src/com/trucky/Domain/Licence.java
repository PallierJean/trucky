package com.trucky.Domain;
// Generated 12 janv. 2017 09:28:27 by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Licence generated by hbm2java
 */
public class Licence implements java.io.Serializable {

	private Integer idLic;
	private String libLic;
	private int codeLic;
	private Set users = new HashSet(0);
	private Set vehicleModels = new HashSet(0);

	public Licence() {
	}

	public Licence(int codeLic) {
		this.codeLic = codeLic;
	}

	public Licence(String libLic, int codeLic, Set users, Set vehicleModels) {
		this.libLic = libLic;
		this.codeLic = codeLic;
		this.users = users;
		this.vehicleModels = vehicleModels;
	}

	public Integer getIdLic() {
		return this.idLic;
	}

	public void setIdLic(Integer idLic) {
		this.idLic = idLic;
	}

	public String getLibLic() {
		return this.libLic;
	}

	public void setLibLic(String libLic) {
		this.libLic = libLic;
	}

	public int getCodeLic() {
		return this.codeLic;
	}

	public void setCodeLic(int codeLic) {
		this.codeLic = codeLic;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getVehicleModels() {
		return this.vehicleModels;
	}

	public void setVehicleModels(Set vehicleModels) {
		this.vehicleModels = vehicleModels;
	}

}
