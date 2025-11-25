package ClientServerRelation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    String hostname = "127.0.0.1";
    int port = 5432;

    public Client(){

        try(Socket adressSocket = new Socket(hostname, port);
            ObjectOutputStream out = new ObjectOutputStream(adressSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(adressSocket.getInputStream());
            Scanner scanner = new Scanner(System.in)) {

            Object msg = in.readObject();
            System.out.println(msg);



        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
