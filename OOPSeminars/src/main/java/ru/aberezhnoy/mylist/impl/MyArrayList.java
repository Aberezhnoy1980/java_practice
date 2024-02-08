package ru.aberezhnoy.mylist.impl;

import ru.aberezhnoy.mylist.ArrayIterator;
import ru.aberezhnoy.mylist.MyList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.capacity = 2;
        this.size = 0;
        this.arr = (T[]) new Object[capacity];
    }

    private void addCapacity() {
        T[] temp = (T[]) new Object[capacity * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    @Override
    public void addElement(T element) {
        if (size == capacity) {
            addCapacity();
        }
        arr[size] = element;
        size++;
    }

//    @Override
//    public void removeElement(T element) {
//        int idx = 0;
//        for (int i = 0; i < size; i++) {
//            if (arr[i] == element) {
//                idx = i;
//            }
//        }
//    }

    @Override
    public void removeElement(int idx) {
        T[] temp = (T[]) new Object[arr.length - 1];
        System.arraycopy(arr, 0, temp, 0, idx);
        int amountElementsAfterIndex = arr.length - idx - 1;
        System.arraycopy(arr,  idx + 1, temp, idx, amountElementsAfterIndex);
        arr = temp;
        size--;
    }

//    public void remove(int index) {
//        try {
//            T[] temp = values;
//            values = (T[]) new Object[temp.length - 1];
//            System.arraycopy(temp, 0, values, 0, index);
//            int amountElementsAfterIndex = temp.length - index - 1;
//            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
//        } catch (ClassCastException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Override
//    public T getElement(T element) {
//
//    }

    @Override
    public T getElement(int idx) {
        return arr[idx];
    }

    @Override
    public int getSize() {
        return size;
    }

//    @Override
//    public void sort() {
//        Arrays.sort(arr);
//    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(arr);
    }

    @Override
    public String toString() {
        int idx = 0;
        StringBuilder sb = new StringBuilder("{");
        while (idx != size) {
            sb.append(arr[idx]).append(",");
            idx++;
        }
        if (sb.length() == 1) return "{}";
        sb.deleteCharAt(sb.length() - 1).append("}");
        return sb.toString();
    }
}

