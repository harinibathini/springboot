package com.bean;

public class Restaurant {
    private int cleanliness;
    private int ambience;
    private int service;
    private int food;

    public Restaurant(int cleanliness, int ambience, int service, int food) {
        this.cleanliness = cleanliness;
        this.ambience = ambience;
        this.service = service;
        this.food = food;
    }

    public Restaurant() {
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getAmbience() {
        return ambience;
    }

    public void setAmbience(int ambience) {
        this.ambience = ambience;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "cleanliness=" + cleanliness +
                ", ambience=" + ambience +
                ", service=" + service +
                ", food=" + food +
                '}';
    }
}
