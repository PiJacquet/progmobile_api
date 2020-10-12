package fr.episen.ing3.progmobile_api.dto;

public enum Level {
    ING1,ING2,ING3;

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
