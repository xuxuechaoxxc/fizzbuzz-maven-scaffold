public class FizzBuzz {

    public static String exc(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }else {
            return null;
        }
    }

}
