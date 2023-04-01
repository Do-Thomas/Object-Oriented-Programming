/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Asus
 */

import tool.MyUtil;

/**
 *
 * @author Asus
 */
public class Subject {
    private String subID;
    private String name;
    private int credit;

    public Subject() {
        subID = name = "";
        credit = 0;
    }

    public Subject(String subID, String name, int credit) {
        this.subID = subID;
        this.name = name;
        this.credit = credit;
    }

    public Subject(String subID) {
        this.subID = subID;
    }

    

    public String getSubID() {
        return subID;
    }

    public void setSubID(String id) throws Exception {
        if (!MyUtil.isEmptyString(id))
            this.subID = subID;
        else
            throw new Exception("Empty ID!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (!MyUtil.isEmptyString(name))
            this.name = name;
        else
            throw new Exception("Empty Name!");
    }

    public int getCredit() {
        return credit;
    }

     public void setCredit(int credit) throws Exception {
        if (MyUtil.checkIntNumMin(credit, 0))
            this.credit = credit;
        else
            throw new Exception("Invalid Credit!");
    }
}