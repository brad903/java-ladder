package ladder;

import ladder.domain.LadderGame;
import ladder.dto.LadderDto;
import ladder.dto.ResultDto;
import ladder.utils.TextParser;
import ladder.view.InputView;
import ladder.view.ResultView;

import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<String> userNames = TextParser.parse(InputView.getPeopleNames());
                List<String> gameResults = TextParser.parse(InputView.getLadderResults());
                int ladderHeight = InputView.getLadderHeights();

                LadderGame ladderGame = new LadderGame(ladderHeight);
                LadderDto ladderDto = ladderGame.initLadderLines(userNames.size());
                ResultDto resultDto = ladderGame.gameStart(userNames, gameResults);

                ResultView.resultHead();
                ResultView.showNames(userNames);
                ResultView.showLadder(ladderDto);
                ResultView.showResult(gameResults);
                while (true) {
                        String userRequest = InputView.getUserRequest();
                        ResultView.showUserRequest(userRequest, resultDto);
                }
        }
}