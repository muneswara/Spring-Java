package com.vehicleinventory.controller;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleinventory.constants.VehicleConstants;
import com.vehicleinventory.model.Vehicle;
import com.vehicleinventory.service.VehicleInventorySearchService;

/**
 * @author RameshReddy Komma
 *
 */
@RestController
public class VehicleInventorySearchController {

	private static final Logger logger = LoggerFactory.getLogger(VehicleInventorySearchController.class);

	@Autowired
	private VehicleInventorySearchService service;

	/**
	 * Fetch all the vehicle inventory details
	 * 
	 * @return
	 */
	@RequestMapping(value = VehicleConstants.VEHICLE_GETALL, method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Vehicle>> getAllVehicles() {
		logger.info("Start getAllVehicles.");
		List<Vehicle> vehicles = null;
		try {
			vehicles = service.getAllVehicles();
			if (CollectionUtils.isEmpty(vehicles)) {
				return new ResponseEntity<List<Vehicle>>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Vehicle>>(vehicles, HttpStatus.OK);
		} catch (SQLException e) {
			logger.error("Exception Message " + e.getLocalizedMessage());
			return new ResponseEntity<List<Vehicle>>(vehicles, HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * Fetch the vehicle inventory details by ID
	 * 
	 * @param vehicleType
	 * @return
	 */
	@RequestMapping(value = VehicleConstants.VEHICLE_GET, method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Vehicle> getVehicle(@PathVariable("vehicleType") int vehicleType) {
		logger.info("Start getVehicle.");
		Vehicle vehicle = null;
		try {
			vehicle = service.getVehicle(vehicleType);

			return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
		} catch (SQLException e) {
			logger.error("Exception Message " + e.getLocalizedMessage());
			return new ResponseEntity<Vehicle>(vehicle, HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * Fetch all the vehicle inventory details by Year
	 * 
	 * @param year
	 * @return
	 */
	@RequestMapping(value = VehicleConstants.VEHICLE_GET_YEAR, method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Vehicle>> getVehiclesByYear(@PathVariable("year") int year) {
		logger.info("Start get vehicles by year.");
		List<Vehicle> vehicles = null;
		try {
			vehicles = service.getVehiclesByYear(year);
			if (CollectionUtils.isEmpty(vehicles)) {
				return new ResponseEntity<List<Vehicle>>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Vehicle>>(vehicles, HttpStatus.OK);
		} catch (SQLException e) {
			logger.error("Exception Message " + e.getLocalizedMessage());
			return new ResponseEntity<List<Vehicle>>(vehicles, HttpStatus.BAD_REQUEST);
		}
	}
}
