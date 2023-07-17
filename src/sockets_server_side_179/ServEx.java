package sockets_server_side_179;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServEx {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1995);
             Socket socket = serverSocket.accept();
             Scanner scanner = new Scanner(socket.getInputStream());
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        ) {
//            writer.println("Allegri");
            writer.write("Allegri");
        }
    }
}