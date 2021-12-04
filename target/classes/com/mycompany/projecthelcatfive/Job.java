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
public class Job 
{ 
    public String customerName;
    public int customerContactNo;
    public String customerEmail;
    public String VehicleNumberl;
    public String VehicleBrand;
    public int ManufactureYear;
    public int JobID;
    public String jobType;

    public Job(String customerName, int customerContactNo, String customerEmail, String VehicleNumberl, String VehicleBrand, int ManufactureYear, int JobID, String jobType) {
        this.customerName = customerName;
        this.customerContactNo = customerContactNo;
        this.customerEmail = customerEmail;
        this.VehicleNumberl = VehicleNumberl;
        this.VehicleBrand = VehicleBrand;
        this.ManufactureYear = ManufactureYear;
        this.JobID = JobID;
        this.jobType = jobType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerContactNo() {
        return customerContactNo;
    }

    public void setCustomerContactNo(int customerContactNo) {
        this.customerContactNo = customerContactNo;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getVehicleNumberl() {
        return VehicleNumberl;
    }

    public void setVehicleNumberl(String VehicleNumberl) {
        this.VehicleNumberl = VehicleNumberl;
    }

    public String getVehicleBrand() {
        return VehicleBrand;
    }

    public void setVehicleBrand(String VehicleBrand) {
        this.VehicleBrand = VehicleBrand;
    }

    public int getManufactureYear() {
        return ManufactureYear;
    }

    public void setManufactureYear(int ManufactureYear) {
        this.ManufactureYear = ManufactureYear;
    }

    public int getJobID() {
        return JobID;
    }

    public void setJobID(int JobID) {
        this.JobID = JobID;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    
    
   

 
    
  
    
}
