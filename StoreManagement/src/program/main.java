/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import lib.Menu;
import static lib.mytools.*;

/**
 *
 * @author Admin
 */
public class main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.loadDataFromFile();
        boolean cont = true;
        int importReceiptMaxId = extractNumericId(getMaxIDFromFile("ImReceipts.txt", 0));
        int coutProduct = extractNumericId(getMaxIDFromFile("Products.txt", 1));
        do {
            String[] menu = {"nhập hàng", "Xem kho hàng",
                "Xem danh sách hàng gần hết hạn sử dụng",
                "Tìm mặt hàng còn kinh doanh theo tên",
                "Xem thông tin về những hàng không còn kinh doanh",
                "Xem thông tin về những hàng có số lượng dưới mức cho trước",
                "Sửa tên, giá, số lượng một sản phẩm",
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
                case "nhập hàng" -> {
                    importReceiptMaxId++;
                    pm.addImReceipt(importReceiptMaxId);
                    System.out.print("Nhập số lượng hàng: ");
                    int imProduct = sc.nextInt();
                    for (int i = 0; i < imProduct; i++) {
                        coutProduct++;
                        pm.addProduct(coutProduct);
                    }
                }
                case "Xem kho hàng" -> {
                    pm.PrintAll();
                }
                case "Xem danh sách hàng gần hết hạn sử dụng" -> {
                    pm.PrintNearExpireList();
                }
                case "Tìm mặt hàng còn kinh doanh theo tên" -> {
                    pm.SearchByName(readStr("nhap ten can kiem: ", ".*"));
                }
                case "Xem thông tin về những hàng không còn kinh doanh" -> {
                    pm.PrintAllSoldOut();
                }
                case "Ghi dữ liệu lên file" -> {
                    pm.saveFile();
                }
                case "Sửa tên, giá, số lượng một sản phẩm" -> {
                    pm.updateProduct(readStr("nhap ma can cap nhat: ", ".*"));
                }
                case "exit" -> {
                    cont = false;

                }
                default -> {
                    cont = true;
                    System.out.println("wrong choice");
                }

            }
        } while (cont);
    }
}
