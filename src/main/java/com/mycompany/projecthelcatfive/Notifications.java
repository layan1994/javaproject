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
public class Notifications {
    
        String emailt;
        String fromemail;
        String fromemailpassword;
        String emailss ;

    public Notifications(String emailt, String fromemail, String fromemailpassword, String emailss) {
        this.emailt = emailt;
        this.fromemail = fromemail;
        this.fromemailpassword = fromemailpassword;
        this.emailss = emailss;
    }

    public String getEmailt() {
        return emailt;
    }

    public void setEmailt(String emailt) {
        this.emailt = emailt;
    }

    public String getFromemail() {
        return fromemail;
    }

    public void setFromemail(String fromemail) {
        this.fromemail = fromemail;
    }

    public String getFromemailpassword() {
        return fromemailpassword;
    }

    public void setFromemailpassword(String fromemailpassword) {
        this.fromemailpassword = fromemailpassword;
    }

    public String getEmailss() {
        return emailss;
    }

    public void setEmailss(String emailss) {
        this.emailss = emailss;
    }
        
    
}
