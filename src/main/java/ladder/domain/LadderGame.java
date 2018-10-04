package ladder.domain;

import ladder.dto.LadderDto;
import ladder.dto.ResultDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static ladder.utils.TextLengthAdjuster.textAdjust;

public class LadderGame {
    private List<Line> LadderLines = new ArrayList<>();
    private int ladderHeight;

    public LadderGame(int ladderHeight) {
        this.ladderHeight = ladderHeight;
    }

    public LadderDto initLadderLines(int countOfPerson) {
        List<List<Boolean>> lineValues = new ArrayList<>();

        for (int i = 0; i < ladderHeight; i++) {
            Line line = new Line(countOfPerson);
            lineValues.add(line.valueToDto(countOfPerson));  // ladderDTO
            LadderLines.add(line);
        }
        LadderDto ladderDto = new LadderDto(lineValues);
        return ladderDto;
    }

    public ResultDto gameStart(List<String> names, List<String> results) {
        Map<String, String> gameResult = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            int startPoisition = i;
            gameResult.put(textAdjust(names.get(i)), results.get(movePositions(startPoisition)));  // resultDTO
        }
        ResultDto resultDto = new ResultDto(gameResult);
        return resultDto;
    }

    public int movePositions(int position) {
        for (int j = 0; j < ladderHeight; j++) {
            position = LadderLines.get(j).move(position);
        }
        return position;
    }

}
