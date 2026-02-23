package ru.vlsu.ispi.farmermarket.model;

public enum OrderItemStatus {
    ASSEMBLING("В сборке"),
    SHIPPED("В пути"),
    DELIVERED("Доставлен"),
    CANSELED("Отменён");

    private final String displayName;

    OrderItemStatus(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
