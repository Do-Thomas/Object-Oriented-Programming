package training.main;

import training.entities.Person;
import training.entities.*;
import training.utils.Validator;

public class ManagerProgram {

    Person[] persons;
    int total;

    public ManagerProgram() {
        persons = new Person[10];
        total = 0;
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
        if (validator.isvalidEmail(email)) {
            person.setEmail(email);
        } else {
            System.out.println("Format Email is not valid!");
            return false;
        }
        
        person.setPhoneNumber(Cabinet.getString("Phone number: "));

        if (person instanceof Student) {
            ((Student) person).setId(Cabinet.getString("Input id: "));

            double pratice = Cabinet.getFloat("Input practice mark: ");
            if (validator.isvalidMark(pratice)) {
                ((Student) person).setPractice(pratice);
            } else {
                System.out.println("Practice mark is not valid!");
                return false;
            }

            double theory = Cabinet.getFloat("Input theory mark: ");
            if (validator.isvalidMark(theory)) {
                ((Student) person).setTheory(theory);
            } else {
                System.out.println("Theory mark is not valid!");
                return false;
            }

        } else if (person instanceof Teacher) {
            ((Teacher) person).setBasicSalary(Cabinet.getFloat("Input basic salary: "));
            ((Teacher) person).setSubsidy(Cabinet.getFloat("Input subsidy: "));

        }
        persons [total++] = person;
        return true;
    }

    
    
    public void updateStudent(String id) {
        for (int i = 0; i < total; i++) {
            if(persons[i] instanceof Student){
            if (((Student) persons[i]).getId().equals(id)) {
                ((Student)persons[i]).setPractice(Cabinet.getFloat("Update Practice mark: "));
                ((Student)persons[i]).setTheory(Cabinet.getFloat("Update Theory mark: "));
            return;
            }
            }
        }  
        System.out.println("Cannot find the student!");
           
    }
    
    public void displayTeacher(){
        for(int i = 0; i < total; i++){
            if(persons[i] instanceof Teacher && ((Teacher)persons[i]).calculateSalary() > 1000)
                System.out.println(persons[i]);    
        }
        
    }
    
    public void report(){
        for(int i = 0; i < total; i++){
            if(persons[i] instanceof Student && ((Student)persons[i]).calculateFinalMark() >= 6)
                System.out.println(persons[i]);
            else
                System.out.println("Cannot report student!");
        }
    }
}
