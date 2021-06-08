public class FizzBuzz {
    public static String fizzBuzz(int number) {
        String result = "";
        String NUM = String.valueOf(number);
        if(number % 3 == 0 && number % 5 != 0)
        {
            result = "Fizz";
        }
        else if (number % 5 == 0 && number % 3 != 0)
        {
            result = "Buzz";
        }
        else if (number % 3 == 0 && number % 5 == 0)
        {
            result = "FizzBuzz";
        }
        if (result == "Fizz" || result == "Buzz" || result == "FizzBuzz")
        {
            return result;
        }
        else return NUM;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(2));
    }
}
