package ClientServerRelation;

import java.io.Serializable;

public class Messages implements Serializable {

    private Object sending;


    public Messages(Object sending){
        this.sending=sending;
    }


    public String getText() {
        return sending.toString();
    }
}
