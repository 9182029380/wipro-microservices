package com.Wipro.BankService.client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue
    private int id;//pk
    private String name;
    private String email;
    private String phone;
    private String accountNumber;
    private String accountType;
    private double balance;
    private String status;
    private String createdDate;
    private String updatedDate;
    private String createdBy;
    private String updatedBy;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private int bankId;//fk
}
