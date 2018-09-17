package ladder;

import java.util.ArrayList;

public class ResultView {
    public static final String LADDER_COL = "|";
    public static final String LADDER_ROW = "-";
    public static final String LADDER_BLANK = " ";

    public static void printLadder(ArrayList<ArrayList<Boolean>> ladderValues) {
        for (ArrayList ladderValue : ladderValues) {
            printOneLayer(ladderValue);
        }
    }

    public static void printOneLayer(ArrayList<Boolean> ladderValue) {
        for (Boolean isLadder : ladderValue) {
            System.out.print(LADDER_COL);
            printEachLadder(isLadder);
        }
        System.out.println(LADDER_COL);
    }

    public static void printEachLadder(boolean isLadder) {
        if (isLadder) {
            System.out.print(LADDER_ROW);
            return;
        }
        System.out.print(LADDER_BLANK);
    }

}
