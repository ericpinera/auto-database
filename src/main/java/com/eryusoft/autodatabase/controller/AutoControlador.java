package com.eryusoft.autodatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eryusoft.autodatabase.domain.Auto;
import com.eryusoft.autodatabase.domain.AutoRepositorio;

@RestController
public class AutoControlador {
	
	@Autowired
	private AutoRepositorio repositorio;
	
	@RequestMapping("/autos")
	public Iterable<Auto> getAutos(){
		return repositorio.findAll();
	}

}
