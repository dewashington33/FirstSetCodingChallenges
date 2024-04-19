
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
    }
}
