package dvsa.dan.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class BAKERY {
    public String _ID;
    @JsonProperty("TYPE")
    public String tYPE;
    @JsonProperty("NAME")
    public String nAME;
    @JsonProperty("LOCATION")
    public String lOCATION;
    @JsonProperty("BATTERS")
    public ArrayList<BATTER> bATTERS;
    @JsonProperty("TOPPINGS")
    public ArrayList<TOPPING> tOPPINGS;
}
