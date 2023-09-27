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

    
        do {
            ArrayList<String> strList = new ArrayList();
            strList.add("add");
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
                   
                    System.out.print("enter id:");
                    String id=sc.nextLine();
                    System.out.print("enter name:");
                    String name=sc.nextLine(); 
                    System.out.print("enter color:");
                    String color=sc.nextLine();
                    System.out.print("enter price:");
                    String price=sc.nextLine();
                    System.out.print("enter brand:");
                    String brand=sc.nextLine();
                    System.out.print("enter type:");
                    String type=sc.nextLine();
                    System.out.print("enter productYear:");
                    String productYear=sc.nextLine();                  
                    Vmng mng=new Vmng( id, name, color, price, brand, type, productYear);
                    mng.addVehicle();
                    System.out.println("List is added");
                    break;
                    case 2:
                    System.out.print("enter id:");
                    id=sc.nextLine();
                    Vmng check =new Vmng();
                    check.checkList(id);
                    break;
                case 5:
                    Vmng dis= new Vmng();
                    dis.Display();
                    break;
                default:
                    cont = false;
                    break;

            }
        } while (cont == true);

    }
}
