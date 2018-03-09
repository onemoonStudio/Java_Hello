package com.javalec.iostream;

import java.io.*;

public class Io_dataiostraem {
    public static void main(String[] args) {
        Io_dataiostraem iods = new Io_dataiostraem();
        iods.data_io();
    }

    public void data_io(){
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;

        try {
//            os = new FileOutputStream(Static_path.MYPATH + "hello4.txt");
//            dos = new DataOutputStream(os);
//            dos.writeUTF("헬로우 버전 4 입니다.");

            is = new FileInputStream(Static_path.MYPATH + "hello4.txt");
            dis = new DataInputStream(is);
            System.out.println(dis.readUTF());

            // 이상한점 -> dis 만 사용했을 경우에는 readUTF 할 시에 EOFException 에러 발생
            // dos로 작성한 파일은 dis 로 읽을 수 있으나 그렇지 않은 파일들은 읽을 수 없음
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(is != null){try{is.close();}catch (IOException e){ e.printStackTrace(); } }
            if(dis != null){try{dis.close();}catch (IOException e){ e.printStackTrace(); } }
            if(os != null){try{os.close();}catch (IOException e){ e.printStackTrace(); } }
            if(dos != null){try{dos.close();}catch (IOException e){ e.printStackTrace(); } }

        }


    }

}
