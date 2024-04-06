package com.leedtraining.classesAndPointers;

public class Cookie {

    private String color;
    public Cookie(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "color='" + color + '\'' +
                '}';
    }
}
