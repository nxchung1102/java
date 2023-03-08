/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class QLProduct {

    Scanner sc = new Scanner(System.in);
    Product pr = new Product();
    List<Product> lstPr = new ArrayList<>();
    NoTaxProduct ntPr = new NoTaxProduct();

    public void inputPr() {
        System.out.print("Enter product quantity: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            pr = new Product();
            pr.input();
            lstPr.add(pr);
        }
    }

    public void outputPr() {
        for (Product product : lstPr) {
            product.info();
        }
    }

    public void output3Product() {
            pr = new Product("sp1", 10);
            lstPr.add(pr);
            pr = new Product("sp2", 20);
            lstPr.add(pr);
            ntPr = new NoTaxProduct("sp3", 30);
            lstPr.add(ntPr);
            pr.insert();
        outputPr();
    }
}
