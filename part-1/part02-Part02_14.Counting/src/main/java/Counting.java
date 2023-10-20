
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scaned = Integer.valueOf(scanner.nextLine());

        for (int value = 0; value <= scaned; value++) {
            System.out.println(value);
        }

//        int value = 0;
//        while (value > 0) {
//            System.out.println(value);
//            int number = Integer.valueOf (scanner.nextLine());
//            
//            if (value == number) {
//                break;
//            }
//            value = (value++);
//            System.out.println(value);
//        }
    }
}
