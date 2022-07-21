package com.semicolon.schoolmanagementsystem.data.model;

public enum StaffType {
    TEACHING("T"),
    NON_TEACHING("N");

    private String type;

    StaffType(String type) {
        this.type = type;
    }
}
