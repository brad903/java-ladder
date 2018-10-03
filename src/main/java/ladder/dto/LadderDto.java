package ladder.dto;

import java.util.List;

public class LadderDto {
    private List<List<Boolean>> lineValues;

    public LadderDto(List<List<Boolean>> lineValues) {
        this.lineValues = lineValues;
    }

    public List<List<Boolean>> getLineValues() {
        return lineValues;
    }
}
