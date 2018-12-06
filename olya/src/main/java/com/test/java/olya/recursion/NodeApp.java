package com.test.java.olya.recursion;

/*
есть дерево элементов типа Node
этот элемент содержит в себе массив потомков типа Node
написать функцию которая принимает любой элемент дерева, будь то верхушка или середина или тд..
и возвращает глубину дерева
 */

public class NodeApp {
  public static void main(String[] args) {
    Node node11111 = new Node();
    Node node1111 = new Node(node11111);

    Node node111 = new Node(node1111);
    Node node112 = new Node();
    Node node113 = new Node();
    Node node121 = new Node();
    Node node122 = new Node();

    Node node11 = new Node(node111, node112, node113);
    Node node12 = new Node(node121, node122);

    Node node1 = new Node(node11, node12);

    int deep = node1.deepCount(0);
    System.out.println(deep);


  }
}
