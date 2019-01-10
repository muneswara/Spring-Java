package com.vehicleinventory.dao;

import java.sql.SQLException;

import com.vehicleinventory.model.Vehicle;

public interface VehicleInventoryDao {

	public void setVehicleInventoryRepo() throws SQLException;

	public void insertVehicle(Vehicle vehicle) throws SQLException;

	public Vehicle updateVehicle(Vehicle vehicle) throws SQLException;

	public void deleteVehicle() throws SQLException;

}
