import java.sql.Timestamp;

public class Entry {
    String body;
    String user;

    public String getBody() {
        return body;
    }

    public String getUser() {
        return user;
    }


    public Entry(String body, String user) {
        this.body = body;
        this.user = user;


    }
}