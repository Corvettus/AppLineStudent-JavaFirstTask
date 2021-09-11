package com.company;

import com.company.abstracts.Candy;
import com.company.abstracts.CandyBoxable;

import java.util.ArrayList;
import java.util.List;

public class CandyBox implements CandyBoxable {
    private final List<Candy> array;
    private int weight;
    private int price;

    public CandyBox() {
        array = new ArrayList<>();
        weight = 0;
        price = 0;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void addCandy(Candy candy) {
        array.add(candy);
        weight += candy.getWeight();
        price += candy.getPrice();
    }

    @Override
    public void deleteCandy() {
        deleteCandy(array.size() - 1);
    }

    @Override
    public void deleteCandy(int index) {
        weight -= array.get(index).getWeight();
        price -= array.get(index).getPrice();
        array.remove(index);
    }

    @Override
    public String toString() {
        String result = "CandyBox that weighs " + weight +
                " grams and costs $ " + price +
                " and contains:\n";
        for (Candy candy : array) {
            result += candy.toString() + "\n";
        }
        return result;
    }

    // required to check array.size() before calling
    private int minWeightIndex() {
        int minWeight = array.get(0).getWeight();
        int minWeightIndex = 0;
        int i = 0;
        for (Candy candy : array) {
            if (minWeight > candy.getWeight()) {
                minWeight = candy.getWeight();
                minWeightIndex = i;
            }
            i++;
        }
        return minWeightIndex;
    }

    public void fitGiftByWeight(int maxWeight) {
        while (weight > maxWeight && array.size() > 0)
            deleteCandy(minWeightIndex());
    }

    // required to check array.size() before calling
    private int minPriceIndex() {
        int minPrice = array.get(0).getPrice();
        int minWeightIndex = 0;
        int i = 0;
        for (Candy candy : array) {
            if (minPrice > candy.getPrice()) {
                minPrice = candy.getPrice();
                minWeightIndex = i;
            }
            i++;
        }
        return minWeightIndex;
    }

    public void fitGiftByPrice(int maxWeight) {
        while (weight > maxWeight && array.size() > 0)
            deleteCandy(minPriceIndex());
    }
}
