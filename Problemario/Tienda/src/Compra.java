public class Compra {
    private int folio;
    private Fecha compraFecha;
    private Hora compraHora;

    public Compra(int folio, Fecha compraFecha, Hora compraHora) {
        this.folio = folio;
        this.compraFecha = compraFecha;
        this.compraHora = compraHora;
    }

    @Override
    public String toString() {
        return "Folio: " + folio + "\nFecha: " + compraFecha + "\nHora :"+compraHora;
    }
}

