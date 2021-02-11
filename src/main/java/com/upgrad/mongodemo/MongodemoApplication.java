package com.upgrad.mongodemo;

import com.upgrad.mongodemo.dao.CustomerRepository;
import com.upgrad.mongodemo.entities.Customer;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodemoApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository _customerRepository ;

	public static void main(String[] args) {
		SpringApplication.run(MongodemoApplication.class, args);
		//System.out.println(_customerRepository);


	}

  @Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		System.out.println(_customerRepository);

		Customer customer1 = new Customer(1,"Vishwa","Mohan", "vmohan", "******", LocalDateTime.of(1955,12,07,12,00));
		Customer customer2 = new Customer(2,"Sachin","Mohan", "smohan", "******", LocalDateTime.of(1975,8,04,12,00));
		Customer customer3 = new Customer(3,"Rakesh","Roshan", "Rroshan", "******", LocalDateTime.of(1985,11,05,12,00));

		_customerRepository.save(customer1);
		_customerRepository.save(customer2);
		_customerRepository.save(customer3);



		//Getting all the customers
		for(Customer customer : _customerRepository.findAll()){
			System.out.println(customer);
		}


		//Getting the individual customers
		System.out.println(_customerRepository.findByFirstName("Vishwa"));

		System.out.println(_customerRepository.findByLastName("Mohan"));


	}

}
