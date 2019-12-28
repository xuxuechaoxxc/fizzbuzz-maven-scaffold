import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Test
    public void test15() {
        String result = fizzBuzz.exc(15);
        assertThat(result).isEqualTo("Buzz");
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
