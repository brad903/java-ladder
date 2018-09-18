package ladder;

import java.util.ArrayList;
import java.util.Random;

public class LadderGame {
    public static final int RANDOM_PASS = 5;
    public static final int RANDOM_BOUND = 10;
    private int peopleCount;
    private int ladderHeight;
    private ArrayList<ArrayList<Boolean>> ladderValues = new ArrayList<>();

    LadderGame(int peopleCount, int ladderHeight) {
        this.peopleCount = peopleCount;
        this.ladderHeight = ladderHeight;
    }

    public boolean isEligible(int randomValue) {
        return randomValue >= RANDOM_PASS;
    }

    public void storeLadder() {
        for (int i = 0; i < ladderHeight; i++) {
            storeOneLayer();
        }
    }

    public void storeOneLayer() {
        ArrayList<Boolean> ladderValue = new ArrayList<>();
        for (int i = 0; i < peopleCount - 1; i++) {
            Random random = new Random();
            ladderValue.add(storeEachLadder(random.nextInt(RANDOM_BOUND)));
        }
        ladderValues.add(ladderValue);
    }

    public boolean storeEachLadder(int randomVal) {
        if (isEligible(randomVal)) {
            return true;
        }
        return false;
    }

    public ArrayList<ArrayList<Boolean>> getLadderValues() {
        return ladderValues;
    }

    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(InputView.getPeopleCount(), InputView.getLadderHeight());
        ladderGame.storeLadder();
        ResultView.printLadder(ladderGame.getLadderValues());
    }
}
