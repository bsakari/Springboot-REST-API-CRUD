package com.kingwanyama.spring_boot_demo_app.customer;

import com.kingwanyama.spring_boot_demo_app.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers(){
        return customerRepo.getCustomers();
    }

    Customer getCustomer(Long id){
        return customerRepo.getCustomers().
                stream().filter(customer -> customer.getId().equals(id)).
                findFirst().
                orElseThrow(()-> new NotFoundException("Customer with id "+id+" not found"));
    }
}
