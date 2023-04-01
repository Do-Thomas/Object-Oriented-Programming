package training.main;

import training.entities.Person;
import training.entities.Student;
import training.entities.Teacher;
import training.utils.Validator;

public class ManagerProgram {

    Person[] persons;
    int count;
    
    public ManagerProgram() {
        persons = new Person[10];
        count = 0;
    }

    public boolean input(Person person) {
        Validator validator = new Validator();
        person.setName(Cabinet.getString("Name: "));
        person.setGender(Cabinet.getString("Gender: "));
        String date = Cabinet.getString("Birthday (dd/mm/yyyy): ");
        if (validator.birthDate(date)) {
            person.setBirthday(date);
        } else {
            System.out.println("Format Date is not valid!");
            return false;
        }
        String email = Cabinet.getString("Email: ");
        if (validator.isEmail(email)) {
            person.setEmail(email);
        } else {
            System.out.println("Format Email is not valid!");
            return false;
        }
        
        person.setPhoneNumber(Cabinet.getString("Phone number: "));

        if (person instanceof Student) {
            ((Student) person).setId(Cabinet.getString("Enter Id: "));

            double pratice = Cabinet.getADouble("Enter practice mark: ");
            if (validator.isvalidMark(pratice)) {
                ((Student) person).setPractice(pratice);
            } else {
                System.out.println("Practice mark is not valid!");
                return false;
            }

            double theory = Cabinet.getADouble("Enter theory mark: ");
            if (validator.isvalidMark(theory)) {
                ((Student) person).setTheory(theory);
            } else {
                System.out.println("Theory mark is not valid!");
                return false;
            }

        } else if (person instanceof Teacher) {
            ((Teacher) person).setBasicSalary(Cabinet.getADouble("Enter basic salary: "));
            ((Teacher) person).setSubsidy(Cabinet.getADouble("Enter subsidy: "));

        }
        persons [count++] = person;
        return true;
    }
    
    public void updateStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (persons[i] instanceof Student) {
                if (((Student) persons[i]).getId().equals(id)) {
                    ((Student) persons[i]).setName(Cabinet.getString("New name: ", "New name: "));
                    ((Student) persons[i]).setPhoneNumber(Cabinet.getString("New phone: ", "New phone: "));
                    ((Student) persons[i]).setPractice(Cabinet.getADouble("Update Practice mark: "));
                    ((Student) persons[i]).setTheory(Cabinet.getADouble("Update Theory mark: "));
                    return;
                }
            }
        }
        System.out.println("Cannot find the student!");

    }

    public void displayTeacher() {
        for (int i = 0; i < count; i++) {
            if (persons[i] instanceof Teacher && ((Teacher) persons[i]).calculateSalary() > 1000) {
                System.out.println(persons[i]);
            }
        }

    }

    public void report() {
        for (int i = 0; i < count; i++) {
            if (persons[i] instanceof Student && ((Student) persons[i]).calculateFinalMark() >= 6) {
                System.out.println(persons[i]);
            }
        }
    }
}
