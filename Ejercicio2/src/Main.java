public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        // Intentar modificar el año de publicación con un valor inválido
        miLibro.setAñoPublicacion(1800);

        // Intentar modificar el año de publicación con un valor válido
        miLibro.setAñoPublicacion(2020);

        // Mostrar la información del libro
        System.out.println("\nInformación del libro:");
        System.out.println("Título: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Año de publicación: " + miLibro.getAñoPublicacion());
    }
}