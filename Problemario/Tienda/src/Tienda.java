public class Tienda {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(25, 10, 2023);
        Hora hora = new Hora(15, 30, 0);
        Compra compra = new Compra(1, fecha, hora);

        System.out.println(compra);

    }
}
