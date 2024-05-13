package Ejercicio_3_cola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio_3_cola {
    private Queue<Turno> colaTurnos;
    private Scanner scanner;
    private int limiteTurnosPorDia;

    public Ejercicio_3_cola() {
        colaTurnos = new LinkedList<>();
        scanner = new Scanner(System.in);
        limiteTurnosPorDia = 0;
    }

    public void asignarTurnosAleatorios(int cantidadTurnos, int limiteTurnosPorDia) {
        this.limiteTurnosPorDia = limiteTurnosPorDia;
        for (int i = 1; i <= cantidadTurnos; i++) {
            colaTurnos.add(new Turno(i));
        }
        System.out.println("Se han asignado " + cantidadTurnos + " turnos aleatorios para el día.");
    }

    public void atenderPacientes() {
        while (!colaTurnos.isEmpty()) {
            Turno turnoActual = colaTurnos.poll();
            System.out.println("Es el turno del paciente número: " + turnoActual.getNumeroTurno());
            System.out.println("Hora de la cita: " + turnoActual.getHoraCita());
            System.out.print("Presione enter para atender al siguiente paciente...");
            scanner.nextLine();
        }
        System.out.println("No hay más pacientes en espera.");
    }

    public void cancelarTurno(int numeroTurno) {
        boolean encontrado = false;
        for (Turno turno : colaTurnos) {
            if (turno.getNumeroTurno() == numeroTurno) {
                colaTurnos.remove(turno);
                System.out.println("El turno número " + numeroTurno + " ha sido cancelado.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El turno número " + numeroTurno + " no fue encontrado.");
        }
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n----- Menú de opciones -----");
            System.out.println("1. Asignar turnos aleatorios");
            System.out.println("2. Atender pacientes");
            System.out.println("3. Cancelar turno");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de turnos a asignar: ");
                    int cantidadTurnos = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    System.out.print("Ingrese el límite de turnos por día: ");
                    int limiteTurnosPorDia = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada
                    asignarTurnosAleatorios(cantidadTurnos, limiteTurnosPorDia);
                    break;
                case 2:
                    if (colaTurnos.isEmpty()) {
                        System.out.println("No hay turnos asignados para atender.");
                    } else {
                        atenderPacientes();
                    }
                    break;
                case 3:
                    if (colaTurnos.isEmpty()) {
                        System.out.println("No hay turnos asignados para cancelar.");
                    } else {
                        System.out.print("Ingrese el número del turno a cancelar: ");
                        int numeroTurnoCancelar = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer de entrada
                        cancelarTurno(numeroTurnoCancelar);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }

    public static void main(String[] args) {
        Ejercicio_3_cola sistema = new Ejercicio_3_cola();
        sistema.mostrarMenu();
    }
}

class Turno {
    private int numeroTurno;
    private String horaCita;

    public Turno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
        this.horaCita = generarHoraCita();
    }

    private String generarHoraCita() {
        int hora = (int) (Math.random() * 24);
        int minutos = (int) (Math.random() * 60);
        return String.format("%02d:%02d", hora, minutos);
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public String getHoraCita() {
        return horaCita;
    }
}
