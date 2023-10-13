/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import static lib.mytools.*;

/**
 *
 * @author Admin
 */
public final class Product {

    private String prID;
    private String pId;
    private String name;
    private Date productionDate;
    private Date expirationDate;
    private int purchasePrice;
    private int salePrice;
    private int initialQuantity;
    private int curQuantity;

    public Product() {
    }

    public Product(String prID) {
        this.prID = prID;
    }
 

    public int getCurQuantity() {
        return curQuantity;
    }

    public void setCurQuantity(int curQuantity) {
        this.curQuantity = curQuantity;
    }

    public String getPrID() {
        return prID;
    }

    public void setPrID(String prID) {
        this.prID = prID;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
      
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String dateFormat = formatter.format(productionDate);
        System.out.println(productionDate);
        this.productionDate=readDate(dateFormat, "dd-MM-yyyy");


    }
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        if (purchasePrice>0) {
            this.purchasePrice = purchasePrice;
        }
        else System.out.println("wrong price");
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(int initialQuantity) {
        if (initialQuantity>0) {
            this.initialQuantity = initialQuantity;
        }
        else System.out.println("wrong quntity");
        
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %d, %d, %d, %d%n", prID,pId,name,productionDate,expirationDate,purchasePrice,salePrice,initialQuantity,curQuantity);
    }

}
