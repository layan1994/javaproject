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
public class Report {
    public double SparePartcost;
    public double ServeceCharge;

    public Report(double SparePartcost, double ServeceCharge) {
        this.SparePartcost = SparePartcost;
        this.ServeceCharge = ServeceCharge;
    }

    public double getSparePartcost() {
        return SparePartcost;
    }

    public void setSparePartcost(double SparePartcost) {
        this.SparePartcost = SparePartcost;
    }

    public double getServeceCharge() {
        return ServeceCharge;
    }

    public void setServeceCharge(double ServeceCharge) {
        this.ServeceCharge = ServeceCharge;
    }
    
    
}
