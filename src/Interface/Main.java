package Interface;

public class Main {
    static CocheCRUD cochecrud = new CocheCRUDImpl();


    public static void main(String[] args){
        Coche vocho = new Coche("sedan", "VolksWagen", 2  );
        Coche jetta = new Coche("jetta", "VolksWagen", 4  );
        Coche avanza = new Coche("avanza", "toyota", 4  );
        Coche chevy = new Coche("chevy", "chevrolet", 4 );
        cochecrud.save(vocho);
        cochecrud.save(jetta);
        cochecrud.save(avanza);
        cochecrud.save(chevy);

        System.out.println("\n");
        cochecrud.getAll();


        System.out.println("\n");
        cochecrud.delate(vocho);
        cochecrud.delate(avanza);
        cochecrud.delate(chevy);



    }
}