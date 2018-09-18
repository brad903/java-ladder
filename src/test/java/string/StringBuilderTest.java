package string;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class StringBuilderTest {

    @Test
    public void append() {
        assertEquals("코드스쿼드 화이트 레벨 수강생은? 14명이다.", createMessage(14));
    }

    private String createMessage(int numberOfClass) {
        StringBuilder sb = new StringBuilder();

        // TODO append() 메소드를 활용해 구현
        sb.append("코드스쿼드 ");
        sb.append("화이트 ");
        sb.append("레벨 ");
        sb.append("수강생은? ");
        sb.append("14명이다.");

        return sb.toString();
    }

    @Test
    public void stringBufferObjectCheck() throws Exception {
        StringBuffer sb = new StringBuffer();
        int beforeSb = sb.hashCode();
        int afterSb = (sb.append("변경")).hashCode();  // hashCode() 메서드 → 메모리 주소 확인
        assertThat(afterSb).isEqualTo(beforeSb);
    }
}
