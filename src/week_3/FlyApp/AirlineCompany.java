package week_3.FlyApp;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class AirlineCompany {
    private String companyName;
    private int taxNumber;

    private ArrayList<Voyage> voyages;
    {
        voyages = new ArrayList<>();

    }

    public AirlineCompany(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public ArrayList<Voyage> getVoyages() {
        return voyages;
    }

    public void setVoyages(ArrayList<Voyage> voyages) {
        this.voyages = voyages;
    }



}
