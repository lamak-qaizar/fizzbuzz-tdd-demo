public class FizzBuzz {
    public String on(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number == 5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
