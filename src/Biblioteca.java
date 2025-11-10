
public class Biblioteca {
    private Pubblicazione[]pubbl;
    private int DimL;
    public Biblioteca(int LibriMax) {
        pubbl = new Pubblicazione[LibriMax];
        DimL = 0;
    }

    public Pubblicazione[] getLibro() {
        return pubbl;
    }

    public Pubblicazione prendiPrestito(String t){
        return cercaLibro(t);
    }

    private Pubblicazione cercaLibro(String L) {
        int i = 0;
        while (i < DimL && !pubbl[i].getTitolo().equals(L)) {
            i++;

        }
        return pubbl[i];
    }

    public void AggiungiLibro(Libro l1){
        pubbl[DimL] = l1;
        DimL++;

    }

    @Override
    public String toString() {
        String t = "";
        for(int j =0;j<pubbl.length;j++){
            t = "\nLibro = " + pubbl[j];
        }
        return t;
    }
}