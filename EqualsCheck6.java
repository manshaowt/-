package com.container.hashset;

import java.util.Set;
import java.util.HashSet;

public class EqualsCheck6 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();

        // �ȵ���HashCode()�����һ�����ٵ���equals()
        System.out.println("Test First : ");
        hashSet.add(new Student("Nick", 18));
        System.out.println("Test Second : ");
        hashSet.add(new Student("Jorden", 20));
        System.out.println("Test Third : ");
        hashSet.add(new Student("Nick", 18)); // �ظ�
    }

}
