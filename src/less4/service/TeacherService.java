package less4.service;

import java.util.List;

import less4.model.Teacher;


public class TeacherService {

    private List<Teacher> teachers;

    public Teacher createTeacher(int id, String name, String last) {
        Teacher teach =  new Teacher(id, name, last);
        teachers.add(teach);
        return teach;
    }

    public void editTeacher (int id, String name, String last){
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id){
                teacher.setName(name);
                teacher.setLastName(last);
            }
        }
    }
}
