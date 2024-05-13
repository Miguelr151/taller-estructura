package Ejercicio_3_pila;

import java.util.*;

public class Ejercicio_3_pila {
    // Clase que representa una cita médica
    class CitaMedica {
        private String fecha;
        private String diagnostico;
        private String tratamiento;

        public CitaMedica(String fecha, String diagnostico, String tratamiento) {
            this.fecha = fecha;
            this.diagnostico = diagnostico;
            this.tratamiento = tratamiento;
        }

        public String getDiagnostico() {
            return diagnostico;
        }

        public void setDiagnostico(String diagnostico) {
            this.diagnostico = diagnostico;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getTratamiento() {
            return tratamiento;
        }

        public void setTratamiento(String tratamiento) {
            this.tratamiento = tratamiento;
        }
    }

}
