
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades average = new Grades();
        Grades averagePassing = new Grades();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points >= 0 && points <= 100) {
                average.add(points);
              
            } if (points >= 50 && points <= 100) {
                averagePassing.add(points);
            }
        }
        System.out.println("Point average (all): " + average.getAverage());
        if (averagePassing.getAverage() <= 50) {
            System.out.println("Point average (passing): -");
        } else {
           System.out.println("Point average (passing): " + averagePassing.getAverage());
        }

        System.out.println("Pass percentage: " +100 *  (1.0 * averagePassing.getSize() / average.getSize()));
        
        System.out.println("Grade distribution:" + average.gradeDistribution(average));
    } 
}
