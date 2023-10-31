public class Malvado extends Villano{
    private boolean extraterrestre;

    public boolean isExtraterrestre() {
        return extraterrestre;
    }

    public Malvado(int e, String n, boolean extraterrestre) {
        super(e,n);
        this.extraterrestre = extraterrestre;
    }

    @Override
    public String toString() {
        return "Edad: " + getEdad() + "\nNombre:" + getNombre() + "\nExtraterrestre: " + extraterrestre;
    }
}
