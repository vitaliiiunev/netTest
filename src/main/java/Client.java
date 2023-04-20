import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {

    private static final int PORT = 8889;

    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost", PORT);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println(in.readLine());

            out.println("Привет клиент");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
