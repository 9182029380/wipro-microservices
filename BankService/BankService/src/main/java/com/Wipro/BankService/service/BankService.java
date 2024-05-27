package com.Wipro.BankService.service;

import com.Wipro.BankService.client.Account;
import com.Wipro.BankService.client.FullResponse;
import com.Wipro.BankService.fegin.Accountclient;
import com.Wipro.BankService.model.Bank;
import com.Wipro.BankService.repository.Bankrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BankService {
    @Autowired
    private Bankrepo bankRepository;
    @Autowired
    private Accountclient client;
    public void addBank(Bank bank) {
        bankRepository.save(bank);
    }
    public List<Bank> getAllBanks() {
        return bankRepository.findAll();
    }


    public FullResponse getBankById(int id) {
        Bank bank = bankRepository.findById(id).orElse(null);

        List<Account> accounts = client.findAllAccountByBank(id);

        FullResponse fullResponse = new FullResponse();
        fullResponse.setBankName(bank.getBankName());
        fullResponse.setBankAddress(bank.getBankAddress());
        fullResponse.setBankContact(bank.getBankContact());
        fullResponse.setBankEmail(bank.getBankEmail());
        fullResponse.setBankType(bank.getBankType());
        fullResponse.setAccounts(accounts);

        return fullResponse;
    }


}
