/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import tool.MyUtil;


public class Transcript {
     private String StudentID;
    private String SubjectID;
    private double lab;
    private double test;
    private double finalexam;

    public Transcript() {
        StudentID = SubjectID = "";
        lab = test = finalexam = 0.0f;
    }


    public Transcript(String StudentID, String SubjectID, double lab, double test, double finalexam) {
        this.StudentID = StudentID;
        this.SubjectID = SubjectID;
        this.lab = lab;
        this.test = test;
        this.finalexam = finalexam;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) throws Exception {
        if (!MyUtil.isEmptyString(StudentID))
            this.StudentID = StudentID;
        else
            throw new Exception("Empty Student ID!");
    }

    public String getSubjectID() {
        return SubjectID;
    }

    public void setSubjectID(String SubjectID) throws Exception {
        if (!MyUtil.isEmptyString(SubjectID))
            this.SubjectID = SubjectID;
        else
            throw new Exception("Empty Subject ID!");
    }

    public double getLab() {
        return lab;
    }

    public void setLabs(double labs) throws Exception {
        if (MyUtil.checkFloatNumber(labs, 0.0f, 10.0f))
            this.lab = lab;
        else
            throw new Exception("Negative Labs Grade!");
    }

    public double getTest() {
        return test;
    }

    public void setTest(double test) throws Exception {
        if (MyUtil.checkFloatNumber(test, 0.0f, 10.0f))
            this.test = test;
        else
            throw new Exception("Negative Progress Test Grade!");
    }

    public double getFinalexam() {
        return finalexam;
    }

    public void setFinalexam(double finalexam) throws Exception {
        if (MyUtil.checkFloatNumber(finalexam, 0.0f, 10.0f))
            this.finalexam = finalexam;
        else
            throw new Exception("Negative Final Exam Grade!");
    }
}
