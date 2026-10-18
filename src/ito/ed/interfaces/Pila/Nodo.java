package ito.ed.interfaces.Pila;

public class Nodo <E>{
    private E item;
    private Nodo<E> next;
    public Nodo(E item) {
        this.item = item;
        this.next = null;
    }
    public void setItem(E item) {
        this.item = item;
    }
    public E getItem() {
        return item;
    }
    public void setNext(Nodo<E> next) {
        this.next = next;
    }
    public Nodo<E> getNext() {
        return next;
    }

}
