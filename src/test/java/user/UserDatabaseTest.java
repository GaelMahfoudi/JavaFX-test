package user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;

/**
 * Created by Gaël on 20/04/2016.
 */
public class UserDatabaseTest {

    private UserDatabase userDatabase;

    @Before
    public void initTest() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Jean"));
        users.add(new User("Paul"));
        users.add(new User("Yves"));
        users.add(new User("Charles"));
        userDatabase = new UserDatabase(users);
    }


    @Test
    public void testEmptyDatabase() {
        assertThat(userDatabase.getAll().size(), is(equalTo(4)));
        userDatabase.emptyDatabase();
        assertThat(userDatabase.getAll().size(), is(equalTo(0)));
    }

    @Test
    public void testGetAUser() {
        assertThat(userDatabase.getUser("Jean"), is(notNullValue()));
    }

    @Test
    public void testSaveNewUser() {
        assertThat(userDatabase.getAll().size(), is(equalTo(4)));
        userDatabase.saveUser(new User("Charlie"));
        assertThat(userDatabase.getUser("Charlie"), is(notNullValue()));
    }

    @After
    public void endTest() {
        userDatabase = null;
    }
}
