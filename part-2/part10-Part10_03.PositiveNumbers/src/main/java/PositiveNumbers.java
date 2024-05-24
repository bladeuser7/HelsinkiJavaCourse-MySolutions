
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> myList = new ArrayList<>();
        positive(myList);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> returnList = new ArrayList<>();

        returnList = numbers.stream()
                .filter(s -> s > 0)
                .collect(Collectors.toList());
                
        
        return returnList;

    }

}
