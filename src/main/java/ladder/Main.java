package ladder;

import ladder.domain.LadderGame;
import ladder.domain.ResultDto;
import ladder.utils.ParseText;
import ladder.view.InputView;
import ladder.view.ResultView;

public class Main {
    public static void main(String[] args) {
        String nameText= InputView.getPeopleNames();
        String resultText = InputView.getGameResult();
        int ladderHeight = InputView.getLadderHeight();

        LadderGame ladderGame = new LadderGame(nameText);
        ladderGame.storeLadder(ladderHeight);
        ResultDto resultDto = new ResultDto(ladderGame.getLadderValues(), ladderGame.getUsers(), ParseText.getParseText(resultText));

        ResultView.printUserNames(resultDto.getUsers());
        ResultView.printLadder(resultDto.getUsers(), resultDto.getLadderValues());
        ResultView.printResult(resultDto.getResults());
        while(true){
            ResultView.printUserAsk(resultDto, InputView.getAsk());
        }
    }
}
