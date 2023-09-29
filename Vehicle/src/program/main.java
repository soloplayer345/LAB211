/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.ArrayList;
import java.util.Scanner;
import lib.Menu_module;

/**
 *
 * @author ADMIN
 */
public class main {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cont = true;
        VehicleList mng = new VehicleList();
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
            Menu_module Menu_module = new Menu_module();
            int intChoice = Menu_module.getIntChoice(strList);
            System.out.println("Your choose: " + intChoice);
            switch (intChoice) {
                case 1:
                    mng.addVehicle();
                    System.out.println("List is added");
                    break;
                case 2:
                    mng.delete();
                    break;
                case 3:
                    System.out.print("enter id:");
                    String checkid = sc.nextLine();
                    VehicleList check = new VehicleList();
                    if (check.checkList(checkid)) {
                        System.out.println("Existed Vehicle");
                    } else {
                        System.out.println("No Vehicle Found!");
                    }
                    break;
                case 4:
                    System.out.print("enter id you want to update:");
                    String fixid = sc.nextLine();
                    mng.update(fixid);
                case 5:
                    System.out.print("enter id:");
                    String searchid = sc.nextLine();
                    VehicleList search = new VehicleList();
                    search.Search(searchid);
                    break;

                case 6:
                    VehicleList dis = new VehicleList();
                    dis.Display();
                    break;
                default:
                    cont = false;
                    break;

            }
        } while (cont == true);

    }
}
