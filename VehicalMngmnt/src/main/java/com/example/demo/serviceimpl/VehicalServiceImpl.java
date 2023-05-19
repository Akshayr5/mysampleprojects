package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.module.Vehical;
import com.example.demo.repo.VehicalRepo;
import com.example.demo.service.VehicalService;
@Service
public class VehicalServiceImpl implements VehicalService{
@Autowired
	VehicalRepo repo;
	@Override
	public Vehical addVehical(Vehical v) {
		
		return repo.save(v);
	}

	@Override
	public Vehical getByVid(Integer vid) {
		
		return repo.findById(vid).orElseThrow(()->new ResourceNotFoundException("Vehical","Id",vid));
	}

	@Override
	public List<Vehical> getByVcolor(String vcolor) {
		// TODO Auto-generated method stub
		return repo.findByColor(vcolor);
	}

	@Override
	public List<Vehical> getVehicalAboveLakh() {
		// TODO Auto-generated method stub
		return repo.findVehicalAboveLakh();
	}

	@Override
	public Vehical updateVehical(Vehical v) {
		Vehical v1=repo.findById(v.getVid()).orElse(null);
		if(v1!=null) {
			v1.setVname(v.getVname());
			v1.setVprice(v.getVprice());
			v1.setVcolor(v.getVcolor());
			v1.setModal(v.getModal());
			return repo.save(v1);
		}else {
			throw new ResourceNotFoundException("Vehical","id",(v.getVid()));
		}
				
	}

	@Override
	public List<Vehical> getByVprice(double vprice) {
		// TODO Auto-generated method stub
		return repo.findByVprice(vprice);
	}

	@Override
	public Vehical deleteVehicalById(Integer vid) {
		Vehical v= repo.findById(vid).orElse(null);
		if(v!=null) {
		repo.deleteById(vid);	
	}
		return v;
	}

	@Override
	public List<Vehical> getAllVehicals() {
		// TODO Auto-generated method stub
		return repo.findAllVehical();
	}

	@Override
	public List<Vehical> getAllSortedPriceColor() {
		// TODO Auto-generated method stub
		return repo.findAllSortedPriceColor();
	}
}
