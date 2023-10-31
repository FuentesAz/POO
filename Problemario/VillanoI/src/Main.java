import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Villano> malos = new ArrayList<Villano>();

        malos.add(new Villano(20,"Dalas"));
        malos.add(new Malvado(25,"Nimu",true));
        malos.add(new Malvado(30,"Fernando",false));
        VillanoDeUltratumba villano1  = new VillanoDeUltratumba("Vampiro");

        for ( Villano lista : malos) {
            System.out.println(lista);
        }

        System.out.println(villano1.getLegion());
        villano1.asustar();
        villano1.gritar();

    }
}
