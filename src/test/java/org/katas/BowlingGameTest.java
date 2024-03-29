package org.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    public void gutterGameShouldScoreZero() {
        Game g = new Game();
        //20 misses / no pin rolls
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        g.roll(0);
        assertEquals(0, g.score());
    }

    @Test
    public void allOnesShouldScoreTwenty() {
        Game g = new Game();
        //20 1 pin rolls
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        g.roll(1);
        assertEquals(20, g.score());
    }
}
