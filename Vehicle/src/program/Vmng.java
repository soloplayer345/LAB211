/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Vmng extends Vehicle implements method{
    ArrayList<Vehicle> list = new ArrayList<>();
   private int index;
    public Vmng() {
    }
    
  public Vmng( String id, String name, String color, String price, String brand, String type, String productYear) {
        super(id, name, color, price, brand, type, productYear);
    }
    @Override
    public void addVehicle() {
       Vehicle v=new Vehicle(getId(), getName(), getColor(), getPrice(), getBrand(), getType(), getProductYear());
       
        Save(v);
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
        PrintAll();
    }

    @Override
    public void Save(Vehicle v) {
        try {
            File file = new File("vehicle.dat");
            if (!file.exists()) {
                file.createNewFile();
            }
             FileInputStream fis =null;
              ObjectInputStream ois=null;
        try {
           fis = new FileInputStream("vehicle.dat");
          ois = new ObjectInputStream(fis);
             list = (ArrayList<Vehicle>) ois.readObject();
         index = list.indexOf(v);
                        if (index == -1) {
                            list.add(v);
                            System.out.println("Added!");
                        } else {
                            System.out.println("Dupplicated!");
                        }
                        System.out.println("");
            FileOutputStream fos=new FileOutputStream("vehicle.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
             oos.close();
            fos.close();
            System.out.println("Saved!");
        } catch (IOException e) {
             e.printStackTrace();
        }   catch (ClassNotFoundException ex) { 
                Logger.getLogger(Vmng.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }   catch (IOException ex) {
            Logger.getLogger(Vmng.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void PrintAll() {
      FileInputStream fis =null;
              ObjectInputStream ois=null;
        try {
           fis = new FileInputStream("vehicle.dat");
          ois = new ObjectInputStream(fis);
             list = (ArrayList<Vehicle>) ois.readObject();
             list.sort(new Comparator<Vehicle>() {
        public int compare(Vehicle o1, Vehicle o2) {
            return o1.getId().compareTo(o2.getId());
        }
    });
             
              
            for (Vehicle vhc : list) {
                System.out.println(vhc);
            }
         
            
    }   catch (Exception ex) {
             ex.printStackTrace();
      
        }
finally {
            if (fis != null) {
            
                try {
                    fis.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
              
            }
            if (ois != null) {
           
                try {
                    ois.close();
                } catch (IOException ex) {
                    Logger.getLogger(Vmng.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
 
 
    }
    }
}
