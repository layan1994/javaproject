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
public class Supplier {
    public String SupplierId;
    private String SupplierName;
    public int ContactNo;
    public String SupplyingItem;

    public Supplier(String SupplierId, String SupplierName, int ContactNo, String SupplyingItem) {
        this.SupplierId = SupplierId;
        this.SupplierName = SupplierName;
        this.ContactNo = ContactNo;
        this.SupplyingItem = SupplyingItem;
    }

    public String getSupplierId() {
        return SupplierId;
    }

    public void setSupplierId(String SupplierId) {
        this.SupplierId = SupplierId;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public void setContactNo(int ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getSupplyingItem() {
        return SupplyingItem;
    }

    public void setSupplyingItem(String SupplyingItem) {
        this.SupplyingItem = SupplyingItem;
    }

    
 
    
    
}
