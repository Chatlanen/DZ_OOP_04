package less4.view;

import less4.model.Teacher;

import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        Collections.sort(teachers);
        System.out.println(teachers);
    }

    public void editVew (int id, String name, String last)
    {
        
    }

    public void print (List<Teacher> teachers){
        System.out.println(teachers);
    }

}
