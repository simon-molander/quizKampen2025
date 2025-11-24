package ClientServerRelation;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 1337;
    private Score playerScore1 = new Score();
    private Score playerScore2 = new Score();
    public Server(){

        try(ServerSocket serverSocket = new ServerSocket(port)){

         while (true){
             System.out.println("Waiting for player 1");
             Socket player1 = serverSocket.accept();
             System.out.println("Player one connected");

             System.out.println("Waiting for player 2");
             Socket player2 = serverSocket.accept();


             new Thread(() -> clientHandler(player1, playerScore1)).start();
             new Thread(() -> clientHandler(player2, playerScore2)).start();
         }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void clientHandler(Socket clientSocket1, Score playerScore){

        try (ObjectOutput out = new ObjectOutputStream(clientSocket1.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(clientSocket1.getInputStream()))
        {
            out.writeObject("Spelet börjar!!! snälla fungera!!!!!!!!!");
            out.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Server server = new Server();

    }

}
