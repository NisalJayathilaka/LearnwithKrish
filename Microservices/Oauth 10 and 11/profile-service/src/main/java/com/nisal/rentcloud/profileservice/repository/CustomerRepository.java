package com.nisal.rentcloud.profileservice.repository;



import com.nisal.rentcloud.commmons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
