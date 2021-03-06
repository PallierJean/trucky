package com.trucky.Domain;
// Generated 12 janv. 2017 09:28:27 by Hibernate Tools 5.2.0.CR1

/**
 * Drive generated by hbm2java
 */
public class Drive implements java.io.Serializable {

	private DriveId id;
	private User user;
	private Vehicle vehicle;
	private VehicleModel vehicleModel;

	public Drive() {
	}

	public Drive(DriveId id, User user, Vehicle vehicle, VehicleModel vehicleModel) {
		this.id = id;
		this.user = user;
		this.vehicle = vehicle;
		this.vehicleModel = vehicleModel;
	}

	public DriveId getId() {
		return this.id;
	}

	public void setId(DriveId id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleModel getVehicleModel() {
		return this.vehicleModel;
	}

	public void setVehicleModel(VehicleModel vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

}
