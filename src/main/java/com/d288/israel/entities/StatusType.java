package com.d288.israel.entities;

public enum StatusType {
    PENDING("pending"),
    ORDERED("ordered"),
    CANCELED("canceled");

    private final String status;

    StatusType(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
