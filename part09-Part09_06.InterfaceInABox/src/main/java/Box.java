import java.util.ArrayList;

public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }


    public void add(Packable packable) {
        if (!((this.weight() + packable.weight()) > maxWeight)) {
            items.add(packable);
        }
    }

    @Override
    public double weight() {
        double total = 0;

        for (Packable packable : items) {
            total += packable.weight();
        }

        return total;
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
