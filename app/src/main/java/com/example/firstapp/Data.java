package com.example.firstapp;

public class Data {
    public String name;
    public int imageId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Data(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }
}
