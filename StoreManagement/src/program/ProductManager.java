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
import static program.main.sc;

/**
 *
 * @author Admin
 */
public class ProductManager {

    Product p;
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

    public void add() {
        System.out.print("nhap ten hang:");
        String name = sc.nextLine();
        System.out.print("nhap gia mua:");
        int purchasePrice= sc.nextInt();
        System.out.print("nhap gia ban:");
        int salePrice= sc.nextInt();
        System.out.println("nhap so luong ban dau");
        int initialQuantity = sc.nextInt();
    }
}
