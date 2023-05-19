package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Vehical;
import com.example.demo.service.VehicalService;
@RestController
public class VehicalController {
	@Autowired
	VehicalService serv;
	@PostMapping("/addvehical")
	ResponseEntity<Vehical> addVehical(@RequestBody Vehical v){
		return new ResponseEntity<Vehical>(serv.addVehical(v),HttpStatus.CREATED);
	}
	//localhost:9090/byvid
	@GetMapping("/byvid")
	ResponseEntity<Vehical> getByVid(@RequestHeader Integer vid){
		return new ResponseEntity<Vehical>(serv.getByVid(vid),HttpStatus.FOUND);
	}
	@GetMapping("/allvehical")
	ResponseEntity<List<Vehical>> getAllVehical(){
		return new ResponseEntity<List<Vehical>>(serv.getAllVehicals(),HttpStatus.FOUND);
	}
	@GetMapping("/sortpricecolor")
	ResponseEntity<List<Vehical>> getAllSortedPriceColor(){
		return new ResponseEntity<List<Vehical>>(serv.getAllSortedPriceColor(),HttpStatus.FOUND);
	}
	@GetMapping("/byabovelakh")
	ResponseEntity<List<Vehical>> getVehicalAboveLakh(){
		return new ResponseEntity<List<Vehical>>(serv.getVehicalAboveLakh(),HttpStatus.FOUND);
	}
	@GetMapping("/byVcolor")
	ResponseEntity<List<Vehical>> getByVcolor(@RequestHeader String vcolor){
		return new ResponseEntity<List<Vehical>>(serv.getByVcolor(vcolor),HttpStatus.FOUND);
	}
	@GetMapping("/byVprice")
	ResponseEntity<List<Vehical>> getByVprice(@RequestHeader Double vprice){
		return new ResponseEntity<List<Vehical>>(serv.getByVprice(vprice),HttpStatus.FOUND);
	}

	@PutMapping("/update")
	ResponseEntity<Vehical> updateVehical(@RequestBody Vehical v){
		return new ResponseEntity<Vehical>(serv.updateVehical(v),HttpStatus.OK);

	}
}
