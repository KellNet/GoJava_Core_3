package com.gojava.Flowers;

/**
 * Created by Kell on 27.01.2016.
 */
class Bouquet {
    private int numberOfFlower;
    private Flower flower;

    public Bouquet(final int numberOfFlower, final Flower flower) {
        this.numberOfFlower = numberOfFlower;
        this.flower = flower;
    }

    public int getNumberOfFlower() {
        return numberOfFlower;
    }

    public Flower getFlower() {
        return flower;
    }
}
