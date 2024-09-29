import UserController.User;

import java.util.List;

public interface UserService <T extends User> {
    public void initData(List<T> list);
    public void create(String surname, String firstname, String midlename);
}