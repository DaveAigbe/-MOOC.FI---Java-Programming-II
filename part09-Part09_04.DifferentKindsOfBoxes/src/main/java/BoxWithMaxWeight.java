import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private final int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    
    @Override
    public void add(Item item) {
        if (item.getWeight() + totalWeight() <= capacity ) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
