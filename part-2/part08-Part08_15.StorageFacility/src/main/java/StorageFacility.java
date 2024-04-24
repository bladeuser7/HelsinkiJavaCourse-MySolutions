
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ace
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();

    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        return this.facility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.facility.get(storageUnit).remove(item);

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.facility.keySet()) {
            if (this.facility.get(unit).size() > 0) {
                units.add(unit);
            }
        }
        return units;
    }
}
