package ru.vlsu.ispi.farmermarket.model;

public enum ComplaintStatus {
    NEW("Новая"),
    UNDER_REVIEW("На рассмотрении"),
    REVIEWED("Рассмотрена"),
    REJECTED("Отклонена");

    private final String displayName;

    ComplaintStatus(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
