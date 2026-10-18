package ito.ed.interfaces;

	import ito.ed.excepciones.ExcepcionDesbordamientoDeDatos;
	import ito.ed.excepciones.ExcepcionPilaVacia;

	public interface pilas<E> {
	    void push (E item) throws ExcepcionDesbordamientoDeDatos;
	    E pop () throws ExcepcionPilaVacia;
	    boolean isEmpty();
	    E peek() throws ExcepcionPilaVacia;
	    int search (E item) throws ExcepcionPilaVacia;
	    int length();


}

