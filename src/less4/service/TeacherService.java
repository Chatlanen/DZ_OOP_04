package less4.service;

import java.util.List;

import less4.controller.inteface.UserController;
import less4.model.Teacher;
import less4.model.User;
import less4.view.TeacherView;
import less4.view.UserView;


public class TeacherService implements UserController{

    private UserView<Teacher> view = new TeacherView();

    public Teacher createTeacher(int id, String name, String last) {
        return new Teacher(id, name, last);
    }

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    @Override
    public <T extends User> User edit(T user, int id, String name, String last) {
        user.setId(id);
        user.setName(name);
        user.setLastName(last);
        return user;
    }

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }
}
