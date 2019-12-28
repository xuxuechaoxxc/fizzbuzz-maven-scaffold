import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Test
    public void test1() {
        String result = fizzBuzz.exc(3);
        assertThat(result).isEqualTo("Fizz");
    }
    @Test
    public void test2() {
        String result = fizzBuzz.exc(5);
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    public void test3() {
        String result = fizzBuzz.exc(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }


}
