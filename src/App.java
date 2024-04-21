
public class App {
    public static void main(String[] args) throws Exception {
        PositiveNegativeZero.checkNumber(5);
        PositiveNegativeZero.checkNumber(-5);
        PositiveNegativeZero.checkNumber(0);
        PositiveNegativeZero.checkNumber2(1);

        Car myCar = new Car("Toyota", "Corolla", 2021);
        long mph = myCar.toMilesPerHour(75.114);
        System.out.println(mph);

        myCar.printConversion(75.114);

        System.out.println("My " + myCar.year + " " + myCar.make +
                " " + myCar.model + " is a great car!\n" +
                "My " + myCar.make + " is currently traveling " + mph + " miles per hour.");

        Bytes myBytes = new Bytes();
        myBytes.printMegaBytesAndKiloBytes(99);

        Dog myDog = new Dog("Della", "CockaPooh", 5, "Brown and White");
        int hourOfDay = 23;
        boolean isBarking = true;
        boolean wakeUp = myDog.shouldWakeup(isBarking, hourOfDay);

        // create a ternary operator to print "My dog Della is barking" if wakeUp is
        // true

        System.out.println(wakeUp ? "My dog " + myDog.name + " is barking at " +
                myDog.convertMilitaryToRegular(hourOfDay) + " and I need to wake up!"
                : "My dog " +
                        myDog.name + " is not barking");

        int year = 2024;
        LeapYearCalculator myLeapYear = new LeapYearCalculator(year);
        boolean isLeapYear = myLeapYear.isLeapYear();
        System.out
                .println(isLeapYear ? myLeapYear.year + " is a leap year." : myLeapYear.year + " is not a leap year.");

        double firstNumber = 3.1756;
        double secondNumber = 3.176;
        boolean areEqual = MathComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber);
        System.out.println(areEqual ? firstNumber + " and " + secondNumber + " are equal to three decimal places."
                : firstNumber + " and " + secondNumber + " are not equal to three decimal places.");

        int firstNum = 1;
        int secondNum = 2;
        int sum = 4;
        boolean hasEqualSum = MathComparator.hasEqualSum(firstNum, secondNum, sum);
        System.out.println(hasEqualSum ? firstNum + " + " + secondNum + " = " + sum
                : firstNum + " + " + secondNum + " does not equal " + sum);

        int firstTeen = 13;
        int secondTeen = 14;
        int thirdTeen = 20;
        boolean hasTeen = MathComparator.hasTeen(firstTeen, secondTeen, thirdTeen);
        System.out.println(hasTeen ? "One of the numbers is a teen."
                : "None of the numbers are teens.");

        double feet = 5;
        double inches = 8;
        // ternary operator to call calcFeetAndInchesToCentimeters with two arguments or
        // one argument if inches is 0
        System.out.println(inches == 0 ? feet + " feet is " +
                Metric.calcFeetAndInchesToCentimeters(feet) + " centimeters."
                : feet + " feet " + inches + " inches is " +
                        Metric.calcFeetAndInchesToCentimeters(feet, inches) + " centimeters.");

        int seconds = 3600;
        int minutes = 0;
        if (minutes == 0) {
            Time.getDurationString(seconds);
        } else {
            Time.getDurationString(minutes, seconds);
        }
    }

}
