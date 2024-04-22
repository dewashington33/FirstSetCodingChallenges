public class Military {

    public static void getMilitaryWordFromAlphabet(char letter) {
        letter = Character.toUpperCase(letter);

        switch (letter) {
            case 'A' -> System.out.println("Alpha");
            case 'B' -> System.out.println("Bravo");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Delta");
            case 'E' -> System.out.println("Echo");
            case 'F' -> System.out.println("Foxtrot");
            case 'G' -> System.out.println("Golf");
            case 'H' -> System.out.println("Hotel");
            case 'I' -> System.out.println("India");
            case 'J' -> System.out.println("Juliet");
            case 'K' -> System.out.println("Kilo");
            case 'L' -> System.out.println("Lima");
            case 'M' -> System.out.println("Mike");
            case 'N' -> System.out.println("November");
            case 'O' -> System.out.println("Oscar");
            case 'P' -> System.out.println("Papa");
            case 'Q' -> System.out.println("Quebec");
            case 'R' -> System.out.println("Romeo");
            case 'S' -> System.out.println("Sierra");
            case 'T' -> System.out.println("Tango");
            case 'U' -> System.out.println("Uniform");
            case 'V' -> System.out.println("Victor");
            case 'W' -> System.out.println("Whiskey");
            case 'X' -> System.out.println("X-ray");
            case 'Y' -> System.out.println("Yankee");
            case 'Z' -> System.out.println("Zulu");
            default -> System.out.println("Invalid letter");
        }
    }

    public static String militaryToCivilianTime(int milTime) {
        int hour = milTime / 100;
        int min = milTime % 100;
        String period;

        if (hour < 0 || hour > 24 || min < 0 || min > 59) {
            return ""; // Invalid input
        } else if (hour >= 12) {
            hour = (hour == 12) ? 12 : hour - 12;
            period = "PM";
        } else {
            period = "AM";
        }

        return String.format("%02d:%02d %s", hour, min, period);
    }

    public static String civilianTimetoMilitary(int hour, int min, String period) {
        if (hour < 1 || hour > 12 || min < 0 || min > 59) {
            return ""; // Invalid input
        }

        if (period.equalsIgnoreCase("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else if (period.equalsIgnoreCase("PM")) {
            if (hour != 12) {
                hour += 12;
            }
        } else {
            return ""; // Invalid input
        }

        return String.format("%02d%02d", hour, min);
    }
}
