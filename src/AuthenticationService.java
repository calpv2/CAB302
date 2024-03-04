import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService(ArrayList<User> userList) {
        users = userList;
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String username, String password) {
        boolean userTaken = false;
        for (int i = 0; i <= users.size() - 1; i++) {
            String usernameCheck = users.get(i).getUsername();
            if (Objects.equals(username, usernameCheck)) {
                userTaken = true;
                break;
            }
        }
        if (!userTaken) {
            User user = new User(username, password);
            users.add(user);
            return user;
        }
        else {
            return null;
        }
    }
    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    public User logIn(String username, String password) {
        for (int i = 0; i <= users.size() - 1; i++) {
            String usernameCheck = users.get(i).getUsername();
            String passwordCheck = users.get(i).getPassword();
            if (Objects.equals(username, usernameCheck) && Objects.equals(password, passwordCheck))  {
                return users.get(i);
            }
        }
        return null;
    }
}
