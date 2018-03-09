package com.javalec.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class URLConnection {

    public URLConnection() {

        String code = null;
        System.out.println("주소를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.next();

        try {
            URL url = new URL(address);
            java.net.URLConnection con = url.openConnection();
            BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
//			FileWriter fw = new FileWriter("MYPATH", false);
//
//			while ((code = webData.readLine()) != null) {
//				fw.write(code);
//			}
            System.out.println("The End");

//            fw.close();
//            주석 해제시 입력한 주소의 html 파일을 읽고 쓴다.
            webData.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
