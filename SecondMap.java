package com.container.map.second;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import com.container.map.second.Student;


public class SecondMap {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<Student, String>();

        HashSet<Student> set = new HashSet<Student>();
        set.add(new Student("Nick", 18));
        set.add(new Student("Harden", 20));
        set.add(new Student("James", 21));
        set.add(new Student("Mike", 18));
        set.add(new Student("Paul", 21));
        set.add(new Student("Nick", 18));

        Iterator<Student> it = set.iterator();
        int i = 100;
        while (it.hasNext()) {
            Student s = it.next();
            map.put(s, "����ѧԺ������A" + i++);
        }

        // ʹ��keySet����
        for (Student key : map.keySet()) {
            System.out.println(key + ", ��ַ: " + map.get(key));
        }

        System.out.println();

        // ʹ��entrySet
        for (Map.Entry<Student, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", ��ַ: " + entry.getValue());
        }
    }
}
