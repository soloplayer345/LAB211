/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class VList extends ArrayList<Vehicle> implements method{
    ArrayList<Vehicle> list = new ArrayList<>();
    Vehicle v;

    public VList(String id) {
        super();
    }

    @Override
    public void addList(Vehicle v) {
        list.add(v);
    }

    @Override
    public void checkList(Vehicle v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vehicle update(Vehicle v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Vehicle v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vehicle Search(Vehicle v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Save() {
        try {
            File file = new File("vehicle.dat");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos=new FileOutputStream("vehicle.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            System.out.println("Saved!");
        } catch (IOException e) {
             
        } finally {
            
        }
    }

    @Override
    public void PrintAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
