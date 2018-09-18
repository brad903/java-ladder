package string;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class StringTest {

    @Test
    public void getStringLength() throws Exception {
        String name = "이정현";
        assertThat(name.length());
    }

    @Test
    public void addString() throws Exception {
        String name = "이정현 ";
        String welcome = "안녕!";
        assertThat(name + welcome).isEqualTo("이정현 안녕!");
    }

    @Test
    public void getCharOfString() throws Exception {
        String name = "이정현";
        char[] nameChar = {'이', '정', '현'};

        for (int i = 0; i < name.length(); i++) {
            assertThat(nameChar[i]).isEqualTo(name.charAt(i));
        }
    }

    @Test
    public void stringObjectCheck() throws Exception {
        String before = "기존";
        int beforeString = before.hashCode();  // hashCode() 메서드 → 메모리 주소 확인
        int afterString = (before + "변경").hashCode();
        assertThat(afterString).isEqualTo(beforeString);
    }

}
