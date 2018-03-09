package com.javalec.ArrList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {
    public static void main(String[] args){
        ListMain here = new ListMain();
        here.ArrListFunction();
    }

    private void ArrListFunction(){

        ArrayList<String> ArrList = new ArrayList<String>();
//        LinkedList<String> ArrList = new LinkedList<String>();

        ArrList.add("hello");
        ArrList.add("world");
        ArrList.add("and");
        ArrList.add("java");

        System.out.println(ArrList.toString());

        ArrList.set(2,"onemoon");
        System.out.println(ArrList.toString());

        ArrList.remove(2);
        System.out.println(ArrList.toString());

        System.out.println(ArrList.get(2));
        ArrList.clear();
        System.out.println(ArrList.toString());

        ArrList = null;
        System.out.println(ArrList);

    }
}
