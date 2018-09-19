package ladder;

import java.util.ArrayList;

public class LadderGame {
    private ArrayList<Line> ladderValues = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private int ladderHeight;

    LadderGame(String peopleNames, int ladderHeight) {  // game setting
        for (String peopleName : peopleNames.split(",")) {
            User user = new User(peopleName);   // register user
            users.add(user);
        }
        this.ladderHeight = ladderHeight;
    }

    public void storeLadder() {
        for (int i = 0; i < ladderHeight; i++) {
            storeOneLine();
        }
    }

    public void storeOneLine() {
        Line line = new Line(users.size());
        line.store();
        ladderValues.add(line);
    }

    public ArrayList<Line> getLadderValues() {
        return ladderValues;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(InputView.getPeopleNames(), InputView.getLadderHeight());
        ladderGame.storeLadder();
        ResultView.printLadder(ladderGame.getUsers(), ladderGame.getLadderValues());
    }
}
