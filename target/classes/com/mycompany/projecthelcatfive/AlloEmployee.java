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
public class AlloEmployee 
{
  String EmpName;
  String workId;
  String JobID;

    public AlloEmployee(String EmpName, String workId, String JobID) {
        this.EmpName = EmpName;
        this.workId = workId;
        this.JobID = JobID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getJobID() {
        return JobID;
    }

    public void setJobID(String JobID) {
        this.JobID = JobID;
    }
  
}
