package cf.yellowstrawberry.multath.system.connection;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Connection {
    public Socket Connection;

    public Connection(){
        try {
            Connection = new Socket("localhost",3009);

            new Thread(() -> {
                while (true){
                    try {
                        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(Connection.getOutputStream())), true);
                        printWriter.println("Version::::멍청이");
                        System.out.println("send");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            new InputThread(Connection.getInputStream(), Connection.getOutputStream()).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("start");
        new Connection();
    }
}
