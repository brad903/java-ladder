package ladder;

import java.util.ArrayList;

public class ResultView {
    public static final String LADDER_COL = "|";
    public static final String LADDER_ROW = "-----";
    public static final String LADDER_BLANK = "     ";

    public static void printLadder(ArrayList<User> users, ArrayList<Line> ladderValues) {
        System.out.println();
        System.out.println("실행결과");
        System.out.println();
        printUserNames(users);
        for (Line line : ladderValues) {
            printOneLine(line, users.size() - 1);
        }
    }

    private static void printUserNames(ArrayList<User> users) {
        for (User user : users) {
            System.out.printf("%6s", user.getUserName());
        }
        System.out.println();
    }

    public static void printOneLine(Line line, int printLength) {
        System.out.print(LADDER_BLANK);
        for (int i = 0; i < printLength; i++) {
            System.out.print(LADDER_COL);
            printEachLadder(line.hasLadder(i));
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
