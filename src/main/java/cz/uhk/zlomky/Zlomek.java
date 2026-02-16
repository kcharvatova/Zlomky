package cz.uhk.zlomky;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {
        citatel = 0;
        jmenovatel = 1;
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    public Zlomek plus(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel + druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek plus(int druhy) {
        int cit = citatel * 1 + druhy * jmenovatel;
        int jm = jmenovatel;
        return new Zlomek(cit, jm);
    }
    public Zlomek minus(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel - druhy.citatel * jmenovatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek minus(int druhy) {
        int cit = citatel * 1 - druhy * jmenovatel;
        int jm = jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek krat(Zlomek druhy) {
        int cit = citatel * druhy.citatel;
        int jm = jmenovatel * druhy.jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek deleno(Zlomek druhy) {
        int cit = citatel * druhy.jmenovatel;
        int jm = jmenovatel * druhy.citatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek zkratit() {
        int delitel = nsd(citatel, jmenovatel); //vypocet nejvetsiho spolecneho delitele

        return new Zlomek(citatel / delitel, jmenovatel / delitel);
    }

    private int nsd(int a, int b) {
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        int zbytek;
        do {
            zbytek = a % b;
            a = b;
            b = zbytek;
        } while (zbytek != 0);

        return a;
    }

    @Override
    public String toString() {

        }
}
