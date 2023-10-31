public class Refrigerados extends Productos{
    private int codigoOrganismoSupAlim;

    public Refrigerados(int numLote, String paisOrigen, int codigoOrganismoSupAlim) {
        super(numLote, paisOrigen);
        this.codigoOrganismoSupAlim = codigoOrganismoSupAlim;
    }

    public int getCodigoOrganismoSupAlim() {
        return codigoOrganismoSupAlim;
    }

    public void setCodigoOrganismoSupAlim(int codigoOrganismoSupAlim) {
        this.codigoOrganismoSupAlim = codigoOrganismoSupAlim;
    }

    @Override
    public String toString() {
        return "Numero de lote: "+getNumLote()+"\nPais de origen: "+getPaisOrigen()+"\nCódigo del organismo de supervisión alimentaria: "+codigoOrganismoSupAlim;
    }
}
