package com.example.adventurefall22.repository;

import com.example.adventurefall22.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public Boolean existsByPhoneNumber(int phone);
}
