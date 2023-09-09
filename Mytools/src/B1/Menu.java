/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
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
    public Object getObjectChoice(ArrayList<Object> list){
        
    }
}

