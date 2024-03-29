package com.container.linkedlist;

import java.util.LinkedList;

public class MyQueue4<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    // 入队
    public void offer(T e) {
        linkedList.addLast(e);
    }

    // 出队
    public T poll() {
        return linkedList.removeFirst();
    }

    // 大小
    public int size() {
        return linkedList.size();
    }

    // 判空
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // 清空
    public void clear() {
        linkedList.clear();
    }

    // 单向队列，其余队列方法类似
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<String>();

        // 往队列添加元素
        queue.offer("Queue1");
        queue.offer("Queue2");
        queue.offer("Queue3");

        // 输出队列大小
        System.out.println("队列大小 : " + queue.size());

        // 遍历队列
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
