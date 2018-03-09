package com.javalec.iostream;

import java.io.*;

public class Io_basic_cp {
    public Io_basic_cp(){
        copy_and_paste_2();
    }

    private void copy_and_paste(){
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(Static_path.MYPATH + "hello.txt");
            os = new FileOutputStream(Static_path.MYPATH + "hello3.txt");

            while(true){
                int i = is.read();
                if(i == -1) break;
                os.write(i);
            }


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(os != null){
                try{
                    os.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            if(is != null){
                try{
                    is.close();
                }catch (IOException e ){
                    e.printStackTrace();
                }

            }
        }
    }

    private void copy_and_paste_2(){
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(Static_path.MYPATH + "hello.txt");
            os = new FileOutputStream(Static_path.MYPATH + "hello3.txt");

            byte[] bs = new byte[5];

            while(true){
                int count = is.read(bs);
                if(count == -1) break;
                os.write(bs,0,count);
            }


        }catch (IOException e){
            e.printStackTrace();
        }finally {

            if(is != null){
                try{
                    is.close();
                }catch (IOException e ){
                    e.printStackTrace();
                }

            }
            if(os != null){
                try{
                    os.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
