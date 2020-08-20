package data;

import model.Car;
import model.User;

public class UserCarProvider {

    public static Object[][] getUsersCars() {

        return new Object[][]{
                {new User("Tom", 21), new Car("Audi")},
                {new User("Bob", 22), new Car("BMW")},
                {new User("Jim", 23), new Car("Skoda")}
        };


//        Тоже самое, возвращает Stream<Object[]>
//        return Stream.of(
//                new Object[][]{
//                        {new User("Tom", 21), new Car("Audi")},
//                        {new User("Bob", 22), new Car("BMW")},
//                        {new User("Jim", 23), new Car("Skoda")}
//                }
//        );
    }
}
