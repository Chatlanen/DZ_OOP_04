package less4;

import less4.controller.StudentController;
import less4.controller.TeacherController;
import less4.model.Student;
import less4.model.Teacher;

import java.util.Arrays;
import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(2, "Ira", "Ivanova")));

//____________________________________________________________________

        List<Teacher> teach = Arrays.asList(
                new Teacher(1, "SashaT", "IvanovT"),
                new Teacher(2, "IraT", "IvanovaT"));

        Teacher te = new Teacher(3, "Ivan", "Sidorov");

        TeacherController TC = new TeacherController(teach);
        
        TC.showTeachers();

        TC.addTeacher(te);

        TC.showTeachers();

        TC.editTeacher(TC.getTeacher(3), 4, "IvanT", "SidorovT");

        TC.showTeachers();

    }
}
