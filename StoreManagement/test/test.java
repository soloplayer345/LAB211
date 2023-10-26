/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import static lib.mytools.*;
import program.Product;
import program.ProductManager;

/**
 *
 * @author ADMIN
 */
public class test {

    public static void main(String[] args) {
        ProductManager pm= new ProductManager();
        Product p = new Product();
        pm.addImReceipt(0);
        pm.addProduct(0);
        pm.PrintAll();
        pm.saveProduct();
//        System.out.println(p.getName());
//        String d="13--10-2023";
//        String f="dd-MM-yy";
//        SimpleDateFormat formatter = new SimpleDateFormat(f);
//        p.setProductionDate(readDate(normalizeDateStr(d), f));
//        System.out.println(p.getProductionDate());
//        Date productionDate = Date.from(Instant.now());
//        Date expDate= productionDate.after();
//        String strDate= formatter.format(productionDate);
//        p.setProductionDate(readDate(strDate, f));
//        System.out.println(productionDate);
// String f="dd-MM-yy";
//        this.expirationDate = readDateAfter(expirationDate, f, productionDate);
    }
}
