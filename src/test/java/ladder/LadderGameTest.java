package ladder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


import java.util.ArrayList;


public class LadderGameTest {
    String testUsers = "pobi,honux,crong,jk";
    int testHeight = 5;

    @Test
    public void showLadderStatus() {
        LadderGame ladderGame = new LadderGame(testUsers, testHeight);
        ladderGame.storeLadder();

        ArrayList<Line> ladderValues = ladderGame.getLadderValues();
        for (Line line : ladderValues) {
            ladderOneLine(line);
            System.out.println();
        }
    }

    private void ladderOneLine(Line line) {
        for (int i = 0; i < testUsers.split(",").length - 1; i++) {
            int boolVal = line.hasLadder(i) ? 1 : 0;
            System.out.print(boolVal + " ");
        }
    }

}