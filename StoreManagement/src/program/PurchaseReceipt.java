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
public class PurchaseReceipt extends Product{
private Date date;
    public PurchaseReceipt(String prID) {
        super(prID);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
