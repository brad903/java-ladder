package ladder;

import ladder.domain.LadderGame;
import ladder.view.InputView;
import ladder.view.ResultView;

public class Main {
    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(InputView.getPeopleNames(), InputView.getGameResult(), InputView.getLadderHeight());
        ladderGame.storeLadder();
        ResultView.print(ladderGame);
        while(true){
            ResultView.printUserAsk(ladderGame, InputView.getAsk());
        }
    }
}
