package training.entities;

import java.util.ArrayList;
import trainning.utils.Validator;

public class TeacherList extends ArrayList<Teacher> {

    public ArrayList<Teacher> getTeacherList() {
        return this;
    }

    public boolean addTeacher(Teacher newTeacher) {
        try {
            return this.add(newTeacher);
        } catch (Exception e) {
            return false;
        }
    }

}
