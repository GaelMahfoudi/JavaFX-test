package user;

import java.util.List;

/**
 * Created by Gaël on 20/04/2016.
 */
public class UserDatabase {

    private List<User> userList;

    public UserDatabase(List<User> userList) {
        this.userList = userList;
    }

    public User getUser(String name) {
        return null;
    }

    public List getAll() {
        return userList;
    }

    public void saveUser(User user) {
        userList.add(user);
    }

    public void emptyDatabase() {
        userList.clear();
    }
}
