package ClientServerRelation;

import java.io.Serializable;

public class Message implements Serializable {

    private String text;

    public Message(String text){
        this.text=text;

    }

    public Message() {

    }

    public String getText() {
        return text;
    }
}
