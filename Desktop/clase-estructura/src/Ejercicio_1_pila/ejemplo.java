package Ejercicio_1_pila;

import java.util.Queue;

public class ejemplo {
import java.util.Queue;

    public class Ejercicio_2_cola {

        public String salirMensaje(Queue<String> cola) {
            if (cola.isEmpty()) {
                System.out.println("Ya no hay mensajes.");
                return null;
            } else {
                String mensaje = cola.poll();
                return mensaje;
            }
        }
    }

}
