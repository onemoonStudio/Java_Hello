package com.javalec.iostream;

import java.io.*;

public class Io_basic {
    public Io_basic(){

    }

    // Input / Output Stream 에서는 에러 핸들러가 필수로 있어야 한다. ( try catch )
    public void read_func(){
        InputStream is = null;
        try{
            is = new FileInputStream(Static_path.MYPATH + "hello.txt");
            while(true){
                int i = is.read();
                System.out.println("데이터는 : " + i);
                if(i == -1) break;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try {
                if(is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void write_func(){
        // byte stream 형식으로 변환해야 한다는것을 잊지 말자
        OutputStream os = null;
        try{
            os = new FileOutputStream(Static_path.MYPATH + "hello2.txt");
            String hello2 = "안녕하세요 원문입니다.";
            byte[] bs = hello2.getBytes();
            os.write(bs);
            // 폴더에 hello2.txt 가 작성되어 있음
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try {
                if(os != null) os.close();
                // 끝난경우 연결을 끊는다.
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
