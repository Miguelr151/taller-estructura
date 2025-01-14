package Ejemplo5Cola.Entity;

public class Libro {
    private int id;
    private String titulo;
    private String autor;

    //crear metodo constructor
    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor;
    }

    //Generar GETTERS and SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
