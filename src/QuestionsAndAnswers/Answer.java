package QuestionsAndAnswers;

import java.io.Serializable;

public class Answer implements Serializable {

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