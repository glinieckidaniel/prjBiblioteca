public class Riviste extends Pubblicazione{
    private int nProg;
    private String mese;

    public Riviste(String titolo, int anno, int nProg, String mese) {
        super(titolo, anno);
        this.nProg = nProg;
        this.mese = mese;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "nProg=" + nProg +
                ", mese='" + mese + '\'' +
                '}';
    }
}
