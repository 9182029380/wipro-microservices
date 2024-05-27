package com.Wipro.BankService.controller;

import com.Wipro.BankService.client.FullResponse;
import com.Wipro.BankService.model.Bank;
import com.Wipro.BankService.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addBank(@RequestBody Bank bank){
        bankService.addBank(bank);
    }

    @GetMapping
    public ResponseEntity<List<Bank>> getAllBanks(){
        return ResponseEntity.ok(bankService.getAllBanks());
    }

    @GetMapping("with-bank/{bankid}")
    public ResponseEntity<FullResponse> getBankById(@PathVariable("bankid") int id){
        return ResponseEntity.ok(bankService.getBankById(id));
    }



}
