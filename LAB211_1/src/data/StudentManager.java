package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import tool.MyUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class StudentManager {

    StudentList stuList = new StudentList();
    SubjectList subList = new SubjectList();
    TranscriptList trList = new TranscriptList();

    public StudentManager() {
        subList = new SubjectList();
        stuList = new StudentList();
        trList = new TranscriptList();
    }
    Scanner sc = new Scanner(System.in);

    public void addSubject() {
        String sID = "", name = "";
        int credit = 0;
        boolean cont = true;
        do {
            System.out.print("\tEnter Subject ID: ");
            try {
                sc = new Scanner(System.in);
                sID = sc.nextLine();
                if (MyUtil.isEmptyString(sID)) {
                    throw new Exception("Subject ID cannot be empty!");
                }
                if (stuList.searchStudent(sID) != null) {
                    throw new Exception("Subject ID exists!");
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter ID again...");
            }
        } while (cont);

        // name
        cont = true;
        do {
            System.out.print("\n\tEnter Subject name: ");
            try {
                sc = new Scanner(System.in);
                name = sc.nextLine();
                if (MyUtil.isEmptyString(name)) {
                    throw new Exception("Subject name cannot be empty!");
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter Subject name again...");
            }
        } while (cont);

        // credit
        cont = true;
        do {
            System.out.print("\n\tEnter Subject credit: ");
            try {
                sc = new Scanner(System.in);
                credit = sc.nextInt();
                if (credit < 0) {
                    throw new Exception("Credit must be an integer that is equal or bigger than 0!");
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter Subject credit again...");
            }
        } while (cont);

        if (subList.addSubject(new Subject(sID, name, credit))) {
            System.out.println("Added subject successfully!");
        } else {
            System.out.println("Failed to add! Please check again.");
        }
    }

    public void updateSubject() throws Exception {
        if (subList.isEmpty()) {
            System.out.println("Subject list is empty! Please try to add some subjects to operate!");
            MyUtil.getEnter("Press Enter to get back the main menu...");
        } else {
            sc = new Scanner(System.in);
            String uID = "";
            boolean cont = true;
            do {
                System.out.print("Enter Subject ID to update: ");
                try {
                    uID = sc.nextLine();
                    if (MyUtil.isEmptyString(uID)) {
                        throw new Exception("Subject ID cannot be empty!");
                    }
                    if (subList.searchSubject(uID) == null) {
                        System.out.println("Subject does not exist to update!!");
                        MyUtil.getEnter("Press Enter to get back to main menu...");
                        break;
                    }
                    cont = true;
                    do {

                        Subject oldSubject = subList.searchSubject(uID);
                        System.out.println("\t\tEnter new information (or just Enter if you don't want to change)");
                        String name = "";
                        int credit = 0;

                        // name
                        cont = true;
                        do {
                            System.out.println("\n\tOld Subject name: " + oldSubject.getName());
                            System.out.print("\tEnter Subject new name: ");
                            try {
                                sc = new Scanner(System.in);
                                name = sc.nextLine();
                                cont = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                cont = true;
                                MyUtil.getEnter("Press Enter to enter Name again...");
                            }
                        } while (cont);

                        // credit
                        cont = true;
                        do {
                            System.out.println("\n\tSubject old Credit: " + oldSubject.getCredit());
                            System.out.print("\tEnter Subject new Credit (or -1 to stay unchange): ");
                            try {
                                sc = new Scanner(System.in);
                                credit = sc.nextInt();
                                if (credit != -1) {
                                    if (credit < 0) {
                                        throw new Exception("Credit must be an integer that is equal or bigger than 0!");
                                    }
                                }
                                cont = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                cont = true;
                                MyUtil.getEnter("Press Enter to enter Credit again...");
                            }
                        } while (cont);

                        Subject newSubject = new Subject(oldSubject.getSubID(), name, credit);
                        if (subList.updateSubject(oldSubject, newSubject)) {
                            System.out.println("Update Subject successfully!");
                        } else {
                            System.out.println("Failed to update. Please check again!");
                        }

                    } while (cont);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } while (cont);
        }
    }

    // Xóa môn học
    public void deleteSubject() {
        if (subList.isEmpty()) {
            System.out.println("Subject list is empty! Please try to add some subject to operate!");
            MyUtil.getEnter("Press Enter to get back the main menu...");
        } else {
            sc = new Scanner(System.in);
            String uID = "";
            boolean cont = true;
            do {
                System.out.print("Enter Subject ID to delete: ");
                try {
                    uID = sc.nextLine();
                    if (MyUtil.isEmptyString(uID)) {
                        throw new Exception("Subject ID cannot be empty!");
                    }
                    if (subList.searchSubject(uID) == null) {
                        System.out.println("Subject does not exist to update!!");
                        MyUtil.getEnter("Press Enter to get back to main menu...");
                        break;
                    }
                    cont = true;
                    Subject delSub = subList.searchSubject(uID);
                for (Subject stu : subList) {
                    if (trList.isEmpty()) {
                        break;
                    }
                    Transcript sGrade = trList.searchTranscript(stu.getSubID(), uID);
                    if (sGrade != null) {
                        trList.remove(sGrade);
                    }
                }
                if (subList.deleteSubject(delSub)) {
                    System.out.println("Delete Subject successfully!");
                    MyUtil.getEnter("Press Enter to go back to the main menu...");
                    cont = false;
                } else {
                    System.out.println("Failed to delete. Please check again!");
                }
             } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } while (cont);
        }
    }

//    public Student search(String stID) {
//        stID = stID.trim().toUpperCase();
//        for (int i = 0; i < stList.size(); i++) {
//            if (stList.get(i).getStID().equals(stID)) {
//                return stList.get(i);
//            }
//        }
//        return null;
//    }
//
//    //checking whether a code is duplicated or not?
//    public boolean isCodeDupplicated(String stID) {
//        stID = stID.trim();
//        if (search(stID) != null) // nếu Id khác null = có tồn tại
//        {
//            return false;
//        }
//        return true;
//    }
    // Thêm sinh viên
    public void addStudent() {
        String sID = "", FName = "", LName = "", gender = "", email = "", phone = "";
        DOB dob = null;

        System.out.println("----------------------");
        System.out.println("Add a new Student");

        // ID
        boolean cont = true;
        do {
            System.out.print("\tEnter Student ID: ");
            try {
                sc = new Scanner(System.in);
                sID = sc.nextLine();
                if (MyUtil.isEmptyString(sID)) {
                    throw new Exception("Student ID cannot be empty!");
                }
                if (stuList.searchStudent(sID) != null) {
                    throw new Exception("Student ID exists!");
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter ID again...");
            }
        } while (cont);

        // FName
        cont = true;
        do {
            System.out.print("\n\tEnter Student First name: ");
            try {
                sc = new Scanner(System.in);
                FName = sc.nextLine();
                if (!MyUtil.isName(FName)) {
                    throw new Exception("First Name must be a string with the length of 1 - 20 characters!");
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter First name again...");
            }
        } while (cont);

        // LName
        cont = true;
        do {
            System.out.print("\n\tEnter Student Last name: ");
            try {
                sc = new Scanner(System.in);
                LName = sc.nextLine();
                if (!MyUtil.isName(LName)) {
                    throw new Exception("Last Name must be a string with the length of 1 - 40 characters!");
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter Last name again...");
            }
        } while (cont);

        // gender
        cont = true;
        do {
            System.out.print("\n\tEnter Student Gender (male / female or m / f are accepted): ");
            try {
                sc = new Scanner(System.in);
                gender = sc.nextLine();
                gender = MyUtil.convertGender(gender);
                if (gender.isEmpty()) {
                    throw new Exception("Please enter male or m or female or f!");
                }
                if (gender.equalsIgnoreCase("male")) {
                    gender = "m";
                } else if (gender.equalsIgnoreCase("female")) {
                    gender = "f";
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter gender again...");
            }
        } while (cont);

        // dob
        cont = true;
        String sDob;
        do {
            System.out.print("\n\tEnter Student Date of Birth (dd/mm/yyyy; Ex: 10/2/1989): ");
            try {
                sc = new Scanner(System.in);
                sDob = sc.nextLine().trim();
                dob = new DOB(sDob);
                cont = false;
            } catch (Exception e) {
                System.out.println("Please enter a valid date, ex: 10/2/1989");
                cont = true;
                MyUtil.getEnter("Press Enter to enter date of birth again...");
            }
        } while (cont);

        // email
        cont = true;
        do {
            System.out.print("\n\tEnter Student Email: ");
            try {
                sc = new Scanner(System.in);
                email = sc.nextLine();
                if (!MyUtil.isEmail(email)) {
                    throw new Exception("Please enter a valid email!");
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter email again...");
            }
        } while (cont);

        // phone
        cont = true;
        do {
            System.out.print("\n\tEnter Student Phone number: ");
            try {
                sc = new Scanner(System.in);
                phone = sc.nextLine();
                if (!MyUtil.isPhone(phone)) {
                    throw new Exception("Please enter a valid phone number (10 to 12 numbers)");
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = true;
                MyUtil.getEnter("Press Enter to enter phone number again...");
            }
        } while (cont);

        if (stuList.addStudent(new Student(sID, FName, LName, gender, dob, email, phone))) {
            System.out.println("Added student successfully!");
        } else {
            System.out.println("Failed to add! Please check again.");
        }
    }

    public void updateStudent() throws Exception {
        if (stuList.isEmpty()) {
            System.out.println("Student list is empty! Please try to add some students to operate!");
            MyUtil.getEnter("Press Enter to get back the main menu...");
        } else {
            System.out.println("----------------------");
            System.out.println("Update a student");
            sc = new Scanner(System.in);
            String uID = "";
            boolean cont = true;
            do {
                System.out.print("Enter Student ID to update: ");
                try {
                    uID = sc.nextLine();
                    if (MyUtil.isEmptyString(uID)) {
                        throw new Exception("Student ID cannot be empty!");
                    }
                    if (stuList.searchStudent(uID) == null) {
                        System.out.println("Student does not exist to update!!");
                        MyUtil.getEnter("Press Enter to get back to main menu...");
                        break;
                    }
                    cont = true;
                    do {
                        Student oldStudent = stuList.searchStudent(uID);
                        System.out.println("\t\tEnter new information (or just Enter if you don't want to change)");
                        String nFName = "", nLName = "", nGender = "", nEmail = "", nPhone = "";
                        DOB nDob = new DOB();

                        // FName
                        cont = true;
                        do {
                            System.out.println("\n\tOld Student First name: " + oldStudent.getFName());
                            System.out.print("\tNew Student new First name: ");
                            try {
                                sc = new Scanner(System.in);
                                nFName = sc.nextLine();
                                if (!MyUtil.isEmptyString(nFName) && !MyUtil.isName(nFName)) {
                                    throw new Exception("First Name must be a string with the length of 1 - 40 characters!");
                                }
                                cont = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                cont = true;
                                MyUtil.getEnter("Press Enter to enter First name again...");
                            }
                        } while (cont);

                        // LName
                        cont = true;
                        do {
                            System.out.println("\n\tStudent old Last name: " + oldStudent.getLName());
                            System.out.print("\tEnter Student new Last name: ");
                            try {
                                sc = new Scanner(System.in);
                                nLName = sc.nextLine();
                                if (!MyUtil.isEmptyString(nLName) && !MyUtil.isName(nLName)) {
                                    throw new Exception("Last Name must be a string with the length of 1 - 40 characters!");
                                }
                                cont = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                cont = true;
                                MyUtil.getEnter("Press Enter to enter Last name again...");
                            }
                        } while (cont);

                        // gender
                        cont = true;
                        do {
                            System.out.println("\n\tStudent old Gender: " + oldStudent.getGender());
                            System.out.print("\tEnter Student new Gender (male / female or m / f are accepted): ");
                            try {
                                sc = new Scanner(System.in);
                                nGender = sc.nextLine();
                                if (!MyUtil.isEmptyString(nGender)) {
                                    nGender = MyUtil.convertGender(nGender);
                                    if (nGender.isEmpty()) {
                                        throw new Exception("Please enter male or m or female or f!");
                                    }
                                    if (nGender.equalsIgnoreCase("male")) {
                                        nGender = "m";
                                    } else if (nGender.equalsIgnoreCase("female")) {
                                        nGender = "f";
                                    }
                                }
                                cont = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                cont = true;
                                MyUtil.getEnter("Press Enter to enter gender again...");
                            }
                        } while (cont);

                        // dob
                        cont = true;
                        String sDob;
                        do {
                            System.out.println("\n\tStudent old Date of Birth: " + oldStudent.getDOB());
                            System.out.print("\tEnter Student new Date of Birth (dd/mm/yyyy; Ex: 10/2/1989): ");
                            try {
                                sc = new Scanner(System.in);
                                sDob = sc.nextLine().trim();
                                if (!MyUtil.isEmptyString(sDob)) {
                                    nDob = new DOB(sDob);
                                }
                                cont = false;
                            } catch (Exception e) {
                                System.out.println("Please enter a valid date, ex: 10/2/1989");
                                cont = true;
                                MyUtil.getEnter("Press Enter to enter date of birth again...");
                            }
                        } while (cont);

                        // email
                        cont = true;
                        do {
                            System.out.println("\n\tStudent old Email: " + oldStudent.getEmail());
                            System.out.print("\tEnter Student new Email: ");
                            try {
                                sc = new Scanner(System.in);
                                nEmail = sc.nextLine();
                                if (!MyUtil.isEmptyString(nEmail) && !MyUtil.isEmail(nEmail)) {
                                    throw new Exception("Please enter a valid email!");
                                }
                                cont = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                cont = true;
                                MyUtil.getEnter("Press Enter to enter email again...");
                            }
                        } while (cont);

                        // phone
                        cont = true;
                        do {
                            System.out.println("\n\tStudent old Phone number: " + oldStudent.getPhone());
                            System.out.print("\tEnter Student new Phone number: ");
                            try {
                                sc = new Scanner(System.in);
                                nPhone = sc.nextLine();
                                if (!MyUtil.isEmptyString(nPhone) && !MyUtil.isPhone(nPhone)) {
                                    throw new Exception("Please enter a valid phone number (10 to 12 numbers)");
                                }
                                cont = false;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                cont = true;
                                MyUtil.getEnter("Press Enter to enter phone number again...");
                            }
                        } while (cont);

                    } while (cont);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (cont);

        }
    }

    public void deleteStudent() {
        if (stuList.isEmpty()) {
            System.out.println("Student list is empty! Please try to add some students to operate!");
            MyUtil.getEnter("Press Enter to get back the main menu...");
        } else {
            sc = new Scanner(System.in);
            String uID = "";
            boolean cont = true;
            do {
                System.out.print("Enter Student ID to delete: ");
                try {
                    uID = sc.nextLine();
                    if (MyUtil.isEmptyString(uID)) {
                        throw new Exception("Student ID cannot be empty!");
                    }
                    if (stuList.searchStudent(uID) == null) {
                        System.out.println("Student does not exist to update!!");
                        MyUtil.getEnter("Press Enter to get back to main menu...");
                        break;
                    }
                    cont = true;
                    Student delStudent = stuList.searchStudent(uID);
                    for (Subject sub : subList) {
                        if (trList.isEmpty()) {
                            break;
                        }
                        Transcript sGrade = trList.searchTranscript(uID, sub.getSubID());
                        if (sGrade != null) {
                            trList.remove(sGrade);
                        }
                    }
                    if (stuList.deleteStudent(delStudent)) {
                        System.out.println("Delete Student successfully!");
                        MyUtil.getEnter("Press Enter to go back to the main menu...");
                        cont = false;
                    } else {
                        System.out.println("Failed to delete. Please check again!");

                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } while (cont);
        }
    }
              


    public void addGrade() {
        if (stuList.isEmpty()) {
            System.out.println("There is no student to add grade! Please try to add at least one to progress!");
            MyUtil.getEnter("Press Enter to go back to main menu...");
        } else if (subList.isEmpty()) {
            System.out.println("There is no subject to add grade! Please try to add at least one to progress!");
            MyUtil.getEnter("Press Enter to go back to main menu...");
        } else {
            boolean cont = true;
            do {
                String stuID = "", subID = "";
                double labs = 0, progress = 0, fe = 0;

                System.out.println("----------------------");
                System.out.println("Add Student grade");

                // ID
                cont = true;
                System.out.print("\tEnter Student ID: ");
                try {
                    sc = new Scanner(System.in);
                    stuID = sc.nextLine();
                    if (MyUtil.isEmptyString(stuID)) {
                        throw new Exception("Student ID cannot be empty!");
                    }
                    if (stuList.searchStudent(stuID) == null) {
                        throw new Exception("Student ID does not exist!");
                    }

                    System.out.println("Student found!");

                    // Subject ID
                    System.out.print("\tEnter Subject ID: ");
                    sc = new Scanner(System.in);
                    subID = sc.nextLine();
                    if (MyUtil.isEmptyString(subID)) {
                        throw new Exception("Subject ID cannot be empty!");
                    }
                    if (subList.searchSubject(subID) == null) {
                        throw new Exception("Subject ID does not exist!");
                    }
                    System.out.println("Subject found!");
                    int sChoice = -1;
                    Transcript sGrade = trList.searchTranscript(stuID, subID);
                    if (sGrade != null) {
                        sChoice = MyUtil.isContinue("Grade existed! Do you want to overwrite or not (y/n)?");
                    }
                    if (sChoice == 1) {
                        //Todo CODE
                        // Grade
                        System.out.println("\t\nUpdate grade for Student " + stuID + " (" + stuList.searchStudent(stuID).getFName() + ") of the Subject " + subID + " (" + subList.searchSubject(subID).getName() + ")");

                        // Labs
                        cont = true;
                        do {
                            try {
                                System.out.println("\tOld Labs: " + sGrade.getLab());
                                System.out.print("\tEnter new Labs: ");
                                labs = MyUtil.inputFloatNumber(0, 10);
                                cont = false;
                            } catch (Exception ex) {
                                System.out.println("Labs must be between 0 and 10! Please enter again...");
                                cont = true;
                            }
                        } while (cont);

                        // Progress
                        cont = true;
                        do {
                            try {
                                System.out.println("\tOld Progress tests: " + sGrade.getTest());
                                System.out.print("\tEnter new Progress tests: ");
                                progress = MyUtil.inputFloatNumber(0, 10);
                                cont = false;
                            } catch (Exception ex) {
                                System.out.println("Progress tests must be between 0 and 10! Please enter again...");
                                cont = true;
                            }
                        } while (cont);

                        // Finale
                        cont = true;
                        do {
                            try {
                                System.out.println("\tOld Final Exam: " + sGrade.getFinalexam());
                                System.out.print("\tEnter new Final Exam: ");
                                fe = MyUtil.inputFloatNumber(0, 10);
                                cont = false;
                            } catch (Exception ex) {
                                System.out.println("Final exam must be between 0 and 10! Please enter again...");
                                cont = true;
                            }
                        } while (cont);
                        Transcript newGrade = new Transcript(stuID, subID, labs, progress, fe);
                        if (trList.updateGrade(sGrade, newGrade)) {
                            System.out.println("Updated grade successfully!");
                        } else {
                            System.out.println("Failed to update! Please check again.");
                        }
                        int iContinue = MyUtil.isContinue();
                        switch (iContinue) {
                            case 1:
                                cont = true;
                                break;
                            case 0:
                                cont = false;
                                break;
                        }
                    } else {
                        // Grade
                        System.out.println("\t\tEnter grade for Student " + stuID + " (" + stuList.searchStudent(stuID).getFName() + ") of the Subject " + subID + " (" + subList.searchSubject(subID).getName() + ")");
                        // Labs
                        cont = true;
                        do {
                            try {
                                System.out.print("\tEnter Labs: ");
                                labs = MyUtil.inputFloatNumber(0, 10);
                                cont = false;
                            } catch (Exception ex) {
                                System.out.println("Labs must be between 0 and 10! Please enter again...");
                                cont = true;
                            }
                        } while (cont);

                        // Progress
                        cont = true;
                        do {
                            try {
                                System.out.print("\tEnter  tests: ");
                                progress = MyUtil.inputFloatNumber(0, 10);
                                cont = false;
                            } catch (Exception ex) {
                                System.out.println("Progress tests must be between 0 and 10! Please enter again...");
                                cont = true;
                            }
                        } while (cont);

                        // Finale
                        cont = true;
                        do {
                            try {
                                System.out.print("\tEnter Final Exam: ");
                                fe = MyUtil.inputFloatNumber(0, 10);
                                cont = false;
                            } catch (Exception ex) {
                                System.out.println("Final exam must be between 0 and 10! Please enter again...");
                                cont = true;
                            }
                        } while (cont);

                        if (trList.addGrade(new Transcript(stuID, subID, labs, progress, fe))) {
                            System.out.println("Added grade successfully!");
                        } else {
                            System.out.println("Failed to add! Please check again.");
                        }
//                        int iContinue = MyUtil.isContinue();
//                        switch (iContinue) {
//                            case 1:
//                                cont = true;
//                                break;
//                            case 0:
//                                cont = false;
//                                break;
//                        }
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    cont = false;
                    MyUtil.getEnter("Press Enter to go back to main menu...");
                }
            } while (cont);
        }
    }

    public void reportSubject() {
        if (trList.isEmpty()) {
            System.out.println("No Grade to Report! Please try to add some grade to progress!");
            MyUtil.getEnter("Press Enter to get back the main menu...");
        } else {
            System.out.println("----------------------");
            System.out.println("Grade Report by Student ID");

            // ID
            boolean cont = true;
            String stuID = "";
            System.out.print("\tEnter Student ID: ");
            try {
                sc = new Scanner(System.in);
                stuID = sc.nextLine();
                if (MyUtil.isEmptyString(stuID)) {
                    throw new Exception("Student ID cannot be empty!");
                }
                if (stuList.searchStudent(stuID) == null) {
                    throw new Exception("Student ID does not exist!");
                }

                Student stu = stuList.searchStudent(stuID);
                ArrayList<Transcript> gradeReport = trList.reportGradeByStu(stuID);
                Collections.sort(gradeReport, new Comparator<Transcript>() {
                    @Override
        public int compare(Transcript o1, Transcript o2) {
                        return subList.searchSubject(o1.getSubjectID()).getName().compareTo(subList.searchSubject(o2.getSubjectID()).getName());
                    }
                });
                System.out.println("- Student ID: " + stu.getId());
                System.out.println("- Student name: " + stu.getFName() + " " + stu.getLName());
                System.out.printf("%-5s\t%-30s\t%-20s\t%-10s\n",
                        "No.", "Subject name", "Average mark", "Status");
                int i = 0;
                for (Transcript grade : gradeReport) {
                    i++;
                    String subName = subList.searchSubject(grade.getSubjectID()).getName();
                    double avg = 0.3 * grade.getLab() + 0.3 * grade.getTest() + 0.4 * grade.getFinalexam();
                    String status = "";
                    if (avg >= 4) {
                        status = "Passed";
                    } else {
                        status = "Not Passed";
                    }
                    System.out.printf("%-5d\t%-30s\t%-20.3f\t%-10s\n",
                            i, subName, avg, status);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = false;
                MyUtil.getEnter("Press Enter to go back to main menu...");
            }
        }
    }

    public void reportStudent() {
        if (trList.isEmpty()) {
            System.out.println("No Grade to Report! Please try to add some grade to progress!");
            MyUtil.getEnter("Press Enter to get back the main menu...");
        } else {
            System.out.println("----------------------");
            System.out.println("Grade Report by Subject ID");

            // ID
            boolean cont = true;
            String subID = "";
            System.out.print("\tEnter Subject ID: ");
            try {
                sc = new Scanner(System.in);
                subID = sc.nextLine();
                if (MyUtil.isEmptyString(subID)) {
                    throw new Exception("Subject ID cannot be empty!");
                }
                if (subList.searchSubject(subID) == null) {
                    throw new Exception("Subject ID does not exist!");
                }

                Subject sub = subList.searchSubject(subID);
                ArrayList<Transcript> gradeReport = trList.reportGradeBySub(subID);
                Collections.sort(gradeReport, new Comparator<Transcript>() {
                    @Override
        public int compare(Transcript o1, Transcript o2) {
                        return (stuList.searchStudent(o1.getStudentID())).getLName().compareTo(stuList.searchStudent(o2.getStudentID()).getLName());
                    }
                });
                System.out.println("- Subject ID: " + sub.getSubID());
                System.out.println("- Subject name: " + sub.getName());
                System.out.printf("%-30s\t%-40s\t%-20s\t%-10s\n",
                        "Student ID", "Student name", "Average mark", "Status");
                int i = 0;
                for (Transcript grade : gradeReport) {
                    i++;
                    String stuName = stuList.searchStudent(grade.getStudentID()).getFName() + " " + stuList.searchStudent(grade.getStudentID()).getLName();
                    double avg = 0.3 * grade.getLab() + 0.3 * grade.getTest() + 0.4 * grade.getFinalexam();
                    String status = "";
                    if (avg >= 4) {
                        status = "Passed";
                    } else {
                        status = "Not Passed";
                    }
                    System.out.printf("%-30s\t%-40s\t%-20.3f\t%-10s\n",
                            grade.getStudentID(), stuName, avg, status);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                cont = false;
                MyUtil.getEnter("Press Enter to go back to main menu...");
            }
        }
    }
}
