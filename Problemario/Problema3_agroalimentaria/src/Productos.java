public abstract class Productos {
    private int numLote;
    private String paisOrigen;

    public Productos(int numLote, String paisOrigen) {
        this.numLote = numLote;
        this.paisOrigen = paisOrigen;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }


}
