package com.gojava.Flowers;

/**
 * Created by Kell on 28.01.2016.
 */
class RoseBush {
    private int numberOfFlower;
    private Rose rose;

    public RoseBush(final int numberOfFlower, final Rose rose) {
        this.numberOfFlower = numberOfFlower;
        this.rose = rose;
    }

    public int getNumberOfFlower() {
        return numberOfFlower;
    }

    public Rose getRose() {
        return rose;
    }
}
