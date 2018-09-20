package ladder.domain;

public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String printUserName() {
        if (userName.length() > 5) {
            return sliceName();
        }
        return userName;
    }

    private String sliceName() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(userName.charAt(i));
        }
        return sb.toString();
    }
}
