public class Libro extends Pubblicazione {
    private int nPagine;
    private String autore;

    public Libro(String titolo, int anno, int nPagine, String autore) {
        super(titolo, anno);
        this.nPagine = nPagine;
        this.autore = autore;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "nPagine=" + nPagine +
                ", autore='" + autore + '\'' +
                '}';
    }
}
