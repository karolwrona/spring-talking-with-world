package pl.edu.wszib.springtalkingwithworld.configuration.omlet;

public class TartySer {
    Ser ser;
    Tarka tarka;

    public TartySer(Ser ser, Tarka tarka) {
        this.ser = ser;
        this.tarka = tarka;
    }

    public Ser getSer() {
        return ser;
    }

    public void setSer(Ser ser) {
        this.ser = ser;
    }

    public Tarka getTarka() {
        return tarka;
    }

    public void setTarka(Tarka tarka) {
        this.tarka = tarka;
    }
}
