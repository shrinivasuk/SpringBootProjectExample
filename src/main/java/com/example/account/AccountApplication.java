package com.example.account;

import com.example.account.model.Account;
import com.example.account.repository.AccountRepository;
import com.example.account.service.AccountService;
import com.example.account.service.AccountServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(AccountRepository repository) {
		return args-> {
			// save a few customers
			repository.save(new Account("1", "Savings","Savings data"));
			repository.save(new Account("2", "Current","Current data"));
			repository.save(new Account("3", "PPF","PPF data"));
			repository.save(new Account("4", "Other","Other data"));
			repository.save(new Account("5", "Demat","demat data"));



		};
	}

}
