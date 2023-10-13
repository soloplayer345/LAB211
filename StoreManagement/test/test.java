/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import static lib.mytools.*;
import program.Product;
/**
 *
 * @author ADMIN
 */
public class test {
    public static void main(String[] args) {
        Product p= new Product(); 
        String d="13--10-2023";
        String f="dd-MM-yy";
        p.setProductionDate(readDate(normalizeDateStr(d), f));
        System.out.println(p.getProductionDate());
    }
}
