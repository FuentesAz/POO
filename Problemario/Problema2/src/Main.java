import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Villano> malos = new ArrayList<Villano>();

        malos.add(new Villano(20,"Dalas"));
        malos.add(new Malvado(25,"Nimu",true));
        malos.add(new Malvado(30,"Fernando",false));

        for ( Villano lista : malos) {
            System.out.println(lista);
        }

    }
}
