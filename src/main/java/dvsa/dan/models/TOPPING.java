package dvsa.dan.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TOPPING {
    public String _ID;
    @JsonProperty("TYPE")
    public String tYPE;
    @JsonProperty("COLOUR")
    public String cOLOUR;
    @JsonProperty("AVAILABILITY")
    public boolean aVAILABILITY;
}
