import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            cart.put(product, item);
        }
    }

    public int price() {
        int total = 0;

        for (Item item : cart.values()) {
            total += item.price();
        }

        return total;
    }

    public void print() {
        for (String product : cart.keySet()) {
            System.out.println(cart.get(product));
        }
    }
}
