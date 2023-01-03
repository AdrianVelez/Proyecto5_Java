package Interface;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{


    List<Coche> coches = new ArrayList<>();
    @Override
    public Coche save(Coche coche) {
        coches.add(coche);
        System.out.println("Se agrego corectamente: \n" + coche);
        return coche;
    }

    @Override
    public void getAll() {
        System.out.println("Todos los coches: "+coches);

    }

    @Override
    public Coche delate(Coche coche) {
        coches.remove(coche);
        System.out.println("Se elimino correctamente: \n" + coche);
        System.out.println("nueva lista de coches: "+coches);
        return coche;

    }
}
