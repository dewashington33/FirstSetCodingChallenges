public class PositiveNegativeZero {

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void checkNumber2(int number) {
        if (number > 0)
            System.out.println("positive");
        else if (number < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}
