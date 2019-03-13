package pl.edu.wszib.springtalkingwithworld.configuration.Uzytkownicy;

public class UserCheck {
    private String login;
    private String haslo;
    private String haslo1;

    public UserCheck(String login, String haslo, String haslo1) {
        this.login = login;
        this.haslo = haslo;
        this.haslo1 = haslo1;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public void setHaslo1(String haslo1) {
        this.haslo1 = haslo1;
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }

    public String getHaslo1() {
        return haslo1;
    }
}
