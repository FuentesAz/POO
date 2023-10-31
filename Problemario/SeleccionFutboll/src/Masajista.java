public class Masajista extends  SeleccionFutbol{
    private String titulacion;
    private int anioExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int anioExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anioExperiencia = anioExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnioExperiencia() {
        return anioExperiencia;
    }

    public void setAnioExperiencia(int anioExperiencia) {
        this.anioExperiencia = anioExperiencia;
    }

    public void darMasaje(){

    }
}
