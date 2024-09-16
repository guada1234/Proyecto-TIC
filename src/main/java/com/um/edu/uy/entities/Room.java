package com.um.edu.uy.entities;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Room {
    private int rows;

    private int columns;

    private List<Function> functions;

    public Room() {
        this.rows = 10;
        this.columns = 15;
        this.functions = new LinkedList<Function>();
    }

    public Room(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.functions = new LinkedList<Function>();
    }


    public void CreateFunction(LocalDateTime dateAndTime, Movie movie) {
        boolean[][] seatsMatrix = new boolean[rows][columns];
        Function newFunction = new Function(dateAndTime,movie,seatsMatrix);

        functions.add(newFunction);
    }
}
