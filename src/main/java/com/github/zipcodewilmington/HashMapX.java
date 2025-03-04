package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public interface HashMapX {
    // fundamentals
    void set(String key, String value);
    void delete(String key);
    SinglyLinkedList get(String key);
    boolean isEmpty();
    long size();

    // testing access
    int bucketSize(String key); // used for tests
}
