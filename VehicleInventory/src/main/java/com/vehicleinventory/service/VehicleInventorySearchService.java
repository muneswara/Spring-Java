package com.vehicleinventory.service;

import java.sql.SQLException;
import java.util.List;

import com.vehicleinventory.model.Vehicle;

public interface VehicleInventorySearchService {
	
	public List<Vehicle> getAllVehicles() throws SQLException;

	public Vehicle getVehicle(int type) throws SQLException;
	
	public List<Vehicle> getVehiclesByYear(int year) throws SQLException;

}
