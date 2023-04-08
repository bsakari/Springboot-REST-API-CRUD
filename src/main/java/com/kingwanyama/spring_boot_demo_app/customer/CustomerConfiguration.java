package com.kingwanyama.spring_boot_demo_app.customer;

import com.kingwanyama.spring_boot_demo_app.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {
    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Value("${info.company.name}")
    String companyName;
    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp){
        return args -> {
            System.out.println("Command line runner. Hooray!.");
            System.out.println(companyName);
            System.out.println(infoApp);
        };
    }

    @Bean
    CustomerRepo customerRepo(){
        System.out.println("useFakeCustomerRepo = "+useFakeCustomerRepo);
        return new CustomerFakeRepository();
    }
}
