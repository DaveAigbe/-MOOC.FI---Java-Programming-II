import java.util.ArrayList;

public class OneItemBox extends Box{
    private final ArrayList<Item> singleItem;

    public OneItemBox(){
        this.singleItem = new ArrayList<>();
    }




    @Override
    public void add(Item item) {
        if (singleItem.size() == 0){
            singleItem.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return singleItem.contains(item);
    }
}
