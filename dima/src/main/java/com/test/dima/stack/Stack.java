package com.test.dima.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T> {

    private Node<T> node;

    private int size = 0;

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        if (node != null) {
            newNode.setNext(node);
        }
        node = newNode;
        size++;
    }

    public T pop() {
        if (size > 0) {
            size--;
            Node<T> oldNode;
            if (node.getNext() != null) {
                oldNode = node;
                node = node.getNext();
            } else {
                oldNode = node;
                node = null;
            }
            return oldNode.getValue();
        }
        return null;
    }

    public boolean isEmpty() {
        return node == null;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private Node<T> current = node;
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
