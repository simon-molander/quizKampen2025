package ClientServerRelation;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 1337;


    public Server(){

        try(ServerSocket serverSocket = new ServerSocket(port)){

         while (true){
             Socket clientSocket = serverSocket.accept();
             new Thread(() -> clientHandler(clientSocket)).start();

         }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void clientHandler(Socket clientSocket){

        try (ObjectOutput out = new ObjectOutputStream(clientSocket.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream()))
        {


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
