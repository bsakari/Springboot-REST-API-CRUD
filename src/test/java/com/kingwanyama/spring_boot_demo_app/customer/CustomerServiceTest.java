package com.kingwanyama.spring_boot_demo_app.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {
    @Autowired
    private CustomerRepository customerRepository;
    private CustomerService underTest;
    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        // given
        Customer king = new Customer(1L,"king","king123","king@gmail.com");
        Customer wanyama = new Customer(2L,"Wanyama","wanyama123","wanyama@gmail.com");
        customerRepository.saveAll(Arrays.asList(king,wanyama));
        // When
        List<Customer> customers = underTest.getCustomers();
        //Then
        assertEquals(2, customers.size());

    }

    @Test
    void getCustomer() {
        // Given
        Customer king = new Customer(1L,"king","king123","king@gmail.com");
        customerRepository.save(king);
        //When
        Customer actual = underTest.getCustomer(1L);
        //Then
        assertEquals(1L,actual.getId());
        assertEquals("king",actual.getName());
        assertEquals("king123",actual.getPassword());
        assertEquals("king@gmail.com",actual.getEmail());
    }
}