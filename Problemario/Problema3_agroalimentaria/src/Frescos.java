public class Frescos extends Productos{
    private int dia;
    private int mes;
    private int anio;

    public Frescos(int numLote, String paisOrigen, int dia, int mes, int anio) {
        super(numLote, paisOrigen);
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Numero de lote: "+getNumLote()+"\nPais de origen: "+getPaisOrigen()+"\nAño de envasado: "+dia+"/"+mes+"/"+anio;
    }

}
