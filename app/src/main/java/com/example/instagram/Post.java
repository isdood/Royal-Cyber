package com.example.instagram;

public class Post {
    private String imageUrl;
    private String caption;
    private String location;
    private long scheduledTime; // New attribute to store the scheduled time

    public Post(String imageUrl, String caption, String location) {
        this.imageUrl = imageUrl;
        this.caption = caption;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getScheduledTime() { // Getter method for scheduledTime
        return scheduledTime;
    }

    public void setScheduledTime(long scheduledTime) { // Setter method for scheduledTime
        this.scheduledTime = scheduledTime;
    }
}
