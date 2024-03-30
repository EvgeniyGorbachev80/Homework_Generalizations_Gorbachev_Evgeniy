package org.Gorbachev;

import java.util.List;

public interface UserView <T extends User> {
    void display(List<T> list);
}
