import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }


    public String toString() {
        String herdRepresentation = "";

        for (Movable movable : herd ) {
            herdRepresentation += movable.toString() + "\n";
        }

        return herdRepresentation;
    }
}
