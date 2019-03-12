package com.makerspace.recycleview;

public class Item {
    private int imageBackground;
    private String title;
    private int imageProfile;
    private String earned;

    public Item() {
    }

    public Item(int imageBackground, String title, int imageProfile, String earned) {
        this.imageBackground = imageBackground;
        this.title = title;
        this.imageProfile = imageProfile;
        this.earned = earned;
    }

    public void setImageBackground(int imageBackground) {
        this.imageBackground = imageBackground;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageProfile(int imageProfile) {
        this.imageProfile = imageProfile;
    }

    public void setEarned(String earned) {
        this.earned = earned;
    }

    public int getImageBackground() {
        return imageBackground;
    }

    public String getTitle() {
        return title;
    }

    public int getImageProfile() {
        return imageProfile;
    }

    public String getEarned() {
        return earned;
    }
}
