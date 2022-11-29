/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

/**
 *
 * @author chung
 */
public class Bai2 {

    Scanner _sc = new Scanner(System.in);
    List<ClassOfBai2> _lstName;
    ClassOfBai2 _name;

    public Bai2() {
        _lstName = new ArrayList<>();
    }

    public void inputName() {
        String Y_N;
        do {
            _name = new ClassOfBai2();
            System.out.println("enter your name:");
            String name = _sc.nextLine();
            _name.setName(name);
            _lstName.add(_name);
            System.out.println("do you want to continue (Y/N)");
            Y_N = _sc.nextLine();
            if (Y_N.equalsIgnoreCase("N")) {
                break;
            }
        } while (Y_N.equalsIgnoreCase("Y"));
    }

    public void output() {

        for (ClassOfBai2 name : _lstName) {
            System.out.println("entered name: " + name);
        }
    }

    public void random() {

        Collections.shuffle(_lstName);

    }

    public void arrange() {

        Collections.sort(_lstName, new Comparator<ClassOfBai2>() {
            @Override
            public int compare(ClassOfBai2 o1, ClassOfBai2 o2) {
                return -o1.getName().compareTo(o2.getName());
            }
        });
//        Collections.reverse(_lstName);

    }

    public void del() {

        System.out.println("enter the name you want to delete: ");
        String nameDel = _sc.nextLine();
        int count = 0;
        for (int i = 0; i < _lstName.size(); i++) {
            if (_lstName.get(i).getName().equalsIgnoreCase(nameDel)) {
                _lstName.remove(i);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("name cannot be deleted");
        }
    }
}
