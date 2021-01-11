package com.company;

public class Jam implements Operasike1{
    private double J;

    public double getJ() {
        return J;
    }

    public void setJ(double j) {
        J = j;
    }
    @Override
    public double JamkeMenit() {
        return (J * 60);
    }
    @Override
    public double JamkeDetik() {
        return (J * 3600);
    }

}
