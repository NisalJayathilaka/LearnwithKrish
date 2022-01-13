package com.nisal.rentcloud.profileservice.service;


import com.nisal.rentcloud.commmons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
