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
import java.util.logging.Level;
import java.util.logging.Logger;
import static program.main.sc;

/**
 *
 * @author Admin
 */
public class VehicleList implements method {

    ArrayList<Vehicle> list = new ArrayList<>();
    private int index;

    public VehicleList() {
    }

    @Override
    public void addVehicle() {
        System.out.print("enter id:");
        String id = sc.nextLine();
        System.out.print("enter name:");
        String name = sc.nextLine();
        System.out.print("enter color:");
        String color = sc.nextLine();
        System.out.print("enter price:");
        String price = sc.nextLine();
        System.out.print("enter brand:");
        String brand = sc.nextLine();
        System.out.print("enter type:");
        String type = sc.nextLine();
        System.out.print("enter productYear:");
        String productYear = sc.nextLine();
        Vehicle v = new Vehicle(id, name, color, price, brand, type, productYear);
        load();
        index = list.indexOf(v);
        if (index == -1) {
            list.add(v);
            Save();
            System.out.println("Added!");
        } else {
            System.out.println("Dupplicated!");
        }
    }

    @Override
    public void checkList(String id) {
        boolean a = false;

        load();
        index = list.indexOf(list);
        for (Vehicle vehicle : list) {
            if (vehicle.getId() != null && vehicle.getId().equals(id)) {
                System.out.println(vehicle.toString());
                a = true;
            }
        }
        if (a == false) {
            System.out.println("Not found!");
        }
    }

    @Override
    public Vehicle update(Vehicle v) {
        load();
        index = list.indexOf(list);
        for (Vehicle vehicle : list) {
            list.set(index, vehicle);
        }
        Save();
        return v;
    }

    @Override
    public void delete() {
        load();

        System.out.print("enter id:");
        String id = sc.nextLine();

        Vehicle deletingVehicle = null;
        for (Vehicle vehicle : list) {
            if (vehicle.getId().equalsIgnoreCase(id)) {
                deletingVehicle = vehicle;
            }
        }

        if (deletingVehicle != null) {
            list.remove(deletingVehicle);
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream("vehicle.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
                System.out.println("Deleted!");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(VehicleList.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(VehicleList.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(VehicleList.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

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
    public void Save() {

        try {
            System.out.println("");
            FileOutputStream fos = new FileOutputStream("vehicle.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            System.out.println("Saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void PrintAll() {
        load();
        list.sort((Vehicle o1, Vehicle o2) -> o1.getId().compareTo(o2.getId()));
        for (Vehicle vhc : list) {
            System.out.println(vhc);
        }
    }

    public void load() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File file = new File("vehicle.dat");
            if (!file.exists()) {
                file.createNewFile();
            }

            fis = new FileInputStream("vehicle.dat");
            ois = new ObjectInputStream(fis);
            list = (ArrayList<Vehicle>) ois.readObject();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VehicleList.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(VehicleList.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(VehicleList.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
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
                    Logger.getLogger(VehicleList.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }
}
