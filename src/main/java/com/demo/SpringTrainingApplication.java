package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.model.Antwort;


public class SpringTrainingApplication {
	private static Logger log = LoggerFactory.getLogger(SpringTrainingApplication.class);

    public static void main(String[] args) {

    	// TODO: Initialize Spring ApplicationContext and call DeepThoughtController
    	
    	Antwort antwort = new Antwort();
        
    	log.info("Die Antwort ist \"{}\"", antwort);
    	
    }
    
}