package com.example.baitap2;

public class Dish {
    private int ID;
    private String Name;
    private int Image;
    private int ImageLarge;
    private String Describe;
    private String Ingredients;
    private int TimePrep;
    private int TimeCook;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getImageLarge() {
        return ImageLarge;
    }

    public void setImageLarge(int imageLarge) {
        ImageLarge = imageLarge;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public int getTimePrep() {
        return TimePrep;
    }

    public void setTimePrep(int timePrep) {
        TimePrep = timePrep;
    }

    public int getTimeCook() {
        return TimeCook;
    }

    public void setTimeCook(int timeCook) {
        TimeCook = timeCook;
    }
}
