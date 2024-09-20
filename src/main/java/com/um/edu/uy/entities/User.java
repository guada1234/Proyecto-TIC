package com.um.edu.uy.entities;

import com.um.edu.uy.enums.CountryCode;
import com.um.edu.uy.enums.IdDocumentType;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class User {
    private String email;

    private String firstName;

    private  String lastName;

    private LocalDate dateOfBirth;
    private CountryCode celCountryCode;

    private long celNumber;

    private IdDocumentType idType;

    private CountryCode idCountry;

    private long idNumber;

    private String password;
}
