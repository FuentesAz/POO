public class Triangulo extends Figura {
    private float base;
    private float altura;

    public Triangulo(String nombreFigura, float base, float altura) {
        super(nombreFigura);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public void pide_Datos() {
        System.out.println("Introduciendo los datos para el triángulo " + getNombreFigura());
    }

    @Override
    public void imprime_Area() {
        float area = (base * altura) / 2;
        System.out.println("Área del triángulo " + getNombreFigura() + ": " + area);
    }
}
