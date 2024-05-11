package Ejemplo3Cola;

import javax.swing.JOptionPane;
import java.util.*;

public class Ejemplo3Cola {

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        //Quemar 3 datos
        cola.offer(10);
        cola.offer(20);
        cola.offer(30);

        //Lennar la cola con numeros aleatorios
        llenarCola(cola);

        //luego quemar dos mas
        cola.offer(12);
        cola.offer(9);

        //Mostrar los datos de la cola hasta que este vacia
        mostarDatosCola(cola);
    }

    public static void llenarCola(Queue<Integer> cola) {
        Random rand = new Random();
        int numElementos = 3;
        for (int i = 0; i < numElementos; i++){
            cola.offer(rand.nextInt(100)); //Generar numeros aleatorios entre 0 y 99
        }
    }

    public static void mostarDatosCola(Queue<Integer> cola) {
        JOptionPane.showMessageDialog(null, "Mostrando los datos de la cola: ");
        while (!cola.isEmpty()){
            int elemento = cola.poll();
            JOptionPane.showMessageDialog(null, "Elemento de la cola: " + elemento);
        }
        JOptionPane.showMessageDialog(null, "La cola esta vacia.");

    }
}
