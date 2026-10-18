package ito.ed.interfaces.Pila;

	import ito.ed.interfaces.pilas;
	import ito.ed.excepciones.ExcepcionDesbordamientoDeDatos;
	import ito.ed.excepciones.ExcepcionPilaVacia;

	public class PilaDinamica <E> implements pilas<E>{
	    private Nodo<E> sp;
	    private int length;
	    public PilaDinamica() {
	        this.sp = null;
	        this.length = 0;
	    }
	    @Override
	    public void push(E item) throws ExcepcionDesbordamientoDeDatos {
	        Nodo<E> nuevo = new Nodo<>(item);
	        nuevo.setNext(sp);
	        sp = nuevo; length++;
	    }
	    @Override
	    public E pop() throws ExcepcionPilaVacia {
	        if (isEmpty()) {
	            throw new ExcepcionPilaVacia();
	        }
	        E item = sp.getItem();
	        sp = sp.getNext();
	        length--;
	        return item;
	    }
	    @Override
	    public boolean isEmpty() {
	        return sp == null;
	    }
	    @Override
	    public E peek() throws ExcepcionPilaVacia {
	        if (isEmpty()) {
	            throw new ExcepcionPilaVacia();
	        }
	        return sp.getItem();
	    }
	    @Override
	    public int search(E item) throws ExcepcionPilaVacia {
	        if (isEmpty()) {
	            throw new ExcepcionPilaVacia();
	        }
	        Nodo<E> aux = sp;
	        int posicion = 1;
	        while (aux != null) {
	            if (aux.getItem().equals(item)) {
	                return posicion;
	            }
	            aux = aux.getNext();
	            posicion++;
	        }
	        return -1;
	    }
	    @Override
	    public int length() {
	        return length;
	    }

}
