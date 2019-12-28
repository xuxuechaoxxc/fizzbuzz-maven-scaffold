public class FizzBuzz {

    public static String exc(int i) {
        String result;
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                result = "FizzBuzz";
            } else {
                result = "Fizz";
            }
            return result;
        }

        if (i % 5 == 0) {
            return "Buzz";
        }
        return i + "";
    }



}
