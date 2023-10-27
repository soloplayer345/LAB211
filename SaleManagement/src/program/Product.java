/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

/**
 *
 * @author Admin
 */
public final class Product {

    private String prID;
    private String pId;
    private String name;
    private String productionDate;
    private String expirationDate;
    private int purchasePrice;
    private int salePrice;
    private int initialQuantity;
    private int curQuantity;

    public Product() {
    }

    public Product(String prID) {
        this.prID = prID;
    }

    public Product(String prID, String pId, String name, String productionDate, String expirationDate, int purchasePrice, int salePrice, int initialQuantity, int curQuantity) {
        this.prID = prID;
        this.pId = pId;
        this.name = name;
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

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
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
        return String.format("%s, %s, %s, %s, %s, %d, %d, %d, %d", prID,pId,name,productionDate,expirationDate,purchasePrice,salePrice,initialQuantity,curQuantity);
    }

}
