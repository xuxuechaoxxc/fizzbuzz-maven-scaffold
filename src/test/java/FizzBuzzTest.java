import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {


    @Test
    public void test1() {
        String result = FizzBuzz.exc(3);
        assertThat(result).isEqualTo("1");
    }
    @Test
    public void test3() {
        String result = FizzBuzz.exc(3);
        assertThat(result).isEqualTo("Fizz");
    }
    @Test
    public void test5() {
        String result = FizzBuzz.exc(5);
        assertThat(result).isEqualTo("Buzz");
    }
    @Test
    public void test15() {
        String result = FizzBuzz.exc(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }


}
