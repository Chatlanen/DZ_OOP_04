package less4.controller;

import less4.model.Student;
import less4.service.StudentService;


import java.util.List;

public class StudentController{

    private StudentService studentService = new StudentService();

    public void sendOnConsole(List<Student> students) {
        studentService.sendOnConsole(students);
    }
}
