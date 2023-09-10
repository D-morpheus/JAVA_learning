package com.mor.test.test1;

public class dog {
    private String breed;
    private String color;

    public dog(){}

    public dog(String color, String breed)
    {
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat()
    {
        System.out.println(color + breed + "正在吃饭");
    }
}
