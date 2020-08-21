import data.EnumProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceTest {

    @ParameterizedTest
    @EnumSource(EnumProvider.class)
    @DisplayName("Чтение данных из enum-класса")
    void enumSourceTest(EnumProvider data) {

        System.out.print(data.name() + " : " + data.getText());
    }

}
