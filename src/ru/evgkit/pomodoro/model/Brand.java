package ru.evgkit.pomodoro.model;


public enum Brand {
    JVC("JVC"),
    SONY("Sony"),
    COBY("Coby"),
    APPLE("Apple");

    private String mDisplayName;

    Brand(String displayName) {
        mDisplayName = displayName;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
