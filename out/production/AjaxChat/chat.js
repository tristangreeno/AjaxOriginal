/**
 * Created by tristangreeno on 4/21/16.
 */

function addMessage() {
    $.post(
        "add-message",
        {
            author: $("#author").val(),
            text: $("#text").val()
        },
        function (data) {
            $("#text").val("");
        }
    );
}

function getMessage() {
    $.get(
        "get-messages",
        function (data) {
            var messages = JSON.parse(data);
            $("#messages").empty();
            for (var i in messages) {
                var element = $("<div>").text(messages[i].author + ": " + messages.text);
                $("#messages").append(element);
            }
        }
    );
}

setInterval(getMessage, 1000);