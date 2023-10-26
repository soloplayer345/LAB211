/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import lib.Menu;
import java.io.*;

/**
 *
 * @author Admin
 */
public class main {
    ProductManager pm;

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cont = true;
        do {
            String[] menu = {"nhap hang", "delete", "check", "update", "search", "display", "exit"};
            ArrayList<String> strList = new ArrayList<>(Arrays.asList(menu));
            Menu Menu_module = new Menu();
            String Strchoice = (String) (Menu_module.getObjectChoice(strList));
            if (Strchoice == null) {
                Strchoice = "";
            }
            System.out.println("Your choose: " + Strchoice);
            switch (Strchoice) {
                case "nhap hang" -> {
                    
                }
                case "exit" -> {
                    cont = false;

                }
                default -> {
                    cont = true;
                    System.out.println("wrong choice");
                }

            }
        } while (cont == true);
    }
}
