package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.InavlidCredentialException;
import com.example.demo.Repo.CustomerRepo;
import com.example.demo.module.Customer;
import com.example.demo.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepo repo;
	BCryptPasswordEncoder b1= new BCryptPasswordEncoder();
	@Override
	public Customer customerSignUp(Customer c) {
		c.setCpassward(b1.encode(c.getCpassward()));
		return repo.save(c);
	}
	@Override
	public Customer customerLogin(String data, String cpassward) {
		// TODO Auto-generated method stub
		Customer c= repo.validate(data, data);
		if(c!=null) {	
			if(b1.matches(cpassward, c.getCpassward())) {
				return c;
			}else {
				throw new InavlidCredentialException();
			}
		}else {
			throw new InavlidCredentialException();
		}

	}
	@Override
	public Customer cforgotPassward(String data) {
		Customer c= repo.validate(data,data);
		if(c!=null) {

			return c;
		}else {
			throw new InavlidCredentialException();
		}


	}
	@Override
	public Customer cupdatePassward(String data, String cpassward) {
		Customer c= repo.validate(data, data);
		if(c!=null) {
			cpassward=b1.encode(cpassward);
			c.setCpassward(cpassward);
			repo.save(c);
			return c;
		}else {
			throw new InavlidCredentialException();
		}

	}

}
