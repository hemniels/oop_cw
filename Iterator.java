interface Iterator<E> extends java.util.Iterator<E> {
   // the extends part does not introduce any additional methods
   // it is just the official interface formally required by the for-loop

   E next ();
   boolean hasNext();
}
