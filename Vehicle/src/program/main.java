/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.ArrayList;
import lib.Menu_module;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        boolean cont = true;
        do {
            ArrayList<String> strList = new ArrayList();
            strList.add("add");
            strList.add("check");
            strList.add("update");
            strList.add("search");
            strList.add("exit");
            Menu_module Menu_module = new Menu_module();
            int intChoice = Menu_module.getIntChoice(strList);
            System.out.println("Your choose: " + intChoice);
            switch (intChoice) {
                case 1:
                    System.out.println("List is added");
                    break;
                case 5:
                    cont = false;
                    break;

            }
        } while (cont == true);

    }
}
