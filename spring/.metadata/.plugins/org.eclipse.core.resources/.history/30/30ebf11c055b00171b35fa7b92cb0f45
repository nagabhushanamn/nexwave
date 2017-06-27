package com.mts.spring;

import org.apache.log4j.Logger;

public class LegacySingleton {

	private static Logger logger = Logger.getLogger("mts");

	private static LegacySingleton singleton = null;

	private LegacySingleton() {
		logger.info("LegacySingleton instantiated...");
	}

	public static LegacySingleton getInstance() {
		if (singleton == null) {
			singleton = new LegacySingleton();
		}
		return singleton;
	}

}
