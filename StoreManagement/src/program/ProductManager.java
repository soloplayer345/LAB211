/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ProductManager {

    ArrayList<Product> list = new ArrayList<>();
    private int index;

    public void CheckFileists() {
        try {
            RandomAccessFile imp = new RandomAccessFile("imports.txt", "rw");
            RandomAccessFile pro = new RandomAccessFile("products.txt", "rw");
            RandomAccessFile imr = new RandomAccessFile("ImReceipts.txt", "rw");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void add(){
        
    }
}
