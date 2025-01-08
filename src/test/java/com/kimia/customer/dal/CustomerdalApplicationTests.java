package com.kimia.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kimia.customer.dal.entities.Customer;
import com.kimia.customer.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {
	
	@Autowired
	private CustomerRepository CustomerRepo;

	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Kimia B");
		customer.setEmail("b.k@gmail.com");
		CustomerRepo.save(customer);
	}
	
	@Test 
	void testFindCustomerById() {
		Customer customer = CustomerRepo.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test 
	void testUpdateCustomer() {
		Customer customer = CustomerRepo.findById(2l).get();
		customer.setEmail("kimia.beheshty@gmail.com");
		CustomerRepo.save(customer);
	}
	
	@Test
	void testDeleteCustomer() {
		Customer customer = CustomerRepo.findById(3l).get();
		CustomerRepo.delete(customer);
//		CustomerRepo.deleteAll();
	}

}
