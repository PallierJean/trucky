package com.trucky.Services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.trucky.Dao.*;
import com.trucky.Domain.*;
import com.trucky.Domain.Vehicle;
import com.trucky.factories.VehicleFactory;

@Path("/Vehicles")
@Produces("application/xml")
public class VehicleService {

	public VehicleService() {
	}
	
	@GET
    public List<Vehicle> getVehicles() {
		System.out.println("getVehicles");
		return VehicleFactory.CreateAll();
	}
	
	 @GET
	 @Path("{id}")
	 public Vehicle getVehicles(@PathParam("id") String codeVehicle) {
		 Vehicle lookingVehicle;
		 int idVehicle = Integer.parseInt(codeVehicle);
		 
		 List<Vehicle> Vehicles = VehicleFactory.CreateAll();
		 
		 for (Vehicle current : Vehicles) {
	            if (idVehicle == current.getId().getIdVeh()) {
					System.out.println(current.getId().getIdVeh()+" - "+current.getId().getImmatTru());
	                return current;
	            }
	        }
		 
		 return null;
	 }
}
