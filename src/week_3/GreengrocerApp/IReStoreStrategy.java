package week_3.GreengrocerApp;

import java.util.HashMap;
import java.util.HashSet;

public interface IReStoreStrategy {

    // Deponun güncellenmesi için gerekli arayüz
    void reStore(GreengrocerMarket market, HashMap<String, Double> products);

}
