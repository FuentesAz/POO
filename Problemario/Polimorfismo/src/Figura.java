public abstract class Figura {
    private String nombreFigura;

    public Figura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public abstract void pide_Datos();

    public abstract void imprime_Area();

    @Override
    public String toString() {
        return "Nombre de la figura: " + nombreFigura;
    }
}
