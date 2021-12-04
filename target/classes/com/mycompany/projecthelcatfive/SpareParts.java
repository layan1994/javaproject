/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projecthelcatfive;

/**
 *
 * @author alpah
 */
public class SpareParts {
   public String SparePartName;
   public String SparePartID;
   private double cost;
   public int quentity;
   private double SellingPrice;

    public SpareParts(String SparePartName, String SparePartID, double cost, int quentity, double SellingPrice) {
        this.SparePartName = SparePartName;
        this.SparePartID = SparePartID;
        this.cost = cost;
        this.quentity = quentity;
        this.SellingPrice = SellingPrice;
    }

    public String getSparePartName() {
        return SparePartName;
    }

    public void setSparePartName(String SparePartName) {
        this.SparePartName = SparePartName;
    }

    public String getSparePartID() {
        return SparePartID;
    }

    public void setSparePartID(String SparePartID) {
        this.SparePartID = SparePartID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuentity() {
        return quentity;
    }

    public void setQuentity(int quentity) {
        this.quentity = quentity;
    }

    public double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(double SellingPrice) {
        this.SellingPrice = SellingPrice;
    }
   
   
    
}
