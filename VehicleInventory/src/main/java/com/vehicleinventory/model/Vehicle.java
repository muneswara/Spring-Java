/**
 * 
 */
package com.vehicleinventory.model;

/**
 * @author Ishitha&Geetham
 *
 */
public class Vehicle{
	
	private int id;
	private VehicleType type;
	private String name;
	private int year;
	private String make;
	private String model;
	private String engine;
	/**
	 * @return the type
	 */
	public VehicleType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(VehicleType type) {
		this.type = type;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", name=" + name + ", year=" + year + ", make=" + make
				+ ", model=" + model + ", engine=" + engine + "]";
	}	
	
}
