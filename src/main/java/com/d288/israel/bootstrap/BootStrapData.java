package com.d288.israel.bootstrap;

import com.d288.israel.dao.CustomerRepository;
import com.d288.israel.dao.DivisionRepository;
import com.d288.israel.entities.Customer;
import com.d288.israel.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (customerRepository.count() == 1) {

            Division division = new Division();
            division.setCountry_id(1l);
            division.setId(5L);
            divisionRepository.save(division);

            Customer customer1 = new Customer("Juan", "One", "1234 Elm St", "11111", "111-111-1111", division);
            Customer customer2 = new Customer("Jane", "Two", "456 Elm St", "22222", "222-222-2222", division);
            Customer customer3 = new Customer("Mike", "Three", "789 Oak St", "33333", "333-333-3333", division);
            Customer customer4 = new Customer("Emily", "Four", "321 Pine St", "44444", "444-444-4444", division);
            Customer customer5 = new Customer("Chris", "Five", "654 Maple St", "55555", "555-555-5555", division);

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);
        }
    }
}
