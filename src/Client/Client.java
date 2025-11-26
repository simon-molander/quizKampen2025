package Client;

import Database.Message;
import QuestionsAndAnswers.Question;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    Message stringChecker = new Message();
    String hostname = "127.0.0.1";
    int port = 5432;
    int val;

    public Client(){

        try(Socket adressSocket = new Socket(hostname, port);
            ObjectOutputStream out = new ObjectOutputStream(adressSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(adressSocket.getInputStream());
            Scanner scanner = new Scanner(System.in)) {

            while(true) {
                Object msg = in.readObject();
                if (msg instanceof String) {
                    System.out.println(msg);
                    out.flush();
                }
                if (msg instanceof Question) {
                    Question currentQuestion = (Question) msg;
                    System.out.println(currentQuestion.getQuestionText());
                    System.out.println(currentQuestion.getAnswers(currentQuestion));
                    val = scanner.nextInt();
                    out.writeObject(currentQuestion.getAnswer(val));
                }
                if(msg instanceof Message){
                    System.out.println(((Message) msg).getText());
                    val = scanner.nextInt();
                    out.writeObject(val);
                }
            }


        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
