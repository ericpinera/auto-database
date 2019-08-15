package com.eryusoft.autodatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eryusoft.autodatabase.domain.Auto;
import com.eryusoft.autodatabase.domain.AutoRepositorio;
import com.eryusoft.autodatabase.domain.Propietario;
import com.eryusoft.autodatabase.domain.PropietarioRepositorio;

@SpringBootApplication
public class AutoDatabaseApplication {
	
	@Autowired	
	private AutoRepositorio arepositorio;

	@Autowired	
	private PropietarioRepositorio prepository;

	public static void main(String[] args) {
		SpringApplication.run(AutoDatabaseApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Propietario propietario1 = new Propietario("John" , "Johnson");			
			Propietario propietario2 = new Propietario("Mary" , "Robinson");			
			prepository.save(propietario1);			
			prepository.save(propietario2);
			
			arepositorio.save(new Auto("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, propietario1));
			arepositorio.save(new Auto("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, propietario2));
			arepositorio.save(new Auto("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, propietario2));

		};

	}	

}
