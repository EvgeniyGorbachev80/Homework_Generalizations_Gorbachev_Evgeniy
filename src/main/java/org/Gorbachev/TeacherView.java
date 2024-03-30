package org.Gorbachev;

import java.util.List;
public class TeacherView implements UserView<Teacher>{
    @Override
    public void display(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
