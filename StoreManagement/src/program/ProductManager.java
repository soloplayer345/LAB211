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
    ArrayList<PurchaseReceipt> prlist = new ArrayList<>();
    private int index;

    public void addImReceipt(int i) {
        try {
            String fname = "ImReceipts.txt";
            RandomAccessFile f = new RandomAccessFile(fname, "rw");
            String prID = generateCode("IM", 6, i);
            Date DateIm = Date.from(Instant.now());
            pr = new PurchaseReceipt(prID, DateIm);
            index = prlist.indexOf(pr);
            if (index == -1) {
                prlist.add(pr);

                System.out.println("Added!");
            } else {
                System.out.println("Dupplicated!");
            }

            f.writeBytes(prID);
        } catch (IOException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addProduct(int i) {
            String prID = updateIDFormFile("ImReceipts.txt");
            String pID = generateCode("IM", 7, i);
            String name=readStr("nhap ten hang", ".");
            String Datepro = DatetoString(Date.from(Instant.now()), "dd-MM-yy");
            String DateExp = DatetoString(readDateAfter("nhap ngay het hang", "dd-MM-yy", parseDate(Datepro, "dd-MM-yy")), "dd-MM-yy");
            System.out.print("nhap gia mua:");
            int purchasePrice = sc.nextInt();
            System.out.print("nhap gia ban:");
            int salePrice = sc.nextInt();
            System.out.print("nhap so luong ban dau");
            int initialQuantity = sc.nextInt();
            System.out.print("nhap so luong ton kho");
            int curQuantity = sc.nextInt();
            p = new Product(prID, pID, name, Datepro, DateExp, purchasePrice, salePrice, initialQuantity, curQuantity);
            index = list.indexOf(p);
            if (index == -1) {
                list.add(p);

                System.out.println("Added!");
            } else {
                System.out.println("Dupplicated!");
            }
    }

    public void saveFile() {
        saveArrayListToFile(list, "Products.txt");
        saveArrayListToFile(prlist, "ImReceipts.txt");
    }

    public void PrintAll() {
        for (Product vhc : list) {
            System.out.println(vhc);
        }
    }
    
}
