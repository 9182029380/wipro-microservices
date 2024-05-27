package com.Wipro.AccountService.service;

import com.Wipro.AccountService.model.Account;
import com.Wipro.AccountService.repository.Accountrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private Accountrepo repo;
    public void createAccount(Account account) {
        repo.save(account);
    }

    public List<Account> getAccount(){
        return repo.findAll();
    }

    public List<Account> getAccountByBankId(int bankId){
        return repo.findByBankId(bankId);
    }


}
