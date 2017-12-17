package spring.first.repository;

import java.util.List;

import spring.first.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}