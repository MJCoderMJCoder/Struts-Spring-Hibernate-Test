package com.lzf.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private double studentScore;
    private int studentNumber;

    @Id
    @Column(name = "studentId", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "studentName", nullable = false, length = 45)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "studentAge", nullable = false)
    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Basic
    @Column(name = "studentScore", nullable = false, precision = 0)
    public double getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(double studentScore) {
        this.studentScore = studentScore;
    }

    @Basic
    @Column(name = "studentNumber", nullable = false)
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (studentAge != student.studentAge) return false;
        if (Double.compare(student.studentScore, studentScore) != 0) return false;
        if (studentNumber != student.studentNumber) return false;
        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = studentId;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + studentAge;
        temp = Double.doubleToLongBits(studentScore);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + studentNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentScore=" + studentScore +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
