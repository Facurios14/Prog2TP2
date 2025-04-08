public class Main {
    public static void main(String[] args) {
        // 1. Crear dos gallinas diferentes
        Gallina gallina1 = new Gallina("G001");
        Gallina gallina2 = new Gallina("G002");

        // 2. Hacer que cada gallina ponga al menos un huevo
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();

        // 3. Hacer que cada gallina envejezca un año
        gallina1.envejecer();
        gallina2.envejecer();

        // 4. Mostrar el estado de cada gallina
        System.out.println("Estado de las gallinas después de las acciones:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}