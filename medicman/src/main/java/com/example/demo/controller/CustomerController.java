package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.serviceImpl.CustomerServiceImpl;

@RestController
public class CustomerController {
@Autowired
	CustomerService serv;

//localhost:9091/customerSignUp
@PostMapping("/customerSignUp")
ResponseEntity<Customer> customerSignUp(@RequestBody Customer c){
	return new ResponseEntity<Customer>(serv.customerSignUp(c),HttpStatus.CREATED);
}
//localhost:9091/getLogin
@GetMapping("/getLogin")
ResponseEntity<Customer> customerLogin(@RequestHeader String data,@RequestHeader String cpassward){
	return new ResponseEntity<Customer>(serv.customerLogin(data,cpassward),HttpStatus.FOUND);
}
@GetMapping("/getpassward")
ResponseEntity<Customer> cforgotPassward(@RequestHeader String data){
	return new ResponseEntity<Customer>(serv.cforgotPassward(data),HttpStatus.FOUND);
}
@PutMapping("/updatepassward")
ResponseEntity<Customer> cupdatePassward(@RequestHeader String data,@RequestHeader String cpassward){
	return new ResponseEntity<Customer>(serv.cupdatePassward(data,cpassward),HttpStatus.ACCEPTED);
}
}
