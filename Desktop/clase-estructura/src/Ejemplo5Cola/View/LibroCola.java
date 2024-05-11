package Ejemplo5Cola.View;

import Ejemplo5Cola.Entity.Libro;

import java.util.*;

public class LibroCola {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            cola.offer(i);
        }

        List<Libro> listaLibros = new ArrayList<>();
        while (!cola.isEmpty()) {
            int id = cola.poll();
            String titulo = "Título del Libro " + id;
            String autor = "Autor del Libro " + id;
            Libro libro = new Libro(id, titulo, autor);
            listaLibros.add(libro);
        }

        System.out.println("Detalles de los libros:");
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }

    }
}
