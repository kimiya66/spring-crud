package com.kimia.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.kimia.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
