package StackStructure;

public interface StackInterface {
    boolean isEmpty();
    void push(Object x); // 원소 x를 스택에 삽입
    Object pop();
    Object peek();
}
