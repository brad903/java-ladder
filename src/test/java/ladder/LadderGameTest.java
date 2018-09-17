package ladder;

import org.junit.Test;

import static org.junit.Assert.*;

public class LadderGameTest {
    LadderGame ladderGame = new LadderGame(3, 5);

    @Test
    public void isEigible() {
        assertEquals(true, ladderGame.isEligible(6));
    }

    @Test
    public void storeEachLadder() {
        assertEquals(false, ladderGame.storeEachLadder(4));
    }
}