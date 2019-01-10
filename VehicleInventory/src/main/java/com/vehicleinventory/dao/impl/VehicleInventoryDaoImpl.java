package com.vehicleinventory.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.vehicleinventory.constants.VehicleInventorySQL;
import com.vehicleinventory.dao.VehicleInventoryDao;
import com.vehicleinventory.model.Vehicle;
import com.vehicleinventory.util.VehicleDBConnection;

/**
 * @author RameshReddy Komma
 *
 */

@Repository
public class VehicleInventoryDaoImpl implements VehicleInventoryDao {
	
	private static final Logger logger = LoggerFactory.getLogger(VehicleInventoryDaoImpl.class);
    
    public void setVehicleInventoryRepo() throws SQLException {
		vehicleTypeBuild();
		vehicleBuild();
	}

	private void vehicleTypeBuild() throws SQLException {
		Connection connection = VehicleDBConnection.getDBConnection();
		Statement stmt = null;
		try {
			connection.setAutoCommit(false);
			stmt = connection.createStatement();
			stmt.execute(VehicleInventorySQL.CREATE_VEHICLE_TYPE_SQL);
			stmt.execute(VehicleInventorySQL.INSERT_VEHICLE_TYPE_CAR_SQL);
			stmt.execute(VehicleInventorySQL.INSERT_VEHICLE_TYPE_TRUCK_SQL);
			stmt.execute(VehicleInventorySQL.INSERT_VEHICLE_TYPE_AIRPLANE_SQL);
			stmt.execute(VehicleInventorySQL.INSERT_VEHICLE_TYPE_AMPHIBIAN_SQL);
			stmt.execute(VehicleInventorySQL.INSERT_VEHICLE_TYPE_DRONE_SQL);
			stmt.execute(VehicleInventorySQL.INSERT_VEHICLE_TYPE_BOAT_SQL);

			stmt.close();
			connection.commit();
		} finally {
			connection.close();
		}
	}
	

	private void vehicleBuild() throws SQLException {
		Connection connection = VehicleDBConnection.getDBConnection();
		Statement stmt = null;
		try {
			connection.setAutoCommit(false);
			stmt = connection.createStatement();
			stmt.execute(VehicleInventorySQL.CREATE_VEHICLE_INVENTORY_SQL);
			stmt.close();
			connection.commit();
		} finally {
			connection.close();
		}
	}

	
	

	@Override
	public void insertVehicle(Vehicle vehicle) throws SQLException {
		Connection connection = VehicleDBConnection.getDBConnection();
		try {
			connection.setAutoCommit(false);
			PreparedStatement insertPreparedStatement = null;
			logger.info("vehicle details ::" + vehicle);
			insertPreparedStatement = connection.prepareStatement(VehicleInventorySQL.INSERT_VEHICLE_INVENTORY_SQL);
			prepareVehicleInsert(vehicle, insertPreparedStatement);
			insertPreparedStatement.executeUpdate();
			insertPreparedStatement.close();
			connection.commit();
		} finally {
			connection.close();
		}
	}

	private void prepareVehicleInsert(Vehicle vehicle, PreparedStatement insertPreparedStatement)
			throws SQLException {
		insertPreparedStatement.setInt(1, vehicle.getType().getId());
		insertPreparedStatement.setString(2, vehicle.getName());
		insertPreparedStatement.setInt(3, vehicle.getYear());
		insertPreparedStatement.setString(4, vehicle.getMake());
		insertPreparedStatement.setString(5, vehicle.getModel());
		insertPreparedStatement.setString(6, vehicle.getEngine());
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) throws SQLException {
		Connection connection = VehicleDBConnection.getDBConnection();
		Statement stmt = null;
		try {
			String updateQuery = "UPDATE VEHICLE_INVENTORY SET VEHICLE_Name=" + "'" + vehicle.getName() + "'"
					+ ",VEHICLE_YEAR=" + vehicle.getYear() + "," + "VEHICLE_MAKE=" + "'" + vehicle.getMake() + "'"
					+ ",VEHICLE_MODEL=" + "'" + vehicle.getModel() + "'" + ",VEHICLE_ENGINE=" + "'"
					+ vehicle.getEngine() + "'" + " WHERE INVENTORY_ID=" + vehicle.getId();
			connection.setAutoCommit(false);
			stmt = connection.createStatement();
			stmt.executeUpdate(updateQuery);
			stmt.close();
			connection.commit();

		} finally {
			connection.close();
		}
		return vehicle;
	}

	public void deleteVehicle() throws SQLException {
		Connection connection =VehicleDBConnection.getDBConnection();
		Statement stmt = null;
		try {
			connection.setAutoCommit(false);
			stmt = connection.createStatement();
            stmt.executeUpdate(VehicleInventorySQL.DELETE_VEHICLE_INVENTORY_SQL);
            stmt.close();
			connection.commit();

		}finally {
				connection.close();
		}
	}
	
}
