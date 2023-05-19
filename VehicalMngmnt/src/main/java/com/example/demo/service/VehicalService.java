package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Vehical;

public interface VehicalService {
	Vehical addVehical(Vehical v);
	List<Vehical>getAllVehicals();
	Vehical getByVid(Integer vid);
	Vehical deleteVehicalById(Integer vid);
	List<Vehical>getByVcolor(String vcolor);
	List<Vehical>getVehicalAboveLakh();
	List<Vehical>getAllSortedPriceColor();
	List<Vehical>getByVprice(double vprice);
	Vehical updateVehical(Vehical v);
}
