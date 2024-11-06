package bkj.dev.tests_unitaires;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<String, User> users = new HashMap<>();

    public UserService() {}

    public void addUser(User user) {
        users.put(user.username(), user);
    }
    public User findByUsername(String username) {
        return users.get(username);
    }
}
