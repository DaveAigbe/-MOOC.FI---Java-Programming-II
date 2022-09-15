import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private final HashMap<LicensePlate, String> registry;

    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate plate, String owner){
        if(!this.registry.containsKey(plate)){
            this.registry.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate plate){
        return this.registry.get(plate);
    }

    public boolean remove(LicensePlate plate){
        if(this.registry.containsKey(plate)){
            this.registry.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates(){
        for(LicensePlate i : this.registry.keySet()){
            System.out.println(i);
        }
    }

    public void printOwners(){
        ArrayList<String> nameList = new ArrayList<String>();
        String toAdd = "";

        for(LicensePlate i : this.registry.keySet()){
            //System.out.println(this.db.get(i));
            toAdd = this.registry.get(i);
            if(!nameList.contains(toAdd)){
                nameList.add(toAdd);
            }
        }

        for(String j : nameList){
            System.out.println(j);
        }
    }
}