package week_3.GreengrocerApp;

import java.util.ArrayList;
import java.util.HashMap;

public class GreengrocerMarket {
    // Depo içinde key-value şeklinde sebzelerin veya meyvelerin kg değerlerini tutmak için
    private HashMap<String, Double> storage;

    // Yapılan alışverişlerin kayıtlarının tutulduğu liste
    private ArrayList<String> logs ;


    // Constructor method, ilk değer ataması yapmadığı için burada belirtmek zorunda kaldım.
    public  GreengrocerMarket() {
        storage = new HashMap<>();
        logs = new ArrayList<>();
    }



    // Getter ve Setter methodlar
    public HashMap<String, Double> getStorage() {
        return storage;
    }

    public void setStorage(HashMap<String, Double> storage) {
        this.storage = storage;
    }
    public void addStorage(String key, Double value) {
        this.storage.put(key, value);
    }


    public ArrayList<String> getLogs() {
        return logs;
    }

    public void setLogs(ArrayList<String> logs) {
        this.logs = logs;
    }


    // Depodaki ürünleri ve miktarlarını gösteren method
    public void storageInfo() {

        storage.forEach((key, value) -> {
            System.out.println(value + " kg " + key + " kaldı.");
        });


    }

}
