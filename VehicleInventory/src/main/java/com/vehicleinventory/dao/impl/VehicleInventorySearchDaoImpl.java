package com.vehicleinventory.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vehicleinventory.constants.VehicleInventorySQL;
import com.vehicleinventory.dao.VehicleInventorySearchDao;
import com.vehicleinventory.model.Vehicle;
import com.vehicleinventory.model.VehicleType;
import com.vehicleinventory.util.VehicleDBConnection;

/**
 * @author RameshReddy Komma
 *
 */
@Repository
public class VehicleInventorySearchDaoImpl implements VehicleInventorySearchDao {

	@Override
	public List<Vehicle> getAllVehicles() throws SQLException {
		Connection connection = VehicleDBConnection.getDBConnection();
		PreparedStatement selectPreparedStatement = null;
		List<Vehicle> list = new ArrayList<Vehicle>();
		try {
			connection.setAutoCommit(false);
			selectPreparedStatement = connection.prepareStatement(VehicleInventorySQL.SELECT_ALL_VEHICLES_SQL);
			ResultSet rs = selectPreparedStatement.executeQuery();
			while (rs.next()) {
				Vehicle vehicle = new Vehicle();
				vehicle.setId(rs.getInt(1));
				vehicle.setType(VehicleType.valueOf(rs.getInt(2)));
				vehicle.setName(rs.getString(3));
				vehicle.setMake(rs.getString(5));
				vehicle.setYear(rs.getInt(4));
				vehicle.setModel(rs.getString(6));
				vehicle.setEngine(rs.getString(7));
				list.add(vehicle);
			}
			selectPreparedStatement.close();
			connection.commit();

		} finally {
			connection.close();
		}
		return list;

	}

	@Override
	public Vehicle getVehicle(int type) throws SQLException {
		Connection connection = VehicleDBConnection.getDBConnection();
		PreparedStatement selectPreparedStatement = null;
		String SelectQuery = null;
		Vehicle vehicle = new Vehicle();
		SelectQuery = "SELECT * FROM VEHICLE_INVENTORY WHERE INVENTORY_ID=" + type + " ";
		try {
			connection.setAutoCommit(false);

			selectPreparedStatement = connection.prepareStatement(SelectQuery);
			ResultSet rs = selectPreparedStatement.executeQuery();
			while (rs.next()) {
				vehicle.setId(rs.getInt(1));
				vehicle.setType(VehicleType.valueOf(rs.getInt(2)));
				vehicle.setName(rs.getString(3));
				vehicle.setMake(rs.getString(5));
				vehicle.setYear(rs.getInt(4));
				vehicle.setModel(rs.getString(6));
				vehicle.setEngine(rs.getString(7));
			}
			selectPreparedStatement.close();
			connection.commit();

		} finally {
			connection.close();
		}
		return vehicle;
	}

	@Override
	public List<Vehicle> getVehiclesByYear(int year) throws SQLException {
		Connection connection = VehicleDBConnection.getDBConnection();
		PreparedStatement selectPreparedStatement = null;
		String SelectQuery = null;
		List<Vehicle> list = new ArrayList<Vehicle>();
		if (year != 0) {
			SelectQuery = "SELECT * FROM VEHICLE_INVENTORY WHERE VEHICLE_YEAR=" + year + " ";
		}
		try {
			connection.setAutoCommit(false);

			selectPreparedStatement = connection.prepareStatement(SelectQuery);
			ResultSet rs = selectPreparedStatement.executeQuery();
			while (rs.next()) {
				Vehicle vehicle = new Vehicle();
				vehicle.setId(rs.getInt(1));
				vehicle.setType(VehicleType.valueOf(rs.getInt(2)));
				vehicle.setName(rs.getString(3));
				vehicle.setMake(rs.getString(5));
				vehicle.setYear(rs.getInt(4));
				vehicle.setModel(rs.getString(6));
				vehicle.setEngine(rs.getString(7));
				list.add(vehicle);
			}
			selectPreparedStatement.close();
			connection.commit();

		} finally {
			connection.close();
		}
		return list;
	}
}
