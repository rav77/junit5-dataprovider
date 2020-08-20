import converter.CsvToUserConverter;
import model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvFileSourceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "user.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Чтение данных из csv-файла")
    void csvReadDataTest(String name, int age) {
        System.out.print(name + " : " + age);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "user.csv", numLinesToSkip = 1, delimiter = ',')
    @DisplayName("Чтение и конвертация данных из csv-файла")
    void csvToUserTest(@AggregateWith(CsvToUserConverter.class) User user) {
        System.out.print(user);
    }

}
