package com.javalec.hash_;

import java.util.HashMap;
import java.util.Iterator;

public class Map_iterator {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<String,String>();
        hashMap.put("one", "one");
        hashMap.put("two", "two");
        hashMap.put("three", "three");
        hashMap.put("four", "four");

        System.out.println(hashMap);

        Iterator<String> iterator = hashMap.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + hashMap.get(key));
            // 만약 key 값을 알고 싶으면 어떻게 해야할까??
            // iterator.next 가 실행되면 바로 넘어간다 따라서 두번 쓰면 원하는 결과가 나오지 않음
            // iterator.next 값을 변수 하나를 할당한 뒤 사용하자.

        }
    }
}
