package com.vehicleinventory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author RameshReddy Komma
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.vehicleinventory")
public class VehicleInventoryConfiguration {
	

}