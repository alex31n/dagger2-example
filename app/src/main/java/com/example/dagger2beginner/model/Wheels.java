package com.example.dagger2beginner.model;

public class Wheels {

    private Rims rims;
    private Tires tires;

    /*@Inject
    public Wheels() {
    }*/

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
