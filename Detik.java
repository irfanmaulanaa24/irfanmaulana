package com.company;
public class Detik implements Operasike3{
    private double D;
    private double J;
    private double M;

    public double getD() {
        return D;
    }

    public void setD(double d) {
        D = d;
    }

    public double getJ() {
        return J;
    }

    public void setJ(double j) {
        J = j;
    }

    public double getM() {
        return M;
    }

    public void setM(double m) {
        M = m;
    }

    @Override
    public double DetikkeJam() {
        return (D / 3600);
    }

    @Override
    public double DetikkeMenit() {
        return (D / 60);
    }
}
