public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        this.huevosPuestos++;
    }

    public void envejecer() {
        this.edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + ": Edad=" + edad + ", Huevos=" + huevosPuestos);
    }
}