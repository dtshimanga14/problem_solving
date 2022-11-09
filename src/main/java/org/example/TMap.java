package org.example;

public class TMap<K,V> {
    static class Node<K,V> {
        K key; V value;
        Node next;
        int hash;
        public Node(K key, V value){
            this.key = key;
            this.value = value;
            this.hash = this.key.hashCode();
        }

        public K getKey() { return key;}

        public void setKey(K key) { this.key = key; }
        public V getValue() { return value;}
        public void setValue(V value) { this.value = value;}
    }
    private int size = 0;
    int capacity = 16;
    Node<K,V>[] bucket = new Node[capacity];

    public int size(){
       return this.size;
    }
    public void put(K key, V value) {
        Node node = new Node(key,value);
         Node p = bucket[node.hash%16];
        if(p == null) {
            bucket[node.hash % 16] = node;
            return;
        }
        while (p.next != null) p = p.next;
        p.next = node;
        this.size++;
    }
    public V get(K key) {
        Node p = bucket[key.hashCode() % 16];
        if(p.getKey() == key)
            return (V) p.getValue();
        while(p.next != null) {
             if(p.next.getKey() != key)
                p = p.next;
             else return (V) p.next.getValue();
        }
        return null;
    }
}
