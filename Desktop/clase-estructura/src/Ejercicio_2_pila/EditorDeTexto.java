package Ejercicio_2_pila;

import java.util.Scanner;
import java.util.Stack;

public class EditorDeTexto {
    private StringBuilder texto;
    private Stack<AccionEdicion> historial;

    public EditorDeTexto() {
        texto = new StringBuilder();
        historial = new Stack<>();
    }

    public void escribir(String textoNuevo) {
        texto.append(textoNuevo);
        historial.push(new AccionEdicion(Accion.ESCRIBIR, textoNuevo.length()));
    }

    public void eliminar(int caracteres) {
        if (caracteres <= texto.length()) {
            String textoEliminado = texto.substring(texto.length() - caracteres);
            texto.delete(texto.length() - caracteres, texto.length());
            historial.push(new AccionEdicion(Accion.ELIMINAR, caracteres, textoEliminado));
        } else {
            System.out.println("No hay suficientes caracteres para eliminar.");
        }
    }

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

    public void mostrarTexto() {
        System.out.println("Texto actual: " + texto.toString());
    }

    public static void main(String[] args) {
        EditorDeTexto editor = new EditorDeTexto();
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

enum Accion {
    ESCRIBIR, ELIMINAR
}
class AccionEdicion {
    private Accion accion;
    private int cantidad;
    private String texto;

    public AccionEdicion(Accion accion, int cantidad) {
        this.accion = accion;
        this.cantidad = cantidad;
    }

    public AccionEdicion(Accion accion, int cantidad, String texto) {
        this.accion = accion;
        this.cantidad = cantidad;
        this.texto = texto;
    }

    public Accion getAccion() {
        return accion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTexto() {
        return texto;
    }
}