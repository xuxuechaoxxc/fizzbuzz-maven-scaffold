import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // 方式一
    @Test
    public void should_throw_IAE_with_message_given_negative_number() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid input");
        FizzBuzz.of(-1);
    }

    // 方式二
    @Test(expected = IllegalArgumentException.class)
    public void should_throw_IAE_given_negative_number() {
        FizzBuzz.of(-1);
    }
}
