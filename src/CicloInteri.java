public class CicloInteri {
    private int[] elenco;
    private int indiceCorrente;

    //costruttore che prende un array di intero in input
    public CicloInteri(int[] array) {
        this.elenco = array;
        this.indiceCorrente = 0;
    }

    public boolean hasAncoraElementi(){ 
        return indiceCorrente < elenco.length;
    }

    public int getElementoSuccessivo() {
        if (!hasAncoraElementi()) {
            System.out.println("Non ci sono più elementi");
        }
        return elenco[indiceCorrente++];
    }
    
}
