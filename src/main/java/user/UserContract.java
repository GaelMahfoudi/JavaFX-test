package user;

/**
 * Created by Gaël on 20/04/2016.
 */
public interface UserContract {

    interface View {
        void showUserInfo(User user);
    }

    interface Presenter {
        User loadUser(String name);
        void openUserInfo(User user);
    }
}
