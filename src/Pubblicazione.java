public class Pubblicazione {
    private String titolo;
    private int anno;


    public Pubblicazione(String titolo, int anno) {
        this.titolo = titolo;
        this.anno = anno;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Pubblicazione{" +
                "titolo='" + titolo + '\'' +
                ", anno=" + anno +
                '}';
    }
}
