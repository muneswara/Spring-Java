package com.vehicleinventory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Muni
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.vehicleinventory")
public class VehicleInventoryConfiguration {
	

}