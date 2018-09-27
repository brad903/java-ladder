package ladder.domain;

import ladder.utils.ParseText;

import java.util.*;

public class LadderGame {
    private List<Line> ladderValues = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public LadderGame(String nameText) {  // game setting
        regisUser(ParseText.getParseText(nameText));
    }

    public void regisUser(List<String> peopleNames) {
        for (int i = 0; i < peopleNames.size(); i++) {
            User user = new User(peopleNames.get(i));
            users.add(user);
        }
    }

    public void storeLadder(int ladderHeight) {
        for (int i = 0; i < ladderHeight; i++) {
            storeOneLine();
        }
    }

    private void storeOneLine() {
        Line line = new Line(users.size(), getPrevPositions());
        line.pointStore();
        line.swapPositions();
        ladderValues.add(line);
    }

    private List<Integer> getPrevPositions() {
        int ladderSize = ladderValues.size();
        if (ladderSize == 0) {
            return null;
        }
        return ladderValues.get(ladderSize -1).getCurrentPositions();
    }

    public List<Line> getLadderValues() {
        return ladderValues;
    }

    public List<User> getUsers() {
        return users;
    }

}
