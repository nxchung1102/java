/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Ke_Thua;

/**
 *
 * @author chung
 */
public class Person {

    //thuộc tính chung
    private String name;
    private String CCCD;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, String CCCD, int age, String address) {
        this.name = name;
        this.CCCD = CCCD;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inFo() {
        System.out.println("-------Thong Tin-----------");
        System.out.print("name: " + name + "\n");
        System.out.print("CCCD: " + CCCD + "\n");
        System.out.print("age: " + age + "\n");
        System.out.print("address: " + address + "\n");
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", CCCD=" + CCCD + ", age=" + age + ", address=" + address + '}';
    }

}
