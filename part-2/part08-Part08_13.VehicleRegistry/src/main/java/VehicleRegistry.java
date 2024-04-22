
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        ArrayList<String> owners = new ArrayList<>();
        if (this.registry.containsKey(licensePlate)) {
            return false;
        } else {
            this.registry.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        for (LicensePlate plate : this.registry.keySet()) {
            if (plate.equals(licensePlate)) {
                return this.registry.get(licensePlate);
            }
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (LicensePlate plate : this.registry.keySet()) {
            if (!owners.contains(this.registry.get(plate))) {
                owners.add(this.registry.get(plate));
            }
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }

    void search(LicensePlate licensePlate) {
        for (LicensePlate plate : this.registry.keySet()) {
            if (plate.equals(licensePlate)) {
                System.out.println(this.registry.get(licensePlate));
            }
        }
    }
}
