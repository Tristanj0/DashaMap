package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapX {
    SinglyLinkedList[] hashArray = new SinglyLinkedList[26];
    public DashaMap() {
        char myChar = 'a';
        int index = 0;
        while (myChar <= 'z') {
            hashArray[index] = new SinglyLinkedList();
            Node node = new Node(Character.toString(myChar));
            hashArray[index].add(node);
            myChar++;
            index++;
        }
    }
    @Override
    public void set(String key, String value) {
        Node node = new Node(value);
        get(key).get(get(key).size()-1).setNext(node);
        get(key).add(node);
    }

    @Override
    public void delete(String key) {
        SinglyLinkedList[] linkedLists = new SinglyLinkedList[hashArray.length - 1];
        int indexToDelete = Math.abs(key.charAt(0) - 'a');
        for(int i = 0; i < indexToDelete; i++) {
            linkedLists[i] = hashArray[i];
        }
        for (int i = indexToDelete; i < hashArray.length; i++) {
            linkedLists[i] = hashArray[i + 1];
        }
        hashArray = linkedLists;
    }

    @Override
    public SinglyLinkedList get(String key) {
        for (SinglyLinkedList linkedList : hashArray) {
            if (linkedList.get(0).getKey().equals(key)) return linkedList;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return hashArray.length == 0;
    }

    @Override
    public long size() {
        return hashArray.length;
    }

    @Override
    public int bucketSize(String key) {
        for (SinglyLinkedList linkedList : hashArray) {
            if (linkedList.get(0).getKey().equals(key)) {
                return linkedList.size() - 1;
            }
        }
        return -1;
    }
}
