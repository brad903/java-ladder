package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class ResultDto {
    private List<Line> ladderValues;
    private List<User> users;
    private List<String> results;

    public ResultDto(List<Line> ladderValues, List<User> users, List<String> results) {
        this.ladderValues = ladderValues;
        this.users = users;
        this.results = results;
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
