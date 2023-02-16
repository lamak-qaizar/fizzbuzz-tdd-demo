import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnNumberWhenNotAMultipleOf3or5() {
        assert new FizzBuzz().on(1).equals("1");
        assert new FizzBuzz().on(2).equals("2");
        assert new FizzBuzz().on(4).equals("4");
    }
}
