import jodd.json.JsonSerializer;
import spark.Spark;

import java.util.ArrayList;

public class Main {

    static ArrayList<Message> messages = new ArrayList<>();

    public static void main(String[] args) {
        Spark.externalStaticFileLocation("resources");

        Spark.init();

        Spark.get(
                "get-messages",
                (request, response) -> new JsonSerializer().serialize(messages)
        );

        Spark.post(
                "add-message",
                (request, response) -> {
                    String author = request.queryParams("author");
                    String text = request.queryParams("text");

                    messages.add(new Message(messages.size(), text, author));

                    return "";
                }
        );
    }
}
