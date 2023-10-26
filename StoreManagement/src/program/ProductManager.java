/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static lib.mytools.*;
import static program.main.sc;

/**
 *
 * @author Admin
 */
public class ProductManager {

    Product p;
    PurchaseReceipt pr;
    ArrayList<Product> list = new ArrayList<>();
    private int index;



    public void addImReceipt(int i) {
        try {
            String fname = "ImReceipts.txt";
            RandomAccessFile f = new RandomAccessFile(fname, "rw");
            String prID = generateCode("IM", 6, i);
            Date DateIm = Date.from(Instant.now());
            pr = new PurchaseReceipt(prID, DateIm);
            f.writeChars(prID);
        } catch (IOException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add() {
        int i = 0;
//        String pID=generateCode("IM", 8, i);
//        Date productionDate = Date.from(Instant.now());
        System.out.print("nhap ten hang:");
        String name = sc.nextLine();
        System.out.print("nhap gia mua:");
        int purchasePrice = sc.nextInt();
        System.out.print("nhap gia ban:");
        int salePrice = sc.nextInt();
        System.out.print("nhap so luong ban dau");
        int initialQuantity = sc.nextInt();
        System.out.print("nhap so luong ton kho");
        int curQuantity = sc.nextInt();
        p = new Product("", "", name, null, null, purchasePrice, salePrice, initialQuantity, curQuantity);
        index = list.indexOf(p);
        if (index == -1) {
            list.add(p);

            System.out.println("Added!");
        } else {
            System.out.println("Dupplicated!");
        }
    }

    public void PrintAll() {
        for (Product vhc : list) {
            System.out.println(vhc);
        }
    }
}
