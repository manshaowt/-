package com.container.linkedlist;

import java.util.LinkedList;

public class MyStack4<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    // ѹջ
    public void push(T e) {
        linkedList.addFirst(e);
    }

    // ��ջ
    public T pop() {
        return linkedList.removeFirst();
    }

    // �鿴ջ��Ԫ��
    public T peek() {
        return linkedList.getFirst();
    }

    // ��С
    public int size() {
        return linkedList.size();
    }

    // �п�
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();


        // ѹջ
        myStack.push("Stack First");
        myStack.push("Stack Second");
        myStack.push("Stack Third");

        // ��С
        System.out.println("��С : " + myStack.size());

        // ջ��Ԫ��
        System.out.println("ջ��Ԫ�� : " + myStack.peek());

        // ��ջ
        myStack.pop();

        // ����ʣ��ջԪ��
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
