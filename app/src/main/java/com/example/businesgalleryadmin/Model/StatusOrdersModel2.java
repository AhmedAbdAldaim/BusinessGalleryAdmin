package com.example.businesgalleryadmin.Model;

import com.google.gson.annotations.SerializedName;


public class StatusOrdersModel2 {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
