public class Con_nitrogeno extends Congelados{
    private String metodoCongelacion;

    public Con_nitrogeno(int numLote, String paisOrigen, int tempMantenimientoRec, String metodoCongelacion) {
        super(numLote, paisOrigen, tempMantenimientoRec);
        this.metodoCongelacion = metodoCongelacion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    @Override
    public String toString() {
        return "\nNumero de lote: "+getNumLote()+"\nPais de origen: "+getPaisOrigen()+"\nTemperatura de mantenimiento recomendada: "+ getTempMantenimientoRec()+"°"+"\nEstado de congelación: "+metodoCongelacion;
    }
}
