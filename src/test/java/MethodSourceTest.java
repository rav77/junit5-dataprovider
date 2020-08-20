import model.Car;
import model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MethodSourceTest {

    @ParameterizedTest
    @MethodSource("data.UserProvider#getUsers")
    @DisplayName("Stream объектов User")
    void userProviderTest(User user) {
        System.out.print(user);
    }

    @ParameterizedTest
    @MethodSource("data.UserCarProvider#getUsersCars")
    @DisplayName("Stream массива объектов User, Car")
    void userCarProviderTest(User user, Car car) {
        System.out.print(user + " --> " + car);
    }
}
