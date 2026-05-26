import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class Server {
    public static void main(String[] args) {

        try {

            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server Started");

            Socket s = ss.accept();

            System.out.println("Client Connected");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );

            PrintWriter pw = new PrintWriter(
                    s.getOutputStream(),
                    true
            );

            String msg = br.readLine();

            System.out.println("Client: " + msg);

            pw.println("Hello Client");

            s.close();
            ss.close();
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }
}