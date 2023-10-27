/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.ArrayList;
import java.util.Arrays;
import lib.Menu;
import static lib.mytools.*;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        BsManager bm;
        bm = new BsManager();
        bm.loadDataFromFile();
        boolean cont = true;
        int BillOfSaleMaxId = extractNumericId(getMaxIDFromFile("exports.txt", 0));
        do {
            String[] menu = {"tạo phiếu bán hàng", "Xem ds sản phẩm đã bán", "test",
                "Ghi dữ liệu lên file",
                "exit"};
            ArrayList<String> strList = new ArrayList<>(Arrays.asList(menu));
            Menu Menu_module = new Menu();
            String Strchoice = (String) (Menu_module.getObjectChoice(strList));
            if (Strchoice == null) {
                Strchoice = "";
            }
            System.out.println("Your choose: " + Strchoice);
            switch (Strchoice) {
                case "tạo phiếu bán hàng" -> {
                    BillOfSaleMaxId++;
                    bm.addBillOfSale(BillOfSaleMaxId);
                    bm.addBsProduct();
                }
                case "test" -> {
                    System.out.println( bm.getProductByID("P0000006"));  
                }
                case "Xem ds sản phẩm đã bán" -> {
                    bm.PrintAll();
                }
                case "Ghi dữ liệu lên file" -> {
                    bm.saveFile();
                }
                case "exit" ->
                    cont = false;
                default -> {
                    cont = true;
                    System.out.println("wrong choice");
                }
            }
        } while (cont);
    }
}
