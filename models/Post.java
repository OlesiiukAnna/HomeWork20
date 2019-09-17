package home.Task_20.models;

public class Post {

    private int userId;
    private int id;
    private String title;
    private String body;

    public Post() {
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" + "\n" +
                "userId = " + userId + "\n" +
                "id = " + id + "\n" +
                "title = '" + title +  "\n" +
                "body = '" + body + '\'' +
                '}';
    }
}
