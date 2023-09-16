/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.view;

/**
 *
 * @author chung
 */
public class Stocker {
    private int id;
    private String CategoryName;
    private int quantity;

    public Stocker() {
    }

    public Stocker(int id, String CategoryName, int quantity) {
        this.id = id;
        this.CategoryName = CategoryName;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stocker{" + "id=" + id + ", CategoryName=" + CategoryName + ", quantity=" + quantity + '}';
    }
    
}
