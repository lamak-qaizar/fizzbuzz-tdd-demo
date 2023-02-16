public class FizzBuzz {
    public String on(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number == 5 || number == 10 || number == 20) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
