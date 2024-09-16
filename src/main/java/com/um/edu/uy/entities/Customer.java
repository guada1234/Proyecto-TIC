package com.um.edu.uy.entities;

import com.um.edu.uy.enums.CountryCode;
import com.um.edu.uy.enums.IdDocumentType;

import java.time.LocalDate;
import java.util.List;

public class Customer {

    private String email;

    private String firstName;

    private  String lastName;

    private LocalDate dateOfBirth;

    private List<Card> paymentMethods;

    private CountryCode celCountryCode;

    private long celNumber;

    private IdDocumentType idType;

    private CountryCode idCountry;

    private long idNumber;

    private String password;
}