package com.app.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		System.out.println("onStartup");
		

		//-------------------------------------------------------------------------

		// Create the 'root' Spring application context
		//AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		//rootContext.register();

		// Manage the lifecycle of the root application context
		//container.addListener(new ContextLoaderListener(rootContext));

		// -------------------------------------------------------------------------
		//
		
		// --------------------------------------------
		//
		// Create the dispatcher servlet's Spring application context
		AnnotationConfigWebApplicationContext springContext = new AnnotationConfigWebApplicationContext();
		springContext.register(WebMvcConfig.class);

		// Register and map the dispatcher servlet
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher",
				new DispatcherServlet(springContext));
		dispatcher.setLoadOnStartup(0);
		dispatcher.addMapping("/");

		// ---------------------------------------------

	}

}
