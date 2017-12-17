package spring.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import spring.first.model.Customer;
import spring.first.repository.CustomerRepository;

@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
		
	}
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see spring.first.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		return customerRepository.findAll();
	}
	

}
