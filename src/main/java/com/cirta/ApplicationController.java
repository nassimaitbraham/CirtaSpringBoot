package com.cirta;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class principale de lancement de l'application (Spring boot)
 * 
 * @author Nassim AIT BRAHAM
 *
 */

@SpringBootApplication
public class ApplicationController {

	public static void main(String[] args) {

		SpringApplication sa = new SpringApplication(ApplicationController.class);
		sa.run(args);
	}



}
