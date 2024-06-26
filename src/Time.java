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

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void printYearsDaysHoursMinutes(int minutes) {
        if (minutes < 0) {
            System.out.println("Invalid values");
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            int days = hours / 24;
            int remainingHours = hours % 24;
            int years = days / 365;
            int remainingDays = days % 365;
            System.out.println(years + "y " + remainingDays + "d " + remainingHours + "h " + remainingMinutes + "m");
        }
    }

    public static int getQuarter(String month) {
        return switch (month.toLowerCase()) {
            case "january", "february", "march" -> 1;
            case "april", "may", "june" -> 2;
            case "july", "august", "september" -> 3;
            case "october", "november", "december" -> 4;
            default -> -1;
        };
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> isLeapYear(year) ? 29 : 28;
                default -> -1;
            };
        }
    }
}
