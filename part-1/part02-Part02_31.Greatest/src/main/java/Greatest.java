
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        // write some code here
        int winner = 0;
        if (number1 >= number2 & number1 >= number3) {
            winner = number1;
        } else if (number2 >= number1 & number2 >= number3) {
            winner = number2;
        } else if (number3 >= number1 & number3 >= number2) {
            winner = number3;
        }
        return winner;
    }

    public static void main(String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }
}
