
public class Checker {

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("yes");
            return true;
        } else {
            return false;
        }
    }

    public boolean allVowels(String string) {
        if (string.matches("[aeiouAEIOU]+")) {
            System.out.println("correct");
            return true;
        } else {
            System.out.println("no");
            return false;
        }
    }

    public boolean timeOfDay(String string) {
        if (string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("morbing 2");
            return true;
        } else {
            System.out.println("nobing 2");
            return false;
        }
    }
}
