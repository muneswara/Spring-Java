package com.vehicleinventory;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Muni
 *
 */
public class VehicleInventoryInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { VehicleInventoryConfiguration.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
}
