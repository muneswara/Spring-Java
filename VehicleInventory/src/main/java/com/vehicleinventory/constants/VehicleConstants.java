/**
 * 
 */
package com.vehicleinventory.constants;

/**
 * @author RameshReddy Komma
 *
 */
public class VehicleConstants {

	public static final String DB_DRIVER = "org.h2.Driver";
	public static final String DB_CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
	public static final String DB_USER = "";
	public static final String DB_PASSWORD = "";
	public static final String VEHICLE_TYPE = "/vehicle/repo";
	public static final String VEHICLE_INSERT = "/vehicle/{vehicleType}";
	public static final String VEHICLE_GET = "/vehicle/{vehicleType}";
	public static final String VEHICLE_GETALL = "/vehicle/all";
	public static final String VEHICLE_GET_YEAR = "/vehicle/year/{year}";
	public static final String VEHICLE_PUT = "/vehicle/update";
	public static final String VEHICLE_DELETE_BY_ID = "/vehicle/delete/{id}";
	public static final String VEHICLE_DELETE_RECENT = "/vehicle/delete";
}
