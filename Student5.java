package com.container.arraylist;

import java.util.*;

public class Student5 implements Comparable {
    private String stuId;  // ѧ��
    private String stuName;  // ����
    private int totalScore;  // �ܷ�

    public String getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public Student(String stuId, String stuName, int totalScore) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "ѧ��: " + this.stuId + ", ����: " + this.stuName + ", �ܷ�: " + this.totalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student))
            return false;

        Student s = (Student) o;

        if (this.stuId.equals(s.stuId))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int result;

        result = (this.stuName == null ? 0 : this.stuName.hashCode());
        result += this.stuId.hashCode();

        return result;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        int result = 0;

        result = this.totalScore > s.totalScore ? 1 : (this.totalScore == s.totalScore ? 0 : -1);

        return result;
    }
}
