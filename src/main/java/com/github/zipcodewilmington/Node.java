package com.github.zipcodewilmington;

public class Node {
    String key;
    Integer value;
    Node next;
    public Node() {}
    public Node(String key) {
        this.key = key;
    }

    public Node(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue() {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
