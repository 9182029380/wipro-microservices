package com.Wipro.AccountService.controller;

import com.Wipro.AccountService.model.Account;
import com.Wipro.AccountService.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createAccount(@RequestBody Account account){
        accountService.createAccount(account);
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAccount(){
        return ResponseEntity.ok(accountService.getAccount());
    }
    @GetMapping("bank/{bankid}")
    public ResponseEntity<List<Account>> getAccountByBankId(@PathVariable("bankid") int bankId){
        return ResponseEntity.ok(accountService.getAccountByBankId(bankId));
    }
}
