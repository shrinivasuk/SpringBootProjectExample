package com.example.account.controller;

import com.example.account.model.Account;
import com.example.account.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AccountController {

    @Autowired
    AccountService accountService;


    @GetMapping("/account/{id}")
    public Account findAccoundId(@PathVariable String id){

        return accountService.accountService(id);
    }
}
