package less4;

import less4.controller.StudentController;
import less4.controller.TeacherController;
import less4.model.Student;
import less4.model.Teacher;

import java.util.Arrays;
import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        List<Teacher> teach = Arrays.asList(
            new Teacher(1, "Sasha", "Ivanov"),
            new Teacher(2, "Ira", "Ivanova")
        );

        TeacherController TC = new TeacherController();
        TC.sendOnConsole(teach);
        //.sendOnConsole(teach);

        new StudentController()
                        .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                                new Student(2, "Ira", "Ivanova")));

    }
}
