import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnNumberWhenNotAMultipleOf3or5() {
        assert new FizzBuzz().on(1) == "1";
        assert new FizzBuzz().on(1) == "2";
        assert new FizzBuzz().on(1) == "4";
    }
}
