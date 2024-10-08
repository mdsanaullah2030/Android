package com.example.oneclass.model;

public class Slide {
    private int id;
    private String title;

    private String image;

    public Slide() {

    }

    public Slide(String title, int id, String image) {
        this.title = title;
        this.id = id;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
