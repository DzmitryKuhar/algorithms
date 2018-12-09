package com.test.dima.recursion;

import lombok.Data;

@Data
class Node {

  public Node(Node parent) {
    this.parent = parent;
  }

  private Node[] nodes = new Node[]{};
  private Node parent;
}
