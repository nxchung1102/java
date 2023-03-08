/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java2_lab3;

/**
 *
 * @author chung
 */
public class Student {

    private String name;
    private String major;
    private double marks;

    public String getGrade() {
        if (this.marks < 3) {
            return "kém";
        }
        if (this.marks < 5) {
            return "yếu";
        }
        if (this.marks < 6.5) {
            return "trung bình";
        }
        if (this.marks < 7.5) {
            return "khá";
        }
        if (this.marks < 9) {
            return "giỏi";
        }
        return "xuất sắc";
    }

    public boolean isBonus() {
        return this.marks >= 7.5;
    }

    public Student() {
    }

    public Student(String name, String major, double marks) {
        this.name = name;
        this.major = major;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", major=" + major + ", marks=" + marks + '}';
    }
}
