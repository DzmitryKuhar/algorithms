package com.test.java.olya.recursion;

public class Node {
  private Node[] nodes;
  int maxDeep;

  public Node(Node... nodes) {
    if (nodes.length == 0)
      this.nodes = new Node[] {};
    this.nodes = nodes;
  }

  public int deepCount(int initialDeep) {
    if (nodes.length == 0)
      return initialDeep;
    for (Node child : nodes) {
      int deep = initialDeep;
      deep = child.deepCount(deep + 1);
      if (maxDeep < deep)
        maxDeep = deep;
    }
    return maxDeep;
  }
}
