package com.vehicleinventory.model;

import java.util.HashMap;
import java.util.Map;

public enum VehicleType {
	CAR(1), TRUCK(2),  AIRPLANE(3), DRONE(4), AMPHIBIAN(5), BOAT(6); 
	
	private static Map<Integer, VehicleType> map = new HashMap<Integer, VehicleType>();
	private int id;

    static {
        for (VehicleType vehicleType : VehicleType.values()) {
            map.put(vehicleType.id, vehicleType);
        }
    }	
	VehicleType(int p) {
	      id = p;
	   }
	
	  public  int getId() {
	      return id;
	   } 
	  
	  public static VehicleType valueOf(int vehicleType) {
	        return (VehicleType) map.get(vehicleType);
	    }
}
