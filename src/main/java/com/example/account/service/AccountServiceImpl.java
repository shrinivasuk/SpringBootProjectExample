package com.example.account.service;

import com.example.account.model.Account;
import com.example.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    private final AccountRepository repo;

    public AccountServiceImpl(AccountRepository repo){
        this.repo = repo;
    }

    public Account accountService(String id){
        Optional<Account> account = repo.findById(id);
        return account.orElse(null);
    }
}
