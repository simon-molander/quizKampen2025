package Server;


import Database.DAO;
import Database.Message;
import QuestionsAndAnswers.Answer;
import QuestionsAndAnswers.Question;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    int port = 5432;
    public static ArrayList<Question> category = new ArrayList<>();
    DAO dataB = new DAO();

    public Server(){

        try(ServerSocket serverSocket = new ServerSocket(port)){

         while (true){
             System.out.println("Waiting for player 1");
             Socket player1 = serverSocket.accept();
             System.out.println("Player one connected");

             System.out.println("Waiting for player 2");
             Socket player2 = serverSocket.accept();
             System.out.println("PLayer two connected");


             new Thread(() -> clientHandler(player1, player2)).start();
         }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void clientHandler(Socket player1, Socket player2){

        try (ObjectOutputStream out1 = new ObjectOutputStream(player1.getOutputStream());
             ObjectOutputStream out2 = new ObjectOutputStream(player2.getOutputStream());
             ObjectInputStream in1 = new ObjectInputStream(player1.getInputStream());
             ObjectInputStream in2 = new ObjectInputStream(player2.getInputStream()))
        {

            dataB.shuffleQuestions();
            boolean player1Chooses = true;


            while (true) {
                ObjectOutputStream currentplayerOut;
                ObjectInputStream currentplayerIn;

                if (player1Chooses) {
                    currentplayerOut = out1;
                    currentplayerIn = in1;

                }else {
                    currentplayerOut = out2;
                    currentplayerIn = in2;
                }
                currentplayerOut.writeObject("Choose a category");
                currentplayerOut.flush();
                currentplayerOut.writeObject(new Message("1.Media 2.History 3.Nature 4.Geography"));
                currentplayerOut.flush();

                int chosenCat = (int) currentplayerIn.readObject();
                dataB.setCategory(chosenCat);


                for (int i = 0; i < 5; i++) {
                    currentplayerOut.writeObject(dataB.getQuestion(category));
                    currentplayerOut.flush();
                    Answer playerAnswer = (Answer) currentplayerIn.readObject();
                    currentplayerOut.writeObject(correctOrNot(playerAnswer.isCorrect()));
                    currentplayerOut.flush();
                }
                dataB.index = 0;

                if(player1Chooses){
                    player1Chooses = false;
                } else player1Chooses = true;

                if (player1Chooses) {
                    currentplayerOut = out1;
                    currentplayerIn = in1;

                }else {
                    currentplayerOut = out2;
                    currentplayerIn = in2;
                }



                for (int i = 0; i < 5; i++) {
                    currentplayerOut.writeObject(dataB.getQuestion(category));
                    currentplayerOut.flush();
                    Answer playerAnswer = (Answer) currentplayerIn.readObject();
                    currentplayerOut.writeObject(correctOrNot(playerAnswer.isCorrect()));
                    currentplayerOut.flush();
                }

                dataB.index = 0;

                out1.writeObject("Spelet är klart för dig!");
                out1.flush();
                out2.writeObject("Spelet är klart för dig!");
                out2.flush();


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }public String correctOrNot(boolean answer){
        if (answer){
            //Här kan man lägga till en score counter.
            return "Correct answer!";
        } else {
            return "Incorrect answer.";

        }

    }

    public void swapCurrentPlayer(Boolean bool){

    }

    public static void main(String[] args) {
        Server server = new Server();

    }

}
