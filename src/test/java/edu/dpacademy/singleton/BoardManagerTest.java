package edu.dpacademy.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BoardManagerTest {

    @Test
    public void getInstance() throws Exception {

        Boardable boardable1 = BoardManager.getInstance();
        Boardable boardable2 = BoardManager.getInstance();

        assertTrue(boardable1 == boardable2);
    }
}