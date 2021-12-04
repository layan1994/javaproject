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
public class Employee {
    String EmployeeName;
    String EmployeeID;
    String Address;
    int ContactNumber;
    String JobType;

    public Employee(String EmployeeName, String EmployeeID, String Address, int ContactNumber, String JobType) {
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
        this.Address = Address;
        this.ContactNumber = ContactNumber;
        this.JobType = JobType;
    }

    Employee(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(int ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public String getJobType() {
        return JobType;
    }

    public void setJobType(String JobType) {
        this.JobType = JobType;
    }
    
}
