public class MathComparator {

    /*
     * Write a method areEqualByThreeDecimalPlaces with two parameters of type
     * double.
     * The method should return boolean and it needs to return true if two double
     * numbers are the same
     * up to three decimal places. Otherwise, return false.
     * 
     * 
     */
    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
        return (int) (firstDouble * 1000) == (int) (secondDouble * 1000);
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int sum) {
        return firstNumber + secondNumber == sum;
    }

    /*
     * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
     * Write a method named hasTeen with 3 parameters of type int.
     * The method should return boolean and it needs to return true if one of the
     * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
     * false.
     */

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        return isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber);
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }

    public static void printEqual(int firstNum, int secondNum, int thirdNum) {
        if (firstNum < 0 || secondNum < 0 || thirdNum < 0) {
            System.out.println("Invalid Value");
        } else if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("All numbers are equal");
        } else if (firstNum != secondNum && secondNum != thirdNum && firstNum != thirdNum) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
