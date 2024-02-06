package com.example.D288.bootstrap;

import com.example.D288.dao.CustomerRepository;
import com.example.D288.dao.DivisionRepository;
import com.example.D288.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        int startingDivisionId = 1000;
        Customer alice = new Customer();
        alice.setFirstName("Alice");
        alice.setLastName("Johnson");
        alice.setAddress("456 Elm Street");
        alice.setPostal_code("54321");
        alice.setPhone("9876543210");

        Customer bob = new Customer();
        bob.setFirstName("Bob");
        bob.setLastName("Miller");
        bob.setAddress("789 Oak Lane");
        bob.setPostal_code("98765");
        bob.setPhone("1234567890");

        Customer carol = new Customer();
        carol.setFirstName("Carol");
        carol.setLastName("Garcia");
        carol.setAddress("101 Pine Avenue");
        carol.setPostal_code("24680");
        carol.setPhone("8765432109");

        Customer david = new Customer();
        david.setFirstName("David");
        david.setLastName("Brown");
        david.setAddress("222 Cedar Road");
        david.setPostal_code("13579");
        david.setPhone("5678901234");

        Customer emily = new Customer();
        emily.setFirstName("Emily");
        emily.setLastName("Clark");
        emily.setAddress("777 Maple Drive");
        emily.setPostal_code("86420");
        emily.setPhone("1098765432");

        customerRepository.save(alice);
        customerRepository.save(bob);
        customerRepository.save(carol);
        customerRepository.save(david);
        customerRepository.save(emily);
    }


}