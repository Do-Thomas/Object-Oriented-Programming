package training.entities;

import java.util.ArrayList;
import java.util.Scanner;
import trainning.utils.Validator;

public abstract class Person {

    String name;
    String gender;
    int phone;
    String email;
    String dob;

    public Person() {
    }

    public Person(String name, String gender, int phone, String email) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void purchaseParkingPass() {

    }

    public void input() {
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter phone: ");
        int phone = Integer.parseInt(sc.nextLine());
        String email;
        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
            if (Validator.isEmail(email) == false) {
                System.out.println("Wrong format!");
                System.out.print("Enter email again: ");
                email = sc.nextLine();
            }
            break;
        } while (Validator.isEmail(email));

        String sDob = null;
        DOB dob = null;
        do {
            System.out.println("Date of Birth (dd/mm/yyyy): ");
            try {
                sc = new Scanner(System.in);
                sDob = sc.nextLine().trim();
                dob = new DOB(sDob);
                cont = false;
            } catch (Exception e) {
                System.out.println("Please enter a valid date, ex: 10/2/1989");
                cont = true;
            }
        } while (cont);
    }

//        public boolean addStudent(Student newStudent) {
//            try {
//                return this.add(newStudent);
//            } catch (Exception e) {
//                return false;
//            }
//        }
//
//        public boolean deleteStudent(Student delStudent) {
//            try {
//                return this.remove(delStudent);
//            } catch (Exception e) {
//                return false;
//            }
//        }
//
//        public Student searchStudent(String StudentID) {
//            for (Student student : this) {
//                if (StudentID.equalsIgnoreCase(student.getId())) {
//                    return student;
//                }
//            }
//            return null;
//        }
//
//        public boolean updateStudent(Student oldStudent, Student newStudent) {
//            try {
//                if (searchStudent(oldStudent.getId()) == null || newStudent == null) {
//                    return false;
//                }
//                if (!MyUtil.isEmptyString(newStudent.getFName())) {
//                    oldStudent.setFName(newStudent.getFName());
//                }
//                if (!MyUtil.isEmptyString(newStudent.getLName())) {
//                    oldStudent.setLName(newStudent.getLName());
//                }
//                if (!MyUtil.isEmptyString(newStudent.getGender())) {
//                    oldStudent.setGender(MyUtil.convertGender(newStudent.getGender()));
//                }
//                if (!newStudent.getDOB().equals("1/1/1")) {
//                    oldStudent.setDOB(new DOB(newStudent.getDOB()));
//                }
//                if (!MyUtil.isEmptyString(newStudent.getEmail())) {
//                    oldStudent.setEmail(newStudent.getEmail());
//                }
//                if (!MyUtil.isEmptyString(newStudent.getPhone())) {
//                    oldStudent.setPhone(newStudent.getPhone());
//                }
//                return true;
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                return false;
//            }
//        }
    }

