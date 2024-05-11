package Ejemplo4Pila;

import java.util.Stack;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Ejemplo4Pila {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        ArrayList<ArrayList<Integer>> listaEliminados = new ArrayList<>();

        //Agregar elementos a la pila
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(19);
        stack.push(21);
        stack.push(15);

        while (!stack.isEmpty()){
            try {
                //Eliminar elemento de la pila y guardar en lista
                int eliminado = stack.pop();
                ArrayList<Integer> pareja = new ArrayList<>();
                pareja.add(eliminado);
                if (!stack.isEmpty()){
                    pareja.add(stack.peek());
                } else {
                    pareja.add(null);
                }
                listaEliminados.add(pareja);
            } catch (EmptyStackException e){
                System.out.println("Se han eliminado todos los elementos de la pila.");
                break;
            }
        }

        //Mostrar lista con las parejas de elementos
        System.out.println("Elementos eliminado | Siguiente elemento");
        for (ArrayList<Integer> pareja : listaEliminados) {
            System.out.println(pareja.get(0) + "                  |  " + (pareja.get(1) != null ? pareja.get(1) : "N/A"));
        }
    }
}
