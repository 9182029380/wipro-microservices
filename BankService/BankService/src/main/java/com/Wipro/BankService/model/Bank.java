package com.Wipro.BankService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bank")
public class Bank {
    @Id
    private int id;
    private String bankName;
    private String bankAddress;
    private String bankContact;
    private String bankEmail;
    private String bankPassword;
    private String bankUsername;
    private String bankType;
    private String bankStatus;


}
