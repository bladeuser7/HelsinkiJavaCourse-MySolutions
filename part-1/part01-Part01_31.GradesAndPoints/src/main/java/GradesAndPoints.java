
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points[0-100]:");
        int point1 = Integer.valueOf(scan.nextLine());
        
        if (point1 < 0) {
            System.out.println("imposible!");
        } else if (point1 <= 49) {
            System.out.println("failed");
        } else if (point1 <= 59) {
            System.out.println("1");
        } else if (point1 <= 69) {
            System.out.println("2");
        } else if (point1 <= 79) {
            System.out.println("3");
        } else if (point1 <= 89) {
            System.out.println("4");
        }  else if (point1 <= 100) {
            System.out.println("5");
        } else if (point1 <= 101) {
            System.out.println("incredible!");
        }
    }
}
