package program;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Vehicle {
    private String id;
    private String name;
    private String color;
    private String price;
    private String brand;
    private String type;
    private String productYear;

    public Vehicle(String id) {
        this.id = id;
    }

    public Vehicle(String id, String name, String color, String price, String brand, String type, String productYear) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.type = type;
        this.productYear = productYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductYear() {
        return productYear;
    }

    public void setProductYear(String productYear) {
        this.productYear = productYear;
    }

    @Override
    public String toString() {
        return String.format("ID_Vehicle:%s ,Name_Vehicle: %s ,color_Vehicle: %s ,price_Vehicle: %s ,brand_Vehicle: %s ,type: %s ,productYear: %s", id,name,color,price,brand,type,productYear);
    }
    
}
