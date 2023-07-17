package HTTP_protokol_180;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ClientEx {
    public static void main(String[] args) throws IOException {
        URLConnection connection = new URL("https://jufc.ru/").openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        scanner.useDelimiter("\\Z");
        System.out.println(scanner.next());
    }
}
