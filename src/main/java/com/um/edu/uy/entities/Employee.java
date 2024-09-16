package com.um.edu.uy.entities;

import com.um.edu.uy.enums.CountryCode;
import com.um.edu.uy.enums.EmployeeRole;

import java.time.LocalDate;
public class Employee {

    private String firstName;

    private  String lastName;

    private EmployeeRole role;

    private String address;

    private LocalDate dateOfBirth;

    private CountryCode celCountryCode;

    private long celNumber;

    private String idType;

    private CountryCode idCountry;

    private long idNumber;

    private String password;
}
