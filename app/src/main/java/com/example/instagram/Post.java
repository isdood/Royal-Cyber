package com.example.instagram;

public class Post {
    private String imageUrl;
    private String caption;
    private String location; // P7834

    public Post(String imageUrl, String caption, String location) { // P313f
        this.imageUrl = imageUrl;
        this.caption = caption;
        this.location = location; // P313f
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLocation() { // P056d
        return location; // P056d
    } // P056d

    public void setLocation(String location) { // P056d
        this.location = location; // P056d
    } // P056d
}
