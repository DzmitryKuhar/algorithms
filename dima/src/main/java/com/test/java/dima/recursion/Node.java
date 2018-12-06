package com.test.java.dima.recursion;

import lombok.Data;

@Data
class Node {

  public Node(Node parent) {
    this.parent = parent;
  }

  private Node[] nodes = new Node[]{};
  private Node parent;
}
