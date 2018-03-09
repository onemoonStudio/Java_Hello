package com.javalec.hash_;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args){
//        Set_Student Student = new Set_Student();

        HashSet<Set_Student> hashSet = new HashSet<Set_Student>();
        hashSet.add(new Set_Student("홍길동" , 1));
        hashSet.add(new Set_Student("장보고" , 2));
        hashSet.add(new Set_Student("이순신" , 3));

        System.out.println(hashSet.toString());

//        Iterator - HashSet
        Iterator<Set_Student> hash_list = hashSet.iterator();
        while(hash_list.hasNext()){
//            Set_Student key = hash_list.next();
//            System.out.println(key);
            System.out.println(hash_list.next());
        }

        // remove를 조심하자 아래 예제를 보자
        Set_Student student = new Set_Student("장보고" , 2);
        hashSet.remove(student);
        System.out.println(hashSet);
        // 결과는 [홍길동 1, 장보고 2, 이순신 3] 으로 장보고가 삭제되지 않는다.
        // 이유는 위에서 만든 장보고 Student 객체와 방금 만든 student객체는 hash값 즉 주소가 다르다
        // 따라서 직관적으로 remove를 사용하고 싶다면 equals와 hashcode를 override해야한다.


    }
}
