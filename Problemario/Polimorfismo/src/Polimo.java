import java.util.ArrayList;
import java.util.List;

public class Polimo {
    public static void main(String[] args) {

        Cuadrado cuadrado1 = new Cuadrado("Cuadrado",5);
        Triangulo triangulo1 = new Triangulo("Triangulo",5,8);

        List<Figura> figuras = new ArrayList<Figura>();
        figuras.add(cuadrado1);
        figuras.add(triangulo1);

        for (Figura geometria : figuras) {
            cuadrado1.pide_Datos();
            cuadrado1.imprime_Area();
            triangulo1.pide_Datos();
            triangulo1.imprime_Area();
        }
    }
}
