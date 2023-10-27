/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.Date;
import static lib.mytools.*;

/**
 *
 * @author Admin
 */
public class BillOfSale {
    private String bsID;
    private Date bsDate;

    public BillOfSale() {
    }
    public BillOfSale(String bsID, Date bsDate) {
        this.bsID = bsID;
        this.bsDate = bsDate;
    }

    public Date getBsDate() {
        return bsDate;
    }

    public void setBsDate(Date bsDate) {
        this.bsDate = bsDate;
    }

    public String getBsID() {
        return bsID;
    }

    public void setBsID(String bsID) {
        this.bsID = bsID;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", bsID,DatetoString(bsDate, "dd-MM-yy"));
    }
    
}
