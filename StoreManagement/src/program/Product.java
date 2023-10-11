/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.Date;
import lib.mytools;
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

    public Product(String prID, String pId, String name, Date productionDate, Date expirationDate, int purchasePrice, int salePrice, int initialQuantity, int curQuantity) {
        this.prID = prID;
        this.pId = pId;
        setName(name);
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.initialQuantity = initialQuantity;
        this.curQuantity = curQuantity;
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
        this.productionDate = productionDate;
//        this.productionDate=readDate(productionDate, "dd-MM-yyyy");
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
        this.purchasePrice = purchasePrice;
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
        this.initialQuantity = initialQuantity;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %d, %d, %d, %d%n", prID,pId,name,productionDate,expirationDate,purchasePrice,salePrice,initialQuantity,curQuantity);
    }

}
