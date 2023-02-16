import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnNumberWhenNotAMultipleOf3or5() {
        assert new FizzBuzz().on(1).equals("1");
        assert new FizzBuzz().on(2).equals("2");
        assert new FizzBuzz().on(4).equals("4");
    }

    @Test
    public void shouldReturnFizzWhenMultipleOf3() {
        assert new FizzBuzz().on(3).equals("Fizz");
        assert new FizzBuzz().on(6).equals("Fizz");
        assert new FizzBuzz().on(9).equals("Fizz");
    }

    @Test
    public void shouldReturnBuzzWhenMultipleOf5() {
        assert new FizzBuzz().on(5).equals("Buzz");
        assert new FizzBuzz().on(10).equals("Buzz");
        assert new FizzBuzz().on(20).equals("Buzz");
    }
}
