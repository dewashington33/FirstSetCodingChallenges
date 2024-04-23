
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
                System.out.println(wakeUp ? "My dog " + myDog.name + " " + myDog.speak() + " is barking at " +
                                myDog.convertMilitaryToRegular(hourOfDay) + " and I need to wake up!"
                                : "My dog " +
                                                myDog.name + " is not barking");

                System.out.println("**** Time ****");

                int year = 2024;
                boolean isLeapYear = Time.isLeapYear(year);
                System.out
                                .println(isLeapYear ? year + " is a leap year."
                                                : year + " is not a leap year.");

                int month = 2;
                year = 2024;
                int days = Time.getDaysInMonth(month, year);
                System.out.println(days == -1 ? "Invalid month or year"
                                : "There are " + days + " days in the month of " +
                                                Time.getMonthName(month) + ".");

                String qtrMonth = "April";
                int quarter = Time.getQuarter(qtrMonth);
                // ternary operator to print the quarter of the month where it checks for -1
                // and prints "Invalid month" if quarter is -1
                System.out.println(quarter == -1 ? "Invalid month"
                                : "The quarter for " + qtrMonth +
                                                " is " + quarter + ".");

                double firstNumber = 3.1756;
                double secondNumber = 3.176;
                boolean areEqual = MathComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber);
                System.out.println(areEqual
                                ? firstNumber + " and " + secondNumber + " are equal to three decimal places."
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

                int seconds = 59;
                int minutes = 65;
                if (minutes == 0) {
                        Time.getDurationString(seconds);
                } else {
                        Time.getDurationString(minutes, seconds);
                }

                System.out.println("***Minutes to Years and Days***");
                minutes = 570301;
                Time.printYearsDaysHoursMinutes(minutes);

                double radius = 1;
                double length = -5;
                double width = 5;
                double areaCircle = AreaCalculator.area(radius);
                double areaRectangle = AreaCalculator.area(length, width);

                // ternary operator where it checks if there is one value for the area and
                // returns the area of a circle,
                // otherwise it returns the area of a rectangle. It also checks if the area is
                // less than 0 and returns -1
                // therefore stating that you cannot have a negative area.
                System.out.println(areaCircle < 0 ? "The radius of the circle cannot be less than 1 "
                                : "The area of the circle is " + areaCircle + ".");
                System.out.println(areaRectangle < 0 ? "The length or width of the rectangle cannot be less than 1 "
                                : "The area of the rectangle is " + areaRectangle + ".");

                MathComparator.printEqual(1, 1, 1);
                MathComparator.printEqual(1, 2, 3);
                MathComparator.printEqual(1, 2, 1);
                MathComparator.printEqual(-1, 1, 1);

                System.out.println("**** Cat ****");
                Cat myCat1 = new Cat("Mittens", "Siamese", 3, "White");
                int temperature = 30;
                boolean isPlaying = myCat1.isCatPlaying(temperature);
                System.out.println(isPlaying ? "My cat is playing. " + myCat1.speak() : "My cat is not playing.");

                Cat myCat2 = new Cat("Garfield", "Mixed", 3, "Yellow & White");
                temperature = 47;
                isPlaying = myCat2.isCatPlaying(temperature);
                System.out.println(isPlaying ? "My cat is playing. " + myCat2.speak() : "My cat is not playing.");

                System.out.println("**** Military ****");
                System.out.println(Military.militaryToCivilianTime(2330));
                System.out.println(Military.civilianTimetoMilitary(11, 59, "AM"));
                System.out.println(Military.civilianTimetoMilitary(11, 59, "PM"));

                // Remember a char data type uses single quotes
                Military.getMilitaryWordFromAlphabet('S');
                Military.getMilitaryWordFromAlphabet('H');

                System.out.println("**** Numbers ****");
                System.out.println(Numbers.isPrime(7));
                System.out.println(Numbers.isPrime(8));

        }
}
