package com.test.dima.recursion;

import java.util.stream.Stream;

public class TreeDeep {

  public static void main(String[] args) {
    Node parentNode = new Node(null);
    Node child1Level1 = new Node(parentNode);
    Node child2Level1 = new Node(parentNode);
    Node child3Level1 = new Node(parentNode);
    Node child1Level2 = new Node(child1Level1);
    Node child1Level3 = new Node(child1Level2);

    parentNode.setNodes(new Node[]{child1Level1, child2Level1, child3Level1});
    child1Level1.setNodes(new Node[]{child1Level2});
    child1Level2.setNodes(new Node[]{child1Level3});

    Integer result = counter(parentNode, 0);
    System.out.println(result);
  }

  private static Integer counter(Node node, Integer currentDeep) {
    return Stream.of(node.getNodes()).map(nodeItem -> counter(nodeItem, currentDeep + 1))
        .max(Integer::compareTo).orElse(currentDeep);
  }
}
