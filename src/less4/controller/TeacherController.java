package less4.controller;

import java.util.List;

import less4.model.Teacher;
import less4.model.User;
import less4.view.TeacherView;
import less4.view.UserView;

public class TeacherController implements UserController{

    private UserView<Teacher> view = new TeacherView();

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
