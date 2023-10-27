/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import lib.Menu;

/**
 *
 * @author Admin
 */
public class main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        boolean cont = true;
        int countImReceipt=0;
        int coutProduct=0;
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
                    countImReceipt++;
                    pm.addImReceipt(countImReceipt);
                    System.out.print("Nhập số lượng hàng: ");
                    int imProduct=sc.nextInt();
                    while (coutProduct<imProduct) {                        
                        coutProduct++;
                        pm.addProduct(imProduct);
                    }
                }
                case "Xem kho hàng" -> {
                    pm.PrintAll();
                }
                case "Ghi dữ liệu lên file" -> {
                    pm.saveFile();
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
