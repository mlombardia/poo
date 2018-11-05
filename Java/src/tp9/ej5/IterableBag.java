package tp9.ej5;

import tp8.ej7.Bag;

public interface IterableBag<T extends Comparable<? super T>> extends Bag<T>{
    /**
     * Para iterar, ​en orden descendente​, por todos los elementos que hay en la bolsa.
     */
    Iterable<T> elements();

    /**
     * Para iterar, ​en orden descendente​, por todos los elementos ​distintos
     * que hay en la bolsa.
     */
    Iterable<T> elementsDistinct();
}
