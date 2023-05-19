package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Vehical;

public interface VehicalRepo extends JpaRepository<Vehical, Integer>{
	@Query(value="select * from Vehical",nativeQuery=true)
	List<Vehical> findAllVehical();
	
@Query(value="select * from Vehical where vcolor=?1",nativeQuery=true)
List<Vehical>findByColor(String vcolor);

@Query(value="select * from Vehical where vprice=?1",nativeQuery=true)
List<Vehical>findByVprice(double vprice);

@Query(value="select * from Vehical where vprice>=10000000",nativeQuery=true)
List<Vehical>findVehicalAboveLakh();

@Query(value="select * from Vehical order by vprice desc,vcolor Asc",nativeQuery=true)
List<Vehical> findAllSortedPriceColor();
}
