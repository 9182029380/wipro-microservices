package com.Wipro.BankService.repository;

import com.Wipro.BankService.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bankrepo  extends JpaRepository<Bank,Integer> {
}
