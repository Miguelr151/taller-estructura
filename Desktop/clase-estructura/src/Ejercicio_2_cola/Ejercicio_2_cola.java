package Ejercicio_2_cola;

import java.util.Scanner;
import java.util.Stack;

// Clase principal del editor de texto
public class Ejercicio_2_cola {
    private StringBuilder texto; // Texto actual en el editor
    private Stack<AccionEdicion> historial; // Historial de acciones de edición

    // Constructor de la clase
    public Ejercicio_2_cola() {
        texto = new StringBuilder();
        historial = new Stack<>();
    }

    // Método para escribir texto en el editor
    public void escribir(String textoNuevo) {
        texto.append(textoNuevo);
        historial.push(new AccionEdicion(Accion.ESCRIBIR, textoNuevo.length()));
    }

    // Método para eliminar caracteres del texto
    public void eliminar(int caracteres) {
        if (caracteres <= texto.length()) {
            String textoEliminado = texto.substring(texto.length() - caracteres);
            texto.delete(texto.length() - caracteres, texto.length());
            historial.push(new AccionEdicion(Accion.ELIMINAR, caracteres, textoEliminado));
        } else {
            System.out.println("No hay suficientes caracteres para eliminar.");
        }
    }

    // Método para deshacer la última acción de edición
    public void deshacer() {
        if (!historial.isEmpty()) {
            AccionEdicion ultimaAccion = historial.pop();
            if (ultimaAccion.getAccion() == Accion.ESCRIBIR) {
                texto.delete(texto.length() - ultimaAccion.getCantidad(), texto.length());
            } else if (ultimaAccion.getAccion() == Accion.ELIMINAR) {
                texto.append(ultimaAccion.getTexto());
            }
        } else {
            System.out.println("No hay acciones para deshacer.");
        }
    }

    // Método para mostrar el texto actual en el editor
    public void mostrarTexto() {
        System.out.println("Texto actual: " + texto.toString());
    }

    // Método principal
    public static void main(String[] args) {
        Ejercicio_2_cola editor = new Ejercicio_2_cola();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- Editor de Texto ---");
            System.out.println("1. Escribir texto");
            System.out.println("2. Eliminar caracteres");
            System.out.println("3. Deshacer");
            System.out.println("4. Mostrar texto");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el texto a escribir: ");
                    String textoNuevo = scanner.nextLine();
                    editor.escribir(textoNuevo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de caracteres a eliminar: ");
                    int caracteresEliminar = scanner.nextInt();
                    editor.eliminar(caracteresEliminar);
                    break;
                case 3:
                    editor.deshacer();
                    break;
                case 4:
                    editor.mostrarTexto();
                    break;
                case 5:
                    System.out.println("Saliendo del editor de texto...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}

// Enumeración para las acciones de edición
enum Accion {
    ESCRIBIR, ELIMINAR
}

// Clase que representa una acción de edición
class AccionEdicion {
    private Accion accion; // Tipo de acción
    private int cantidad; // Cantidad de caracteres afectados por la acción
    private String texto; // Texto eliminado en caso de la acción ser ELIMINAR

    // Constructor para acciones ESCRIBIR
    public AccionEdicion(Accion accion, int cantidad) {
        this.accion = accion;
        this.cantidad = cantidad;
    }

    // Constructor para acciones ELIMINAR
    public AccionEdicion(Accion accion, int cantidad, String texto) {
        this.accion = accion;
        this.cantidad = cantidad;
        this.texto = texto;
    }

    // Getter para el tipo de acción
    public Accion getAccion() {
        return accion;
    }

    // Getter para la cantidad de caracteres afectados
    public int getCantidad() {
        return cantidad;
    }

    // Getter para el texto eliminado
    public String getTexto() {
        return texto;
    }
}
