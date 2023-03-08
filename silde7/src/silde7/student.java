/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package silde7;

/**
 *
 * @author chung
 */
public class student {

    private String Id, name;
    private NganhHoc major;

    public student(String Id, String name, NganhHoc major) {
        this.Id = Id;
        this.name = name;
        this.major = major;
    }

    public student() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NganhHoc getMajor() {
        return major;
    }

    public void setMajor(NganhHoc major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "student{" + "Id=" + Id + ", name=" + name + ", major=" + getMAjorName() + '}';
    }
@Deprecated
    public String getMAjorName() {
        switch (major) {
            case UD:
                return "ứng dụng phần mềm";
            case PTPM:
                return "phát triển phân mềm";
            default:
                return "phát triển web";
        }
    }
;

}
