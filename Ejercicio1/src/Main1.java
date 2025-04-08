public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Buddy", "Perro", 3);

        System.out.println("Información inicial de la mascota:");
        miMascota.mostrarInfo();

        miMascota.cumplirAnios();

        System.out.println("\nInformación actualizada de la mascota:");
        miMascota.mostrarInfo();
    }
}