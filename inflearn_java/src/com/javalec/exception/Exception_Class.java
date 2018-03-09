package com.javalec.exception;

public class Exception_Class {

    public Exception_Class() {
        func_C();
    }

    private void func_A() throws Exception{
        // 주의할점 () 의 위치 를 잘 볼것
        // Exception 다음에 () 가 아니라 function 에 ()를 붙인다. 그 뒤에 throws exception
        System.out.println("Function A");

        int I_Arr[] = {1,2,3,4};
        System.out.println(I_Arr[4]);

        System.out.println("Function AA");
    }

    private void func_B(){
        System.out.println("Function B");

        try {
            func_A();
        }catch (Exception e ){
            System.out.println(e.getMessage());
            System.out.println("에러가 발생했습니다. 확인하세요");
        }finally {
            System.out.print("finally 는 무조건 실행됩니다 ! \n");
        }
        System.out.println("Function BB");
    }

    private void func_C(){
        System.out.println("Function C");
        func_B();
        System.out.println("Function CC");
    }
}
