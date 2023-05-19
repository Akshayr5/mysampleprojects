package com.example.demo.service;

import com.example.demo.module.Customer;

public interface CustomerService {
Customer customerSignUp(Customer c);
Customer customerLogin(String data,String cpassward);
Customer cforgotPassward(String data);
Customer cupdatePassward(String data,String cpassward);
}
