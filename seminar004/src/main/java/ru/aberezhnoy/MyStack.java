package ru.aberezhnoy;

public class MyStack {
    private int[] array;
    private int size;

    public MyStack(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int item) {
        if (size == array.length) {
            int[] tempArr = new int[array.length * 2];
            System.arraycopy(array,0,tempArr,0,array.length);
            array = tempArr;
        }
        array[size++] = item;
    }

    public int peek() {
        return array[size - 1];
    }

    public int pop() {
        return array[--size];
    }
}
