package com.container.linkedlist;

import java.util.LinkedList;

public class MyQueue4<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    // ���
    public void offer(T e) {
        linkedList.addLast(e);
    }

    // ����
    public T poll() {
        return linkedList.removeFirst();
    }

    // ��С
    public int size() {
        return linkedList.size();
    }

    // �п�
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // ���
    public void clear() {
        linkedList.clear();
    }

    // ������У�������з�������
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<String>();

        // ���������Ԫ��
        queue.offer("Queue1");
        queue.offer("Queue2");
        queue.offer("Queue3");

        // ������д�С
        System.out.println("���д�С : " + queue.size());

        // ��������
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
