package spring.first.repository;

import java.util.ArrayList;
import java.util.List;

import spring.first.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see spring.first.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Kevin");
		customer.setLastName("Castro");
		
		customers.add(customer);
		
		return customers;
		
		
		
		
	}
	
}
