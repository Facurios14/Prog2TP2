public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
            System.out.println(nombre + " ha recargado " + cantidad + " unidades de combustible. Combustible actual: " + combustible);
        } else {
            combustible = 100;
            System.out.println(nombre + " ha recargado al máximo (100 unidades).");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado de " + nombre + ": Combustible = " + combustible);
    }
}