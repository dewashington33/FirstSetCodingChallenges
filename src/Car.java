public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public long toMilesPerHour(double speed) {
        // 1 kilometer per hour is equal to 0.621371 miles per hour
        if (speed < 0) {
            return -1;
        }
        return Math.round(speed * 0.621371);
    }

    public void printConversion(double speed) {
        long mph = toMilesPerHour(speed);
        if (mph == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(speed + " km/h = " + mph + " mi/h");
        }
    }
}
