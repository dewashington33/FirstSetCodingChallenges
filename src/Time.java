public class Time {

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
        } else {
            int minutes = seconds / 60; // will be 0 if seconds < 60 and 1 if seconds = 60
            int remainingSeconds = seconds % 60; // will be 0 if seconds < 60 and 0 if seconds = 60
            getDurationString(minutes, remainingSeconds);
        }
    }

    public static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value");
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
        }
    }
}
