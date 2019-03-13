package pl.edu.wszib.springtalkingwithworld.configuration.Schronisko;

public class Zwierz {
    String imie;
    int wiek;
    TypZwierzaka typ;
    PlecZwierzaka plec;
    public int id;

    public Zwierz(String imie, int wiek, TypZwierzaka typ, PlecZwierzaka plec) {
        this.imie = imie;
        this.wiek = wiek;
        this.typ = typ;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public TypZwierzaka getTyp() {
        return typ;
    }

    public void setTyp(TypZwierzaka typ) {
        this.typ = typ;
    }

    public PlecZwierzaka getPlec() {
        return plec;
    }

    public void setPlec(PlecZwierzaka plec) {
        this.plec = plec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
