package com.devsuperior.bds04.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.bds04.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

	@Query(nativeQuery = true, value = " SELECT * FROM tb_city ORDER BY tb_city.name")
	List<City> findAllSorted();
}
