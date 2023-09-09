/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1;

/**
 *
 * @author Admin
 */
public class Vehicle implements Comparable<Vehicle>{
    
    
    String id;
    String name;
    double price;
    String brand;
    String type;

    public Vehicle(String id) {
        this.id = id;
    }

    public Vehicle(String id, String name, double price, String brand, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        Vehicle v =(Vehicle)obj;
        return this.id.equals(v.id);
    }

    @Override
    public String toString() {    
        return String.format("%s,%s,%d,%s,%s", id,name,price,brand,type);
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.id.compareTo(((Vehicle)o).id);
    }
    
}
