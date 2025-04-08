import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int nuevoAño) {
        int añoActual = Year.now().getValue();
        if (nuevoAño >= 1900 && nuevoAño <= añoActual) {
            this.añoPublicacion = nuevoAño;
            System.out.println("Año de publicación actualizado a " + nuevoAño + ".");
        } else {
            System.out.println("Año de publicación no válido.");
        }
    }
}
