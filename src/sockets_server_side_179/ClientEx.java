package sockets_server_side_179;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("127.0.0.1", 1994), 2000);
            Scanner scanner=new Scanner(socket.getInputStream());
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }

    }
}
