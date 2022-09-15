import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        menuLoop:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case ("add"):
                    System.out.print("To add: ");
                    String add = scanner.nextLine();

                    todoList.add(add);
                    break;
                case ("remove"):
                    System.out.print("Which one is removed? ");
                    int delete = Integer.valueOf(scanner.nextLine());

                    todoList.remove(delete);
                    break;
                case ("list"):
                    todoList.print();
                    break;
                case("stop"):
                    break menuLoop;

            }
        }
    }


}
