package calculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();

    @Test
    public void 단순_문자열() {
        assertThat(calculator.add("1")).isEqualTo(1);
    }

    @Test
    public void 콤마_문자열() {
        assertThat(calculator.add("2,3")).isEqualTo(5);
    }

    @Test
    public void 콤마_세미콜론_문자() {
        assertThat(calculator.add("2,4:3;9")).isEqualTo(18);
    }

}