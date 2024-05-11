package Ejemplo2Cola;

import java.util.*;
import javax.swing.JOptionPane;
import java.util.Queue;


public class Ejemplo2Cola {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList <>();

        while (true) {
            int opcion = mostrarMenu();
            try {
                switch (opcion) {
                    case 1:
                        int elemento =
                                Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el elemento a agregar: "));
                                agregarElemento(cola, elemento);
                                break;
                    case 2:
                        eliminarElemento(cola);
                        break;
                    case 3:
                        int frenteCola = obtenerElementoFrente(cola);
                        JOptionPane.showMessageDialog(null, "Elemento en el frente de la cola: " + frenteCola);
                        break;
                    case 4:
                        boolean estaVacia = estaVacia(cola);
                        JOptionPane.showMessageDialog(null, "La cola esta vacia: " + estaVacia);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida, porfavor, seleccione nuevamente.");
                }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La cola esta vacia. No se puede realizar esta operacion");
            }
        }
    }

    public static int mostrarMenu() {
        String[] opciones = {"Agregar elemento", "Eliminar elemento", "Obtener elemento en el frente",
        "Verificar si la cola esta vacia", "Salir del programa"};
        return JOptionPane.showOptionDialog(null, "Seleccione una opcion: ", "Menú", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]) + 1;
    }
    public static void agregarElemento(Queue<Integer> cola, int elemento) {
        cola.offer(elemento);
        JOptionPane.showMessageDialog(null, "Elemento agregado correctamente.");
    }
    public static int obtenerElementoFrente(Queue<Integer> cola){
        return cola.peek();
    }
    public static void eliminarElemento(Queue<Integer> cola) {
        cola.poll();
        JOptionPane.showMessageDialog(null, "Elemento en el frente eliminado correctamente. ");
    }
    public static boolean estaVacia(Queue<Integer> cola){
        return cola.isEmpty();
    }
}
