
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here 
        //Give the first number:
        //5
        //Give the second number:
        //4
        //5 + 4 = 9


        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number: ");
        int sec = Integer.valueOf(scanner.nextLine());
        
        String plusSign = " + ";
        String equalSign = " = ";

        System.out.println(
                first 
                + plusSign
                + sec
                + equalSign
                + (first + sec)
                
        );

    }
}
