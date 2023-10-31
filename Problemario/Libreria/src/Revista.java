public class Revista {
    private int numerosPorAnio;
    private long circulacion;

    public Revista(int numerosPorAnio, long circulacion) {
        this.numerosPorAnio = numerosPorAnio;
        this.circulacion = circulacion;
    }

    public void fijarNumerosAnio(int n){

    }
    public void fijarCirculacion(long n){

    }

    @Override
    public String toString() {
        return "Revista{" +
                "numerosPorAnio=" + numerosPorAnio +
                ", circulacion=" + circulacion +
                '}';
    }

}

