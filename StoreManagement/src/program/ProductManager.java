/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
           
            f.writeChars(prID);
        } catch (IOException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String readImpReceipt() {
        String fileName = "ImReceipts.txt"; // The file containing the ArrayList

        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "r");
            String line;
            ArrayList<String> arrayList = new ArrayList<>();

            // Read each line from the file and add it to the ArrayList
            while ((line = file.readLine()) != null) {
                arrayList.add(line);
            }

            file.close();
            String maxStringId = findMaxStringId(arrayList);
            return maxStringId;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addProduct(int i) {
        try {
            String prID=readImpReceipt();
            String pID = generateCode("IM", 7, i);
            String impFile = "ImReceipts.txt";
            RandomAccessFile file = new RandomAccessFile(impFile, "r");;
            System.out.print("nhap ten hang:");
            String name = sc.nextLine();
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveProduct() {
        try {
             String fname="products.txt";
            RandomAccessFile f = new RandomAccessFile(fname, "rw");
            for (Product product : list) {
                f.writeBytes(product + System.lineSeparator());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void PrintAll() {
        for (Product vhc : list) {
            System.out.println(vhc);
        }
    }

    private static String findMaxStringId(List<String> arrayList) {
        String maxStringId = null;

        for (String item : arrayList) {
            if (maxStringId == null || item.compareTo(maxStringId) > 0) {
                maxStringId = item;
            }
        }

        return maxStringId;
    }
}
