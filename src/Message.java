/**
 * Created by tristangreeno on 4/21/16.
 */
public class Message {
    int id;
    String message;
    String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Message(int id, String message, String author) {
        this.id = id;
        this.message = message;
        this.author = author;
    }
}
