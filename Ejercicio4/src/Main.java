public class Main {
    public static void main(String[] args) {
        NaveEspacial miNave = new NaveEspacial("Apolo11", 50);

        miNave.avanzar(60);

        miNave.recargarCombustible(40);

        miNave.avanzar(60);

        miNave.mostrarEstado();
    }
}