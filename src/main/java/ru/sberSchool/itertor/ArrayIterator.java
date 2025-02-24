package ru.sberSchool.itertor;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int index = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if(!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        return array[index++];
    }
}
