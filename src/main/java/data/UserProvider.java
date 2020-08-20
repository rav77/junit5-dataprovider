package data;

import model.User;

import java.util.stream.Stream;

public class UserProvider {

    public static Stream<User> getUsers() {
        return Stream.of(
                new User("Tom", 21),
                new User("Bob", 22),
                new User("Jim", 23)
        );
    }
}
