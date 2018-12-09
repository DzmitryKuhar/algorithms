package com.test.dima.stack;

public class Stack<T> {

  private Node<T> node;

  private int size = 0;

  public void push(T element) {
    Node<T> newNode = new Node<>(element);
    if(node != null) {
      newNode.setNext(node);
    }
    node = newNode;
    size++;
  }

  public T pop() {
    if(size > 0) {
      size--;
      Node<T> oldNode;
      if(node.getNext() != null) {
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

  public boolean isEmpty () {
    return node == null;
  }

  public int size() {
    return size;
  }
}
