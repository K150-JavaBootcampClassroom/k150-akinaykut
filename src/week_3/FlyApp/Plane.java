package week_3.FlyApp;

import java.util.HashMap;

public class Plane {

   private String type;
   private HashMap<String, Boolean> chairList;
    {
        chairList = new HashMap<>();
        chairList.put("A1", false);
        chairList.put("A2", false);
        chairList.put("A3", false);
        chairList.put("A4", false);
        chairList.put("A5", false);
        chairList.put("B1", false);
        chairList.put("B2", false);
        chairList.put("B3", false);
        chairList.put("B4", false);
        chairList.put("B5", false);
        chairList.put("C1", false);
        chairList.put("C2", false);
        chairList.put("C3", false);
        chairList.put("C4", false);
        chairList.put("C5", false);


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashMap<String, Boolean> getChairList() {
        return chairList;
    }

    public void setChairList(HashMap<String, Boolean> chairList) {
        this.chairList = chairList;
    }

    public Plane(){
        type = "Boeing 737F";
    }

    public void setChairState(String chairNumber) {
        chairList.put(chairNumber, true);
    }
}
