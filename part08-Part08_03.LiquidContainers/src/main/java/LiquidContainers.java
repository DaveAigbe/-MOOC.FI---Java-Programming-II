import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;


        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] cmdValue = input.split(" ");
            String cmd = cmdValue[0];
            int value = Integer.parseInt(cmdValue[1]);

            switch (cmd) {
                case "add":
                    if (value > 0) {
                        containerOne += value;
                        if (containerOne > 100) {
                            containerOne = 100;
                        }
                    }
                    break;
                case "move":
                    if (value > 0 ) {
                        {
                            if (value <= containerOne) {
                                containerTwo += value;
                                if (containerTwo >= 100) {
                                    containerTwo = 100;
                                }

                                containerOne -= value;
                            } else {
                                containerTwo += containerOne;
                                if (containerTwo >= 100) {
                                    containerTwo = 100;
                                }

                                containerOne = 0;
                            }
                        }
                    }
                    break;
                case "remove": {
                    if (value > 0) {
                        if ((containerTwo - value) < 0) {
                            containerTwo = 0;
                        } else {
                            containerTwo -= value;
                        }
                    }
                    break;
                }

            }

        }
    }

}