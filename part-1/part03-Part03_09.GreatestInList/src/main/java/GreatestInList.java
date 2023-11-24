
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        } int smallest = list.get(0);

for(int i = 0; i < list.size(); i++) {
    int number = list.get(i);
    if (smallest < number) {
        smallest = number;
    }
}

System.out.println("The greatest number: " + smallest);

        // implement finding the greatest number in the list here
//        System.out.println("The greatest number: " + );
    }
}
