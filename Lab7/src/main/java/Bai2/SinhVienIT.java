/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author chung
 */
public class SinhVienIT extends SinhVienPoly {

    private double java;
    private double html;
    private double css;

    @Override
    double getDiem() {
        return (2 * java + html + css) / 4;

    }

    public SinhVienIT(double java, double html, double css) {
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public SinhVienIT(double java, double html, double css, String name, String job) {
        super(name, job);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    @Override
    public void xuat() {
        super.xuat();
    }

}
