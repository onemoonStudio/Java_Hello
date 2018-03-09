package com.javalec.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket_Server {

    ServerSocket serverSocket = null;
    Socket socket = null;
    PrintWriter writer = null;
    BufferedReader reader = null;
    String lineStr;

    public Socket_Server() {
        try {
            serverSocket = new ServerSocket(2000);

            while (true) {
                socket = serverSocket.accept();
                System.out.println("Client 요청이 들어왔습니다.");

                writer = new PrintWriter(socket.getOutputStream(), true);
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                while ((lineStr = reader.readLine()) != null) {
                    writer.write(lineStr);
                    System.out.println("Client : " + lineStr);
                }

                writer.close();
                reader.close();
                socket.close();
            }
        } catch (Exception e) {}

    }

    public static void main(String[] args) {
        new Socket_Server();
    }
}

