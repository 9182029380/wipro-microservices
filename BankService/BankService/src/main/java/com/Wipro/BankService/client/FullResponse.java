package com.Wipro.BankService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    private String bankName;
    private String bankAddress;
    private String bankContact;
    private String bankEmail;
    private String bankType;
    private List<Account> accounts;


}
