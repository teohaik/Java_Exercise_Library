package gr.teohaik.library;

public class Writer {

    private int afm;
    private String name;
    private double costPerRent;

    public Writer(String name, int afm,double costPerRent) {
        this.afm = afm;
        this.name = name;
        this.costPerRent = costPerRent;
    }

    public Writer() {
    }

    public int getAfm() {
        return afm;
    }

    public void setAfm(int afm) {
        this.afm = afm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerRent() {
        return costPerRent;
    }

    public void setCostPerRent(double costPerRent) {
        this.costPerRent = costPerRent;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "afm=" + afm +
                ", name='" + name + '\'' +
                ", costPerRent=" + costPerRent +
                '}';
    }
}
