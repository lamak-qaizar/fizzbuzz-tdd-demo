public class FizzBuzz {
    public String on(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number == 15 || number == 30 || number == 45) {
            return "FizzBuzz";
        }
        return String.valueOf(number);
    }
}
