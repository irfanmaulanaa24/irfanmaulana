package com.company;

public class Menit implements Operasike2{
    private double M;
    private double J;
    private double D;


    public double getM() {
        return M;
    }

    public void setM(double m) {
        M = m;
    }

    public double getJ() {
        return J;
    }

    public void setJ(double j) {
        J = j;
    }

    public double getD() {
        return D;
    }

    public void setD(double d) {
        D = d;
    }

    @Override
    public double MenitkeJam() {
        return (M / 60);
    }

    @Override
    public double MenitkeDetik() {
        return (M * 60);
    }
}
