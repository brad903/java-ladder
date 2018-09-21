package ladder.domain;

import java.util.*;

public class LadderGame {
    private List<Line> ladderValues = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Integer> currentPositions = new ArrayList<>();
    private List<String> results = new ArrayList<>();
    private int ladderHeight;

    public LadderGame(String nameText, String resultText, int ladderHeight) {  // game setting
        List<String> peopleNames = new ArrayList<>(Arrays.asList(nameText.split(",")));
        List<String> textResults = new ArrayList<>(Arrays.asList(resultText.split(",")));
        for (int i = 0; i < peopleNames.size(); i++) {
            User user = new User(peopleNames.get(i));   // register user
            users.add(user);
            currentPositions.add(i);  // register position
            results.add(textResults.get(i));
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
        currentPositions = line.swapPositions(currentPositions);
        ladderValues.add(line);
    }

    public List<Integer> getCurrentPositions() {
        return currentPositions;
    }

    public List<Line> getLadderValues() {
        return ladderValues;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<String> getResults() {
        return results;
    }

}
