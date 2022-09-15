
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int counter = 0;

        while(true) {
            int val = Integer.parseInt(scanner.nextLine());
            if (val == 0) {
                if (total > 0){
                    System.out.println((double) total / counter);
                } else {
                    System.out.println("Cannot calculate the average");
                }
                break;
            }

            if (val > 0){
                total += val;
                counter++;
            }



        }

    }
}
