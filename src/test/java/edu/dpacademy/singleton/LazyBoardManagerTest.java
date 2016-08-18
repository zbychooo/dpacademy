package edu.dpacademy.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LazyBoardManagerTest {
    @Test
    public void getInstance() throws Exception {

        Boardable boardable1 = LazyBoardManager.getInstance();
        Boardable boardable2 = LazyBoardManager.getInstance();

        assertTrue(boardable1 == boardable2);
    }

}