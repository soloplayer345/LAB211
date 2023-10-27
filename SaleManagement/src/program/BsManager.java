/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static lib.mytools.*;

/**
 *
 * @author Admin
 */
public class BsManager {

    Product p;
    BsProduct bs;
    BillOfSale boS;
    private int index;
    ArrayList<BillOfSale> BillOfSaleList = new ArrayList<>();
    ArrayList<Product> productList = new ArrayList<>();
    ArrayList<BsProduct> BillSaleProductList = new ArrayList<>();

    public void addBillOfSale(int i) {
        String BsId = generateCode("BS", 6, i);
        Date bdDate = Date.from(Instant.now());
        boS = new BillOfSale(BsId, bdDate);
        index = BillOfSaleList.indexOf(boS);
        if (index == -1) {
            BillOfSaleList.add(boS);
            System.out.println("Added!");
        } else {
            System.out.println("Dupplicated!");
        }
        saveArrayListToFile(BillOfSaleList, "exports.txt");
    }

    public void addBsProduct() {
        String bsID = getMaxIDFromFile("exports.txt", 0);
        String pID=readStr("nhập 1 mã sản phẩm có trong kho: ", ".*");
        getProductByID(pID);
        int bsPrice = getProductByID(pID).getSalePrice();
        System.out.print("nhap so luong da ban: ");
        int bsQuantity = sc.nextInt();
        bs = new BsProduct(bsID, pID, bsPrice, bsQuantity);
        index = BillSaleProductList.indexOf(bs);
        if (index == -1) {
            BillSaleProductList.add(bs);
            System.out.println("Added!");
        } else {
            System.out.println("Dupplicated!");
        }
        saveArrayListToFile(BillSaleProductList, "bsproducts.txt");
    }

    public Product getProductByID(String pID) {
        loadDataFromFileProduct();
        boolean a = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getpId() != null && productList.get(i).getpId().equals(pID)) {
                a = true;
                return productList.get(i);
            }
        }
        if (a == false) {
            System.out.println("Not found!");
        }
        return null;
    }

    public void loadDataFromFileProduct() {
        List<String> stringProductList = readArrayListFromFile("../StoreManagement/products.txt");
        productList.clear();
        for (String stringProduct : stringProductList) {
            String[] arr = stringProduct.split(", ");
            productList.add(new Product(
                    arr[0], arr[1], arr[2], arr[3], arr[4],
                    Integer.parseInt(arr[5]), Integer.parseInt(arr[6]), Integer.parseInt(arr[7]), Integer.parseInt(arr[8])));
        }
    }
    public void loadDataFromFile() {
        List<String> stringBsProduct = readArrayListFromFile("bsproducts.txt");
        List<String> stringBillOfSale = readArrayListFromFile("exports.txt");
        BillSaleProductList.clear();
        for (String stringProduct : stringBsProduct) {
            String[] arr = stringProduct.split(", ");
            BillSaleProductList.add(new BsProduct(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));
        }

        BillOfSaleList.clear();

        for (String stringReceipt : stringBillOfSale) {
            String[] arr = stringReceipt.split(", ");
            BillOfSaleList.add(new BillOfSale(arr[0], parseDate(arr[1], "dd-MM-yy")));
        }
    }
    public void PrintAll() {
        for (BsProduct bsP : BillSaleProductList) {
            System.out.println(bsP);
        }
    }
     public void saveFile() {
        saveArrayListToFile(BillSaleProductList, "bsproducts.txt");
        saveArrayListToFile(BillOfSaleList, "exports.txt");
    }
}
