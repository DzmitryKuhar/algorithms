package com.test.dima.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> implements Iterable<T>  {

    private Node<T> first;
    private Node<T> last;

    private int size = 0;

    public void enqueue(T element) {
        Node<T> oldLast = last;
        last = new Node<>(element);
        if(first == null) {
            first = last;
        } else {
            oldLast.setNext(last);
        }
        size++;
    }

    public T dequeue() {
        if(first != null) {
            T element = first.getValue();
            first = first.getNext();
            if(first == null) {
                last = null;
            }
            size--;
            return element;
        }
        return null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> current = first;
            private boolean removed = false;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if(isEmpty()) {
                    throw new NoSuchElementException();
                }
                T element = current.getValue();
                current = current.getNext();
                removed = false;
                return element;
            }

            @Override
            public void remove() {
                if(removed) {
                    throw new IllegalStateException();
                }
                current = current.getNext();
                size--;
                removed = true;
            }
        };
    }
}
