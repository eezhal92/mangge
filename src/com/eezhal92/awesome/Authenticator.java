package com.eezhal92.awesome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Authenticator {
    private static final Map<String, User> users = new HashMap<>();
    private final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static {
        users.put("password", new User("johndoe", "password", 10000));
    }

    private static boolean isAuthenticated(String username, String password) {
        User user = users.get(password);

        if (user == null) {
            return false;
        }

        return user.getUsername().equals(username);
    }

    public static User authenticate() {
        String username = "";
        String password = "";
        User user;

        try {
            while (!isAuthenticated(username, password)) {
                System.out.print("username:");
                username = READER.readLine();
                System.out.print("password:");
                password = READER.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        user = users.get(password);

        return user;
    }
}
