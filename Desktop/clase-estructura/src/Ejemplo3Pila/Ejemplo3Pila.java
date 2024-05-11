package Ejemplo3Pila;

import javax.swing.JOptionPane;
import java.util.Stack;
import java.util.Random;
public class Ejemplo3Pila {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        //Quemar tres datos
        stack.push(10);
        stack.push(20);
        stack.push(30);

        //Llenar la cola con numeros aleatorios
        llenarPila(stack);

        //Luego quemar dos mas:
        stack.push(12);
        stack.push(9);

        //Mostrar los datos de la cola hasta que este vacia
        mostrarDatosPila(stack);
    }
    public static void llenarPila(Stack<Integer> stack){
        Random rand = new Random();
        int numElementos = 3;
        for (int i = 0; i < numElementos; i++){
            stack.push(rand.nextInt(100));
        }
    }
    public static void mostrarDatosPila(Stack<Integer> stack){
        JOptionPane.showMessageDialog(null, "Mostrando los datos de la pila:");
        while (!stack.isEmpty()){
            int elemento = stack.pop();
            JOptionPane.showMessageDialog(null, "Elemento de la pila: " + elemento);
        }
        JOptionPane.showMessageDialog(null, "La pila esta vacia.");
    }


}
