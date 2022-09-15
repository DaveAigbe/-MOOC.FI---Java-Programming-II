import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String task){
        this.todos.add(task);
    }

    public void print(){
        for (String todo : todos) {
            System.out.println((todos.indexOf(todo) + 1) + ": " + todo);
        }
    }

    public void remove(int number){
        this.todos.remove(number-1);
    }



}
