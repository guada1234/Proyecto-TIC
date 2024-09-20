package com.um.edu.uy.entities;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class Room {
    private int rows;

    private int columns;

    private List<Screening> screenings;

    public Room() {
        this.rows = 10;
        this.columns = 15;
        this.screenings = new LinkedList<Screening>();
    }

    public Room(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.screenings = new LinkedList<Screening>();
    }


    public void CreateFunction(LocalDateTime dateAndTime, Movie movie) {
        boolean[][] seatsMatrix = new boolean[rows][columns];
        Screening newScreening = new Screening(dateAndTime,movie,seatsMatrix);

        screenings.add(newScreening);
    }
}
