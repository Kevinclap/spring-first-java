package spring.first.service;

import java.util.List;

import spring.first.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}