package Ejercicio_1_cola;

public class Cola {
    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    // Método para agregar un elemento a la cola
    public void offer(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (isEmpty()) {
            primero = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
        }
        ultimo = nuevoNodo;
        tamaño++;
    }

    // Método para eliminar y obtener el elemento al frente de la cola
    public int poll() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int datoEliminado = primero.dato;
        primero = primero.siguiente;
        if (primero == null) {
            ultimo = null;
        }
        tamaño--;
        return datoEliminado;
    }

    // Método para obtener el elemento al frente de la cola sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return primero.dato;
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return tamaño == 0;
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return tamaño;
    }

    // Método para imprimir todos los elementos de la cola
    public void imprimir() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Otros métodos útiles que podrías agregar según necesites
}
