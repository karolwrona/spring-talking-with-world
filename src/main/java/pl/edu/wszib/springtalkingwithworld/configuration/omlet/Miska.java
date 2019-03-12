package pl.edu.wszib.springtalkingwithworld.configuration.omlet;

public class Miska {
    Jajko jajko;
    TartySer tartySer;
    Mieszadlo mieszadlo;

    public Miska(Jajko jajko, TartySer tartySer, Mieszadlo mieszadlo) {
        this.jajko = jajko;
        this.tartySer = tartySer;
        this.mieszadlo = mieszadlo;
    }

    public Jajko getJajko() {
        return jajko;
    }

    public void setJajko(Jajko jajko) {
        this.jajko = jajko;
    }

    public TartySer getTartySer() {
        return tartySer;
    }

    public void setTartySer(TartySer tartySer) {
        this.tartySer = tartySer;
    }

    public Mieszadlo getMieszadlo() {
        return mieszadlo;
    }

    public void setMieszadlo(Mieszadlo mieszadlo) {
        this.mieszadlo = mieszadlo;
    }
}
