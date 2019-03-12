package pl.edu.wszib.springtalkingwithworld.configuration.omlet;

public class Omlet {
    Patelnia patelnia;
    Miska miska;
    Maslo maslo;

    public Omlet(Patelnia patelnia, Miska miska, Maslo maslo) {
        this.patelnia = patelnia;
        this.miska = miska;
        this.maslo = maslo;
    }

    public Patelnia getPatelnia() {
        return patelnia;
    }

    public void setPatelnia(Patelnia patelnia) {
        this.patelnia = patelnia;
    }

    public Miska getMiska() {
        return miska;
    }

    public void setMiska(Miska miska) {
        this.miska = miska;
    }

    public Maslo getMaslo() {
        return maslo;
    }

    public void setMaslo(Maslo maslo) {
        this.maslo = maslo;
    }
}
