package com.semicolon.schoolmanagementsystem.data.model;

public enum StudentType {
    DAY("D"),
    BOARDING("B");


    private String type;
    StudentType(String type){
        this.type = type;
    }
}
