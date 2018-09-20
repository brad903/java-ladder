package ladder.domain;

import ladder.domain.User;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class UserTest {
    @Test
    public void 이름_5글자_초과() {
        User testUser = new User("abcdefghijklmn");
        assertThat("abcde").isEqualTo(testUser.printUserName());
    }

    @Test
    public void 이름_5글자_이하() {
        User testUser = new User("abc");
        assertThat("abc").isEqualTo(testUser.printUserName());
    }
}