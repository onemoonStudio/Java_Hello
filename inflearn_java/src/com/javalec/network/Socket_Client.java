package com.javalec.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Socket_Client {

    Socket socket = null;
    PrintWriter writer = null;
    BufferedReader reader = null;

    public Socket_Client() {
        try {
            socket = new Socket("localhost", 2000);
            writer = new PrintWriter(socket.getOutputStream(), true);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String str = null;
            BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));

            while ((str = sReader.readLine()) != null) {
                writer.println(str);
                System.out.println("Server : " + str);
            }

            writer.close();
            reader.close();
            sReader.close();
            socket.close();
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        new Socket_Client();
    }
}
