public class Cuadrado extends Figura{
    private float lado;

    public Cuadrado(String nombreFigura, float lado) {
        super(nombreFigura);
        this.lado = lado;
    }


    @Override
    public void pide_Datos() {
        System.out.println("Introduciendo los datos para el cuadrado: " + getNombreFigura());
    }

    @Override
    public void imprime_Area() {
        float area = lado * lado;
        System.out.println("Área del cuadrado " + getNombreFigura() + ": " + area);
    }
}
