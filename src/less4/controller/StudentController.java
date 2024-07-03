package less4.controller;

import less4.model.Student;
import less4.model.User;
import less4.view.StudentView;
import less4.view.UserView;

import java.util.List;

public class StudentController implements UserController {

    private UserView<Student> view = new StudentView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }

    @Override
    public <T extends User> User edit(T user, int id, String name, String last) {
        user.setId(id);
        user.setName(name);
        user.setLastName(last);
        return user;
    }

}
