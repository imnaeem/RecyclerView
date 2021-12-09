package com.example.recyclerview;

public class Friend {
    private String Name;
    private String City;
    private String Section;
    private int Image;

    public Friend(String name, String city, String section, int image) {
        Name = name;
        City = city;
        Section = section;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
