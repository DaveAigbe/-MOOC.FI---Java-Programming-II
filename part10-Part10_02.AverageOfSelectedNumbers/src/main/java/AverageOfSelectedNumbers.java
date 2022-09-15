import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String response = scanner.nextLine();

            if (response.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String choice = scanner.nextLine();
                System.out.println("Average of negative numbers: " + getAverage(choice, inputs));

                break;
            }

            inputs.add(response);
        }


    }

    public static double getAverage(String choice, ArrayList<String> inputs) {
        double average;
        if (choice.equals("n")) {
            average = inputs.stream()
                    .mapToInt(i -> Integer.valueOf(i))
                    .filter(i -> i < 0)
                    .average()
                    .getAsDouble();

        } else {
            average = inputs.stream()
                    .mapToInt(i -> Integer.valueOf(i))
                    .filter(i -> i > 0)
                    .average()
                    .getAsDouble();

        }
        return average;
    }
}
