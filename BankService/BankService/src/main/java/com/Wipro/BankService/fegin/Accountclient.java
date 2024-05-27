package com.Wipro.BankService.fegin;


import com.Wipro.BankService.client.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ACCOUNT-SERVICE",url="http://localhost:9091/account")
public interface Accountclient {
    @GetMapping("bank/{bankid}")
    List<Account> findAllAccountByBank(@PathVariable("bankid") int id);


}
