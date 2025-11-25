package ClientServerRelation;

import java.util.ArrayList;

public class Answer {

    private String answerText;
    private boolean trueOrFalse;


    public Answer(String answerText, boolean trueOrFalse){
        this.answerText=answerText;
        this.trueOrFalse=trueOrFalse;
    }

    public Answer() {

    }

    public String getAnswerText() {
        return answerText;
    }

    public boolean isCorrect() {
        return trueOrFalse;
    }
}