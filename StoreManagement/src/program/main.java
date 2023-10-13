/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import lib.Menu;

/**
 *
 * @author Admin
 */
public class main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cont = true;
        //mng.Load();
        do {
            ArrayList<String> strList = new ArrayList();
            strList.add("add");
            strList.add("delete");
            strList.add("check");
            strList.add("update");
            strList.add("search");
            strList.add("display");
            strList.add("exit");
            Menu Menu_module = new Menu();
            String Strchoice = (String) (Menu_module.getObjectChoice(strList));
            if (Strchoice == null) {
                Strchoice="";
            }
            System.out.println("Your choose: " + Strchoice);
            switch (Strchoice) {
                
                case "exit" -> {
                    cont = false;
            
                }
                default->{
                    cont = true;
                    System.out.println("wrong choice");
                }
                    
            }
        } while (cont == true);
    }
}
