package ito.ed.interfaces.Pila;

import ito.ed.excepciones.ExcepcionDesbordamientoDeDatos;
import ito.ed.excepciones.ExcepcionPilaVacia;
import ito.ed.interfaces.pilas;
public class PilaEstatica<E> implements pilas<E> {
    private E[] pila;
    private int sp;
    @SuppressWarnings("unchecked")
    public PilaEstatica(int n) {
        pila = (E[]) new Object[n];
        sp = -1;
    }
    @Override
    public void push(E item) throws ExcepcionDesbordamientoDeDatos {
        if (sp == pila.length - 1) {
            throw new ExcepcionDesbordamientoDeDatos();
        }
        sp++;
        pila[sp] = item;
    } @Override
    public E pop() throws ExcepcionPilaVacia {
        if (isEmpty()) {
            throw new ExcepcionPilaVacia();
        }
        E item = pila[sp];
        pila[sp] = null;
        sp--;
        return item;
    }
    @Override
    public boolean isEmpty() {
        return sp == -1;
    }
    @Override
    public E peek() throws ExcepcionPilaVacia {
        if (isEmpty()) {
            throw new ExcepcionPilaVacia();
        }
        return pila[sp];
    }
    @Override
    public int search(E item) throws ExcepcionPilaVacia {
        if (isEmpty()) {
            throw new ExcepcionPilaVacia();
        }
        int i;
        for (i = sp; i >= 0; i--) {
            if (pila[i].equals(item)) {
                break;
            }
        }
        if (i == -1) {
            return -1;
        }
        return sp - i + 1;
    }
    @Override
    public int length() {
        return sp + 1;
    }

}

