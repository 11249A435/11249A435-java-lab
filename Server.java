import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();

            System.out.println("Client connected.");

            // Receive message from client
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // Send message to client
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            String message = input.readLine();

            System.out.println("Client says: " + message);

            output.println("Hello Client! Message received.");

            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}