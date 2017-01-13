package com.trucky.factories;

import java.util.ArrayList;
import java.util.List;

import com.trucky.Dao.*;
import com.trucky.Domain.*;

public class VehicleFactory {
	
	public static Vehicle VehicleT;
	public static VehicleId VehicleIdT;
	public static VehicleModel VehicleModelT;
	private static List<Vehicle> Vehicles = new ArrayList<Vehicle>();
	private static List<VehicleId> VehicleIds = new ArrayList<VehicleId>();
	private static List<VehicleModel> VehicleMs = new ArrayList<VehicleModel>();
	
	static {
		VehicleIds.add(CreateVehicleId(1, "xwazerty1")); // id + immatriculation
		VehicleIds.add(CreateVehicleId(2, "xwazerty2"));
		VehicleIds.add(CreateVehicleId(3, "xwazerty3"));
		VehicleIds.add(CreateVehicleId(4, "xwazerty4"));
		VehicleIds.add(CreateVehicleId(5, "xwazerty5"));
		VehicleIds.add(CreateVehicleId(6, "xwazerty6"));
	
		VehicleMs.add(CreateVehicleM("Scania S 730", 110)); // modele + vitesse
		VehicleMs.add(CreateVehicleM("Scania P 410", 220));
		VehicleMs.add(CreateVehicleM("Scania R 450", 180));
		VehicleMs.add(CreateVehicleM("Scania R 500 (RHD)0", 90));
		VehicleMs.add(CreateVehicleM("Scania R 730 V8", 50));
		VehicleMs.add(CreateVehicleM("Scania R 500", 60));
		
		Vehicles.add(CreateVehicle(VehicleIds.get(0), VehicleMs.get(0))); // VehicleIds + VehicleMs
		Vehicles.add(CreateVehicle(VehicleIds.get(1), VehicleMs.get(1)));
		Vehicles.add(CreateVehicle(VehicleIds.get(2), VehicleMs.get(2)));
		Vehicles.add(CreateVehicle(VehicleIds.get(3), VehicleMs.get(3)));
		Vehicles.add(CreateVehicle(VehicleIds.get(4), VehicleMs.get(4)));
		Vehicles.add(CreateVehicle(VehicleIds.get(5), VehicleMs.get(5)));
	}
	
	public static Vehicle CreateVehicle(VehicleId id, VehicleModel VehicleModelT){
		Vehicle VehicleT = new Vehicle(id, VehicleModelT);
		VehicleT.setVehicleModel(VehicleModelT);	
		return VehicleT;
	}
	
	public static VehicleId CreateVehicleId(int idVehId, String immaVehId){
		VehicleId VehicleIdT = new VehicleId(immaVehId, idVehId);
		VehicleIdT.setIdVeh(idVehId);
		VehicleIdT.setImmatTru(immaVehId);
		return VehicleIdT;
	}
	
	public static VehicleModel CreateVehicleM(String libelleVeh, int speedMaxVeh){
		VehicleModel VehicleModelT = new VehicleModel(libelleVeh, speedMaxVeh);
		VehicleModelT.setSpeedMaxVeh(speedMaxVeh);
		VehicleModelT.setLibelleVeh(libelleVeh);
		return VehicleModelT;
	}

	
	public static List<Vehicle> CreateAll() {
		return Vehicles;
	}
	
	public static List<VehicleId> CreateAllId() {
		return VehicleIds;
	}
	
	public static List<VehicleModel> CreateAllM() {
		return VehicleMs;
	}
}
