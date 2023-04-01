/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import java.util.ArrayList;
import java.util.Scanner;
import tool.MyUtil;

/**
 *
 * @author Tran Phong <phongntse150974@fpt.edu.vn>
 */
public class StudentList extends ArrayList<Student> {
    
    public ArrayList<Student> getStudentList() {
        return this;
    }
    
    public boolean addStudent(Student newStudent) {
        try {
            return this.add(newStudent);
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean deleteStudent(Student delStudent) {
        try {
            return this.remove(delStudent);
        } catch (Exception e) {
            return false;
        }
    }
    
    public Student searchStudent(String StudentID) {
        for (Student student : this) {
            if (StudentID.equalsIgnoreCase(student.getId()))
                return student;
        }
        return null;
    }
    public boolean updateStudent(Student oldStudent, Student newStudent) {
        try {
            if (searchStudent(oldStudent.getId()) == null || newStudent == null)
                return false;
            if (!MyUtil.isEmptyString(newStudent.getFName()))
                oldStudent.setFName(newStudent.getFName());
            if (!MyUtil.isEmptyString(newStudent.getLName()))
                oldStudent.setLName(newStudent.getLName());
            if (!MyUtil.isEmptyString(newStudent.getGender())) 
                oldStudent.setGender(MyUtil.convertGender(newStudent.getGender()));
            if (!newStudent.getDOB().equals("1/1/1"))
                oldStudent.setDOB(new DOB(newStudent.getDOB()));
            if (!MyUtil.isEmptyString(newStudent.getEmail()))
                oldStudent.setEmail(newStudent.getEmail());
            if (!MyUtil.isEmptyString(newStudent.getPhone()))
                oldStudent.setPhone(newStudent.getPhone());
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
    
