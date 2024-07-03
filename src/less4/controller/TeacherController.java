package less4.controller;

import java.util.ArrayList;
import java.util.List;

import less4.model.Teacher;
import less4.service.TeacherService;

public class TeacherController{

    private List<Teacher> teachers = new ArrayList<>();
    private TeacherService teacherService = new TeacherService();


    public TeacherController(List<Teacher> teachers){
        this.teachers.addAll(teachers);
    }

    public void showTeachers(){
        teacherService.sendOnConsole(teachers);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    
    public Teacher getTeacher(int id){
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id)
                return teacher;
        }
        return null;
    }

    public void editTeacher(Teacher teacher, int id, String name, String last){
        teacherService.edit(teacher, id, name, last);
    }






}
