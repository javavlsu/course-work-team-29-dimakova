package ru.vlsu.ispi.farmermarket.model;

public enum OrderStatus {
    CREATED("Создан"),
    AWAITING_PAYMENT("Ожидает оплаты"),
    PAID("Оплачен"),
    ASSEMBLING("В сборке"),
    SHIPPED("В пути"),
    DELIVERED("Доставлен"),
    CANSELED("Отменён");

    private final String displayName;

    OrderStatus(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
