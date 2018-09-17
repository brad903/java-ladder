package ladder;

public class LadderGame {
    public static final int PASS_VALUE = 5;

    public static boolean isEligible(int randomValue) {
        return randomValue >= PASS_VALUE;
    }

    public static void main(String[] args) {
        ResultView.printLadder(InputView.getPeopleCount(), InputView.getLadderHeight());
    }
}
