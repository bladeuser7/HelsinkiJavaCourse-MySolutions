
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numb1 = Integer.valueOf(scanner.nextLine());
        int numb2 = Integer.valueOf(scanner.nextLine());
        
        int squareRoot = (int) Math.sqrt(numb1 + numb2);
        System.out.println(squareRoot);

    }
}
