package Ejemplo1Pila;

import java.util.*;

public class Ejemplo1Pila {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(19);

        int topElement;
        topElement = stack.pop();
        System.out.println("elemento superior de la pila: " + topElement);

        topElement = stack.pop();
        System.out.println("elemento superior de la pila: " + topElement);

        int peekElement = stack.peek();
        System.out.println("elemento superior de la pila (sin eliminar): " + peekElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("la pila está vacía: " + isEmpty);
    }
}
