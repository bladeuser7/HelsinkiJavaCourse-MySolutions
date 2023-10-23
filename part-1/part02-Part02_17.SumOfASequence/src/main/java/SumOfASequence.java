
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int scanned = Integer.valueOf (scanner.nextLine());
        int result = 1;
        int i = 1;
        
        while (true) {
            result = i + result +1;
            i++;
            
            if (i == scanned)  {
                break;
            }

            
        } System.out.println("The sum is " + result);
    }
}
