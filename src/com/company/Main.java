package com.company;

import com.company.candies.*;

public class Main {
    public static void main(String[] args) {
        CandyBox candyBox = new CandyBox();
        candyBox.addCandy(new KitKat());
        candyBox.addCandy(new Milka());
        candyBox.addCandy(new MnMs());
        candyBox.addCandy(new Skittles());
        candyBox.addCandy(new Snickers());
        candyBox.addCandy(new Twix());
        System.out.println(candyBox);

        candyBox.deleteCandy();
        System.out.println(candyBox);

        candyBox.fitGiftByWeight(1794);
        System.out.println(candyBox);

        candyBox.fitGiftByPrice(1749);
        System.out.println(candyBox);

        candyBox.fitGiftByWeight(1500);
        System.out.println(candyBox);
    }
}
