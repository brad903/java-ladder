package ladder;

import java.util.Random;

public class ResultView {
    public static final String LADDER_COL = "|";
    public static final String LADDER_ROW = "-";
    public static final String LADDER_BLANK = " ";

    public static void printLadder(int peopleCount, int ladderHeight) {
        for (int i = 0; i < ladderHeight; i++) {
            printOneLayer(peopleCount);
        }
    }

    public static void printOneLayer(int peopleCount) {
        for (int i = 0; i < peopleCount - 1; i++) {
            System.out.print(LADDER_COL);
            printEachLadder();
        }
        System.out.println(LADDER_COL);
    }

    public static void printEachLadder() {
        Random random = new Random();
        if (LadderGame.isEligible(random.nextInt(10))) {
            System.out.print(LADDER_ROW);
            return;
        }
        System.out.print(LADDER_BLANK);
    }

}
