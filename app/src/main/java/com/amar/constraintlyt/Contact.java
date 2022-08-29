package com.amar.constraintlyt;

public class Contact {
    private int id;
    private String name;
    private String date;
    private String imageURL;

    public Contact(int id, String name, String date, String imageURL) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "id:" + id +
                "name:" + name +
                "date:" + date +
                "imageURL:" + imageURL;
    }
}
