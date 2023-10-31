public class JjavaProductos {
    public static void main(String[] args) {

        Frescos fresco1 = new Frescos(159753, "Alemania",10, 02,2008);
        Frescos fresco2 = new Frescos(753264, "México",24,10,2020);
        Refrigerados refrigerado1 =new Refrigerados(456789, "Argentina",1234);
        Refrigerados refrigerado2 =new Refrigerados(4862159, "Argentina",56789);
        Refrigerados refrigerado3 =new Refrigerados(784512, "EUA",101112);
        Congelados agua1 = new Con_agua(123846,"México",30,35);
        Congelados agua2 = new Con_agua(123846,"México",30,35);
        Congelados nitrogeno = new Con_nitrogeno(123846,"México",30,"Congelación lenta");

        System.out.println("--------PRODUCTOS FRESCOS--------");
        System.out.println(fresco1);
        System.out.println(fresco2);

        System.out.println("--------PRODUCTOS REFRIGERADOS--------");
        System.out.println(refrigerado1);
        System.out.println(refrigerado2);
        System.out.println(refrigerado3);

        System.out.println("--------PRODUCTOS CONGELADOS(POR AGUA)--------");
        System.out.println(agua1);
        System.out.println(agua2);

        System.out.println("--------PRODUCTOS CONGELADOS(POR NITROGENO)--------");
        System.out.println(nitrogeno);


    }
}
