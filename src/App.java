
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

    }
}
