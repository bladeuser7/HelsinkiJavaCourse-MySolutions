
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int value = Integer.valueOf (scanner.nextLine());
        int result = 1; 
        int i = 1;
        
        while (true) {
            result = i * result + result;
            i++;
            
            if (i == value) {
                break;
            }
        }
        
        
        
        
        System.out.println("Factorial: " + result);

    }
}
