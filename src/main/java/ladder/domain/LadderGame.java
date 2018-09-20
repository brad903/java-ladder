package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class LadderGame {
    private List<Line> ladderValues = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private int ladderHeight;

    public LadderGame(String peopleNames, int ladderHeight) {  // game setting
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

    private void storeOneLine() {
        Line line = new Line(users.size());
        line.store();
        ladderValues.add(line);
    }

    public List<Line> getLadderValues() {
        return ladderValues;
    }

    public List<User> getUsers() {
        return users;
    }
}
