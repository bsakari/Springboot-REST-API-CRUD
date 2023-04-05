package com.kingwanyama.spring_boot_demo_app.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"King", "password123", "email@example.com"),
                new Customer(2L,"King Wanyama", "password456", "email@example.com"),
                new Customer(3L,"King Wanyama Senior", "password789", "email@example.com")
        );
    }


}
