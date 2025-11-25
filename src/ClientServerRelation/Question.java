package ClientServerRelation;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question {


    private ArrayList <ArrayList> subject = new ArrayList();
    private String questionText;
    private Answer answer1;
    private Answer answer2;
    private Answer answer3;
    private Answer answer4;

    Scanner scanner = new Scanner(System.in);
    private int playerAnswer;

    public Question(ArrayList subject, String questionText, Answer answer1, Answer answer2, Answer answer3, Answer answer4) {
        this.subject = subject;
        this.questionText = questionText;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        subject.add(this);
        DAO.subjectList.add(subject);

    }

    public Question() {

    }

    public Answer getAnswer(int n) {
        if (n == 1) {
            return answer1;
        }
        if (n == 2) {
            return answer2;
        }
        if (n == 3) {
            return answer3;
        }
        return answer4;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int enterAnswer() {
        while (true) {
            try {
                playerAnswer = scanner.nextInt();
                if (playerAnswer >= 1 && playerAnswer <= 4) {
                    return playerAnswer;
                } else System.out.println("Enter a number between 1-4.");
            }catch (InputMismatchException e){
                System.out.println("Enter a number between 1-4.");
                scanner.nextLine();
            }

        }
    }

    public void getAnswers(Question q) {
        System.out.println("1." + answer1.getAnswerText() + " 2." + answer2.getAnswerText() + " 3." + answer3.getAnswerText() + " 4." + answer4.getAnswerText());
    }
}