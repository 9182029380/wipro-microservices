package com.Wipro.AccountService.repository;

import com.Wipro.AccountService.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Accountrepo extends JpaRepository<Account,Integer> {

    List<Account> findByBankId(int bankid);
}
