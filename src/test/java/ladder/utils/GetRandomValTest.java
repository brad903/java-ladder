package ladder.utils;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GetRandomValTest {

    @Test
    public void 제한된범위_넘는_랜덤값() {
        assertThat(GetRandomVal.getRandomVal() >= 10).isEqualTo(false);
    }

    @Test
    public void 범위내_랜덤값() {
        assertThat(GetRandomVal.getRandomVal() >= 0 && GetRandomVal.getRandomVal() < 10).isEqualTo(true);
    }
}