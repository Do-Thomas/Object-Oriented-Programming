/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.entities;

import java.util.ArrayList;
import trainning.utils.Validator;

/**
 *
 * @author Asus
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
            if (StudentID.equalsIgnoreCase(student.getId())) {
                return student;
            }
        }
        return null;
    }

    public boolean updateStudent(Student oldStudent, Student newStudent) {
        try {
            if (searchStudent(oldStudent.getId()) == null || newStudent == null) {
                return false;
            }
            if (!Validator.isEmptyString(newStudent.getName())) {
                oldStudent.setName(newStudent.getName());
            }
            
            if (!Validator.isEmptyString(newStudent.getGender())) {
                oldStudent.setGender(Validator.convertGender(newStudent.getGender()));
            }
//            if (!newStudent.getDOB().equals("1/1/1"))
//                oldStudent.setDOB(new DOB(newStudent.getDOB()));
//            }
            if (!Validator.isEmptyString(newStudent.getEmail())) {
                oldStudent.setEmail(newStudent.getEmail());
            }
            
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
