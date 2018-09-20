package ladder;

import ladder.domain.LadderGame;
import ladder.view.InputView;
import ladder.view.ResultView;

public class Main {
    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(InputView.getPeopleNames(), InputView.getLadderHeight());
        ladderGame.storeLadder();
        ResultView.printLadder(ladderGame.getUsers(), ladderGame.getLadderValues());
    }
}
