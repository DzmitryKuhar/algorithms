package com.test.dima.stack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Node<T> {

  public Node(T value) {
    this.value = value;
  }

  private T value;

  private Node<T> next;
}
