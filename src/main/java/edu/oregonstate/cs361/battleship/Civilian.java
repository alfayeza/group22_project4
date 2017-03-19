package edu.oregonstate.cs361.battleship;

/**
 * Created by ASF_9 on 3/3/2017.
 */
public class Civilian extends Ship {

    public Civilian(String n, int l,Coordinate s, Coordinate e) {
        super(n, l, s, e);
    }

        private String name;
        private int length;
        private Coordinate start;
        private Coordinate end;
}
