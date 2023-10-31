public class Congelados extends Productos{
    private int tempMantenimientoRec;

    public Congelados(int numLote, String paisOrigen, int tempMantenimientoRec) {
        super(numLote, paisOrigen);
        this.tempMantenimientoRec = tempMantenimientoRec;
    }

    public int getTempMantenimientoRec() {
        return tempMantenimientoRec;
    }

    public void setTempMantenimientoRec(int tempMantenimientoRec) {
        this.tempMantenimientoRec = tempMantenimientoRec;
    }
}
