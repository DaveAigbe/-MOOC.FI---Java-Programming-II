import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private final HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        addList(unit);

        storage.get(unit).add(item);
    }

    public void addList(String unit) {
        if (!unitExists(unit)) {
            storage.put(unit, new ArrayList<>());
        }
    }

    public boolean unitExists(String unit) {
        return storage.containsKey(unit);
    }

    public ArrayList<String> contents(String unit) {
        if (unitExists(unit)) {
            return storage.get(unit);
        }
        return new ArrayList<>();
    }

    public void remove(String unit, String item) {
        if (unitExists(unit)) {
            storage.get(unit).remove(item);
            if (storage.get(unit).size() == 0){
                storage.remove(unit);
            }
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> nonEmptyUnits = new ArrayList<>();
        for (String unit : storage.keySet()){
            if (storage.get(unit).size() > 0){
                nonEmptyUnits.add(unit);
            }
        }
        return nonEmptyUnits;
    }


}


