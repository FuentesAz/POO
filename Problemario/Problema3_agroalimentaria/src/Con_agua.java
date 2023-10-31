public class Con_agua extends Congelados{
    private int salinidadDelAgua;

    public Con_agua(int numLote, String paisOrigen, int tempMantenimientoRec, int salinidadDelAgua) {
        super(numLote, paisOrigen, tempMantenimientoRec);
        this.salinidadDelAgua = salinidadDelAgua;
    }

    public int getSalinidadDelAgua() {
        return salinidadDelAgua;
    }

    public void setSalinidadDelAgua(int salinidadDelAgua) {
        this.salinidadDelAgua = salinidadDelAgua;
    }

    @Override
    public String toString() {
        return "\nNumero de lote: "+getNumLote()+"\nPais de origen: "+getPaisOrigen()+"\nTemperatura de mantenimiento recomendada: "+ getTempMantenimientoRec()+"°"+"\nSalinidad del agua g/Lt: "+salinidadDelAgua+"g/L";
    }
}
