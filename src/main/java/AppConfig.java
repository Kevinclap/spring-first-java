import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.first.repository.CustomerRepository;
import spring.first.repository.HibernateCustomerRepositoryImpl;
import spring.first.service.CustomerService;
import spring.first.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"spring.first"})
public class AppConfig {
	
	@Bean (name = "customerService")
	public CustomerService getCustomerService() {
	   //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
	   return service;
	}
 
	@Bean(name= "customerRepository")
	
	public CustomerRepository getCustomerRepository() {
		
		return new HibernateCustomerRepositoryImpl();
		
	}
}
