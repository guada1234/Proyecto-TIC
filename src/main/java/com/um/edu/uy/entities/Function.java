package com.um.edu.uy.entities;

import com.um.edu.uy.exceptions.InvalidDataException;

import java.time.LocalDateTime;

public class Function {

    private final LocalDateTime dateAndTime;

    private final Movie movie;

    private boolean[][] reservedSeats;

    public Function(LocalDateTime dateAndTime, Movie movie, boolean[][] reservedSeats) {
        this.dateAndTime = dateAndTime;
        this.movie = movie;
        this.reservedSeats = reservedSeats;
    }

    public void MakeSingleReservation(int seatRow, int seatColumn) throws InvalidDataException {
        if (seatRow >= reservedSeats.length || seatRow < 0)
            throw new InvalidDataException("Invalid row number");
        else if (seatColumn >= reservedSeats[0].length || seatColumn < 0)
            throw new InvalidDataException("Invalid column number");
        else
            reservedSeats[seatRow][seatColumn] = true;
    }
}
