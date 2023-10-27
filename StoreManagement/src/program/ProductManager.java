/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static lib.mytools.*;
import static program.main.sc;

/**
 *
 * @author Admin
 */
public class ProductManager {

    Product p;
    PurchaseReceipt pr;
    ArrayList<Product> productList = new ArrayList<>();
    ArrayList<PurchaseReceipt> purchaseReceiptList = new ArrayList<>();
    private int index;

    public void addImReceipt(int i) {
        String prID = generateCode("IM", 6, i);
        Date DateIm = Date.from(Instant.now());
        pr = new PurchaseReceipt(prID, DateIm);
        index = purchaseReceiptList.indexOf(pr);
        if (index == -1) {
            purchaseReceiptList.add(pr);

            System.out.println("Added!");
        } else {
            System.out.println("Dupplicated!");
        }
        saveArrayListToFile(purchaseReceiptList, "ImReceipts.txt");
    }

    public void addProduct(int i) {
        String prID = getMaxIDFromFile("ImReceipts.txt", 0);
        String pID = generateCode("P", 7, i);
        String name = readStr("nhap ten hang: ", ".*");
        String Datepro = DatetoString(Date.from(Instant.now()), "dd-MM-yy");
        String DateExp = DatetoString(readDateAfter("nhap ngay het hang: ", "dd-MM-yy", parseDate(Datepro, "dd-MM-yy")), "dd-MM-yy");
        System.out.print("nhap gia mua: ");
        int purchasePrice = sc.nextInt();
        System.out.print("nhap gia ban: ");
        int salePrice = sc.nextInt();
        System.out.print("nhap so luong ban dau: ");
        int initialQuantity = sc.nextInt();
        p = new Product(prID, pID, name, Datepro, DateExp, purchasePrice, salePrice, initialQuantity, initialQuantity);
        index = productList.indexOf(p);
        if (index == -1) {
            productList.add(p);
            System.out.println("Added!");
        } else {
            System.out.println("Dupplicated!");
        }
        saveArrayListToFile(productList, "Products.txt");
    }

    public void loadDataFromFile() {
        List<String> stringProductList = readArrayListFromFile("Products.txt");
        List<String> stringReceiptList = readArrayListFromFile("ImReceipts.txt");

        productList.clear();
        for (String stringProduct : stringProductList) {
            String[] arr = stringProduct.split(", ");
            productList.add(new Product(
                    arr[0], arr[1], arr[2], arr[3], arr[4],
                    Integer.parseInt(arr[5]), Integer.parseInt(arr[6]), Integer.parseInt(arr[7]), Integer.parseInt(arr[8])));
        }

        purchaseReceiptList.clear();

        for (String stringReceipt : stringReceiptList) {
            String[] arr = stringReceipt.split(", ");
            purchaseReceiptList.add(new PurchaseReceipt(arr[0], parseDate(arr[1], "dd-MM-yy")));
        }
    }

    public void saveFile() {
        saveArrayListToFile(productList, "Products.txt");
        saveArrayListToFile(purchaseReceiptList, "ImReceipts.txt");
    }

    public void PrintAll() {
        var sortedList = new ArrayList<Product>(productList);
        sortedList.sort((Product o1, Product o2) -> {
            if (o1.getPrID().compareTo(o2.getPrID()) == 0) {
                return (o1.getpId().compareTo(o2.getpId()));
            } else {
                return -(o1.getPrID().compareTo(o2.getPrID()));
            }
        });
        for (Product vhc : sortedList) {
            System.out.println(vhc);
        }
    }

    public void PrintNearExpireList() {
        for (Product p : productList) {
            LocalDate nearExpireDate = LocalDate.now().plusDays(10);

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy");
            LocalDate dt = LocalDate.parse(p.getExpirationDate(), dtf);

            if (dt.isAfter(nearExpireDate)) {
                System.out.println(p);
            }
        }
    }

    public void SearchByName(String name) {
        boolean a = false;
        for (Product product : productList) {
            if (product.getName() != null && product.getName().equals(name)) {
                System.out.println(product.toString());
                a = true;
            }
        }
        if (a == false) {
            System.out.println("Not found!");
        }
    }

    public void PrintAllSoldOut() {
        for (Product vhc : productList) {
            if (vhc.getCurQuantity() == 0) {
                System.out.println(vhc);
            }
        }
    }

    public void updateProduct(String pID) {
        boolean a = false;
        for (int i = 0; i< productList.size(); i++) {
            if (productList.get(i).getpId() != null && productList.get(i).getpId().equals(pID)) {
                
                System.out.println(productList.get(i).toString());
                a = true;
                String name = readStr("nhap ten hang: ", ".*");
                if (name != null && !name.isBlank() && !name.isEmpty()) {
                    productList.get(i).setName(name);
                }
                System.out.print("nhap gia mua: ");
                int purchasePrice = sc.nextInt();
                productList.get(i).setPurchasePrice(purchasePrice);
                System.out.print("nhap gia ban: ");
                int salePrice = sc.nextInt();
                productList.get(i).setSalePrice(salePrice);
                System.out.print("nhap so luong ban dau: ");
                int initialQuantity = sc.nextInt();
                productList.get(i).setInitialQuantity(initialQuantity);
                productList.get(i).setCurQuantity(initialQuantity);
                //productList.set(i, productList.get(i));
                saveArrayListToFile(productList, "Products.txt");
            }
        }
        if (a == false) {
            System.out.println("Not found!");
        }
    }

}
