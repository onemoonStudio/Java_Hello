package com.javalec.hash_;

public class Set_Student {

    private String name;
    private int grade;

    public Set_Student(String name , int grade){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return name + " " + grade;
    }

    // remove를 직관적으로 사용하기 위해서 equals와 hashcode를 override한다.
    @Override
    public boolean equals(Object obj) {
        String CompareValue = obj.toString();
        String thisValue = toString();
        return thisValue.equals(CompareValue);
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
