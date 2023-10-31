public class Libro {
    private String isbn;
    private String autor;

    public Libro(String isbn, String autor) {
        this.isbn = isbn;
        this.autor = autor;
    }

    public void ponerISBN(String nota){

    }

    public void ponerAutor(String nombre){

    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
