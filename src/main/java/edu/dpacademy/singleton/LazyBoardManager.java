package edu.dpacademy.singleton;

public class LazyBoardManager implements Boardable {

    private static Boardable instance;

    private LazyBoardManager() {
    }

    public static Boardable getInstance() {
        if (instance == null) {
            instance = new LazyBoardManager();
        }
        return instance;
    }
}
