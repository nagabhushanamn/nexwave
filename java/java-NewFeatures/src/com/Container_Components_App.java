package com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//--------------------------------------------------

class ComponentOne {

	@RequestMapping(url = "/login")
	public void doLogin() {
		System.out.println("Login.....");
	}

	@RequestMapping(url = "/register")
	public void doRegister() {
		System.out.println("Register.....");
	}
}
// ----------------------------------------------------

// ---------------------------------------------------

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE, ElementType.METHOD })
@interface RequestMapping {
	String url();
}

class Container {
	public void process(String url) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class clazz = Class.forName("com.ComponentOne");
		Object instance1 = clazz.newInstance();

		// ---------------------------------------------

		Method[] methods = clazz.getMethods();
		for (Method method : methods) {

			RequestMapping rm = method.getAnnotation(RequestMapping.class);
			if (rm != null) {
				String mappedUrl = rm.url();
				if (mappedUrl.equals(url)) {
					method.invoke(instance1, null);
				}
			}

		}

		// ---------------------------------------------

	}
}

// ----------------------------------------------------

public class Container_Components_App {

	public static void main(String[] args) {

		Container container = new Container();
		try {

			container.process("/login");
			container.process("/register");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
