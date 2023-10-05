/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu<T> {
    Scanner sc =new Scanner(System.in);
    //Get an user choice as an integer
    public int getIntChoice(ArrayList List){
        for (int i=0; i<List.size();i++) {
            System.out.format("%d-%s",i+1,List.get(i));
            System.out.println("---------------------------------");
            System.out.format("Please choose 1 to %d :",List.size());
        }
        return Integer.parseInt(sc.nextLine());
    }
    public T getObjectChoice(ArrayList<T> list){
        int n= list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+"-"+list.get(i));
        }
        System.out.println("--------------------------");
        System.out.format("Please choose 1 to %d :",list.size());
        int choiceNo = Integer.parseInt(sc.nextLine());
        return (choiceNo >0 && choiceNo<=n) ? list.get(choiceNo-1): null;
    }
//    public static void main(String[] args) {
//        // Kiếm thử menu chứa các chuỗi trả về số int
//        ArrayList<String> strList = new ArrayList();
//        strList.add("Operation 1");
//        strList.add("Operation 2");
//        strList.add("Operation 3");
//        Menu_module Menu_module = new Menu_module();
//        int intChoice = Menu_module.getIntChoice(strList);
//        System.out.println("Your choose: "+intChoice);
//        //Kiểm thử menu chứa các ItemType trả về 1 ItemType
//        ArrayList<ite>
//    }
}


