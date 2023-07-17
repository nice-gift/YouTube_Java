package sockets_server_side_179;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServExMultiThrd {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(1994);
        ) {
            while (true) {
                Socket socket = serverSocket.accept();
                new RunImpl(socket);
            }
        }
    }
}

class RunImpl implements Runnable {
    Socket socket;
    Thread thread;

    public RunImpl(Socket socket) {
        this.socket = socket;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(socket.getInputStream());
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);){
//            writer.println("Allegri");
            writer.write("Allegri");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}