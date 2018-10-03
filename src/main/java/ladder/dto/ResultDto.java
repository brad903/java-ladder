package ladder.dto;

import java.util.Map;

public class ResultDto {
    private Map<String, String> gameResult;

    public ResultDto(Map<String, String> gameResult) {
        this.gameResult = gameResult;
    }

    public Map<String, String> getGameResult() {
        return gameResult;
    }

}
