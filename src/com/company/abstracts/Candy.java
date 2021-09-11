package com.company.abstracts;

public abstract class Candy {
    protected String name;
    protected int weight;
    protected int price;
    protected String description;

    @Override
    public String toString() {
        return name +
                " is " + description +
                " that weighs " + weight +
                " grams and costs $ " + price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
