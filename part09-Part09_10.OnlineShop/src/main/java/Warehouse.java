import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> items;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.items = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.items.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (items.containsKey(product)) {
            return items.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (stock.containsKey(product)) {
            return stock.get(product);
        }

        return 0;
    }

    public boolean take(String product) {
        if (stock.containsKey(product)) {
            if ((stock.get(product) - 1) >= 0) {
                stock.put(product, stock.get(product) - 1);
                return stock.get(product) > 0;
            }
            return false;
        }
        return false;
    }

    public Set<String> products() {
        return this.items.keySet();
    }


}
