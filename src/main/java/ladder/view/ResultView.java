package ladder.view;

import ladder.domain.LadderGame;
import ladder.domain.Line;
import ladder.domain.User;

import java.util.*;

public class ResultView {
    public static final String LADDER_COL = "|";
    public static final String LADDER_ROW = "-----";
    public static final String LADDER_BLANK = "     ";
    public static final String NAME_SPACE = "6";

    public static void print(LadderGame ladderGame) {
        System.out.println();
        System.out.println("실행결과");
        System.out.println();
        printUserNames(ladderGame.getUsers());
        printLadder(ladderGame);
        printResult(ladderGame.getResults());
    }

    private static void printUserNames(List<User> users) {
        for (User user : users) {
            printEachText(user.printUserName());
        }
        System.out.println();
    }

    public static void printLadder(LadderGame ladderGame) {
        for (Line line : ladderGame.getLadderValues()) {
            printOneLine(line, ladderGame.getUsers().size() - 1);
        }
    }

    private static void printOneLine(Line line, int printLength) {
        System.out.print(LADDER_BLANK);
        for (int i = 0; i < printLength; i++) {
            System.out.print(LADDER_COL);
            printEachLadder(line.hasLadder(i));
        }
        System.out.println(LADDER_COL);
    }

    private static void printEachLadder(boolean isLadder) {
        if (isLadder) {
            System.out.print(LADDER_ROW);
            return;
        }
        System.out.print(LADDER_BLANK);
    }

    public static void printResult(List<String> getResults) {
        for (String result : getResults) {
            printEachText(result);
        }
        System.out.println();
    }

    private static void printEachText(String text) {
        System.out.printf("%" + NAME_SPACE + "s", text);
    }

    public static void printUserAsk(LadderGame ladderGame, String answer) {
        Map<String, String> result = new HashMap<>();

        int index = 0;
        for (int i = 0; i < ladderGame.getUsers().size(); i++) {
            int position = ladderGame.getCurrentPositions().get(index);
            result.put(ladderGame.getUsers().get(position).printUserName(), ladderGame.getResults().get(index));
            index++;
        }

        System.out.println();
        System.out.println("실행결과");
        if (answer.equals("all")) {
            printAllResult(result);
            return;
        }
        System.out.println(result.get(answer));

    }

    private static void printAllResult(Map<String, String> result) {
        Set set = result.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = (String)iterator.next();
            System.out.println(key + " : " + result.get(key));
        }
    }

}
