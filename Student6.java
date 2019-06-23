package com.container.hashset;

public class Student6 {
    private String name;  // ����
    private int age;  // ����

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(this.name + "����equals()");

        if (!(o instanceof com.container.map.second.Student))
            return false;

        Student s = (Student) o;

        if ((this.name.equals(s.name)) && (this.age == s.age))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        System.out.println(this.name + "����HashCode()");

        int result;

        result = (this.name == null ? 0 : this.name.hashCode());
        result += this.age;

        return result;
    }
}
