package ladder;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;


import java.util.ArrayList;


public class LadderGameTest {
    LadderGame ladderGame = new LadderGame(3, 5);

    @Test
    public void isEigible() {
        assertThat(ladderGame.isEligible(6)).isEqualTo(true);
    }

    @Test
    public void storeEachLadder() {
        int testValue = 3;
        if (testValue > LadderGame.RANDOM_PASS) {
            assertThat(ladderGame.storeEachLadder(testValue)).isEqualTo(true);
            return;
        }
        assertThat(ladderGame.storeEachLadder(testValue)).isEqualTo(false);
    }

    @Test
    public void showLadderStatus() {
        int testPeopleCount = 5;
        int testLadderHeight = 10;
        LadderGame ladderGame = new LadderGame(testPeopleCount, testLadderHeight);
        ladderGame.storeLadder();

        ArrayList<ArrayList<Boolean>> ladderValues = ladderGame.getLadderValues();
        for (ArrayList<Boolean> ladderValue : ladderValues) {
            ladderOneLayer(ladderValue);
            System.out.println();
        }
    }

    private void ladderOneLayer(ArrayList<Boolean> ladderValue) {
        for (Boolean aBoolean : ladderValue) {
            int boolVal = aBoolean ? 1 : 0;
            System.out.print(boolVal + " ");
        }
    }

}