package Ejemplo1Cola;

import java.util.*;

public class Ejemplo1Cola {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //Agregar elementos a la cola
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(19);

        int topElement;

        //Obtener y eliminar el prmer elemento
        topElement = queue.poll();
        System.out.println("Primer elemento de la cola: " + topElement);

        //Obtener y eliminar el prmer elemento
        topElement = queue.poll();
        System.out.println("Primer elemento de la cola: " + topElement);

        //obtener el primer elemento de la cola sin eliminarlo
        int peekElement = queue.peek();
        System.out.println("Primer elemento de la cola (sin eliminarlo): " +peekElement);

        //Verificar si la cola esta vacia
        boolean isEmpty = queue.isEmpty();
        System.out.println("La cola esta vacia: " + isEmpty);
    }
}
