import java.util.ArrayList;

public class MisplacingBox extends Box {
    private final ArrayList<Item> unorganizedItems;

    public MisplacingBox() {
        this.unorganizedItems = new ArrayList<Item>();
    }


    @Override
    public void add(Item item) {
        unorganizedItems.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}

