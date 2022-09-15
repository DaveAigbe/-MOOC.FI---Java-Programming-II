
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (Integer.parseInt(input) < 0) {
                numbers.stream().filter(i -> i >= 1 && i <= 5).forEach(i -> System.out.println(i));
                break;
            }


            numbers.add(Integer.valueOf(input));
        }

    }
}
