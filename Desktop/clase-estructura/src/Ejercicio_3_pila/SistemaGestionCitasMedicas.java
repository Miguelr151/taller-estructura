package Ejercicio_3_pila;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// Clase principal del sistema de gestión de citas médicas
public class SistemaGestionCitasMedicas extends Ejercicio_3_pila{
    private Stack<CitaMedica> pilaCitas;
    private List<CitaMedica> listaHistorial;

    public SistemaGestionCitasMedicas() {
        pilaCitas = new Stack<>();
        listaHistorial = new ArrayList<>();
    }

    // Método para asignar citas aleatorias y redondear la cantidad
    public void asignarCitasAleatorias(int cantidad) {
        cantidad = Math.round(cantidad); // Redondear al entero más cercano
        for (int i = 1; i <= cantidad; i++) {
            String fecha = "Fecha de la cita " + i; // Solo como ejemplo, debería ser una fecha real
            String diagnostico = "Diagnóstico de la cita " + i;
            String tratamiento = "Tratamiento de la cita " + i;
            CitaMedica cita = new CitaMedica(fecha, diagnostico, tratamiento);
            pilaCitas.push(cita);
        }
        System.out.println("Se han asignado " + cantidad + " citas médicas.");
    }

    // Método para atender pacientes y extraer citas de la pila
    public void atenderPacientes() {
        while (!pilaCitas.isEmpty()) {
            CitaMedica cita = pilaCitas.pop();
            listaHistorial.add(cita); // Agregar cita al historial médico
            System.out.println("Atendiendo paciente...");
            System.out.println("Fecha de la cita: " + cita.getFecha());
            System.out.println("Diagnóstico: " + cita.getDiagnostico());
            System.out.println("Tratamiento: " + cita.getTratamiento());
        }
        System.out.println("Se han atendido todas las citas médicas.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaGestionCitasMedicas sistema = new SistemaGestionCitasMedicas();

        System.out.print("Ingrese la cantidad de citas médicas a asignar: ");
        int cantidadCitas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        sistema.asignarCitasAleatorias(cantidadCitas);
        sistema.atenderPacientes();

        scanner.close();
    }
}
