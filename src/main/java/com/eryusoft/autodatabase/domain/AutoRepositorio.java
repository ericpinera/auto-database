package com.eryusoft.autodatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AutoRepositorio extends CrudRepository <Auto, Long> {
	
	List<Auto> findByMarcaOrderByYearAsc(String marca);

}