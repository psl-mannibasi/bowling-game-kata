package org.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    public void gutterGameShouldScoreZero() {
        Game g = new Game();
        g.roll(0);
        assertEquals(0, g.score());
    }
}
