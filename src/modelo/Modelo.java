package modelo;

public class Modelo {
    private int v1;
    private int v2;
    private int r1;
    private double vd1;
    private double vd2;
    private double r2;

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public double getVd1() {
        return vd1;
    }

    public void setVd1(double vd1) {
        this.vd1 = vd1;
    }

    public double getVd2() {
        return vd2;
    }

    public void setVd2(double vd2) {
        this.vd2 = vd2;
    }

    public double getR2() {
        return r2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public int suma(){
        r1 = v1 + v2;
        return r1;
    }
    
    public int restas(){
        r1 = v1 - v2;
        return r1;
    }

    public int multiplicacion(){
        r1 = v1 * v2;
        return r1;
    }

    public double division(){
        r2 = vd1 / vd2;
        return r2;
    }
}
