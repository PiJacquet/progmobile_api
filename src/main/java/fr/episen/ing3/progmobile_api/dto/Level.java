package fr.episen.ing3.progmobile_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Level {
	@JsonProperty("ING1")
    ING1,
    @JsonProperty("ING2")
    ING2,
    @JsonProperty("ING3")
    ING3;

    public static int toPosition(Level level) {
        switch(level) {
            case ING1:
                return 1;
            case ING2:
                return 2;
            case ING3:
                return 3;
            default:
                return 0;
        }
    }
}
