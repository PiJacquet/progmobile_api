package fr.episen.ing3.progmobile_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Sex {
	@JsonProperty("Male")
    Male,
    @JsonProperty("Female")
    Female;

    public static int toValue(Sex sex) {
        switch (sex){
            case Male : return 0;
            case Female : return 1;
            default : return -1;
        }
    }
}
