package com.um.edu.uy.entities;

import com.um.edu.uy.enums.CardType;

import java.time.YearMonth;

public class Card {

    private CardType cardType;

    private String holderName;

    private long cardNumber;

    private YearMonth expirationDate;

    private int cvv;

}
