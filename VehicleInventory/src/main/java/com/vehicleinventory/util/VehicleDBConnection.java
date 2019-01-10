package com.vehicleinventory.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.vehicleinventory.constants.VehicleConstants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author RameshReddy Komma
 *
 */
public class VehicleDBConnection {

	private static final Logger logger = LoggerFactory.getLogger(VehicleDBConnection.class);

	public static Connection getDBConnection() {
		Connection dbConnection = null;
		try {
			Class.forName(VehicleConstants.DB_DRIVER);
			dbConnection = DriverManager.getConnection(VehicleConstants.DB_CONNECTION, VehicleConstants.DB_USER,
					VehicleConstants.DB_PASSWORD);
			return dbConnection;
		} catch (SQLException e) {
			logger.error("Error occured while connecting H2 Database:" + e.getMessage());
		} catch (ClassNotFoundException ce) {
			logger.error("Error occured while connecting H2 Database:" + ce.getMessage());
		}
		return dbConnection;
	}

}