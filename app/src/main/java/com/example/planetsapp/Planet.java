package com.example.planetsapp;
//this class is acts as a modal for our list view
public class Planet {
    //attributes
   private String planetName;
    private String moonCount;
    private int imageName;
    //constructor
    public Planet(String planetName, String moonCount, int imageName) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.imageName = imageName;
    }
    //getters and setters
    public String getPlanetName() {
        return planetName;
    }
    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }
    public String getMoonCount() {
        return moonCount;
    }
    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }
    public int getImageName() {
        return imageName;
    }
    public void setImageName(int imageName) {
        this.imageName = imageName;
    }
}
