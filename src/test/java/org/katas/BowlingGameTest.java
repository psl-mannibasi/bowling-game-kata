package org.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    public void gutterGameShouldScoreZero() {
        assertEquals(0, Game.score());
    }
}
