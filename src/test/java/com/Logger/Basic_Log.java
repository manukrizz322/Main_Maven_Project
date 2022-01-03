package com.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Log {
	static Logger log =Logger.getLogger(Basic_Log.class);//Factory Design Pattern
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("Debug");
		log.info("Information");
		log.warn("warning");
		log.error("error");
		log.fatal("fatal");
	}

}