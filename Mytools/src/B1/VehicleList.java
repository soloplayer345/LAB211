/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1;
import java.util.Collections;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author Admin
 */
public class VehicleList extends ArrayList<Vehicle>{
    Comparator<Vehicle> cNameDesc = new Comparator<Vehicle>() {
        @Override
        public int compare(Vehicle o1, Vehicle o2) {
            return - o1.name.compareTo(o2.name);
        }
    };
}
