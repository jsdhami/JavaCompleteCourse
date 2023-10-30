package JavaServer;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {
    public static void main(String[] args) {
        int port = 8085; // You can change this to your desired port

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected from " + clientSocket.getInetAddress());

                handleRequest(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleRequest(Socket clientSocket) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))
        ) {
            // Read the HTTP request
            String request = reader.readLine();
            System.out.println("Received from client: " + request);

            // Send a basic HTML response
            String response = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\n\r\n" +
                    "<html> <body><h1>Hello Janak, this is a simple HTTP server!</h1></body></html>";

            writer.write(response);
            writer.flush();

            // Close the connection
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
