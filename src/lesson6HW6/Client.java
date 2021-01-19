package lesson6HW6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static Socket socket;
    static final int PORT = 8787;
    static final String IP_ADDRESS = "localhost";


    public static void main(String[] args) {
        try {
            socket = new Socket(IP_ADDRESS, PORT);
            Scanner sc = new Scanner(System.in);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            while (true) {
                String str = sc.nextLine();

                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        out.println(str);
                    }
                });
                t2.start();
                Scanner scanner = new Scanner(socket.getInputStream());
                if (str.equals("/end")){
                    System.out.println("Client out!");
                    t2.interrupt();
                    break;
                }
                String s = scanner.nextLine();
                System.out.println("Server: " + s);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }  finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
