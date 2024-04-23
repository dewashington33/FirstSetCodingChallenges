public class Numbers {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // create a method that loops 1000 times and if the counter variable i is
    // divisible by 3 and 5,
    // sum the matches and return the sum. If the sum reaches 5 matches, break the
    // loop and return the sum.
    public static int sumOfDivisibleByThreeAndFive(int begin, int end) {
        int sum = 0;
        int countOfMatches = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 3 and 5.");
                sum += i;
                countOfMatches++;
                if (countOfMatches == 5) {
                    break;
                }
            }
        }
        return sum;
    }
}
