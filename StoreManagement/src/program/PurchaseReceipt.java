/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class PurchaseReceipt {
private Date date;
Product p;
String prID;

    public PurchaseReceipt( String prID, Date date) {
        this.date = date;
        this.prID = prID;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", p.getPrID(),date);
    }

}
