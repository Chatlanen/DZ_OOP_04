package less4.controller.inteface;

import less4.model.User;

public interface UserController {

    <T extends User> User create(T user);
    <T extends User> User edit(T user, int id, String name, String last);
    
}
