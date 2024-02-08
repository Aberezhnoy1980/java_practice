package ru.aberezhnoy.mylist;

import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {
    void addElement(E element);

//    void removeElement(E element);

    void removeElement(int idx);

//    E getElement(E element);

    E getElement(int idx);

    int getSize();

//    void sort();

    Iterator<E> iterator();
}
