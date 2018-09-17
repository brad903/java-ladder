package ladder;

import org.junit.Test;

import static org.junit.Assert.*;

public class LadderGameTest {

    @Test
    public void isEigible() {
        assertEquals(true, LadderGame.isEligible(6));
    }

}