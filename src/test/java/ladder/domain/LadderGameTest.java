package ladder.domain;

import ladder.domain.LadderGame;
import ladder.domain.Line;
import org.junit.Test;
import java.util.List;


public class LadderGameTest {
    String testUsers = "pobi,honux,crong,jk";
    int testHeight = 5;

    @Test
    public void 사다리값_정보_출력() {
        LadderGame ladderGame = new LadderGame(testUsers, testHeight);
        ladderGame.storeLadder();

        List<Line> ladderValues = ladderGame.getLadderValues();
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