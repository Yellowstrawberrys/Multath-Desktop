package Internet;

import java.io.*;
import java.math.BigInteger;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Connector {

    OutputStream opt;

    public Connector() {
        try (Socket socket = new Socket("localhost", 3009)) {

             opt = socket.getOutputStream();

        } catch (UnknownHostException ex) {

            System.out.println("Can't connect to Server");

        } catch (IOException ex) {

            System.out.println("I/O error: " + ex.getMessage());

        }
    }

    public void auth(String id, String pass) {
        new Thread(() -> {
            try {
                opt.write((sha512(id)+"[][][][][][][][][][][][][][][][][][][][]"+sha512(pass)).getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public String sha512(String txt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        byte[] messageDigest = md.digest(txt.getBytes());
        BigInteger no = new BigInteger(1, messageDigest);
        String hashtext = no.toString(16);

        while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
        }
        return hashtext;
    }
}
