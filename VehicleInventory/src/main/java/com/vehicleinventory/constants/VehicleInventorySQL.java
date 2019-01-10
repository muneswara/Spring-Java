/**
 * 
 */
package com.vehicleinventory.constants;

/**
 * @author RameshReddy Komma
 *
 */
public class VehicleInventorySQL {
	
	public static final String INSERT_VEHICLE_INVENTORY_SQL = "INSERT INTO VEHICLE_INVENTORY"
			+ "(TYPE_ID, VEHICLE_Name,VEHICLE_YEAR,VEHICLE_MAKE,VEHICLE_MODEL,VEHICLE_ENGINE) values"
			+ "(?,?,?,?,?,?)";
	
	public static final String CREATE_VEHICLE_TYPE_SQL ="CREATE TABLE VEHICLE_TYPE(TYPE_ID int primary key, VEHICLE_TYPE varchar(30),VEHICLE_DESC varchar(50))";
	
	public static final String INSERT_VEHICLE_TYPE_CAR_SQL ="INSERT INTO VEHICLE_TYPE(TYPE_ID, VEHICLE_TYPE,VEHICLE_DESC) VALUES(1, 'CAR','Motor Vehicle')";
	public static final String INSERT_VEHICLE_TYPE_TRUCK_SQL ="INSERT INTO VEHICLE_TYPE(TYPE_ID, VEHICLE_TYPE,VEHICLE_DESC) VALUES(2, 'TRUCK','Goods Transport')";
	public static final String INSERT_VEHICLE_TYPE_AIRPLANE_SQL ="INSERT INTO VEHICLE_TYPE(TYPE_ID, VEHICLE_TYPE,VEHICLE_DESC) VALUES(3, 'AIRPLANE','Flying Vehicle')";
	public static final String INSERT_VEHICLE_TYPE_DRONE_SQL ="INSERT INTO VEHICLE_TYPE(TYPE_ID, VEHICLE_TYPE,VEHICLE_DESC) VALUES(4, 'DRONE','DRONE')";
	public static final String INSERT_VEHICLE_TYPE_AMPHIBIAN_SQL ="INSERT INTO VEHICLE_TYPE(TYPE_ID, VEHICLE_TYPE,VEHICLE_DESC) VALUES(5, 'AMPHIBIAN','AMPHIBIAN')";
	public static final String INSERT_VEHICLE_TYPE_BOAT_SQL ="INSERT INTO VEHICLE_TYPE(TYPE_ID, VEHICLE_TYPE,VEHICLE_DESC) VALUES(6, 'BOAT','WaterCraft')";

	
	public static final String CREATE_VEHICLE_INVENTORY_SQL ="CREATE TABLE VEHICLE_INVENTORY(INVENTORY_ID int auto_increment primary key,TYPE_ID int,VEHICLE_Name varchar(30)"
	+ ",VEHICLE_YEAR int,VEHICLE_MAKE varchar(30),VEHICLE_MODEL varchar(30),VEHICLE_ENGINE varchar(50))";
	
	public static final String DELETE_VEHICLE_INVENTORY_SQL ="DELETE FROM VEHICLE_INVENTORY WHERE INVENTORY_ID=(SELECT MAX(INVENTORY_ID) FROM VEHICLE_INVENTORY)";
	
	
	public static final String SELECT_ALL_VEHICLES_SQL ="SELECT * FROM VEHICLE_INVENTORY";
}
