package edu.dpacademy.singleton;

public class BoardManager implements Boardable {

    private static Boardable instance = new BoardManager();

    private BoardManager() {
    }

    public static Boardable getInstance() {
        return instance;
    }
}
