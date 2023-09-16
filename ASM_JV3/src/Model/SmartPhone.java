/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chung
 */
public class SmartPhone {

    private Integer ID, CategoryId;
    private String name;
    private Integer quantity;
    private Double currentPrice;

    public SmartPhone(Integer ID, Integer CategoryId, String name, Integer quantity, Double currentPrice) {
        this.ID = ID;
        this.CategoryId = CategoryId;
        this.name = name;
        this.quantity = quantity;
        this.currentPrice = currentPrice;
    }

    public SmartPhone(Integer CategoryId, String name, Integer quantity, Double currentPrice) {
        this.CategoryId = CategoryId;
        this.name = name;
        this.quantity = quantity;
        this.currentPrice = currentPrice;
    }

    public SmartPhone(Integer CategoryId, String name) {
        this.CategoryId = CategoryId;
        this.name = name;
    }

    public SmartPhone(Integer CategoryId, String name, Integer quantity) {
        this.CategoryId = CategoryId;
        this.name = name;
        this.quantity = quantity;
    }

    public SmartPhone() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer CategoryId) {
        this.CategoryId = CategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return name;
    }

}
